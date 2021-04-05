import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String selectedWord = "";
        int i=0;
        while(!StdIn.isEmpty()){
            String word = StdIn.readString();
            boolean prob = StdRandom.bernoulli(1.0/(i+1));
            if(prob){
                selectedWord = word;
            }
            i++;
        }
        StdOut.print(selectedWord);
    }

}
