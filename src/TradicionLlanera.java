
import java.util.Scanner;

public class TradicionLlanera {

    public static void main(String[] args) {

        Scanner Digita = new Scanner(System.in);
        

        System.out.print("Ingrese el valor base del consumo: ");
        double valorBase = Digita.nextDouble();

        double impuesto = valorBase * 0.08;
        double propina = 0;

        System.out.print("¿Desea pagar propina voluntaria? (S/N): ");
        char respuesta = Digita.next().toUpperCase().charAt(0);

        if (respuesta == 'S') {
            propina = valorBase * 0.05;
        }

        double total = valorBase + impuesto + propina;

        System.out.println("\n--- FACTURA ---");
        System.out.println("Valor base: $" + valorBase);
        System.out.println("Impuesto (8%): $" + impuesto);
        System.out.println("Propina: $" + propina);
        System.out.println("Total a pagar: $" + total);

        Digita.close();
    }


}


