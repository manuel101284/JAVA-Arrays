import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int vector[] = new int[15];
        int contador = 0;
        Scanner keIn = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor " + (1+i));
            vector[i] = keIn.nextInt();
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 3) {
                contador += 1;
            }
        }
        System.out.println("El número 3 aparece " + contador + " veces");
    }
}
