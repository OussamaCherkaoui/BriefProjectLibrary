import com.sun.org.apache.bcel.internal.generic.SWITCH;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    Library library = new Library();

    public void menuPrincipal(){
        System.out.println("MENU DE BIBLIOTHEQUE :");
        System.out.println("\t1-Livres ");
        System.out.println("\t2-Apprenants ");
        System.out.print("CHOISISSEZ :  ");
        int choix = scanner.nextInt();
        choiceMenuprincipal(choix);
    }

    public void menuBooks() {
        System.out.println("MENU DES LIVRES DU BIBLIOTHEQUE:");
        System.out.println("\t1-Ajouter un livre ");
        System.out.println("\t2-Supprimer un livre ");
        System.out.println("\t3-Modifier les informations d' un livre ");
        System.out.println("\t4-Afficher les livres disponible  ");
        System.out.println("\t5-Retour au menu principal  ");
        int choix = scanner.nextInt();
        choiceMenuBook(choix);
    }

    public void menuStudents(){
        System.out.println("MENU DES APPRENANTS DU BIBLIOTHEQUE:");
        System.out.println("\t1-Ajouter un apprenant ");
        System.out.println("\t2-Supprimer un apprenant ");
        System.out.println("\t3-Modifier les informations d' un apprenant ");
        System.out.println("\t4-Afficher les apprenants disponible  ");
        System.out.println("\t5-Retour au menu principal  ");
        int choix = scanner.nextInt();
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
                library.AddBook();
                menuBooks();
                break;
            case 2:
                System.out.println("\t2-Supprimer un livre ");
                break;
            case 3:
                System.out.println("\t3-Modifier les informations d' un livre ");
                break;
            case 4:
                library.showBooks();
                break;
            case 5:
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
                System.out.println("\t1-Ajouter un apprenant ");
                break;
            case 2:
                System.out.println("\t2-Supprimer un apprenant ");
                break;
            case 3:
                System.out.println("\t3-Modifier les informations d' un apprenant ");
                break;
            case 4:
                System.out.println("\t4-Afficher les apprenants disponible  ");
                break;
            case 5:
                menuPrincipal();
                break;
            default:
                System.out.println("\t Choix invalid !! ressayer .. ");
                menuStudents();
                break;
        }
    }
}