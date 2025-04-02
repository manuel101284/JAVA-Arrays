import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Double matriz[][] = new Double[4][4];
        Double suma = 0.0;
        Scanner keIn = new Scanner(System.in);

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la nota: " + (1+j) + " del alumno " + (1+i));
                matriz[i][j] = keIn.nextDouble();
                suma = suma + matriz[i][j];
            }
            matriz[i][3] = suma / 3;
            suma = 0.0;
        }

        for (int i = 0; i < 4; i++){
            System.out.println("Notas alumno " + (1+i));
            for (int j = 0; j < 3; j++) {
                System.out.print("Nota " + (1+j) + ": " + matriz[i][j] + " ");
            }
            System.out.println("|| Promedio alumno 1: " + matriz[i][3]);
        }

    }
}
