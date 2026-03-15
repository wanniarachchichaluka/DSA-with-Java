import java.util.Scanner;
public class StdIn {
    private static Scanner scanner = new Scanner(System.in);

    public static int readInt(){
        return scanner.nextInt();
    }

    public static boolean isEmpty(){
        return !scanner.hasNext();
    }
}
