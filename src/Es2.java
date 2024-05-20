import java.util.Scanner;

public class Es2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci la prima stringa: ");
        String firstString = sc.nextLine();

        System.out.print("Inserisci la seconda stringa: ");
        String secondString = sc.nextLine();

        System.out.print("Inserisci la terza stringa: ");
        String thirdString = sc.nextLine();

        String inOrder = firstString + secondString + thirdString;
        System.out.println("Ordine di inserimento: " + inOrder);

        String concatenationReverseOrder = thirdString + secondString + firstString;
        System.out.println("Ordine inverso: " + concatenationReverseOrder);

        sc.close();
    }
}
