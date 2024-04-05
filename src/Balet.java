import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Balet extends Eveniment{
    private List<String> balerini;
    private int durataSpectacol;



    public Balet(String tip, String denumire, LocalDate data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase, List<String> balerini, int durataSpectacol) {
        super(tip, denumire, data, organizator, locatie, numarTotalBilete, numarBileteRamase);
        this.balerini = balerini;
        this.durataSpectacol = durataSpectacol;
    }

    public List<String> getBalerini() {
        return balerini;
    }

    public void setBalerini(List<String> balerini) {
        this.balerini = balerini;
    }

    @Override
    public String toString() {
        return super.toString()+ "Balet{" +
                "balerini=" + balerini +
                "durata spectacol=" + durataSpectacol+
                '}';
    }
}
