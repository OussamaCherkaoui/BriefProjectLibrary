import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Student {
    public String Nom ;
    public int NumeroIdentification;
    public String Adresse;

    public String mail;

    public int Telephone;

    public Student(String Nom,int NumeroIdentification,String Adresse,String mail,int Telephone)
    {
        this.Nom=Nom;
        this.NumeroIdentification=NumeroIdentification;
        this.Adresse=Adresse;
        this.mail=mail;
        this.Telephone=Telephone;
    }

    ArrayList<Objects> BookBorrow = new ArrayList<>();

}
