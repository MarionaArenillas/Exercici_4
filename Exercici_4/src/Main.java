//llibreria que utilitzarem per llegir el número demanat a l'usuari
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //donar la benvinguda a l'usuari
        System.out.println("Benvingut al programa!");
        Scanner input = new Scanner(System.in);

        //demanar número de noies que hi ha a la classe i llegir resultat
        int noies;
        do {
            System.out.println("Quantes noies hi ha a la classe?: ");
            noies = input.nextInt();
        } while (noies < 0);

        //demanar número de nois que hi ha a la classe i llegir resultat
        int nois;
        do {
            System.out.println("Quants nois hi ha a la classe?: ");
            nois = input.nextInt();
        } while (nois < 0);

        //fer la suma del total d'alumnes de la classe
        int total = noies + nois;

        //calcular i mostrar els percentatges
        int percentatgeNoies = ((noies * 100)/total);
        int percentatgeNois = ((nois * 100)/total);

        //mostrar els resultats per pantalla
        System.out.println("Hi ha un "+percentatgeNoies+"% de noies i un "+percentatgeNois+"% de nois");

    }
}