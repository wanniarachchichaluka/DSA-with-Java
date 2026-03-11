import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args){
        int count=0;
        String x="";
        String champion="";
        while (!StdIn.isEmpty()){
            count++;
            x = StdIn.readString();
            if(StdRandom.bernoulli(1.0/count)==true){
                champion=x;
            }
        }
        StdOut.println(champion);
    }
}
