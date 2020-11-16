
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Option o = new Option();
        Validation v = new Validation();
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> list = new ArrayList<>();
        while (true) {
            o.Menu();
            System.out.print("Your Choice: ");
            int choice = v.getOption();
            switch (choice) {
                case 1:
                    o.addTask(list);
                    break;
                case 2:
                    o.deleteTask(list);
                    break;
                case 3:
                    o.getDataTasks(list);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
