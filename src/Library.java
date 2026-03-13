import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public boolean bookExists(int id) {
        for (Book b : books) {
            if (b.id == id) {
                return true;
            }
        }
        return false;
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
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

        System.out.println("No book found with ID: " + id);
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
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book was not issued.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void totalBooks() {
        System.out.println("Total books in library: " + books.size());
    }
}