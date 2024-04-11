import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ServiceTip implements ServiceTipInterface{

    private final Scanner scanner = new Scanner(System.in);

    private static ServiceTip instanta = null;

    private ServiceTip() {}

    public synchronized static ServiceTip getInstanta() {
        if (instanta == null) {
            instanta = new ServiceTip();
        }
        return instanta;
    }

    public void sorteazaEvenimenteleDupaTip(List<Eveniment> evenimente){
        System.out.println("Introduceti tipul evenimentului pe care il cautati: ");
        String tipEvenimentSortare = scanner.nextLine();
        String tipEvenimentLower = tipEvenimentSortare.toLowerCase();

        for(Eveniment e: evenimente){
            if(e.getTip().toLowerCase().equals(tipEvenimentLower)){
                System.out.println(e.toString());
            }
        }
    }

    public void sorteazaEvenimenteleDupaTipsiData(List<Eveniment> evenimente){
        System.out.println("Introduceti tipul evenimentului pe care il cautati: ");
        String tipEvenimentSortare = scanner.nextLine();
        String tipEvenimentLower = tipEvenimentSortare.toLowerCase();

        System.out.println("Introduceti luna in care doriti sa cautati: ");
        int lunaSortare = scanner.nextInt();
        scanner.nextLine();

        for(Eveniment e: evenimente){
            if(e.getTip().toLowerCase().equals(tipEvenimentLower) && e.getData().getMonthValue() == lunaSortare){
                System.out.println(e.toString());
            }
        }
    }

}
