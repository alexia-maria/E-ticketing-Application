import java.time.LocalDate;

public abstract class Eveniment {

    private static int ultimId = 0;
    private int idEveniment = 0;
    private String tip;
    private String denumire;

    private LocalDate data;
    private String organizator;
    private Locatie locatie;
    private int numarTotalBilete;
    private int numarBileteRamase;

//    public Eveniment(String tip, String denumire, LocalDate data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase) {
//        this.idEveniment = ++ultimId;
//        this.tip = tip;
//        this.denumire = denumire;
//        this.data = data;
//        this.organizator = organizator;
//        this.locatie = locatie;
//        this.numarTotalBilete = numarTotalBilete;
//        this.numarBileteRamase = numarBileteRamase;
//    }

    Eveniment(){
        this.idEveniment = ++ultimId;
    }

    public static class EvenimentBuilder{
        private Eveniment eveniment;
        private static EvenimentBuilder instanta;

        private EvenimentBuilder(){}

        public static EvenimentBuilder getInstance(){
            if(instanta == null){
                instanta = new EvenimentBuilder();
            }
            return instanta;
        }

        public EvenimentBuilder setTip(String tip){
            eveniment.setTip(tip);
            return this;
        }

        public EvenimentBuilder setDenumire(String denumire){
            eveniment.setDenumire(denumire);
            return this;
        }

        public EvenimentBuilder setData(LocalDate data){
            eveniment.setData(data);
            return this;
        }

        public EvenimentBuilder setOrganizator(String organizator){
            eveniment.setOrganizator(organizator);
            return this;
        }

        public EvenimentBuilder setLocatie(Locatie locatie){
            eveniment.setLocatie(locatie);
            return this;
        }

        public EvenimentBuilder setNumarTotalBilete(int numarTotalBilete){
            eveniment.setNumarTotalBilete(numarTotalBilete);
            return this;
        }

        public EvenimentBuilder setNumarBileteRamase(int numarBileteRamase){
            eveniment.setNumarBileteRamase(numarBileteRamase);
            return this;
        }
    }

    public int getId() {
        return idEveniment;
    }

    public void setId(int id) {
        this.idEveniment = id;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
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
                "id=" + idEveniment +
                ", tip= " + tip + '\''+
                ", denumire='" + denumire + '\'' +
                ", organizator='" + organizator + '\'' +
                ", data= " + data  +
                ", locatie=" + locatie +
                ", numarTotalBilete=" + numarTotalBilete +
                ", numarBileteRamase=" + numarBileteRamase +
                '}';
    }


}
