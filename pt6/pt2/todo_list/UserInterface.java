import java.util.Scanner;

public class UserInterface {
    TodoList tl;Scanner skt;
    public UserInterface(TodoList tl,Scanner skt){
        this.tl  = tl;
        this.skt = skt;
    }
    public void start(){
        while (true) {
        System.out.print("Command : ");
           String valor =  skt.nextLine();

            switch (valor) {
                case "stop":
                    return;

                case "add":
                    System.out.print("To add : ");
                    String v = skt.nextLine();
                    tl.add(v);
                    break;
                case "list":
                    tl.list();
                    break;
                case "remove":
                    System.out.print("Which one is removed?");
                    int r = skt.nextInt();
                    tl.remove(r);
                    break;
            
                default:
                    continue;
                   
            }
        }
    }

}
