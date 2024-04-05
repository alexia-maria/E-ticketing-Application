import java.util.Date;
import java.time.LocalDate;

public class Opera extends Eveniment{
    private String tenor;
    private String soprana;

    public Opera(String tip, String denumire, LocalDate data, String organizator, Locatie locatie, int numarTotalBilete, int numarBileteRamase, String tenor, String soprana) {
        super(tip, denumire, data, organizator, locatie, numarTotalBilete, numarBileteRamase);
        this.tenor = tenor;
        this.soprana = soprana;
    }

    public String getTenor() {
        return tenor;
    }

    public void setTenor(String tenor) {
        this.tenor = tenor;
    }

    public String getSoprana() {
        return soprana;
    }

    public void setSoprana(String soprana) {
        this.soprana = soprana;
    }

    @Override
    public String toString() {
        return super.toString()+ "Opera{" +
                "tenor='" + tenor + '\'' +
                ", soprana='" + soprana + '\'' +
                '}';
    }
}
