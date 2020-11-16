
import java.util.ArrayList;

public class Option {

    Validation v = new Validation();

    public void Menu() {
        System.out.println("========= Task program =========");
        System.out.println("1. Add Task");
        System.out.println("2. Delete task");
        System.out.println("3. Display task");
        System.out.println("4. exit");
    }

    public void addTask(ArrayList<Task> list) {
        System.out.println("------------Add Task---------------");
        int id = 0;
        int lastID = list.size() - 1;
        if (list.isEmpty()) {
            id = 1;
        } else {
            id = list.get(lastID).getId() + 1;
        }
        System.out.print("Requirement Name: ");
        String name = v.getString();
        System.out.print("Task Type: ");
        int typeID = v.getTaskType();
        System.out.print("Date: ");
        String date = v.getDate();
        System.out.print("From: ");
        double from = v.getFrom();
        System.out.print("To: ");
        double to = v.getTo(from);
        System.out.print("Assignee: ");
        String assignee = v.getString();
        System.out.print("Reviewer: ");
        String reviewer = v.getString();
        list.add(new Task(id, name, typeID, date, from, to, assignee, reviewer));
    }

    public void deleteTask(ArrayList<Task> list) {
        System.out.println("---------Del Task------");
        if (list.isEmpty()) {
            System.out.println("Don't have any Task");
        } else {
            System.out.print("ID: ");
            int id = v.getInt();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    list.remove(i);
                    System.out.println("Delete task successful");
                    break;
                } else {
                    System.out.println("ID does not exist");
                    break;
                }
            }
        }
    }

    public void getDataTasks(ArrayList<Task> list) {
        System.out.println("----------------------------------------- Task ---------------------------------------");
        if (list.isEmpty()) {
            System.out.println("Don't have any Task");
        } else {
            System.out.println(String.format("%s%20s%20s%20s%20s%20s%20s", "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer"));
            for (Task task : list) {
                System.out.println(task);
            }
        }
    }
}
