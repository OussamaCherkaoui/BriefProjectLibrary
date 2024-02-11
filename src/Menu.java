import com.sun.org.apache.bcel.internal.generic.SWITCH;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    Library library = new Library();

    public void menuPrincipal(){
        System.out.println("--------------------------MENU DE BIBLIOTHEQUE-------------------------- ");
        System.out.println("\t1-Livres ");
        System.out.println("\t2-Apprenants ");
        System.out.println("\t3-Réserver un livre à un apprenant ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.print("CHOISISSEZ :  ");
        int choix = scanner.nextInt();
        choiceMenuprincipal(choix);
    }

    public void menuBooks() {
        System.out.println("--------------------------MENU DES LIVRES DU BIBLIOTHEQUE--------------------------");
        System.out.println("\t1-Ajouter un livre ");
        System.out.println("\t2-Supprimer un livre ");
        System.out.println("\t3-Modifier les informations d' un livre ");
        System.out.println("\t4-Afficher les livres disponible  ");
        System.out.println("\t5-Chercher un livres ");
        System.out.println("\t6-Retour au menu principal  ");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.print("CHOISISSEZ :  ");int choix = scanner.nextInt();
        choiceMenuBook(choix);
    }

    public void menuStudents(){
        System.out.println("--------------------------MENU DES APPRENANTS DU BIBLIOTHEQUE--------------------------");
        System.out.println("\t1-Ajouter un apprenant ");
        System.out.println("\t2-Supprimer un apprenant ");
        System.out.println("\t3-Modifier les informations d' un apprenant ");
        System.out.println("\t4-Afficher les apprenants disponible  ");
        System.out.println("\t5-Chercher un apprenant");
        System.out.println("\t6-Afficher les livres reserver pour un apprenant");
        System.out.println("\t7-Retour au menu principal  ");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.print("CHOISISSEZ :  ");int choix = scanner.nextInt();
        choiceMenuStudent(choix);
    }

    public void choiceMenuprincipal(int choix) {
        switch (choix)
        {
            case 1:
                menuBooks();
                break;
            case 2:
                menuStudents();
                break;
            case 3:
                library.reserveBook();
                menuPrincipal();
                break;
            default:
                System.out.println("\t Choix invalid !! ressayer .. ");
                menuPrincipal();
                break;
        }
    }
    public void choiceMenuBook(int choix) {
        switch (choix)
        {
            case 1:
                library.addBook();
                menuBooks();
                break;
            case 2:
                library.deleteBook();
                menuBooks();
                break;
            case 3:
                Book book = library.findBook();
                book.editionBook();
                library.showBooks();
                menuBooks();
                break;
            case 4:
                library.showBooks();
                menuBooks();
                break;
            case 5:
                library.searchBook();
                menuBooks();
                break;
            case 6:
                menuPrincipal();
                break;
            default:
                System.out.println("\t Choix invalid !! ressayer .. ");
                menuBooks();
                break;
        }
    }
    public void choiceMenuStudent(int choix) {
        switch (choix)
        {
            case 1:
                library.addStudent();
                menuStudents();
                break;
            case 2:
                library.deleteStudent();
                menuStudents();
                break;
            case 3:
                Student student = library.findStudent();
                student.editionStudent(student);
                library.showStudent();
                menuStudents();
                break;
            case 4:
                library.showStudent();
                menuStudents();
                break;
            case 5:
                library.searchStudent();
                menuStudents();
                break;
            case 6:
                library.listBookForStudent();
                menuStudents();
                break;
            case 7:
                menuPrincipal();
                break;
            default:
                System.out.println("\t Choix invalid !! ressayer .. ");
                menuStudents();
                break;
        }
    }
}