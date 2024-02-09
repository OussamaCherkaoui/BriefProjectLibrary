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

    String Titre,Auteur,DatePublication,Nom,Adresse,Mail;
    int NumeroISBN,NumeroIdentification,Telephone;
    Student emprunteur;


    public void addBook() {
        boolean empruntdispo =false;
        System.out.println("Remplir les Information du livre que voulez-vous ajouter :");
        System.out.print("\tTitre :"); Titre = scanner.next();
        System.out.print("\tAuteur :"); Auteur = scanner.next();
        System.out.print("\tNumero ISBN :"); NumeroISBN = scanner.nextInt();
        for (Book book : Books) {
            if (book.NumeroISBN == NumeroISBN){
                System.out.println("Numero ISBN est d' un autre livre , Ressayer avec le numéro ISBN réel du livre!!");
                System.out.print("\tNumero ISBN :"); NumeroISBN = scanner.nextInt();
            }
        }
        System.out.print("\tDate de publication :"); DatePublication = scanner.next();
        LocalDate date = LocalDate.parse(DatePublication, dateFormatter);
        System.out.print("\tNuméro d' identification d' emprunteur :");NumeroIdentification = scanner.nextInt();
        for (Student student : Students) {
            if (student.NumeroIdentification == NumeroIdentification){
                emprunteur = student;
                empruntdispo=true;
            }
        }
        if(!empruntdispo)
        {
            System.out.println("\tNuméro d' identification indisponible !! Ressayer..");
            System.out.print("\tNuméro d' identification d' emprunteur :");NumeroIdentification = scanner.nextInt();
        }
        Book book = new Book(Titre,Auteur,NumeroISBN,date);
        book.setEmprunteur(emprunteur);
        Books.add(book);
        System.out.println("Ajout effectuer avec succes");
    }

    public void editEmprunt(Book book)
    {
        int numeroIdentification;
        System.out.print("\tNuméro d' identification d' emprunteur :");numeroIdentification = scanner.nextInt();

        for (Student student : Students) {
            if (student.NumeroIdentification == numeroIdentification){
                book.setEmprunteur(student);
                break;
            }
        }
    }
    public int deleteBook(){
        int ISBN;
        System.out.println("Entrer le numero ISBN du livre que voulez-vous supprimer :");ISBN = scanner.nextInt();
        for (Book book : Books) {
            if (book.NumeroISBN == ISBN) {
                Books.remove(book);
                return 1;
            }
        }
        System.out.println("Suppression effectuer avec succes");
        showBooks();
        return 0;
    }

    public Book findBook(){
        int ISBN;
        System.out.println("Entrer le numero ISBN du livre que voulez-vous modifier :");ISBN = scanner.nextInt();
        for (Book book : Books) {
            if (book.NumeroISBN == ISBN){
                return book;
            }
        }
        return null;
    }
    public int searchBook(){
        int ISBN;
        int i=0;
        System.out.println("Entrer le numero ISBN du livre que voulez-vous chercher : ");ISBN = scanner.nextInt();
        for (Book book : Books) {
            if (book.NumeroISBN == ISBN) {
                System.out.println("Livre : ");
                System.out.println("\tTitre : "+book.Titre);
                System.out.println("\tAuteur : "+book.Auteur);
                System.out.println("\tNumero ISBN : "+book.NumeroISBN);
                System.out.println("\tDate de publication : "+book.DatePublication);
                System.out.println("\tEmprunteur : "+book.getEmprunteur().Nom);
                i++;
            }
        }
        return i;
    }
    public int showBooks(){
        int i=0;
        for (Book book : Books)
        {
            i++;
            System.out.println("Livre "+i+" : ");
            System.out.println("\tTitre : "+book.Titre);
            System.out.println("\tAuteur : "+book.Auteur);
            System.out.println("\tNumero ISBN : "+book.NumeroISBN);
            System.out.println("\tDate de publication : "+book.DatePublication);
            System.out.println("\tEmprunteur : "+book.getEmprunteur().Nom);
        }
        return i;
    }
    public void addStudent() {
        System.out.println("Remplir les Information de l' apprenant que voulez-vous ajouter :");
        System.out.print("\tNom :"); Nom = scanner.next();
        System.out.print("\tNumeroIdentification :"); NumeroIdentification = scanner.nextInt();
        for (Student student : Students) {
            if (student.NumeroIdentification == NumeroIdentification) {
                System.out.println("Numero d' identifiaction est d' un autre apprenant !! Ressayer..");
                System.out.print("\tNumeroIdentification :"); NumeroIdentification = scanner.nextInt();
            }
        }
        System.out.print("\tAdresse :"); Adresse = scanner.next();
        System.out.print("\tMail :"); Mail = scanner.next();
        System.out.print("\tTelephone :"); Telephone = scanner.nextInt();
        Student student = new Student(Nom,NumeroIdentification,Adresse,Mail,Telephone);
        Students.add(student);
        System.out.println("Ajout effectuer avec succes");
    }

    public boolean deleteStudent(){
        int numeroIdentification;
        System.out.println("Entrer le numero d' identification de l' apprenant que voulez-vous supprimer :");numeroIdentification = scanner.nextInt();
        for (Student student : Students) {
            if (student.NumeroIdentification == numeroIdentification) {
                Students.remove(student);
                System.out.println("Suppression effectuer avec succes");
                showBooks();
                return true;
            }
        }
        return false;
    }
    public Student findStudent(){
        int numeroIdentification;
        boolean studentdispo=false;
        System.out.println("Entrer le numero d' identification de l' apprenant que voulez-vous modifier :");numeroIdentification = scanner.nextInt();
        for (Student student : Students) {
            if (student.NumeroIdentification == numeroIdentification){
                studentdispo=true;
                return student;
            }
        }
        return null;
    }
    public boolean searchStudent(){
        int numeroIdentification;
        System.out.println("Entrer le numero d' identification de l' apprenant que voulez-vous supprimer :");numeroIdentification = scanner.nextInt();
        for (Student student : Students) {
            if (student.NumeroIdentification == numeroIdentification) {
                System.out.println("Apprenant :");
                System.out.println("\tNom :"+student.Nom);
                System.out.println("\tNumeroIdentification :"+student.NumeroIdentification);
                System.out.println("\tAdresse :"+student.Adresse);
                System.out.println("\tMail :"+student.Mail);
                System.out.println("\tTelephone :"+student.Telephone);
                return true;
            }
        }
        return false;
    }
    public int showStudent(){
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
        return i;
    }
}