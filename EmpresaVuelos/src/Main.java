import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int matrizVuelos[][] = new int[6][3];
        Scanner keyIn = new Scanner(System.in);

        System.out.println("Hello and welcome!");

        // Cargamos la matriz
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la cantidad de vuelos para el destino " + i + ", horario " + j);
                matrizVuelos[i][j] = keyIn.nextInt();
            }
        }

        // Venta de asientos
        Scanner keyStr = new Scanner(System.in);
        String opc = "";

        int destino, horario, asientos;

        while (!opc.equalsIgnoreCase("finish")) {
            System.out.println("<---------->");
            System.out.println("Ingrese el número del destino");
            destino = keyIn.nextInt() - 1;
            System.out.println("Ingreseo el número del horario 1 (Mañana), 2 (Tarde), 3 (Noche)");
            horario = keyIn.nextInt() - 1;
            System.out.println("Ingrese la cantidad de asientos que desea reservar");
            asientos = keyIn.nextInt();

            if (destino >= 0 && destino <= 5) {
                if (horario >= 0 && horario <= 2) {
                    if (matrizVuelos[destino][horario] >= asientos) {
                        System.out.println("La reserva ha sido creada con éxito");
                        matrizVuelos[destino][horario] = matrizVuelos[destino][horario] - asientos;
                    } else {
                        System.out.println("No es posible reservar esa cantidad de asientos en ese horario para ese destino");
                    }
                }
                else {
                    System.out.println("El número de horario no existe.");
                }
            }
            else {
                System.out.println("El número de destino no existe.");
            }

            System.out.println("<---------->");
            System.out.println("Ingrese 'finish' si ha terminado su compra. Presione cualquier letra para continuar.");
            opc = keyStr.next();
        }
    }
}