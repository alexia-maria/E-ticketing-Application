import java.time.LocalDate;
import java.util.*;

public class ServiceBilete {

    private final Scanner scanner = new Scanner(System.in);

    private static ServiceBilete instanta = null;

    private List<Tranzactie> tranzactii;

    private ServiceBilete() {
        this.tranzactii = new ArrayList<>();
    }

    public synchronized static ServiceBilete getInstanta() {
        if (instanta == null) {
            instanta = new ServiceBilete();
        }
        return instanta;
    }

    public boolean logare(List<Client> clienti, String usernameLogare, String parolaLogare){
//       // System.out.println("Introduceti username-ul: ");
//        String usernameLogare = clientLogare.getUsername();
//
//       // System.out.println("Introduceti parola: ");
//        String parolaLogare = scanner.nextLine();

        for(Client c: clienti){
            if(c.getUsername().equals(usernameLogare) && c.getParola().equals(parolaLogare)){
                System.out.println("Autentificare reusita");
                c.setEsteLogat(true);
                return true;
            }
        }
        return false;
    }

    public void delogare(List<Client> clienti, String usernameLogare){
//        System.out.println("Introduceti username-ul: ");
//        String usernameLogare = scanner.nextLine();

        for(Client c: clienti){
            if(c.getUsername().equals(usernameLogare)){
                System.out.println("Delogare reusita");
                c.setEsteLogat(false);
            }
        }
    }

    public void cumparaBilet(List<Client> clienti, List<Eveniment> evenimente, Client utilizator){
      //  System.out.println(utilizator.getId());
        Set<Integer> idEvenimenteBilet = new HashSet<>();
       // int costTotalTranzactie = 0;
        if(utilizator.isEsteLogat()){
            String raspuns = "da";
            while(!(raspuns.equals("nu"))){
                System.out.println("Introduceti denumirea evenimentului pentru care doriti sa cumparati bilete");
                String denumireEvenimentBilet = scanner.nextLine();
                System.out.println("Cate bilete doriti sa cumparati?");
                int numarBilete = scanner.nextInt();
                scanner.nextLine();
                for(Eveniment e:evenimente){
                    if(e.getDenumire().equals(denumireEvenimentBilet)){
                        Eveniment evenimentCopie = e;
                        if(evenimentCopie.getNumarBileteRamase() < numarBilete){
                            System.out.println("Nu sunt suficiente bilete ramase la evenimentul dorit.");
                        }else{
                            e.setNumarBileteRamase(e.getNumarBileteRamase()-numarBilete);
                            idEvenimenteBilet.add(e.getId());
                        }
                    }
                }
                System.out.println("Mai doriti sa cumparati bilete la alt eveniment? (da/nu)");
                raspuns = scanner.nextLine();
            }
           Tranzactie t = new Tranzactie(utilizator.getId(), idEvenimenteBilet, LocalDate.now(), 15);
            tranzactii.add(t);
            System.out.println("Tranzactie reusita");
        }else{
            System.out.println("Nu sunteti logat");
        }
    }

    public void afiseazaTranzactii(){
        for(Tranzactie tranzactie:tranzactii){
            System.out.println(tranzactie.toString());
        }
    }
}
