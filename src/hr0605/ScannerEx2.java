package hr0605;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("계절을 맞춰보세요! 1:봄, 2:여름, 3:가을, 4:겨울");
        int season = a.nextInt();

        if(season==1){
            System.out.println("봄");
        }
        else if (season==2) {
            System.out.println("여름");
        }
        else if (season==3) {
            System.out.println("가을");
        }
        else if (season==4) {
            System.out.println("겨울");
        }
        else{
            System.out.println("잘못 입력하셨습니다.");
        }

    }
}
