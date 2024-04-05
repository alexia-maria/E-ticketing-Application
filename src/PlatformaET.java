import java.time.LocalDate;
import java.util.*;

public class PlatformaET {

    private final Scanner scanner = new Scanner(System.in);
    private List<Client> clienti;
    private List<Eveniment> evenimente;

    private static PlatformaET instanta = null;

    private PlatformaET() {
        this.evenimente = new ArrayList<>();
        this.clienti = new ArrayList<>();
    }

    public synchronized static PlatformaET getInstanta() {
        if (instanta == null) {
            instanta = new PlatformaET();
        }
        return instanta;
    }

    public List<Client> getClienti() {
        return clienti;
    }

    public void setClienti(List<Client> clienti) {
        this.clienti = clienti;
    }

    public List<Eveniment> getEvenimente() {
        return evenimente;
    }

    public void setEvenimente(List<Eveniment> evenimente) {
        this.evenimente = evenimente;
    }

    public void adaugaClienti(Client c){
        clienti.add(c);
    }

    public void adaugaEvenimente(Eveniment e){
        evenimente.add(e);
    }

    public void afiseazaClienti(){
        for(Client c: clienti){
            System.out.println(c.toString());

        }
    }

    public void afiseazaEvenimente(){
        for(Eveniment e: evenimente){
            System.out.println(e.toString());

        }
    }

//    public void citesteEveniment(){
//        System.out.println("Introduceti denumirea evenimentului: ");
//        String denumireEveniment = scanner.nextLine();
//
//        //System.out.println("Introuceti data evenimentului: ");
//        Date dataEveniment = new Date();
//
//        System.out.println("introduceti organizatorul evenimentului: ");
//        String organizatorEveniment = scanner.nextLine();
//
//        System.out.println("Introduceti detalii despre locatia evenimentului: ");
//        System.out.println("Introduceti denumirea locatiei: ");
//        String denumireLocatie = scanner.nextLine();
//        System.out.println("Introduceti strada: ");
//        String stradaLocatie = scanner.nextLine();
//        System.out.println("Introduceti orasul: ");
//        String orasLocatie = scanner.nextLine();
//        System.out.println("Introduceti tara: ");
//        String taraLocatie = scanner.nextLine();
//
//        Locatie locatieEveniment = new Locatie(denumireLocatie, stradaLocatie, orasLocatie, taraLocatie);
//
//        System.out.println("Introduceti numarul total de bilete disponibile in cadrul evenimentului: ");
//        int numarTotalBileteEveniment = scanner.nextInt();
//        scanner.nextLine();
//        int numarBileteRamaseEveniment = numarTotalBileteEveniment;
//
//
//    }

    public void citesteConcert(){
        String tipEveniment = "Concert";

        System.out.println("Introduceti denumirea evenimentului: ");
        String denumireEveniment = scanner.nextLine();

        System.out.println("Introuceti data evenimentului: ");
        System.out.println("Introduceti ziua: ");
        int ziEveniment = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti luna eveimentului: ");
        int lunaEveniment = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti anul evenimentului: ");
        int anEveniment = scanner.nextInt();
        scanner.nextLine();
        LocalDate dataEveniment = LocalDate.of(anEveniment, lunaEveniment, ziEveniment);

        System.out.println("introduceti organizatorul evenimentului: ");
        String organizatorEveniment = scanner.nextLine();

        System.out.println("Introduceti detalii despre locatia evenimentului: ");
        System.out.println("Introduceti denumirea locatiei: ");
        String denumireLocatie = scanner.nextLine();
        System.out.println("Introduceti strada: ");
        String stradaLocatie = scanner.nextLine();
        System.out.println("Introduceti orasul: ");
        String orasLocatie = scanner.nextLine();
        System.out.println("Introduceti tara: ");
        String taraLocatie = scanner.nextLine();

        Locatie locatieEveniment = new Locatie(denumireLocatie, stradaLocatie, orasLocatie, taraLocatie);

        System.out.println("Introduceti numarul total de bilete disponibile in cadrul evenimentului: ");
        int numarTotalBileteEveniment = scanner.nextInt();
        scanner.nextLine();
        int numarBileteRamaseEveniment = numarTotalBileteEveniment;

        System.out.println("Introduceti artistul care va canta la concert: ");
        String artistConcert = scanner.nextLine();
        System.out.println("Introduceti genul muzical al concertului: ");
        String genMuzicalConcert = scanner.nextLine();

        Eveniment e = new Concert(tipEveniment, denumireEveniment, dataEveniment, organizatorEveniment, locatieEveniment, numarTotalBileteEveniment, numarBileteRamaseEveniment, artistConcert, genMuzicalConcert);

        adaugaEvenimente(e);
    }

