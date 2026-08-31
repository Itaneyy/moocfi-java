package ex6;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("File? ");

        String path = "C:\\Users\\WIN\\Desktop\\moccfi\\pt4\\pt3\\ex6\\" + teclado.nextLine();
        ArrayList<Person> persons = readRecordsFromFile(path);
        for (Person person : persons) {
            System.out.print(person.name + ", age:");
            System.out.println(person.age);
        }

        teclado.close();

    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> arr = new ArrayList<>();

        try (Scanner tk = new Scanner(Paths.get(file))) {
            while (tk.hasNextLine()) {
                String[] data = tk.nextLine().split(",");
                String name = data[0];
                int age = Integer.valueOf(data[1]);

                Person pessoa = new Person(name, age);
                arr.add(pessoa);

            }

        } catch (Exception e) {
            System.out.println("Erro  " + e.getMessage());
        }
        if (arr.isEmpty()) {
            return null;
        }
        return arr;

    }
}
