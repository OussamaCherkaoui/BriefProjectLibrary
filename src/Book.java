import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Book {
    private static Scanner scanner = new Scanner(System.in);
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public String Titre ;
    public String Auteur;
    public int NumeroISBN;
    public LocalDate DatePublication;

    private Student Emprunteur;

    Library library = new Library();
    Student emprunteur;

    public Book(String Titre,String Auteur,int NumeroISBN,LocalDate DatePublication)
    {
        this.Titre=Titre;
        this.Auteur=Auteur;
        this.NumeroISBN=NumeroISBN;
        this.DatePublication=DatePublication;
        this.Emprunteur=null;
    }

    public Book() {

    }

    public void editionBook(){
        int choix;
        String datePublication;

        System.out.println("Quelle est l information que voulez-vous modifier :\n1-Titre \n2-Auteur \n3-Numero ISBN \n4-Date de publication");choix = scanner.nextInt();

                switch (choix)
                {
                    case 1:
                        System.out.print("\tTitre : ");
                        this.Titre = scanner.next();
                        break;
                    case 2:
                        System.out.print("\tAuteur : ");
                        this.Auteur = scanner.next();
                        break;
                    case 3:
                        System.out.print("\tNumero ISBN : ");
                        this.NumeroISBN = scanner.nextInt();
                        break;
                    case 4:
                        System.out.print("\tDate de publication : ");
                        datePublication= scanner.next();
                        LocalDate date = LocalDate.parse(datePublication, dateFormatter);
                        this.DatePublication=date;
                        break;
                    default:
                        System.out.println("CHOIX INVALID !! Ressayer..");
                        this.editionBook();
                        break;
        }
        System.out.println("Modification effectuer avec succes");
    }

    public Student getEmprunteur() {
        return Emprunteur;
    }

    public void setEmprunteur(Student emprunteur) {
        this.Emprunteur = emprunteur;
    }
}
