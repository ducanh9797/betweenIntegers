import java.util.Scanner;

public class BetweenIntegers {
    public static void main(String[] args) {
    double number1, number2, number3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap du lieu vao ");
        number1 = scanner.nextDouble();
        number2 = scanner.nextDouble();
        number3 = scanner.nextDouble();
        double[] array = {number1, number2, number3};
        displaySortedNumber(array);

    }

    public static void displaySortedNumber(double array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    double temple = array[i];
                    array[i] = array[j];
                    array[j] = temple;

                }
            }

        }
        System.out.println("In ra mang moi");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
