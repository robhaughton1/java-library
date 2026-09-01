import java.util.Scanner;
import java.util.ArrayList;

public class Library {

    public static int input(String prompt, Scanner scanner) {
        while (true) {
            System.out.print(prompt);
            String rawValue = scanner.nextLine();

            if (rawValue.isBlank()) {
                System.out.println("Input cannot be empty.");
                continue;
            }

            try {
                int value = Integer.parseInt(rawValue);
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Input is not a number.");
            }
        }
    }

    public static double doubleInput(String prompt, Scanner scanner) {
        while (true) {
            System.out.print(prompt);
            String rawValue = scanner.nextLine();

            if (rawValue.isBlank()) {
                System.out.println("Input cannot be empty.");
                continue;
            }

            try {
                double value = Double.parseDouble(rawValue);
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Input is not a number.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            System.out.println();
            System.out.println("""
                    1. Add Book
                    2. Print booklist
                    3. Delete book
                    4. Exit""");

            int option = input("Enter an option: ", input);

            switch (option) {
                case 1:
                    // Adds a book and formats based on price (cheapest to most expensive)

                    System.out.print("\nEnter book name: ");
                    String book = input.nextLine();

                    System.out.print("Enter author name: ");
                    String author = input.nextLine();

                    System.out.print("Enter publish date (DD/MM/YYYY): ");
                    String date = input.nextLine();

                    double price = doubleInput("Enter book price: ", input);

                    Books newBook = new Books(book, author, date, price);
                    double priceOfBook = newBook.getPrice();

                    int position = 0;

                    for (position = 0; position < books.size(); position++) {
                        if (priceOfBook < books.get(position).getPrice()) {
                            break;
                        }
                    }

                    books.add(position, newBook);

                    System.out.println("New book created.");
                    break;

                case 2:
                    // Shows every book title in the array list

                    for (int index = 0; index < books.size(); index++) {
                        System.out.println(
                                index + 1 + ". " + books.get(index).getTitle()
                        );
                    }

                    break;

                case 3:
                    // Deletes a selected book

                    if (books.isEmpty()) {
                        System.out.println("There are no books to delete.");
                        break;
                    }

                    System.out.println("\nChoose a book to delete: ");

                    for (int index = 0; index < books.size(); index++) {
                        System.out.println(
                                index + 1 + ". " + books.get(index).getTitle()
                        );
                    }

                    int index = input("> ", input);

                    if (index < 1 || index > books.size()) {
                        System.out.println("Invalid book selection.");
                        break;
                    }

                    books.remove(index - 1);

                    System.out.println("Book deleted.");
                    break;

                case 4:
                    // Exits the code

                    System.out.println("Closing...");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
