package myapp;

import java.util.Scanner;

public class App {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final App app = new App();
        app.play();
    }

    public void play() {

        System.out.println("Hi!");
        System.out.println("Enter something: ");
        String wagerDate = scanner.next();
        System.out.println(wagerDate);
    }

}
