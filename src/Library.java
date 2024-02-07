import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;


public class Library {
    private static Scanner scanner = new Scanner(System.in);
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    ArrayList<Student> Students = new ArrayList<>();
    ArrayList<Book> Books = new ArrayList<>();

    String Titre,Auteur,Emprunteur,DatePublication,Nom,Adresse,Mail;
    int NumeroISBN,NumeroIdentification,Telephone;


    public void addBook() {
        System.out.println("Remplir les Information du livre que voulez-vous ajouter :");
        System.out.print("\tTitre :"); Titre = scanner.next();
        System.out.print("\tAuteur :"); Auteur = scanner.next();
        System.out.print("\tNumero ISBN :"); NumeroISBN = scanner.nextInt();
        System.out.print("\tDate de publication :"); DatePublication = scanner.next();
        LocalDate date = LocalDate.parse(DatePublication, dateFormatter);
        System.out.print("\tEmprunteur :"); Emprunteur = scanner.next();

        Book book = new Book(Titre,Auteur,NumeroISBN,date,Emprunteur);
        Books.add(book);
        System.out.println("Ajout effectuer avec succes");
    }

    public void deleteBook(){
        int ISBN;
        System.out.println("Entrer le numero ISBN du livre que voulez-vous supprimer :");ISBN = scanner.nextInt();
        for (Book book : Books) {
            if (book.NumeroISBN == ISBN) {
                Books.remove(book);
            }
        }
        System.out.println("Suppression effectuer avec succes");
        showBooks();
    }
    public void searchBook(){

    }
    public void showBooks(){
        int i=0;
        for (Book book : Books)
        {
            i++;
            System.out.println("Livre "+i+":");
            System.out.println("\tTitre :"+book.Titre);
            System.out.println("\tAuteur :"+book.Auteur);
            System.out.println("\tNumero ISBN :"+book.NumeroISBN);
            System.out.println("\tDate de publication :"+book.DatePublication);
            System.out.println("\tEmprunteur :"+book.Emprunteur);
        }
    }
    public void addStudent() {
        System.out.println("Remplir les Information de l' apprenant que voulez-vous ajouter :");
        System.out.print("\tNom :"); Nom = scanner.next();
        System.out.print("\tNumeroIdentification :"); NumeroIdentification = scanner.nextInt();
        System.out.print("\tAdresse :"); Adresse = scanner.next();
        System.out.print("\tMail :"); Mail = scanner.next();
        System.out.print("\tTelephone :"); Telephone = scanner.nextInt();
        Student student = new Student(Nom,NumeroIdentification,Adresse,Mail,Telephone);
        Students.add(student);
        System.out.println("Ajout effectuer avec succes");
    }

    public void deleteStudent(){
        int NI;
        System.out.println("Entrer le numero d' identification de l' apprenant que voulez-vous supprimer :");NI = scanner.nextInt();
        for (Student student : Students) {
            if (student.NumeroIdentification == NI) {
                Students.remove(student);
            }
        }
        System.out.println("Suppression effectuer avec succes");
        showBooks();
    }
    public void searchStudent(){

    }
    public void showStudent(){
        int i=0;
        for (Student student : Students)
        {
            i++;
            System.out.println("Apprenant "+i+":");
            System.out.println("\tNom :"+student.Nom);
            System.out.println("\tNumeroIdentification :"+student.NumeroIdentification);
            System.out.println("\tAdresse :"+student.Adresse);
            System.out.println("\tMail :"+student.Mail);
            System.out.println("\tTelephone :"+student.Telephone);
        }
    }
}