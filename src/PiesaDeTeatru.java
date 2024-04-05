import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class PiesaDeTeatru extends Eveniment{
    private List<String> distributie;
    private String genPiesa;

    public PiesaDeTeatru(String tip, String denumire, LocalDate data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase, List<String> distributie, String genPiesa) {
        super(tip, denumire, data, organizator, locatie, numarTotalBilete, numarBileteRamase);
        this.distributie = distributie;
        this.genPiesa = genPiesa;
    }

    public List<String> getDistributie() {
        return distributie;
    }

    public void setDistributie(List<String> distributie) {
        this.distributie = distributie;
    }

    @Override
    public String toString() {
        return super.toString() +
                "distributie=" + distributie +
                "genul piesei de teatru="+genPiesa+
                '}';
    }
}
