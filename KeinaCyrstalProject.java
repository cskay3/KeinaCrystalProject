import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class KeinaCyrstalProject {

    public static void main(String[] args) throws IOException {
        posOrNeg();
    }

    public static void posOrNeg() throws IOException {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Type your comment here: ");
        String userInput = myScanner.nextLine().toLowerCase();

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
            neg.add(ne.nextLine());
        }

        outterloop:
        for (String word : pos) {
            if (userInput.indexOf(word) > -1) {
                System.out.println("positive");
                break outterloop;
            }

            outterloop1:
            for (String word1 : neg) {
                if (userInput.indexOf(word1) > -1) {
                    System.out.println("negative");
                    break outterloop1;
                }

                else {
                    System.out.println("neutral");
                    break outterloop1;
                }
            }
        }
    }
}
