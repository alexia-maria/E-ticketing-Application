import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class EvenimentSportiv extends Eveniment{
    private String sport;
    private List<String> echipe;

//    public EvenimentSportiv(String tip, String denumire, LocalDate data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase, String sport, List<String> echipe) {
//
//        this.sport = sport;
//        this.echipe = echipe;
//    }

    public static class EvenimentSportivBuilder{
        private EvenimentSportiv evenimentSportiv;

        private static EvenimentSportivBuilder instanta;

        public EvenimentSportivBuilder(){
            evenimentSportiv = new EvenimentSportiv();
        }

//        public static EvenimentSportivBuilder getInstance(){
//            if(instanta == null){
//                instanta = new EvenimentSportivBuilder();
//            }
//            return instanta;
//        }

        public EvenimentSportivBuilder setTip(){
            evenimentSportiv.setTip(TipEveniment.EVENIMENT_SPORTIV.getTip());
            return this;
        }

        public EvenimentSportivBuilder setDenumire(String denumire){
            evenimentSportiv.setDenumire(denumire);
            return this;
        }

        public EvenimentSportivBuilder setData(LocalDate data){
            evenimentSportiv.setData(data);
            return this;
        }

        public EvenimentSportivBuilder setOrganizator(String organizator){
            evenimentSportiv.setOrganizator(organizator);
            return this;
        }

        public EvenimentSportivBuilder setLocatie(Locatie locatie){
            evenimentSportiv.setLocatie(locatie);
            return this;
        }

        public EvenimentSportivBuilder setNumarTotalBilete(int numarTotalBilete){
            evenimentSportiv.setNumarTotalBilete(numarTotalBilete);
            return this;
        }

        public EvenimentSportivBuilder setNumarBileteRamase(int numarBileteRamase){
            evenimentSportiv.setNumarBileteRamase(numarBileteRamase);
            return this;
        }

        public EvenimentSportivBuilder setSport(String sport){
            evenimentSportiv.setSport(sport);
            return this;
        }

        public EvenimentSportivBuilder setEchipe(List<String> echipe){
            evenimentSportiv.setEchipe(echipe);
            return this;
        }

        public EvenimentSportiv build(){
            return evenimentSportiv;
        }
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public List<String> getEchipe() {
        return echipe;
    }

    public void setEchipe(List<String> echipe) {
        this.echipe = echipe;
    }

    @Override
    public String toString() {
        return super.toString()+ "EvenimentSportiv{" +
                "sport='" + sport + '\'' +
                ", echipe=" + echipe +
                '}';
    }
}
