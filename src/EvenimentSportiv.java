import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class EvenimentSportiv extends Eveniment{
    private String sport;
    private List<String> echipe;

    public EvenimentSportiv(String tip, String denumire, LocalDate data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase, String sport, List<String> echipe) {
        super(tip, denumire, data, organizator, locatie, numarTotalBilete, numarBileteRamase);
        this.sport = sport;
        this.echipe = echipe;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public List<String> getEchipe() {
        return echipe;
    }

    public void setEchipe(List<String> echipe) {
        this.echipe = echipe;
    }

    @Override
    public String toString() {
        return super.toString()+ "EvenimentSportiv{" +
                "sport='" + sport + '\'' +
                ", echipe=" + echipe +
                '}';
    }
}
