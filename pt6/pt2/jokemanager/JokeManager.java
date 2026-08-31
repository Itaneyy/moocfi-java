package pt6.pt2.jokemanager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

class JokeManager {
    ArrayList<String> jokes = new ArrayList<>();
    public JokeManager(){}
    public void addJoke(String joke){
        jokes.add(joke);
    }
    public String drawJokes(){
         if (jokes.isEmpty()) {
                    return "Jokes are in short supply.";
                } 
        else{
            return jokes.get(new Random().nextInt(jokes.size()));
        }
    }
    public void printJokes(){
        Iterator<String> it = jokes.iterator();
        while(it.hasNext()){
            String elemento= it.next();
            System.out.println(elemento);
        }
    }
}