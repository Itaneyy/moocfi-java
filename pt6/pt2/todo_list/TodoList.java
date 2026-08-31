import java.util.ArrayList;

class TodoList{
    ArrayList<String> arr  = new ArrayList<>();
    public TodoList(){}

    public void add(String task){
        arr.add(task);
    }

    public void print(){
        int temp = 0;
        for(int i = 0 ; i< arr.size();i++){
            System.out.println(++temp + ": " + arr.get(i));
            
        }
        
    }
    public void remove(int number){
        arr.remove(number-1);
    }
    public void list(){
        int count = 1 ;

        for(String elemento : arr){
            System.out.println(count+": "+ elemento);
            count++;
        }
    }
}