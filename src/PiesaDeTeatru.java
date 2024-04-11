import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class PiesaDeTeatru extends Eveniment{
    private List<String> distributie;
    private String genPiesa;

//    public PiesaDeTeatru(String tip, String denumire, LocalDate data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase, List<String> distributie, String genPiesa) {
//        super(tip, denumire, data, organizator, locatie, numarTotalBilete, numarBileteRamase);
//        this.distributie = distributie;
//        this.genPiesa = genPiesa;
//    }

    public static class PiesaDeTeatruBuilder {
        private PiesaDeTeatru PiesaDeTeatru;

        private static PiesaDeTeatru.PiesaDeTeatruBuilder instanta;

        public PiesaDeTeatruBuilder() {
            PiesaDeTeatru = new PiesaDeTeatru();
        }

//        public static PiesaDeTeatru.PiesaDeTeatruBuilder getInstance() {
//            if (instanta == null) {
//                instanta = new PiesaDeTeatru.PiesaDeTeatruBuilder();
//            }
//            return instanta;
//        }

        public PiesaDeTeatruBuilder setTip() {
            PiesaDeTeatru.setTip(TipEveniment.PIESA_DE_TEATRU.getTip());
            return this;
        }

        public PiesaDeTeatruBuilder setDenumire(String denumire) {
            PiesaDeTeatru.setDenumire(denumire);
            return this;
        }

        public PiesaDeTeatruBuilder setData(LocalDate data) {
            PiesaDeTeatru.setData(data);
            return this;
        }

        public PiesaDeTeatruBuilder setOrganizator(String organizator) {
            PiesaDeTeatru.setOrganizator(organizator);
            return this;
        }

        public PiesaDeTeatruBuilder setLocatie(Locatie locatie) {
            PiesaDeTeatru.setLocatie(locatie);
            return this;
        }

        public PiesaDeTeatruBuilder setNumarTotalBilete(int numarTotalBilete) {
            PiesaDeTeatru.setNumarTotalBilete(numarTotalBilete);
            return this;
        }

        public PiesaDeTeatruBuilder setNumarBileteRamase(int numarBileteRamase) {
            PiesaDeTeatru.setNumarBileteRamase(numarBileteRamase);
            return this;
        }

        public PiesaDeTeatruBuilder setDistributie(List<String> distributie) {
            PiesaDeTeatru.setDistributie(distributie);
            return this;
        }

        public PiesaDeTeatruBuilder setGenPiesa(String genPiesa){
            PiesaDeTeatru.setGenPiesa(genPiesa);
            return this;
        }


        public PiesaDeTeatru build() {
            return PiesaDeTeatru;
        }
    }

    public List<String> getDistributie() {
        return distributie;
    }

    public void setDistributie(List<String> distributie) {
        this.distributie = distributie;
    }


    public String getGenPiesa() {
        return genPiesa;
    }

    public void setGenPiesa(String genPiesa) {
        this.genPiesa = genPiesa;
    }

    @Override
    public String toString() {
        return super.toString() +
                "distributie=" + distributie +
                "genul piesei de teatru="+genPiesa+
                '}';
    }
}
