import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("árvíztűrő tükörfúrógép - ÁRVÍZTŰRŐ TÜKÖRFÚRÓGÉP");
        System.out.print("Kérem a nevét: ");
        Scanner s = new Scanner(System.in, "Cp852");
        System.out.println("Hello " + s.nextLine());
        s.close();
    }
}