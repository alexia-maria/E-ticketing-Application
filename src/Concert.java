import java.time.LocalDate;


public class Concert extends Eveniment{
    private String artist;
    private String genMuzical;

    public Concert(String tip, String denumire, LocalDate data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase, String artist, String genMuzical) {
        super( tip, denumire, data, organizator, locatie, numarTotalBilete, numarBileteRamase);
        this.artist = artist;
        this.genMuzical = genMuzical;
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
