import java.util.List;

public interface ServiceBileteInterface {
    public boolean logare(List<Client> clienti, String usernameLogare, String parolaLogare);

    public void delogare(List<Client> clienti, String usernameLogare);

    public void cumparaBilet(List<Client> clienti, List<Eveniment> evenimente, Client clientLogat);

    public void afiseazaTranzactii();
}
