public class Book {
    int id;
    String title;
    String author;
    String category;
    boolean issued;

    public Book(int id, String title, String author, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.issued = false;
    }

    public void display() {
        System.out.println("----------------------");
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Issued: " + (issued ? "Yes" : "No"));
    }
}