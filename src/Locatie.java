public class Locatie {
    private int id;
    private String denumire;
    private String strada;
    private String oras;
    private String tara;

    public Locatie(int id, String denumire, String strada, String oras, String tara) {
        this.id = id;
        this.denumire = denumire;
        this.strada = strada;
        this.oras = oras;
        this.tara = tara;
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

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }


    public String getOras() {
        return oras;
    }


    public void setOras(String oras) {
        this.oras = oras;
    }


    public String getTara() {
        return tara;
    }


    public void setTara(String tara) {
        this.tara = tara;
    }


    @Override
    public String toString() {
        return "Locatie{" +
                "id=" + id +
                ", denumire='" + denumire + '\'' +
                ", strada='" + strada + '\'' +
                ", oras='" + oras + '\'' +
                ", tara='" + tara + '\'' +
                '}';
    }
}
