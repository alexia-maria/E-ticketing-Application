import java.util.Date;

public abstract class Eveniment {
    private int id;
    private String denumire;
    private String organizator;
    private Locatie locatie;
    private int numarTotalBilete;
    private int numarBileteRamase;

    public Eveniment(int id, String denumire, Date data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase) {
        this.id = id;
        this.denumire = denumire;
        this.organizator = organizator;
        this.locatie = locatie;
        this.numarTotalBilete = numarTotalBilete;
        this.numarBileteRamase = numarBileteRamase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }



    public String getOrganizator() {
        return organizator;
    }

    public void setOrganizator(String organizator) {
        this.organizator = organizator;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    public void setLocatie(Locatie locatie) {
        this.locatie = locatie;
    }

    public int getNumarTotalBilete() {
        return numarTotalBilete;
    }

    public void setNumarTotalBilete(int numarTotalBilete) {
        this.numarTotalBilete = numarTotalBilete;
    }

    public int getNumarBileteRamase() {
        return numarBileteRamase;
    }

    public void setNumarBileteRamase(int numarBileteRamase) {
        this.numarBileteRamase = numarBileteRamase;
    }

    @Override
    public String toString() {
        return "Eveniment{" +
                "id=" + id +
                ", denumire='" + denumire + '\'' +
                ", organizator='" + organizator + '\'' +
                ", locatie=" + locatie +
                ", numarTotalBilete=" + numarTotalBilete +
                ", numarBileteRamase=" + numarBileteRamase +
                '}';
    }

    public abstract void cumparaBilet();
}
