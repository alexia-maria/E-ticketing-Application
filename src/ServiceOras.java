import java.util.List;
import java.util.Scanner;

public class ServiceOras {
    private final Scanner scanner = new Scanner(System.in);

    private static ServiceOras instanta = null;

    private ServiceOras() {}

    public synchronized static ServiceOras getInstanta() {
        if (instanta == null) {
            instanta = new ServiceOras();
        }
        return instanta;
    }

    public void sorteazaEvenimenteleDupaOras(List<Eveniment> evenimente){

        System.out.println("Introduceti orasul: ");
        String orasSortare = scanner.nextLine();

        for(Eveniment e: evenimente){
            if(e.getLocatie().getOras().equals(orasSortare)){
                System.out.println(e.toString());
            }
        }
    }

    public void sorteazaEvenimenteleDupaOrasSiData(List<Eveniment> evenimente){
        System.out.println("Introduceti orasul: ");
        String orasSortare = scanner.nextLine();

        System.out.println("Introduceti luna in care doriti sa cautati: ");
        int lunaSortare = scanner.nextInt();
        scanner.nextLine();

        for(Eveniment e: evenimente){
            if(e.getData().getMonthValue() == lunaSortare && e.getLocatie().getOras().equals(orasSortare)){
                System.out.println(e.toString());
            }
        }
    }
}
