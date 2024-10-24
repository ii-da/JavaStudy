package bronze.original.chapter3;

import java.util.Scanner;

class Sample3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("整数を入力してください: ");
        int number = scanner.nextInt();
        int addedValue = number + 10;
        int subtractedValue = number - 10;
        System.out.println("入力された値に10を加えた値" + addedValue);
        System.out.println("入力された値から10を引いた値" + subtractedValue);
        scanner.close();
    }
}
