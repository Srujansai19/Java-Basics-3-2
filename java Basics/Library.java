class Book {
    String title;
    String author;
    int pages;
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public void showInfo() {
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Pages   : " + pages);
    }
}

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 197);
        Book b2 = new Book("Harry Potter", "J.K. Rowling", 350);
        b1.showInfo();
        b2.showInfo();
    }
}
