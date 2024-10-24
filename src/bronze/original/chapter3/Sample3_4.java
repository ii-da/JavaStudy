package bronze.original.chapter3;

import java.util.Scanner;

class Sample3_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1つ目の実数値を入力してください: ");
        double num1 = scanner.nextDouble();
        System.out.print("2つ目の実数値を入力してください: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        double average = sum / 2;
        System.out.println("和: " + sum);
        System.out.println("平均: " + average);
        scanner.close();
    }
}
