package pt6.pt2.dictionary;

import java.util.Scanner;

class Main{
    public static void main(String[] a){
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        
        TextUI textUI = new TextUI(scanner, dictionary);
        textUI.start();
        System.out.println(dictionary.translate("pike")); // prints the string "nike"
    }
}