    public void citesteBalet(){
        String tipEveniment = "Balet";

        System.out.println("Introduceti denumirea evenimentului: ");
        String denumireEveniment = scanner.nextLine();

        System.out.println("Introuceti data evenimentului: ");
        System.out.println("Introduceti ziua: ");
        int ziEveniment = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti luna eveimentului: ");
        int lunaEveniment = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti anul evenimentului: ");
        int anEveniment = scanner.nextInt();
        scanner.nextLine();
        LocalDate dataEveniment = LocalDate.of(anEveniment, lunaEveniment, ziEveniment);

        System.out.println("introduceti organizatorul evenimentului: ");
        String organizatorEveniment = scanner.nextLine();

        System.out.println("Introduceti detalii despre locatia evenimentului: ");
        System.out.println("Introduceti denumirea locatiei: ");
        String denumireLocatie = scanner.nextLine();
        System.out.println("Introduceti strada: ");
        String stradaLocatie = scanner.nextLine();
        System.out.println("Introduceti orasul: ");
        String orasLocatie = scanner.nextLine();
        System.out.println("Introduceti tara: ");
        String taraLocatie = scanner.nextLine();

        Locatie locatieEveniment = new Locatie(denumireLocatie, stradaLocatie, orasLocatie, taraLocatie);

        System.out.println("Introduceti numarul total de bilete disponibile in cadrul evenimentului: ");
        int numarTotalBileteEveniment = scanner.nextInt();
        scanner.nextLine();
        int numarBileteRamaseEveniment = numarTotalBileteEveniment;

        System.out.println("Introduceti lista de balerini, separati prin virgula: ");
        String linie = scanner.nextLine();

        List<String> listaBalerini = new ArrayList<>(Arrays.asList(linie.split("\\s*,\\s*")));

        System.out.println("Introduceti durata spectacolului: ");
        int durataBalet = scanner.nextInt();

        Eveniment e = new Balet(tipEveniment, denumireEveniment, dataEveniment, organizatorEveniment, locatieEveniment, numarTotalBileteEveniment, numarBileteRamaseEveniment, listaBalerini, durataBalet);

        adaugaEvenimente(e);

    }

    void citesteEvenimentSportiv(){
        String tipEveniment = "Eveniment sportiv";

        System.out.println("Introduceti denumirea evenimentului: ");
        String denumireEveniment = scanner.nextLine();

        System.out.println("Introuceti data evenimentului: ");
        System.out.println("Introduceti ziua: ");
        int ziEveniment = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti luna eveimentului: ");
        int lunaEveniment = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti anul evenimentului: ");
        int anEveniment = scanner.nextInt();
        scanner.nextLine();
        LocalDate dataEveniment = LocalDate.of(anEveniment, lunaEveniment, ziEveniment);

        System.out.println("introduceti organizatorul evenimentului: ");
        String organizatorEveniment = scanner.nextLine();

        System.out.println("Introduceti detalii despre locatia evenimentului: ");
        System.out.println("Introduceti denumirea locatiei: ");
        String denumireLocatie = scanner.nextLine();
        System.out.println("Introduceti strada: ");
        String stradaLocatie = scanner.nextLine();
        System.out.println("Introduceti orasul: ");
        String orasLocatie = scanner.nextLine();
        System.out.println("Introduceti tara: ");
        String taraLocatie = scanner.nextLine();

        Locatie locatieEveniment = new Locatie(denumireLocatie, stradaLocatie, orasLocatie, taraLocatie);

        System.out.println("Introduceti numarul total de bilete disponibile in cadrul evenimentului: ");
        int numarTotalBileteEveniment = scanner.nextInt();
        scanner.nextLine();
        int numarBileteRamaseEveniment = numarTotalBileteEveniment;

        System.out.println("Introduceti sportul: ");
        String sportEveniment = scanner.nextLine();

        System.out.println("Introduceti echipele care vor participa la eveniment, separate prin virgula: ");
        String linieS = scanner.nextLine();

        List<String> listaEchipeEveniment = new ArrayList<>(Arrays.asList(linieS.split("\\s*,\\s*")));

        Eveniment e = new EvenimentSportiv(tipEveniment, denumireEveniment, dataEveniment, organizatorEveniment, locatieEveniment, numarTotalBileteEveniment, numarBileteRamaseEveniment, sportEveniment, listaEchipeEveniment);
        adaugaEvenimente(e);
    }

