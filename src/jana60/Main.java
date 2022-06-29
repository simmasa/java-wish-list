package jana60;
/*
    Creare una classe Main con metodo main in cui implementare il seguente programma:
    Creare una lista dei desideri vuota e chiedere all’utente di aggiungere i suoi desideri uno alla volta, fino a che sceglie di fermarsi.
    Ogni volta che viene aggiunto un desiderio stampare a video quanti desideri sono contenuti nella lista in quel momento.
    Al termine dell’inserimento stampare a video la lista ordinata.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Benvenuto");
        boolean repeat;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDesideri = new ArrayList<>();
        ArrayList<String> creatori = new ArrayList<>();

        do {
            System.out.println("Inserisci desiderio :");
            listaDesideri.add(scanner.nextLine());
            System.out.println("Al momento hai "+listaDesideri.size()+" desideri.");


            System.out.println("Per aggiungere un desiderio premi 's' oppure 'n' per uscire");
            String option = scanner.nextLine();
            repeat = option.equals("s");

        }while (repeat || listaDesideri.size()<=10);

        Collections.sort(listaDesideri);
        System.out.println("Ecco la tua lista di desideri: "+listaDesideri);
        System.out.println("Grazie.");
        scanner.close();

        creatori.add("Gaetano D'Acunzo");
        creatori.add("Davide Catalano");
        creatori.add("Simone Masala");
        creatori.add("Alessia Biagi");
        creatori.add("Oliviero Pinto");
        Collections.sort(creatori);
        System.out.println("Ecco gli aiutanti di Babbo Natale: "+creatori);

    }
}
