import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nombres[] = new String[8];
        Scanner keIn = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.println("Ingresar el nombre " + (1+i));
            nombres[i] = keIn.next();
        }

        for (int i = 0; i < 8; i++) {
            System.out.println("Nombre " + (1+i) + ": " + nombres[i]);
        }

    }
}