package Hr0604;

public class for3 {
    public static void main(String[] args) {

        long[] arr = new long[100];
        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        for(int i = arr.length - 1; i > 0; i--) {
            System.out.println(arr[i]);
        }

    }
}
