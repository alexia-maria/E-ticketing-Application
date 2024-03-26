import java.util.Date;

public class Client {
    private int id;
    private String nume;
    private String prenume;
    private Date dataInregistrare;
    private String email;

    // Constructor
    public Client(int id, String nume, String prenume, String email) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.dataInregistrare = dataInregistrare;
        this.email = email;
    }

    // Getter pentru id
    public int getId() {
        return id;
    }

    // Setter pentru id
    public void setId(int id) {
        this.id = id;
    }

    // Getter pentru nume
    public String getNume() {
        return nume;
    }

    // Setter pentru nume
    public void setNume(String nume) {
        this.nume = nume;
    }

    // Getter pentru prenume
    public String getPrenume() {
        return prenume;
    }

    // Setter pentru prenume
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    // Getter pentru dataInregistrare
    public Date getDataInregistrare() {
        return dataInregistrare;
    }

    // Setter pentru dataInregistrare
    public void setDataInregistrare(Date dataInregistrare) {
        this.dataInregistrare = dataInregistrare;
    }

    // Getter pentru email
    public String getEmail() {
        return email;
    }

    // Setter pentru email
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", dataInregistrare=" + dataInregistrare +
                ", email='" + email + '\'' +
                '}';
    }
}