    public void citesteFestival(){
        String tipEveniment = "Festival";

        System.out.println("Introduceti denumirea evenimentului: ");
        String denumireEveniment = scanner.nextLine();

        System.out.println("Introuceti data evenimentului: ");
        System.out.println("Introduceti ziua: ");
        int ziEveniment = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti luna eveimentului: ");
        int lunaEveniment = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti anul evenimentului: ");
        int anEveniment = scanner.nextInt();
        scanner.nextLine();
        LocalDate dataEveniment = LocalDate.of(anEveniment, lunaEveniment, ziEveniment);

        System.out.println("introduceti organizatorul evenimentului: ");
        String organizatorEveniment = scanner.nextLine();

        System.out.println("Introduceti detalii despre locatia evenimentului: ");
        System.out.println("Introduceti denumirea locatiei: ");
        String denumireLocatie = scanner.nextLine();
        System.out.println("Introduceti strada: ");
        String stradaLocatie = scanner.nextLine();
        System.out.println("Introduceti orasul: ");
        String orasLocatie = scanner.nextLine();
        System.out.println("Introduceti tara: ");
        String taraLocatie = scanner.nextLine();

        Locatie locatieEveniment = new Locatie(denumireLocatie, stradaLocatie, orasLocatie, taraLocatie);

        System.out.println("Introduceti numarul total de bilete disponibile in cadrul evenimentului: ");
        int numarTotalBileteEveniment = scanner.nextInt();
        scanner.nextLine();
        int numarBileteRamaseEveniment = numarTotalBileteEveniment;

        System.out.println("Introduceti numarul de scene: ");
        int numarSceneEveniment = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduceti artistii care vor participa la festuval: ");
        String linie = scanner.nextLine();

        List<String> listaArtistiEveniment = new ArrayList<>(Arrays.asList(linie.split("\\s*,\\s*")));

        Eveniment e = new Festival(tipEveniment, denumireEveniment, dataEveniment, organizatorEveniment, locatieEveniment, numarTotalBileteEveniment, numarBileteRamaseEveniment, numarSceneEveniment, listaArtistiEveniment);
        adaugaEvenimente(e);
    }

    public void citesteFilm(){
        String tipEveniment = "Film";

        System.out.println("Introduceti denumirea evenimentului: ");
        String denumireEveniment = scanner.nextLine();

        System.out.println("Introuceti data evenimentului: ");
        System.out.println("Introduceti ziua: ");
        int ziEveniment = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti luna eveimentului: ");
        int lunaEveniment = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti anul evenimentului: ");
        int anEveniment = scanner.nextInt();
        scanner.nextLine();
        LocalDate dataEveniment = LocalDate.of(anEveniment, lunaEveniment, ziEveniment);

        System.out.println("introduceti organizatorul evenimentului: ");
        String organizatorEveniment = scanner.nextLine();

        System.out.println("Introduceti detalii despre locatia evenimentului: ");
        System.out.println("Introduceti denumirea locatiei: ");
        String denumireLocatie = scanner.nextLine();
        System.out.println("Introduceti strada: ");
        String stradaLocatie = scanner.nextLine();
        System.out.println("Introduceti orasul: ");
        String orasLocatie = scanner.nextLine();
        System.out.println("Introduceti tara: ");
        String taraLocatie = scanner.nextLine();

        Locatie locatieEveniment = new Locatie(denumireLocatie, stradaLocatie, orasLocatie, taraLocatie);

        System.out.println("Introduceti numarul total de bilete disponibile in cadrul evenimentului: ");
        int numarTotalBileteEveniment = scanner.nextInt();
        scanner.nextLine();
        int numarBileteRamaseEveniment = numarTotalBileteEveniment;

        System.out.println("Introduceti genul filmului: ");
        String genFilm = scanner.nextLine();

        System.out.println("Introduceti durata filmului: ");
        int durataFilm = scanner.nextInt();
        scanner.nextLine();

        Eveniment e = new Film(tipEveniment, denumireEveniment, dataEveniment, organizatorEveniment, locatieEveniment, numarTotalBileteEveniment, numarBileteRamaseEveniment, genFilm, durataFilm);
        adaugaEvenimente(e);
    }

