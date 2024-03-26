import java.util.ArrayList;
import java.util.List;

public class PlatformaET {
    public List<Client> clienti;
    public List<Eveniment> evenimente;

    public PlatformaET() {
        this.evenimente = new ArrayList<>();
        this.clienti = new ArrayList<>();
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

    public void adaugaClient(Client c){
        clienti.add(c);
    }

    public void afiseazaClienti(){
        for(Client c: clienti){
            System.out.printf(c.toString());
        }
    }
}
