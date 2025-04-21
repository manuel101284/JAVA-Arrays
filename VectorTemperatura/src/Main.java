import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String vectorCities[] = new String[5];
        double vectorTempMax[] = new double[5];
        double vectorTempMin[] = new double[5];

        double tempMax = -100.0;
        double tempMin = 100.0;

        String cityTempMin = "--";
        String cityTempMax = "--";

        Scanner keyStr = new Scanner(System.in);
        Scanner keyDou = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la ciudad " + (i+1) );
            vectorCities[i] = keyStr.next();

            System.out.println("Ingrese la temperatura Máxima: ");
            vectorTempMax[i] = keyDou.nextDouble();

            System.out.println("Ingrese la temoperatura Mínima: ");
            vectorTempMin[i] = keyDou.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            if (vectorTempMin[i] <= tempMin) {
                tempMin = vectorTempMin[i];
                cityTempMin = vectorCities[i];
            }
            if (vectorTempMax[i] >= tempMax) {
                tempMax = vectorTempMax[i];
                cityTempMax = vectorCities[i];
            }
        }
        System.out.println("La temperatura Mínima es: " + tempMin + " registrada en: " + cityTempMin);
        System.out.println("La temperatura Máxima es: " + tempMax + " registrada en: " + cityTempMax);

    }
}