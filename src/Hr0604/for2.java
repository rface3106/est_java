package Hr0604;

public class for2 {
    public static void main(String[] args) {
        int[]arr =new int[100];
        arr[1]=1;
        arr[2]=1;
        for(int n=2;n<arr.length;n++){
            arr[n] = arr[n-2] + arr[n-1];

        }
        for (int i : arr){
            System.out.println(i);
        }
    }
}
