package ex1;

import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        try (Scanner skt = new Scanner(Paths.get("pt4\\pt3\\ex1\\data.txt"))) {
            String line = skt.nextLine();
            
            System.out.println(line);
            line = skt.nextLine();
            System.out.println(line);
        }
        catch (Exception e) {
            System.out.println("Erro" + e.getMessage());
        }

       

    }
}
