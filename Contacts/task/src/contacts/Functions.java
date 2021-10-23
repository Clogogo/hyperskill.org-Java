package contacts;

import java.util.Locale;
import java.util.Scanner;


public class Functions {
    Scanner scanner = new Scanner(System.in);

    public void add() {
        Person person = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person:");
        person.setName(sc.nextLine().trim().toLowerCase(Locale.ROOT));
        System.out.println("Enter the surname of the person:");
        person.setSurname(sc.nextLine().trim().toLowerCase(Locale.ROOT));
        System.out.println("Enter the number:");
        person.setNumber(sc.nextLine().trim().toLowerCase(Locale.ROOT));
        Contact.phoneBook.add(person);
        System.out.println("The record created!");
    }

    //Remove Element in the array
    public void remove() {
        list();
        System.out.println("Select a record:");
        int choice = scanner.nextInt();
        if (choice > Contact.phoneBook.size() + 1) {
            System.out.println("Record not Found!");
        } else {
            Contact.phoneBook.remove(choice);
        }
    }

    //Edit element in an array
    public void edit() {
        list();
        System.out.println("Select a record:");
        String ans = scanner.next();
        int choice = Integer.parseInt(ans);
        if (choice > Contact.phoneBook.size()) {
            System.out.println("Record not Found!");
        } else {
            System.out.println("Select a field (name, surname, number):");
            String answer = scanner.next().trim().toLowerCase(Locale.ROOT);
            switch (answer) {
                case "name":
                    System.out.println("Enter name: ");
                    Contact.phoneBook.get(choice - 1).setName(scanner.next());
                    System.out.println("The record updated!");
                    break;
                case "surname":
                    System.out.println("Enter surname: ");
                    Contact.phoneBook.get(choice - 1).setSurname(scanner.next());
                    System.out.println("The record updated!");
                    break;
                case "number":
                    System.out.println("Enter number: ");
                    Contact.phoneBook.get(choice - 1).setNumber(scanner.next());
                    System.out.println("The record updated!");
                    break;
            }
        }
    }

    //Count the number of element in an array
    public void count() {
        System.out.println("The Phone Book has " + Contact.phoneBook.size() + " records.");

    }

    //Print element in an array Contact.phoneBook
    public void list() {
        for (int i = 0; i < Contact.phoneBook.size(); i++) {
            System.out.println(i + 1 + ". " + Contact.phoneBook.get(i).getName() + " " + Contact.phoneBook.get(i).getSurname() + ", " + Contact.phoneBook.get(i).getNumber());
        }

    }

}
