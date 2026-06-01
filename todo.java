import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class todo {

    public static void main(String[] args) {
        ArrayList<String> todolist = new ArrayList<String>();
        todolist();

    }

    public static void todolist(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Add a new item to the list: yes or no: ");
        String userInput = myScanner.nextLine().toLowerCase();
        while (userInput.equals("yes")){
            String yes1 = myScanner.nextLine();
            todolist.add(yes1);
            System.out.println("Add a new item to the list: yes or no: ");
            userInput = myScanner.nextLine().toLowerCase();
        }
        System.out.println("Finalized todo list: ");
        for (String item : todolist){
            System.out.println(item);
        }

        }
        public static void shuffle(){
            int num = Math.random()*(todolist.size());
            int num2 = Math.random()*(todolist.size());
            int i = 0;
            while (i < 100){
                todolist.set(num, todolist.get(num2));
            }
            System.out.println(todolist);

        }

    }


