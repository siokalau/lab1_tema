package Tema_ex1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lungimea=");
        int lung=scanner.nextInt();
        System.out.println("Latimea=");
        int lat=scanner.nextInt();
        int perim=2*lung+2*lat;
        float aria=(lung*lat)/2;
        System.out.println("Perimetrul="+perim);
        System.out.println("Aria="+aria);
        scanner.close();

    }
}
