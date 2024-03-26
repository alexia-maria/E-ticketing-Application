

public class Main {
    public static void main(String[] args) {

        PlatformaET platforma = new PlatformaET();
        platforma.adaugaClient(new Client(1, "a", "b", "abb"));
        platforma.adaugaClient(new Client(2, "b", "c", "abb"));
        platforma.afiseazaClienti();
    }
}