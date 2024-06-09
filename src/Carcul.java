import java.util.Scanner;

public class Carcul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("원하는 기능을 선택하세요");
            System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 0.종료");
            int choice = scanner.nextInt();
            int num1;
            int num2;
            int sum;

            switch (choice){
                case 1:
                    System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
                    num1 = scanner.nextInt();
                    System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
                    num2 = scanner.nextInt();
                    sum= num1+num2;
                    System.out.println(num1+"+"+num2+"="+sum);
                    break;

                case 2:
                    System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
                    num1 = scanner.nextInt();
                    System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
                    num2 = scanner.nextInt();
                    sum= num1-num2;
                    System.out.println(num1+"-"+num2+"="+sum);
                    break;

                case 3:
                    System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
                    num1 = scanner.nextInt();
                    System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
                    num2 = scanner.nextInt();
                    sum= num1*num2;
                    System.out.println(num1+"*"+num2+"="+sum);
                    break;

                case 4:
                    System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
                    num1 = scanner.nextInt();
                    System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
                    num2 = scanner.nextInt();
                    sum= num1/num2;
                    System.out.println(num1+"/"+num2+"="+sum);
                    break;

                case 0:
                    System.out.println("종료합니다.");
                    return;

                default:
                    System.out.println("올바른 입력이 아닙니다.");
                    break;
            }
        }
    }
}
