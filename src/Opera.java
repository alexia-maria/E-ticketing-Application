import java.util.Date;
import java.time.LocalDate;

public class Opera extends Eveniment{
    private String tenor;
    private String soprana;

//    public Opera(String tip, String denumire, LocalDate data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase, String tenor, String soprana) {
//        super(tip, denumire, data, organizator, locatie, numarTotalBilete, numarBileteRamase);
//        this.tenor = tenor;
//        this.soprana = soprana;
//    }

    public static class OperaBuilder {
        private Opera Opera;

        private static Opera.OperaBuilder instanta;

        public OperaBuilder() {
            Opera = new Opera();
        }

//        public static Opera.OperaBuilder getInstance() {
//            if (instanta == null) {
//                instanta = new Opera.OperaBuilder();
//            }
//            return instanta;
//        }

        public OperaBuilder setTip() {
            Opera.setTip(TipEveniment.OPERA.getTip());
            return this;
        }

        public OperaBuilder setDenumire(String denumire) {
            Opera.setDenumire(denumire);
            return this;
        }

        public OperaBuilder setData(LocalDate data) {
            Opera.setData(data);
            return this;
        }

        public OperaBuilder setOrganizator(String organizator) {
            Opera.setOrganizator(organizator);
            return this;
        }

        public OperaBuilder setLocatie(Locatie locatie) {
            Opera.setLocatie(locatie);
            return this;
        }

        public OperaBuilder setNumarTotalBilete(int numarTotalBilete) {
            Opera.setNumarTotalBilete(numarTotalBilete);
            return this;
        }

        public OperaBuilder setNumarBileteRamase(int numarBileteRamase) {
            Opera.setNumarBileteRamase(numarBileteRamase);
            return this;
        }

        public OperaBuilder setTenor(String tenor) {
            Opera.setTenor(tenor);
            return this;
        }

        public OperaBuilder setSoprana(String soprana) {
            Opera.setSoprana(soprana);
            return this;
        }

        public Opera build() {
            return Opera;
        }
    }

    public String getTenor() {
        return tenor;
    }

    public void setTenor(String tenor) {
        this.tenor = tenor;
    }

    public String getSoprana() {
        return soprana;
    }

    public void setSoprana(String soprana) {
        this.soprana = soprana;
    }

    @Override
    public String toString() {
        return super.toString()+ "Opera{" +
                "tenor='" + tenor + '\'' +
                ", soprana='" + soprana + '\'' +
                '}';
    }
}
