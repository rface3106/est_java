package hr0605;

import java.util.Random;
import java.util.Scanner;

public class ScannerRandom1 {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.print("1~100 사이의 숫자를 입력하세요: ");
        int input = scanner.nextInt();
        scanner.nextLine();

        if(input<targetNumber){
            System.out.println("up");
        }
        else if(input>targetNumber){
            System.out.println("down");
        } else if (input==targetNumber) {
            System.out.println("정답입니다!");
            break;

        }

        }

    }
}
