package contacts;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
boolean first = true;
        Functions function = new Functions();
        while (first) {
            System.out.println("Enter action (add, remove, edit, count, list, exit)");
            String choice = scanner.nextLine();
            switch (choice) {
                case "add":
                    function.add();
                    break;
                case "remove":
                    if (!Contact.phoneBook.isEmpty()) {
                        function.remove();
                    } else {
                        System.out.println("No records to remove!");
                    }
                    break;
                case "list":
                    if (!Contact.phoneBook.isEmpty()) {
                        function.list();
                    } else {
                        System.out.println("No records to list!");
                    }
                    break;
                case "edit":
                    if (!Contact.phoneBook.isEmpty()) {
                        function.edit();
                    } else {
                        System.out.println("No records to edit!");
                    }
                    break;
                case "count":
                    function.count();
                    break;
                default:
                    first = false;
                    break;
            }

        }
    }
}