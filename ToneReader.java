import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class ToneReader {

    static Scanner myScanner = new Scanner(System.in);
    add();

    public static ArrayList<String> POS(){
        ArrayList

    }


}

public static void add() throws IOException {
    File positive = new File("positive.txt");
    Scanner po = new Scanner(positive);

    ArrayList<String> pos = new ArrayList<>();

    while (po.hasNext()){
        pos.add(po.nextLine());
    }

}