import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            b.display();
        }
    }

    public void searchBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                b.display();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void issueBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                if (!b.issued) {
                    b.issued = true;
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Book already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                if (b.issued) {
                    b.issued = false;
                    System.out.println("Book returned.");
                } else {
                    System.out.println("This book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
    public void saveBooksToFile() {
        try {
            FileWriter writer = new FileWriter("books.txt");

            for (Book b : books) {
                writer.write(b.id + "," + b.title + "," + b.author + "," + b.issued + "\n");
            }

            writer.close();
            System.out.println("Books saved to file.");

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
}

