public class Main {
    public static void main(String[] args) {
        var stack = new Stack<String>();
        stack.push("burak");
        System.out.println(stack.show());
        stack.push("yahya");
        System.out.println(stack.show());
        stack.push("eray");
        System.out.println(stack.show());
        stack.push("dursun");
        System.out.println(stack.show());
        System.out.println("poped: "+stack.pop());
        System.out.println("stack's peek:  "
                +stack.peek());
        System.out.println(stack.show());


        var numberstack=new Stack<Integer>();
        numberstack.push(1);
        numberstack.push(2);
        numberstack.push(3);
        System.out.println(numberstack.show());

    }
}