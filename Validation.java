
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validation {

    Scanner sc = new Scanner(System.in);

    public String getDate() {
        Date date;
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        df.setLenient(false);// check nếu nhập ngày 40/02-2000 thì báo lỗi
        while (true) {
            try {
                date = df.parse(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid date");
            }
        }
        return df.format(date);
    }

    public int getTaskType() {
        int a = 0;
        while (true) {
            try {
                a = Integer.parseInt(sc.nextLine());
                if (a >= 1 && a <= 4) {
                    break;
                } else {
                    System.out.println("Task Type must in 1-4!");
                }
            } catch (Exception e) {
                System.out.println("Please input number!");
            }
        }
        return a;
    }

    public int getInt() {
        int a = 0;
        while (true) {
            try {
                a = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Please input number!");
            }
        }
        return a;
    }

    public int getOption() {
        int a = 0;
        while (true) {
            try {
                a = Integer.parseInt(sc.nextLine());
                if (a >= 1 && a <= 4) {
                    break;
                } else {
                    System.out.println("Invalid Option. Choose option in 1-4");
                }
            } catch (Exception e) {
                System.out.println("Please input number!");
            }
        }
        return a;
    }

    public double getFrom() {
        double from = 0;
        while (true) {
            try {
                from = Double.parseDouble(sc.nextLine());
                if (from >= 8 && from <= 17.5) {
                    if (from % 0.5 == 0) {
                        break;
                    } else {
                        System.out.println("From must in 8.0, 8.5, 9.0, 9.5 ... 17.5");
                    }
                } else {
                    System.out.println("Plan From must in 8h - 17h30");
                }
            } catch (Exception e) {
                System.out.println("Please enter number");
            }
        }
        return from;
    }

    public double getTo(double from) {
        double to = 0;
        while (true) {
            try {
                to = Double.parseDouble(sc.nextLine());
                if (to >= 8 && to <= 17.5) {
                    if (to % 0.5 == 0) {
                        if (to > from) {
                            break;
                        } else {
                            System.out.println("Plan To must be more than Plan From");
                        }
                    } else {
                        System.out.println("To must in 8.0, 8.5, 9.0, 9.5 ... 17.5");
                    }
                } else {
                    System.out.println("Plan To must in 8h - 17h30");
                }
            } catch (Exception e) {
                System.out.println("Please enter number");
            }
        }
        return to;
    }

    public String getString() {
        String st = "";
        while (true) {
            st = sc.nextLine();
            if (!st.trim().isEmpty()) {
                break;
            } else {
                System.out.println("Do not leave it empty");
            }
        }
        return st;
    }
}