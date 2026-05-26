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

        int counter = 0;
        int tbd = 5;

        for (String word : pos) {
            counter++;
            if (userInput.indexOf(word) > -1) {
                System.out.println("positive");
                break;
            }
            if (counter == pos.size()) {
                tbd = 0;
            }

            for (String word1 : neg) {
                counter++;
                if (userInput.indexOf(word1) > -1) {
                    System.out.println("negative");
                    break;
                }
                if (counter == neg.size()) {
                    tbd = 1;
                }

            }
        }

        if (tbd == 0 || tbd == 1){
            System.out.println("neutral");
        }
    }
}