    public void citesteOpera(){
        String tipEveniment = "Opera";

        System.out.println("Introduceti denumirea evenimentului: ");
        String denumireEveniment = scanner.nextLine();

        System.out.println("Introuceti data evenimentului: ");
        System.out.println("Introduceti ziua: ");
        int ziEveniment = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti luna eveimentului: ");
        int lunaEveniment = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti anul evenimentului: ");
        int anEveniment = scanner.nextInt();
        scanner.nextLine();
        LocalDate dataEveniment = LocalDate.of(anEveniment, lunaEveniment, ziEveniment);

        System.out.println("introduceti organizatorul evenimentului: ");
        String organizatorEveniment = scanner.nextLine();

        System.out.println("Introduceti detalii despre locatia evenimentului: ");
        System.out.println("Introduceti denumirea locatiei: ");
        String denumireLocatie = scanner.nextLine();
        System.out.println("Introduceti strada: ");
        String stradaLocatie = scanner.nextLine();
        System.out.println("Introduceti orasul: ");
        String orasLocatie = scanner.nextLine();
        System.out.println("Introduceti tara: ");
        String taraLocatie = scanner.nextLine();

        Locatie locatieEveniment = new Locatie(denumireLocatie, stradaLocatie, orasLocatie, taraLocatie);

        System.out.println("Introduceti numarul total de bilete disponibile in cadrul evenimentului: ");
        int numarTotalBileteEveniment = scanner.nextInt();
        scanner.nextLine();
        int numarBileteRamaseEveniment = numarTotalBileteEveniment;

        System.out.println("Introduceti tenorul care va canta la opera: ");
        String tenorOpera = scanner.nextLine();

        System.out.println("Introduceti soprana care va canta la opera: ");
        String sopranaOpera = scanner.nextLine();

        Eveniment e = new Opera(tipEveniment, denumireEveniment, dataEveniment, organizatorEveniment, locatieEveniment, numarTotalBileteEveniment, numarBileteRamaseEveniment, tenorOpera, sopranaOpera);

        adaugaEvenimente(e);
    }

    public void citesteTeatru(){
        String tipEveniment = "Teatru";

        System.out.println("Introduceti denumirea evenimentului: ");
        String denumireEveniment = scanner.nextLine();

        System.out.println("Introuceti data evenimentului: ");
        System.out.println("Introduceti ziua: ");
        int ziEveniment = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti luna eveimentului: ");
        int lunaEveniment = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti anul evenimentului: ");
        int anEveniment = scanner.nextInt();
        scanner.nextLine();
        LocalDate dataEveniment = LocalDate.of(anEveniment, lunaEveniment, ziEveniment);

        System.out.println("introduceti organizatorul evenimentului: ");
        String organizatorEveniment = scanner.nextLine();

        System.out.println("Introduceti detalii despre locatia evenimentului: ");
        System.out.println("Introduceti denumirea locatiei: ");
        String denumireLocatie = scanner.nextLine();
        System.out.println("Introduceti strada: ");
        String stradaLocatie = scanner.nextLine();
        System.out.println("Introduceti orasul: ");
        String orasLocatie = scanner.nextLine();
        System.out.println("Introduceti tara: ");
        String taraLocatie = scanner.nextLine();

        Locatie locatieEveniment = new Locatie(denumireLocatie, stradaLocatie, orasLocatie, taraLocatie);

        System.out.println("Introduceti numarul total de bilete disponibile in cadrul evenimentului: ");
        int numarTotalBileteEveniment = scanner.nextInt();
        scanner.nextLine();
        int numarBileteRamaseEveniment = numarTotalBileteEveniment;

        System.out.println("Introduceti distributia piesei de teatru, cu virgual intre persoane: ");
        String linie = scanner.nextLine();

        List<String> distributieTeatru = new ArrayList<>(Arrays.asList(linie.split("\\s*,\\s*")));

        System.out.println("Introduceti genul piesei de teatru: ");
        String genTeatru = scanner.nextLine();

        Eveniment e = new PiesaDeTeatru(tipEveniment, denumireEveniment, dataEveniment, organizatorEveniment, locatieEveniment, numarTotalBileteEveniment, numarBileteRamaseEveniment, distributieTeatru, genTeatru);

        adaugaEvenimente(e);
    }

