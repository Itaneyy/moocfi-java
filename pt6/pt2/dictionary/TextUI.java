package pt6.pt2.dictionary;
import java.util.Scanner;

class TextUI  {
    Scanner skt;
    SimpleDictionary dict;
    public  TextUI(Scanner skt , SimpleDictionary dict){
        this.skt = skt;
        this.dict = dict;
        
    }
    public void end(){
         System.out.println("Bye Bye!");
            System.exit(0);
    
    }
    public void add(){
        System.out.print("Word : ");
        String word = skt.nextLine();
            
            
        System.out.print("Translation : ");
        String translation = skt.nextLine();
            
            
        dict.add(word,translation);
            
    }
    
    public void search(){
        System.out.print("To be tranlated : "); 
        String word = skt.nextLine();
        if(dict.contem(word))
            System.out.println("Translation : " + dict.translate(word));
        else
            System.out.printf("A palavra %s nao foi encontrada %n",word);
    }
    public void start(){
        while(true){
            System.out.print("Command : ");
            String comando = skt.nextLine();
            switch(comando){
                case "end":
                    end();
                    break;
                case "add":
                    add();
                    break;
                case "search":
                    search();
                    break;
                default :
                    System.out.println("Unknown commmand");
                    break;
            }        
            
        }
            
        }
}