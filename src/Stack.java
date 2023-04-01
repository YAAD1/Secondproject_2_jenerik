import java.util.ArrayList;
import java.util.List;

public class Stack<E> {
    private List<E> components;
    public Stack(){
        components =new ArrayList<>();
    }
    public void push(E component){
        components.add(component);
    }
    private E operateLastElement(boolean delete){
        if(components.size()==0){
            return null;
        }
        var lastcomponent=components.get(components.size()-1);
        if(delete) components.remove(components.size()-1);
        return lastcomponent;
    }
    public E pop(){
        return operateLastElement(true);
    }
    public E peek(){
        return operateLastElement(false);

    }
    public String show(){
        StringBuilder output= new StringBuilder();
        for(int i=components.size()-1;i>=0;i--){
            output.append(String.format("|%s|", components.get(i)));
            output.append("------");
        }
        return output.toString();
    }
}
