public class Main {
    public static void main(String[] args) {
        var stack = new Stack();
        stack.push(5);
        System.out.println(stack.show());
        stack.push(10);
        System.out.println(stack.show());
        stack.push(20);
        System.out.println(stack.show());
        stack.push(15);
        System.out.println(stack.show());
        System.out.println("poped: "+stack.pop());
        System.out.println("stack's first component:  "
                +stack.peek());
        System.out.println(stack.show());

    }
}