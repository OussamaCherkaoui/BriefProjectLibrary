import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Student {
    private static Scanner scanner = new Scanner(System.in);
    public String Nom ;
    public int NumeroIdentification;
    public String Adresse;

    public String Mail;

    public int Telephone;
    private ArrayList<Book> BookBorrow = new ArrayList<>();

    public Student() {

    }

    public ArrayList<Book> getBookBorrow() {
        return BookBorrow;
    }

    public void setBookBorrow(Book bookBorrow) {
        this.BookBorrow.add(bookBorrow);
    }

    public Student(String Nom, int NumeroIdentification, String Adresse, String Mail, int Telephone)
    {
        this.Nom=Nom;
        this.NumeroIdentification=NumeroIdentification;
        this.Adresse=Adresse;
        this.Mail=Mail;
        this.Telephone=Telephone;
    }

    public void editionStudent(Student student){
        int choix;

        System.out.println("Quelle est l information que voulez-vous modifier :\n1-Nom \n2-Numero d' identification \n3-Adresse \n4-Mail \n5-Telephone");choix = scanner.nextInt();

        switch (choix)
        {
            case 1:
                System.out.print("\tNom : ");
                student.Nom = scanner.next();
                break;
            case 2:
                System.out.print("\tNumero d' identification : ");
                student.NumeroIdentification = scanner.nextInt();
                break;
            case 3:
                System.out.print("\tAdresse : ");
                student.Adresse= scanner.next();
                break;
            case 4:
                System.out.print("\tMail : ");
                student.Mail= scanner.next();
                break;
            case 5:
                System.out.print("\tTelephone : ");
                student.Telephone = scanner.nextInt();
                break;
            default:
                System.out.println("CHOIX INVALID !! Ressayer..");
                editionStudent(student);
                break;
        }
        System.out.println("Modification effectuer avec succes");
    }

}
