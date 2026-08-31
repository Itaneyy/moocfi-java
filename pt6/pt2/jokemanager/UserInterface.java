package pt6.pt2.jokemanager;

import java.util.Scanner;

class UserInterface{
JokeManager manager ;
Scanner skt ;
public UserInterface(JokeManager manager,Scanner skt){
    this.manager  = manager;
    this.skt = skt;
}
public void start(){
    while (true) {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
    
        String command = skt.nextLine();
        if(command.equalsIgnoreCase("X")){
            break;
            
        }
        else{
            switch(command){
            case "1" :
                System.out.println("Write the joke to be added");
                String j = skt.nextLine();
                manager.addJoke(j);
                break;
            
            case "2" :
                System.out.println(manager.drawJokes());
                break;
            
            case "3" :
                manager.printJokes();
                break;
            
            default:
             break;
        }
        }
    
        
    }
   }
 }