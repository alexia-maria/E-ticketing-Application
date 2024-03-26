import java.util.Date;
import java.util.List;

public class StandUp extends Eveniment{
    private List<String> comedianti;
    private int varstaMinimaIntrare;
    private Date data;

    public StandUp(int id, String denumire, Date data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase, List<String> comedianti, int varstaMinimaIntrare) {
        super(id, denumire, data, organizator, locatie, numarTotalBilete, numarBileteRamase);
        this.comedianti = comedianti;
        this.varstaMinimaIntrare = varstaMinimaIntrare;
    }

    public List<String> getComedianti() {
        return comedianti;
    }

    public void setComedianti(List<String> comedianti) {
        this.comedianti = comedianti;
    }

    public int getVarstaMinimaIntrare() {
        return varstaMinimaIntrare;
    }

    public void setVarstaMinimaIntrare(int varstaMinimaIntrare) {
        this.varstaMinimaIntrare = varstaMinimaIntrare;
    }

    @Override
    public void cumparaBilet(){};
}
