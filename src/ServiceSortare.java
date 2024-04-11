import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ServiceSortare implements ServiceSortareInterface{

    private final Scanner scanner = new Scanner(System.in);

    private static ServiceSortare instanta = null;

    private ServiceSortare() {}

    public synchronized static ServiceSortare getInstanta() {
        if (instanta == null) {
            instanta = new ServiceSortare();
        }
        return instanta;
    }

    @Override
    public void sorteazaEvenimenteleDupaDenumire(List<Eveniment> evenimente){
        Collections.sort(evenimente, (e1, e2) -> e1.getDenumire().toLowerCase().compareTo(e2.getDenumire().toLowerCase()));
    }

    @Override
    public void sorteazaEvenimenteleDupaNumarulDeBileteRamase(List<Eveniment> evenimente){
        Collections.sort(evenimente, (e1, e2) -> Integer.compare(e1.getNumarBileteRamase(), e2.getNumarBileteRamase()));
    }
}
