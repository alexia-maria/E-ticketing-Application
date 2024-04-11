import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class StandUp extends Eveniment{
    private List<String> comedianti;
    private int varstaMinimaIntrare;


//    public StandUp(String tip, String denumire, LocalDate data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase, List<String> comedianti, int varstaMinimaIntrare) {
//        super(tip, denumire, data, organizator, locatie, numarTotalBilete, numarBileteRamase);
//        this.comedianti = comedianti;
//        this.varstaMinimaIntrare = varstaMinimaIntrare;
//    }

    public static class StandUpBuilder {
        private StandUp StandUp;

        private static StandUp.StandUpBuilder instanta;

        public StandUpBuilder() {
            StandUp = new StandUp();
        }

//        public static StandUp.StandUpBuilder getInstance() {
//            if (instanta == null) {
//                instanta = new StandUp.StandUpBuilder();
//            }
//            return instanta;
//        }

        public StandUpBuilder setTip() {
            StandUp.setTip(TipEveniment.STANDUP.getTip());
            return this;
        }

        public StandUpBuilder setDenumire(String denumire) {
            StandUp.setDenumire(denumire);
            return this;
        }

        public StandUpBuilder setData(LocalDate data) {
            StandUp.setData(data);
            return this;
        }

        public StandUpBuilder setOrganizator(String organizator) {
            StandUp.setOrganizator(organizator);
            return this;
        }

        public StandUpBuilder setLocatie(Locatie locatie) {
            StandUp.setLocatie(locatie);
            return this;
        }

        public StandUpBuilder setNumarTotalBilete(int numarTotalBilete) {
            StandUp.setNumarTotalBilete(numarTotalBilete);
            return this;
        }

        public StandUpBuilder setNumarBileteRamase(int numarBileteRamase) {
            StandUp.setNumarBileteRamase(numarBileteRamase);
            return this;
        }

        public StandUpBuilder setComedianti(List<String> comedianti) {
            StandUp.setComedianti(comedianti);
            return this;
        }

        public StandUpBuilder setVarstaMinimaIntrare(int varstaMinimaIntrare) {
            StandUp.setVarstaMinimaIntrare(varstaMinimaIntrare);
            return this;
        }

        public StandUp build() {
            return StandUp;
        }
    }



    public List<String> getComedianti() {
        return comedianti;
    }

    public void setComedianti(List<String> comedianti) {
        this.comedianti = comedianti;
    }

    public int getVarstaMinimaIntrare() {
        return varstaMinimaIntrare;
    }

    public void setVarstaMinimaIntrare(int varstaMinimaIntrare) {
        this.varstaMinimaIntrare = varstaMinimaIntrare;
    }

    @Override
    public String toString() {
        return super.toString()+ "StandUp{" +
                "comedianti=" + comedianti +
                ", varstaMinimaIntrare=" + varstaMinimaIntrare +
                '}';
    }
}
