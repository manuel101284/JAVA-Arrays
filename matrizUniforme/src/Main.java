import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyInt = new Scanner(System.in);

        int filas = 0, columnas = 0;

        System.out.printf("Ingrese la cantidad de filas: ");
        filas = keyInt.nextInt();

        System.out.printf("Ingrese la cantidad de columnas: ");
        columnas = keyInt.nextInt();

        int matrizPer[][] = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese la posición [" + (i+1) + "][" + (j+1) + "]:");
                matrizPer[i][j] = keyInt.nextInt();
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizPer[i][j] + " ");
            }
            System.out.println("");
        }
    }
}