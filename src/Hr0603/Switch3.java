package Hr0603;

public class Switch3 {
    public static void main(String[] args) {
        char operator = '+';
        int num1 = 1;
        int num2 = 3;

        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;

        }


    }
}
