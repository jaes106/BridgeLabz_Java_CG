package ObjectOrientedProgramming.Constructors.level1;
import java.util.Scanner;

class Book {

    private String title;
    private String author;
    private double price;

    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter title: ");
        String t = sc.nextLine();
        System.out.print("Enter author: ");
        String a = sc.nextLine();
        System.out.print("Enter price: ");
        double p = sc.nextDouble();

        Book b1 = new Book();
        Book b2 = new Book(t, a, p);

        b1.display();
        b2.display();
    }
}
