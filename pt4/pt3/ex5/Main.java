package ex5;

import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Name of the file : ");
        String path = "C:\\Users\\WIN\\Desktop\\moccfi\\pt4\\pt3\\ex5\\" + teclado.nextLine();

        showContent(path);
        teclado.close();

    }

    public static void showContent(String path) {
        try (Scanner skt = new Scanner(Paths.get(path))) {

            while (skt.hasNextLine()) {
                String[] data = skt.nextLine().split(",");
                String name = data[0];
                String age = data[1];
                System.out.print(name);
                System.out.println(", age: " + age + " years");
            }

        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
}
