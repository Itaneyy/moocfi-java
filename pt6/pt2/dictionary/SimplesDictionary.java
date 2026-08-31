package pt6.pt2.dictionary;

import java.util.*;

class SimpleDictionary{
    HashMap<String,String> map ;
    public SimpleDictionary(){
    
        map = new HashMap<>();
    }
    public void add(String key,String value){
        map.put(key,value);
    }
    public String  translate(String s){
        return map.get(s);
    }
    public boolean contem(String s){
        boolean out =  map.containsKey(s) ? true : false; 
        
        return out;
        
    }   
}
