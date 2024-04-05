import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDate;

public class Film extends Eveniment{
    private String genFilm;
    private int durata;

    public Film(String tip, String denumire, LocalDate data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase, String genFilm, int durata) {
        super(tip, denumire, data, organizator, locatie, numarTotalBilete, numarBileteRamase);
        this.genFilm = genFilm;
        this.durata = durata;
    }

    public String getGenFilm() {
        return genFilm;
    }

    public void setGenFilm(String genFilm) {
        this.genFilm = genFilm;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return super.toString()+ "Film{" +
                "genFilm='" + genFilm + '\'' +
                ", durata=" + durata +
                '}';
    }
}
