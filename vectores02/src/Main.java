import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int vector [] = new int [4];

        Scanner kbIn = new Scanner(System.in);

        for (int j=0; j< vector.length; j++) {
            System.out.println("Ingrese el elemento número " + (1+j));
            vector[j] = kbIn.nextInt();
        }

        for (int i=0; i< vector.length; i++) {
            System.out.println("Elemento " + (1+i) + ": " + vector[i]);
        }

    }
}