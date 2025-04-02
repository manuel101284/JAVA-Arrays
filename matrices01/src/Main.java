//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int matriz2[][] = new int[3][3];

        matriz[0][0] = 10;
        matriz[0][1] = 20;
        matriz[0][2] = 30;
        matriz[1][0] = 40;
        matriz[1][1] = 50;
        matriz[1][2] = 60;
        matriz[2][0] = 70;
        matriz[2][1] = 80;
        matriz[2][2] = 90;

        for (int k=0; k<matriz[0].length; k++ ) {
            for (int l=0; l<matriz[0].length; l++ ) {
                System.out.println(" Elemento fila " + (1 + k) + " columna " + (1 + l) + ": " + matriz[k][l]);
            }
        }
    }
}
