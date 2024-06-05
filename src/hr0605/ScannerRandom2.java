package hr0605;

import java.util.Scanner;

public class ScannerRandom2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int price = 10000;
        int num = 1;
        System.out.print("제목을 입력하세요: ");
        String title = input.nextLine();

        System.out.print("관람 인원 수를 입력하세요: ");
        num = input.nextInt();
            input.nextLine();

        System.out.print("예매자 이름을 입력하세요: ");
        String name = input.nextLine();

        System.out.print("전화번호를 입력하세요: ");
        String phone = input.nextLine();

            System.out.println("title = " + title);
            System.out.println("num = " + num);
            System.out.println("name = " + name);
            System.out.println("phone = " + phone);

            System.out.println("price = " + price*num);


    }
}
