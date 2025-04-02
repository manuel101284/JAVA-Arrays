import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];

        Scanner keIn = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor para fila " + (1+i) + " columna " + (1+j));
                matriz[i][j] = keIn.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Elemento matriz[" + (1+i) + "][" + (1+j) + "]" + matriz[i][j]);
            }
        }
    }
}