package Hr0604;

public class ForEach2 {
    public static void main(String[] args) {
        String[] names = {"okay2", "asbds", "good2", "ormiiiiii", "abcde"};

        for(String name :names){
            if(name.length() <=5){
                continue;
            }
            System.out.println(name);

        }

    }
}
