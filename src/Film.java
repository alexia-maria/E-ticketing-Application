import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDate;

public class Film extends Eveniment{
    private String genFilm;
    private int durata;

//    public Film(String tip, String denumire, LocalDate data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase, String genFilm, int durata) {
//        super(tip, denumire, data, organizator, locatie, numarTotalBilete, numarBileteRamase);
//        this.genFilm = genFilm;
//        this.durata = durata;
//    }

    public static class FilmBuilder {
        private Film Film;

        private static Film.FilmBuilder instanta;

        public FilmBuilder() {
            Film = new Film();
        }

//        public static Film.FilmBuilder getInstance() {
//            if (instanta == null) {
//                instanta = new Film.FilmBuilder();
//            }
//            return instanta;
//        }

        public FilmBuilder setTip() {
            Film.setTip(TipEveniment.FILM.getTip());
            return this;
        }

        public FilmBuilder setDenumire(String denumire) {
            Film.setDenumire(denumire);
            return this;
        }

        public FilmBuilder setData(LocalDate data) {
            Film.setData(data);
            return this;
        }

        public FilmBuilder setOrganizator(String organizator) {
            Film.setOrganizator(organizator);
            return this;
        }

        public FilmBuilder setLocatie(Locatie locatie) {
            Film.setLocatie(locatie);
            return this;
        }

        public FilmBuilder setNumarTotalBilete(int numarTotalBilete) {
            Film.setNumarTotalBilete(numarTotalBilete);
            return this;
        }

        public FilmBuilder setNumarBileteRamase(int numarBileteRamase) {
            Film.setNumarBileteRamase(numarBileteRamase);
            return this;
        }

        public FilmBuilder setGenFilm(String genFilm) {
            Film.setGenFilm(genFilm);
            return this;
        }

        public FilmBuilder setDurata(int durata) {
            Film.setDurata(durata);
            return this;
        }

        public Film build() {
            return Film;
        }
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
