import java.util.Scanner;
public class Array1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeri = new int[10];  // Creo un array di 10 elementi
        int somma = 0;

        for (int i = 0; i < numeri.length; i++) {
            System.out.print("Inserisci numero " + (i + 1) + ": ");
            numeri[i] = input.nextInt();  // Memorizzo il numero nell’array
            somma += numeri[i];           // Aggiungo il numero alla somma
        }
        System.out.println("La somma dei numeri è: " + somma);

        input.close();
        }
    }