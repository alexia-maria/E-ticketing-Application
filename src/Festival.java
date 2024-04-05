import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Festival extends Eveniment{
    private int numarScene;
    private List<String> artisti;

    public Festival(String tip, String denumire, LocalDate data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase, int numarScene, List<String> artisti) {
        super(tip, denumire, data, organizator, locatie, numarTotalBilete, numarBileteRamase);
        this.numarScene = numarScene;
        this.artisti = artisti;
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
