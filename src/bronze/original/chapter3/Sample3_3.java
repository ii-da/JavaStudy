package bronze.original.chapter3;

import java.util.Scanner;

class Sample3_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("整数を入力してください: ");
        int number = scanner.nextInt();
        int lastDigit = number % 10;
        int withoutLastDigit = number / 10;
        System.out.println("最下位桁を除いた値: " + withoutLastDigit);
        System.out.println("最下位桁: " + lastDigit);
        scanner.close();
    }
}
