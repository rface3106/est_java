package Hr0604;

public class while5 {
    public static void main(String[] args) {
        int n= 20;
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%3 ==0 && i%5==0){
                sum+=i;

            }
            System.out.println(sum);

        }

    }
}
