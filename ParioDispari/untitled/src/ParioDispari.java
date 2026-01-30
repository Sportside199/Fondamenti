import java.util.Scanner;
public class ParioDispari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Inserisci un numero (1 per uscire): ");
            numero = input.nextInt();

            if (numero == 1) {
                System.out.println("Programma terminato.");
                break;
            }
            if (numero % 2 == 0) {
                System.out.println(numero + " è pari");
            } else {
                System.out.println(numero + " è dispari");
            }
            } while (numero != 1);

            input.close();
        }
}