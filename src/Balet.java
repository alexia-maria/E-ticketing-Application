import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Balet extends Eveniment{
    private List<String> balerini;
    private int durataSpectacol;



//    public Balet(String tip, String denumire, LocalDate data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase, List<String> balerini, int durataSpectacol) {
//        super(tip, denumire, data, organizator, locatie, numarTotalBilete, numarBileteRamase);
//        this.balerini = balerini;
//        this.durataSpectacol = durataSpectacol;
//    }

    public static class BaletBuilder{
        private Balet balet;

        private static BaletBuilder instanta;

        public BaletBuilder(){
            balet = new Balet();
        }

//        public static BaletBuilder getInstance(){
//            if(instanta == null){
//                instanta = new BaletBuilder();
//            }
//            return instanta;
//        }

        public BaletBuilder setTip(){
            balet.setTip(TipEveniment.BALET.getTip());
            return this;
        }

        public BaletBuilder setDenumire(String denumire){
            balet.setDenumire(denumire);
            return this;
        }

        public BaletBuilder setData(LocalDate data){
            balet.setData(data);
            return this;
        }

        public BaletBuilder setOrganizator(String organizator){
            balet.setOrganizator(organizator);
            return this;
        }

        public BaletBuilder setLocatie(Locatie locatie){
            balet.setLocatie(locatie);
            return this;
        }

        public BaletBuilder setNumarTotalBilete(int numarTotalBilete){
            balet.setNumarTotalBilete(numarTotalBilete);
            return this;
        }

        public BaletBuilder setNumarBileteRamase(int numarBileteRamase){
            balet.setNumarBileteRamase(numarBileteRamase);
            return this;
        }

        public BaletBuilder setBalerini(List<String> balerini){
            balet.setBalerini(balerini);
            return this;
        }

        public BaletBuilder setDurataSpectacol(int durataSpectacol){
            balet.setDurataSpectacol(durataSpectacol);
            return this;
        }

        public Balet build(){
            return balet;
        }
    }
    public List<String> getBalerini() {
        return balerini;
    }

    public void setBalerini(List<String> balerini) {
        this.balerini = balerini;
    }

    public int getDurataSpectacol() {
        return durataSpectacol;
    }

    public void setDurataSpectacol(int durataSpectacol) {
        this.durataSpectacol = durataSpectacol;
    }

    @Override
    public String toString() {
        return super.toString()+ "Balet{" +
                "balerini=" + balerini +
                "durata spectacol=" + durataSpectacol+
                '}';
    }
}
