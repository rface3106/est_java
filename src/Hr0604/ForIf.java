package Hr0604;

public class ForIf {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println("저는i"+i);
            if(i>=50){
                break;
            }
            for (int j = 2; j <100 ; j++) {
                System.out.println("저는j"+j);
                if(j>=80){
                    break;
                }

            }

        }
    }
}
