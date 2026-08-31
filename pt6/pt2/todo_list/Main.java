import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // TodoList list = new TodoList();
        // list.add("read the course material");
        // list.add("watch the latest fool us");
        // list.add("take it easy");
        
        // list.print();
        // list.remove(2);
        
        // System.out.println();
        // list.print();
        
        // TodoList list = new TodoList();
        // list.add("read the course material");
        // list.add("watch the latest fool us");
        // list.add("take it easy");
        // list.print();
        // list.remove(2);
        // list.print();
        // list.add("buy raisins");
        // list.print();
        // list.remove(1);
        // list.remove(1);
        // list.print();
        
        
         TodoList list = new TodoList();
        Scanner skt = new Scanner(System.in);
        UserInterface ui =  new UserInterface(list, skt);
        ui.start();
    }
}

