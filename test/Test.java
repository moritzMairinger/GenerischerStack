public class Test {
    static public void main(String[] args) throws Exception {
        // Creates a new Stack object with a generic Integer
        Stack<Integer> s = new Stack();
        // pushes the value 1 into the stack
        s.push(1);
        // pushes the value 2 into the stack
        s.push(2);
        // pushes the value 3 into the stack
        s.push(3);
        // prints the stack
        System.out.println(s.list());
        // pops the last element from the stack
        System.out.println(s.pop());
        // prints the stack
        System.out.println(s.list());
        // prints the last element from the stack
        System.out.println(s.peek());
        // prints the stack
        System.out.println(s.list());


        // Creates a new Stack object with a generic String
        Stack<String> s2 = new Stack();
        // pushes the value "Hallo" into the stack
        s2.push("Hallo");
        // pushes the value "Welt" into the stack
        s2.push("Welt");
        // pushes the value "!" into the stack
        s2.push("!");
        // prints the stack
        System.out.println(s2.list());
        // pops the last element from the stack
        System.out.println(s2.pop());
        // prints the stack
        System.out.println(s2.list());
        // prints the last element from the stack
        System.out.println(s2.peek());
        // prints the stack
        System.out.println(s.list());


        var a = GenericUtils.<Integer>umdrehen(new Integer[]{1, 2, 3, 4, 5, 6});
        System.out.println(java.util.Arrays.toString(a));
    }
}
