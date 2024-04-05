import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    //de facut
    /* Enum pentru tipul de eveniment,
     ?e nevoie de factory pt crearea fiecarui tip de eveniment
     interfete pentru fiecare service(cu metodele fara corp)
     sortarea unei liste
     */
    public static void main(String[] args) {

        PlatformaET platforma = PlatformaET.getInstanta();
        ServiceOras serviceOras = ServiceOras.getInstanta();
        ServiceTip serviceTip = ServiceTip.getInstanta();
        ServiceBilete serviceBilete = ServiceBilete.getInstanta();

        Scanner scanner = new Scanner(System.in);

        Locatie l1 = new Locatie("Opera Nationala", "Mihail Kogalniceanu", "Bucuresti", "Romania");
        Locatie l2 = new Locatie("Club 99", "Calea Victoriei", "Bucuresti", "Romania");
        Locatie l3 = new Locatie("Teatrul de Stat", "Bulevardul Ferdinand", "Constanta", "Romania");
        Locatie l4 = new Locatie("Neversea Beach", "Bulevardul Mamaia", "Constanta", "Romania");
        Locatie l5 = new Locatie("VIVO Pitesti", "Calea Bucuresti", "Pitesti", "Romania");
        Locatie l6 = new Locatie("Teatrul Alexandru Davila", "Strada Victoriei", "Pitesti", "Romania");
        Locatie l7 = new Locatie("Teatrul National", "Bulevardul Nicolae Balcescu", "Bucuresti", "Romania");
        Locatie l8 = new Locatie("Centrul Sportiv Apollo", "Bulevardul Energeticienilor", "Bucuresti", "Romania");

        Eveniment e1 = new Balet("balet", "Spargatorul de nuci", LocalDate.of(2024, 5, 14), "MCM", l1, 15, 15, new ArrayList<>(List.of("Lia", "Georgia")), 120);
        Eveniment e2 = new Balet("balet", "Primavara de Poveste", LocalDate.of(2024, 5, 25), "JRT", l3, 20,20, new ArrayList<>(List.of("Lia", "Georgia")), 135);
        Eveniment e3 = new Concert("concert", "Irina beach party", LocalDate.of(2024, 6, 28), "E!", l4, 200, 200, "Irina Rimes", "Pop");
        Eveniment e4 = new EvenimentSportiv("eveniment sportiv", "Meci de baschet", LocalDate.of(2024, 6, 12), "FRF", l8 ,100, 100, "baschet", new ArrayList<>(List.of("Steaua", "Dinamo")));
        Eveniment e5 = new Festival("festival", "Neversea", LocalDate.of(2024, 5, 27), "RTT", l4, 2500, 2500, 8, new ArrayList<>(List.of("Puya", "Delia")));
        Eveniment e6 = new Film("film", "Hunger Games", LocalDate.of(2024, 6, 10), "Cinema City", l5, 150, 150, "Distopic", 130);
        Eveniment e7 = new Opera("opera", "Trivineta", LocalDate.of(2024, 5, 14), "LRT", l1, 40, 40, "Adrian Nour", "Maria");
        Eveniment e8 = new PiesaDeTeatru("teatru", "Gaitele", LocalDate.of(2024, 6, 29), "TNB", l7, 70,70, new ArrayList<>(List.of("Ecaterina", "Sabina")), "comedie");
        Eveniment e9 = new PiesaDeTeatru("teatru", "Oameni buni", LocalDate.of(2024, 6, 17), "TNB", l7, 78,78, new ArrayList<>(List.of("Gelu", "Cristian")), "drama");
        Eveniment e10 = new StandUp("standup", "One Man Show", LocalDate.of(2024, 7, 18), "Club 99", l2, 60,60, new ArrayList<>(List.of("Dan Badea")), 18);

        platforma.adaugaEvenimente(e1);
        platforma.adaugaEvenimente(e2);
        platforma.adaugaEvenimente(e3);
        platforma.adaugaEvenimente(e4);
        platforma.adaugaEvenimente(e5);
        platforma.adaugaEvenimente(e6);
        platforma.adaugaEvenimente(e7);
        platforma.adaugaEvenimente(e8);
        platforma.adaugaEvenimente(e9);
        platforma.adaugaEvenimente(e10);

        Client c1 = new Client("Popescu", "Alina", LocalDate.of(2024,4,12),"ap@gmail.com", "ap", "aaa");
        Client c2 = new Client("Ionescu", "Matei", LocalDate.of(2023, 5, 15), "im@gmail.com", "im", "bbb");


        platforma.adaugaClienti(c1);
        platforma.adaugaClienti(c2);

        System.out.println("MENIU");
        int tasta = 1;
        while(tasta != 0){
            System.out.println("Pentru citirea unui eveniment de la tastatura, introduceti tasta 1: ");
            System.out.println("Pentru afisarea tuturor evenimentelor, introduceti tasta 2: ");
            System.out.println("Pentru citirea datelor unui client de la tastatura, apasati tasta 3: ");
            System.out.println("Pentru afisarea tuturor clientilor, introduceti tasta 4: ");
            System.out.println("Pentru afisarea evenimentelor dintr-un anumit oras, apasati tasta 5: ");
            System.out.println("Pentru afisarea evenimentelor dintr-un oras, la o anumita luna, apasati tasta 6: ");
            System.out.println("Pentru afisarea evenimentelor de un anumit tip, apasati tasta 7: ");
            System.out.println("Pentru afisarea evenimentelor de un anumit tip, de la o data dorita, apasati tasta 8: ");
            System.out.println("Pentru logare, introduceti tasta 9: ");
            System.out.println("Pentru delogare, introfuceti numarul 10: ");
            System.out.println("Pentru cumpararea unui bilet, introduceti numarul 11: ");
            System.out.println("Pentru afisarea tranzactiilor, introduceti numarul 12: ");
            System.out.println("Pentru parasirea meniului, introduceti tasta 0: ");

            tasta = scanner.nextInt();
            scanner.nextLine();

            switch(tasta){
                case 1:
                    System.out.println("Ce tip de eveniment doriti sa adaugati? (Concert, Balet, EvenimentSportiv, Festival, Film, Opera, PiesaDeTeatru, StandUp)");
                    String tipEveniment = scanner.nextLine();

                    switch (tipEveniment) {
                        case "concert":
                            platforma.citesteConcert();
                            break;

                        case "balet":
                            platforma.citesteBalet();
                            break;

                        case "eveniment sportiv":
                            platforma.citesteEvenimentSportiv();
                            break;

                        case "festival":
                            platforma.citesteFestival();
                            break;

                        case "film":
                            platforma.citesteFilm();
                            break;

                        case "opera":
                            platforma.citesteOpera();
                            break;

                        case "teatru":
                            platforma.citesteTeatru();
                            break;

                        case "standup":
                            platforma.citesteStandup();
                            break;

                        default:
                            System.out.println("Nu ati introdus un eveniment corespunzator.");
                            break;
                    }
                    break;

                case 2:
                    platforma.afiseazaEvenimente();
                    break;

                case 3:
                    platforma.citesteClient();
                    break;

                case 4:
                    platforma.afiseazaClienti();
                    break;

                case 5:
                    serviceOras.sorteazaEvenimenteleDupaOras(platforma.getEvenimente());
                    break;

                case 6:
                    serviceOras.sorteazaEvenimenteleDupaOrasSiData(platforma.getEvenimente());
                    break;

                case 7:
                    serviceTip.sorteazaEvenimenteleDupaTip(platforma.getEvenimente());
                    break;

                case 8:
                    serviceTip.sorteazaEvenimenteleDupaTipsiData(platforma.getEvenimente());
                    break;

                case 9:
                    System.out.println("Introduceti username-ul: ");
                    String usernameLogare = scanner.nextLine();

                    System.out.println("Introduceti parola: ");
                    String parolaLogare = scanner.nextLine();
                    serviceBilete.logare(platforma.getClienti(), usernameLogare, parolaLogare);
                    break;

                case 10:
                    System.out.println("Introduceti username-ul: ");
                    String usernameDelogare = scanner.nextLine();

                    serviceBilete.delogare(platforma.getClienti(), usernameDelogare);

                    break;

                case 11:
                    serviceBilete.cumparaBilet(platforma.getClienti(), platforma.getEvenimente(), c1);
                    break;

                case 12:
                    serviceBilete.afiseazaTranzactii();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Ati introdus o tasta necorespunzatoare");
            }
        }
    }
}