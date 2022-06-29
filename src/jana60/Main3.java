package jana60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Benvenuto in Lista.Desideri");
        ArrayList<String> desideri = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Premi 1 per aggiungere un desiderio o 2 per uscire");
        String option = scan.nextLine();

        //switch per uscire subito o avviare il programma
        switch (option){
            case "1":
                boolean repeat;
                //ciclo per inserire uno o più desideri
                do {
                    System.out.println("Prego inserisci un tuo desiderio: ");
                    desideri.add(scan.nextLine());
                    System.out.println("Al momento hai: "+desideri.size()+" desideri.");


                    //controllo della risposta
                    String opt2;
                    boolean wrong=true;
                    do {
                        System.out.println("Vuoi aggiungere altro? 1 per continuare o 2 per uscire");
                        opt2 = scan.nextLine();
                        if (opt2.equals("1")||opt2.equals("2")) {
                            wrong = false;
                        }else
                            System.out.println("Solo 1 o 2 sono ammessi.");
                    }while (wrong);

                    repeat = opt2.equals("1");

                }while (repeat);

            case "2":
                scan.close();
                if (desideri.size()>0) {
                    Collections.sort(desideri);
                    System.out.println("Ecco la lista dei tuoi desideri: " + desideri);
                    System.out.println("Grazie, li terremo al sicuro per te.");
                } else
                    System.out.println("Sembra tu non abbia desideri.");

        }
    }
}
