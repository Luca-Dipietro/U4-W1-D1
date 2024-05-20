import java.util.Scanner;

public class Es3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserisci il primo lato del rettangolo: ");
        double lato1Rettangolo = sc.nextDouble();
        System.out.print("Inserisci il secondo lato del rettangolo: ");
        double lato2Rettangolo = sc.nextDouble();
        double perimetroRett = perimetroRettangolo(lato1Rettangolo, lato2Rettangolo);
        System.out.println("Il perimetro del rettangolo è: " + perimetroRett);

        System.out.print("Inserisci un numero: ");
        int numero = sc.nextInt();
        int result = pariDispari(numero);
        if (result == 0) {
            System.out.println("Il numero è pari");
        } else {
            System.out.println("Il numero è dispari");
        }

        System.out.print("Inserisci il primo lato del triangolo: ");
        double lato1Triangolo = sc.nextDouble();
        System.out.print("Inserisci il secondo lato del triangolo: ");
        double lato2Triangolo = sc.nextDouble();
        System.out.print("Inserisci il terzo lato del triangolo: ");
        double lato3Triangolo = sc.nextDouble();
        double areaTriangolo = perimetroTriangolo(lato1Triangolo, lato2Triangolo, lato3Triangolo);
        System.out.println("L'area del triangolo è: " + areaTriangolo);

        sc.close();
    }

    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    public static int pariDispari(int numero) {
        return numero % 2 == 0 ? 0 : 1;
    }

    public static double perimetroTriangolo(double lato1, double lato2, double lato3) {
        double semiPerimetro = (lato1 + lato2 + lato3) / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - lato1) * (semiPerimetro - lato2) * (semiPerimetro - lato3));
    }
}
