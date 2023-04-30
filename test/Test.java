public class Test {
    // Schreibe eine Testklasse für deinen Stack, in dem du sowohl einen Zahlenstack testest und dann einen Textstack. Versuche dir dabei sinnvolle Testszenarien zu überlegen, so dass die Funktionsweise deines Stacks gut gezeigt wird. Dokumentiere sowohl deine Klasse mit Dokumentationskommentaren, als auch die Testklasse mit Zeilenkommentaren.
    static public void main(String[] args) throws Exception {
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.list());
        System.out.println(s.pop());
        System.out.println(s.list());
        System.out.println(s.peek());
        System.out.println(s.list());


        Stack<String> s2 = new Stack();
        s2.push("Hallo");
        s2.push("Welt");
        s2.push("!");
        System.out.println(s2.list());
        System.out.println(s2.pop());
        System.out.println(s2.list());
        System.out.println(s2.peek());
        System.out.println(s.list());


    }
}
