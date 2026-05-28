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

        int counterpos = 0;
        int counterneg = 0;

        for (String word : pos) {
            if (userInput.indexOf(word) > -1) {
                System.out.println("positive");
                break;
            }
            else{
                counterpos++;
            }


        }
            for (String word1 : neg) {
                if (userInput.indexOf(word1) > -1) {
                    System.out.println("negative");
                    break;
                }
                else{
                    counterneg++;
                }

            }

        if ((counterpos == pos.size()) || (counterneg == neg.size())){
            System.out.println("neutral");
        }

        }
    }
