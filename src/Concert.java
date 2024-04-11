import java.time.LocalDate;
import java.util.List;


public class Concert extends Eveniment{
    private String artist;
    private String genMuzical;

//    public Concert(String tip, String denumire, LocalDate data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase, String artist, String genMuzical) {
//        super( tip, denumire, data, organizator, locatie, numarTotalBilete, numarBileteRamase);
//        this.artist = artist;
//        this.genMuzical = genMuzical;
//    }

    public static class ConcertBuilder {
        private Concert concert;

        private static Concert.ConcertBuilder instanta;

        public ConcertBuilder() {
            concert = new Concert();
        }

//        public static Concert.ConcertBuilder getInstance() {
//            if (instanta == null) {
//                instanta = new Concert.ConcertBuilder();
//            }
//            return instanta;
//        }

        public ConcertBuilder setTip() {
            concert.setTip(TipEveniment.CONCERT.getTip());
            return this;
        }

        public ConcertBuilder setDenumire(String denumire) {
            concert.setDenumire(denumire);
            return this;
        }

        public ConcertBuilder setData(LocalDate data) {
            concert.setData(data);
            return this;
        }

        public ConcertBuilder setOrganizator(String organizator) {
            concert.setOrganizator(organizator);
            return this;
        }

        public ConcertBuilder setLocatie(Locatie locatie) {
            concert.setLocatie(locatie);
            return this;
        }

        public ConcertBuilder setNumarTotalBilete(int numarTotalBilete) {
            concert.setNumarTotalBilete(numarTotalBilete);
            return this;
        }

        public ConcertBuilder setNumarBileteRamase(int numarBileteRamase) {
            concert.setNumarBileteRamase(numarBileteRamase);
            return this;
        }

        public ConcertBuilder setArtist(String artist) {
            concert.setArtist(artist);
            return this;
        }

        public ConcertBuilder setGenMuzical(String genMuzical) {
            concert.setGenMuzical(genMuzical);
            return this;
        }

        public Concert build() {
            return concert;
        }
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenMuzical() {
        return genMuzical;
    }

    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        return super.toString()+"Concert{" +
                "artist='" + artist + '\'' +
                ", genMuzical='" + genMuzical + '\'' +
                '}';
    }
}
