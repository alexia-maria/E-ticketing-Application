import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class Tranzactie {
    private static int ultimIdTranzactie = 0;
    private int idTranzactie;
    private int idClient;

    private Set<Integer> idEvenimente;

    private LocalDate dataTranzactie;

    private int pret;

    public Tranzactie(int idClient, Set<Integer> idEvenimente, LocalDate dataTranzactie, int pret) {
        this.idTranzactie = ++ultimIdTranzactie;
        this.idClient = idClient;
        this.idEvenimente = idEvenimente;
        this.dataTranzactie = dataTranzactie;
        this.pret = pret;
    }

    public int getIdTranzactie() {
        return idTranzactie;
    }

    public void setIdTranzactie(int idTranzactie) {
        this.idTranzactie = idTranzactie;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public Set<Integer> getIdEvenimente() {
        return idEvenimente;
    }

    public void setIdEvenimente(Set<Integer> idEvenimente) {
        this.idEvenimente = idEvenimente;
    }

    public LocalDate getDataTranzactie() {
        return dataTranzactie;
    }

    public void setDataTranzactie(LocalDate dataTranzactie) {
        this.dataTranzactie = dataTranzactie;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Tranzactie{" +
                "idTranzactie=" + idTranzactie +
                ", idClient=" + idClient +
                ", idEvenimente=" + idEvenimente +
                ", dataTranzactie=" + dataTranzactie +
                ", pret=" + pret +
                '}';
    }
}
