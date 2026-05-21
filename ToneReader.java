import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class ToneReader {

    static Scanner myScanner = new Scanner(System.in);
    System.out.println("Type your comment here:");
    String userInput = myScanner.next)().toLowerCase();

    public static void add() throws IOException {
        File positive = new File("positive.txt");
        Scanner po = new Scanner(positive);

        ArrayList<String> pos = new ArrayList<>();

        while (po.hasNext()){
            pos.add(po.nextLine());
        }

    }

    public static boolean posOrNeg(){
        boolean positive = false

        if (userInput.indexOf(pos) == -1){
            return positive;
        }

        if
    }

    public
}