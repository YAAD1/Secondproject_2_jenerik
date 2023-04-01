import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> components;
    public Stack(){
        components =new ArrayList<>();
    }
    public void push(int component){
        components.add(component);
    }
    public int pop(){
        if(components.size()==0){
            return -1;
        }
        var lastcomponent=components.get(components.size()-1);
        components.remove(components.size()-1);
        return lastcomponent;
    }
    public int peek(){
        if(components.size()==0){
            return -1;
        }
        var lastcomponent=components.get(components.size()-1);
        return lastcomponent;

    }
    public String show(){
        String output="";
        for(int i=components.size()-1;i>=0;i--){
            output += String.format("|%d|",components.get(i));
            output += "------";
        }
        return output;
    }

}
