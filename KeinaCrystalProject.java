import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class KeinaCyrstalProject {

    static Scanner myScanner = new Scanner(System.in);

    System.out.println("Type your comment here:");
    String userInput = myScanner.next().toLowerCase();

    public static void posOrNeg() throws IOException{

        File positive = new File("positive.txt");
        Scanner po = new Scanner(positive);

        ArrayList<String> pos = new ArrayList<String>();

        while (po.hasNext()) {
            pos.add(po.nextLine());
        }

        File negative = new File("negative.txt");
        Scanner ne = new Scanner(negative);

        ArrayList<String> neg = new ArrayList<String>();

        while (ne.hasNext()) {
            neg.add(po.nextLine());
        }

        for (String word : pos) {
            if (userInput.indexOf(word) > -1) {
                System.out.println("positive");
                break;
            }
        }
        for (String word : neg) {
            if (userInput.indexOf(word) > -1) {
                System.out.println("negative");
                break;
            }
        }

        else {
            System.out.println("neutral");
        }
    }
}
