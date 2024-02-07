import java.time.LocalDate;
import java.util.Date;

public class Book {
    public String Titre ;
    public String Auteur;
    public int NumeroISBN;
    public LocalDate DatePublication;

    public String Emprunteur;

    public Book(String Titre,String Auteur,int NumeroISBN,LocalDate DatePublication,String Emprunteur)
    {
        this.Titre=Titre;
        this.Auteur=Auteur;
        this.NumeroISBN=NumeroISBN;
        this.DatePublication=DatePublication;
        this.Emprunteur=Emprunteur;
    }

    public static void EditionBook(){

    }

}
