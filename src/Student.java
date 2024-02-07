import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Student {
    public String Nom ;
    public int NumeroIdentification;
    public String Adresse;

    public String Mail;

    public int Telephone;

    public Student(String Nom,int NumeroIdentification,String Adresse,String Mail,int Telephone)
    {
        this.Nom=Nom;
        this.NumeroIdentification=NumeroIdentification;
        this.Adresse=Adresse;
        this.Mail=Mail;
        this.Telephone=Telephone;
    }

    ArrayList<Objects> BookBorrow = new ArrayList<>();

}
