import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;


public class Library {
    private static Scanner scanner = new Scanner(System.in);
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    ArrayList<Student> Apprenants = new ArrayList<>();
    ArrayList<Book> Books = new ArrayList<>();

    String Titre,Auteur,Emprunteur;
    int NumeroISBN;
    String DatePublication;

    public void AddBook() {
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

    }
    public void searchBook(){

    }
    public void showBooks(){
        int i=0;
        for (Book book : Books)
        {
            i++;
            System.out.println("Book "+i+":");
            System.out.println("\tTitre :"+book.Titre);
            System.out.println("\tAuteur :"+book.Auteur);
            System.out.println("\tNumero ISBN :"+book.NumeroISBN);
            System.out.println("\tDate de publication :"+book.DatePublication);
            System.out.println("\tEmprunteur :"+book.Emprunteur);
        }
    }
}