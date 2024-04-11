import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Festival extends Eveniment{
    private int numarScene;
    private List<String> artisti;

//    public Festival(String tip, String denumire, LocalDate data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase, int numarScene, List<String> artisti) {
//        super(tip, denumire, data, organizator, locatie, numarTotalBilete, numarBileteRamase);
//        this.numarScene = numarScene;
//        this.artisti = artisti;
//    }

    public static class FestivalBuilder {
        private Festival Festival;

        private static Festival.FestivalBuilder instanta;

        public FestivalBuilder() {
            Festival = new Festival();
        }

//        public static Festival.FestivalBuilder getInstance() {
//            if (instanta == null) {
//                instanta = new Festival.FestivalBuilder();
//            }
//            return instanta;
//        }

        public FestivalBuilder setTip() {
            Festival.setTip(TipEveniment.FESTIVAL.getTip());
            return this;
        }

        public FestivalBuilder setDenumire(String denumire) {
            Festival.setDenumire(denumire);
            return this;
        }

        public FestivalBuilder setData(LocalDate data) {
            Festival.setData(data);
            return this;
        }

        public FestivalBuilder setOrganizator(String organizator) {
            Festival.setOrganizator(organizator);
            return this;
        }

        public FestivalBuilder setLocatie(Locatie locatie) {
            Festival.setLocatie(locatie);
            return this;
        }

        public FestivalBuilder setNumarTotalBilete(int numarTotalBilete) {
            Festival.setNumarTotalBilete(numarTotalBilete);
            return this;
        }

        public FestivalBuilder setNumarBileteRamase(int numarBileteRamase) {
            Festival.setNumarBileteRamase(numarBileteRamase);
            return this;
        }

        public FestivalBuilder setNumarScene(int numarScene) {
            Festival.setNumarScene(numarScene);
            return this;
        }

        public FestivalBuilder setArtisti(List<String> artisti) {
            Festival.setArtisti(artisti);
            return this;
        }

        public Festival build() {
            return Festival;
        }
    }

    public int getNumarScene() {
        return numarScene;
    }

    public void setNumarScene(int numarScene) {
        this.numarScene = numarScene;
    }

    public List<String> getArtisti() {
        return artisti;
    }

    public void setArtisti(List<String> artisti) {
        this.artisti = artisti;
    }

    @Override
    public String toString() {
        return super.toString()+ "Festival{" +
                "numarScene=" + numarScene +
                ", artisti=" + artisti +
                '}';
    }
}
