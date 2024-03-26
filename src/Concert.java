import java.util.Date;

public class Concert extends Eveniment{
    private String artist;
    private String genMuzical;
    private Date data;

    public Concert(int id, String denumire, Date data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase, String artist, String genMuzical) {
        super(id, denumire, data, organizator, locatie, numarTotalBilete, numarBileteRamase);
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
    public void cumparaBilet(){
        System.out.println("Metoda");
    }
}