    public void citesteStandup(){
        String tipEveniment = "Standup";

        System.out.println("Introduceti denumirea evenimentului: ");
        String denumireEveniment = scanner.nextLine();

        System.out.println("Introuceti data evenimentului: ");
        System.out.println("Introduceti ziua: ");
        int ziEveniment = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti luna eveimentului: ");
        int lunaEveniment = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti anul evenimentului: ");
        int anEveniment = scanner.nextInt();
        scanner.nextLine();
        LocalDate dataEveniment = LocalDate.of(anEveniment, lunaEveniment, ziEveniment);

        System.out.println("introduceti organizatorul evenimentului: ");
        String organizatorEveniment = scanner.nextLine();

        System.out.println("Introduceti detalii despre locatia evenimentului: ");
        System.out.println("Introduceti denumirea locatiei: ");
        String denumireLocatie = scanner.nextLine();
        System.out.println("Introduceti strada: ");
        String stradaLocatie = scanner.nextLine();
        System.out.println("Introduceti orasul: ");
        String orasLocatie = scanner.nextLine();
        System.out.println("Introduceti tara: ");
        String taraLocatie = scanner.nextLine();

        Locatie locatieEveniment = new Locatie(denumireLocatie, stradaLocatie, orasLocatie, taraLocatie);

        System.out.println("Introduceti numarul total de bilete disponibile in cadrul evenimentului: ");
        int numarTotalBileteEveniment = scanner.nextInt();
        scanner.nextLine();
        int numarBileteRamaseEveniment = numarTotalBileteEveniment;

        System.out.println("Introduceti lista de comedianti: ");
        String linie = scanner.nextLine();

        List<String> listaComedianti = new ArrayList<>(Arrays.asList(linie.split("\\s*,\\s*")));

        System.out.println("Introduceti varsta minima de intrare: ");
        int varstaMinimaStandup = scanner.nextInt();
        scanner.nextLine();

        Eveniment e = new StandUp(tipEveniment, denumireEveniment, dataEveniment, organizatorEveniment, locatieEveniment, numarTotalBileteEveniment, numarBileteRamaseEveniment, listaComedianti, varstaMinimaStandup);
        adaugaEvenimente(e);
    }

    public void citesteClient(){
        System.out.println("Introduceti numele clientului: ");
        String numeClient = scanner.nextLine();

        System.out.println("Introduceti prenumele clientului: ");
        String prenumeClient = scanner.nextLine();

        System.out.println("Introuceti data inregistrarii: ");
        System.out.println("Introduceti ziua: ");
        int ziInregistrare = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti luna: ");
        int lunaInregistrare = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti anul : ");
        int anInregistrare = scanner.nextInt();
        scanner.nextLine();
        LocalDate dataInregistrareClient = LocalDate.of(anInregistrare, lunaInregistrare, ziInregistrare);

        System.out.println("Introduceti adresa de email a clientului: ");
        String emailClient = scanner.nextLine();

        System.out.println("Introduceti username-ul clientului: ");
        String usernameClient = scanner.nextLine();

        System.out.println("Introduceti parola clientului: ");
        String parolaClient = scanner.nextLine();

        Client c = new Client(numeClient, prenumeClient, dataInregistrareClient, emailClient, usernameClient, parolaClient);

        adaugaClienti(c);
    }

//    public void sorteazaEvenimenteleDupaOras(){
//        System.out.println("Introduceti orasul: ");
//        String orasSortare = scanner.nextLine();
//
//        for(Eveniment e: evenimente){
//            if(e.getLocatie().getOras().equals(orasSortare)){
//                System.out.println(e.toString());
//            }
//        }
//    }

//    public void sorteazaEvenimnteleDupaTip(){
//        System.out.println("Introduceti tipul evenimentului pe care il cautati: ");
//        String tipEvenimentSortare = scanner.nextLine();
//        String tipEvenimentLower = tipEvenimentSortare.toLowerCase();
//
////        for(Eveniment e: evenimente){
////            if(e.getTip().toLowerCase().equals(tipEvenimentLower))){
////                System.out.println(e.toString());
////            }
////        }
//    }

//    public boolean logare(){
//        System.out.println("Introduceti username-ul: ");
//        String usernameLogare = scanner.nextLine();
//
//        System.out.println("Introduceti parola: ");
//        String parolaLogare = scanner.nextLine();
//
//        for(Client c: clienti){
//            if(c.getUsername().equals(usernameLogare) && c.getParola().equals(parolaLogare)){
//                System.out.println("Autentificare reusita");
//                return true;
//            }
//        }
//        return false;
//    }

//    public void cumparaBilet(){
//        System.out.println("Daca doriti sa cumparati un bilet, introduceti username-ul si parola pentru autentificare: ");
//        if(logare() == true){
//
//        }
//    }
}
