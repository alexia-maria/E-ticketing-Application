import java.time.LocalDate;
import java.util.Date;

public class Client {

    private static int ultimIdClient = 0;
    private int idClient;
    private String nume;
    private String prenume;
    private LocalDate dataInregistrare;
    private String email;

    private String username;
    private String parola;

    private boolean esteLogat;

     Client(){
        this.idClient = ++ultimIdClient;
    }

    // Constructor
//    public Client(String nume, String prenume, LocalDate dataInregistrare, String email, String username, String parola) {
//        this.idClient = ++ultimIdClient;
//        this.nume = nume;
//        this.prenume = prenume;
//        this.dataInregistrare = dataInregistrare;
//        this.email = email;
//        this.username = username;
//        this.parola = parola;
//        this.esteLogat = false;
//    }

    public static class ClientBuilder{
        private Client client;

        private static ClientBuilder instance;

        public ClientBuilder(){
            client = new Client();
        }

//        public static ClientBuilder getInstance(){
//            if(instance == null){
//                instance = new ClientBuilder();
//            }
//            return instance;
//        }

        public ClientBuilder setNume(String nume){
            client.setNume(nume);
            return this;
        }

        public ClientBuilder setPrenume(String prenume){
            client.setPrenume(prenume);
            return this;
        }

        public ClientBuilder setDataInregistrare(LocalDate dataInregistrare){
            client.setDataInregistrare(dataInregistrare);
            return this;
        }

        public ClientBuilder setEmail(String email){
            client.setEmail(email);
            return this;
        }

        public ClientBuilder setUsername(String username){
            client.setUsername(username);
            return this;
        }

        public ClientBuilder setParola(String parola){
            client.setParola(parola);
            return this;
        }

        public ClientBuilder setEsteLogat(boolean esteLogat){
            client.setEsteLogat(esteLogat);
            return this;
        }

        public Client build() {
            return client;
        }


    }

    public boolean isEsteLogat() {
        return esteLogat;
    }

    public void setEsteLogat(boolean esteLogat) {
        this.esteLogat = esteLogat;
    }

    // Getter pentru id
    public int getId() {
        return idClient;
    }

    // Setter pentru id
    public void setId(int id) {
        this.idClient = id;
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


    public LocalDate getDataInregistrare() {
        return dataInregistrare;
    }


    public void setDataInregistrare(LocalDate dataInregistrare) {
        this.dataInregistrare = dataInregistrare;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + idClient +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", dataInregistrare=" + dataInregistrare +
                ", email='" + email + '\'' +
                '}';
    }
}


