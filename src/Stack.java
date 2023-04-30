public class Stack<Type> {
    private Object[] store;
    private int index = 0;
    Stack() {
        store = new Object[10];
    }
    Stack(int len) {
        store = new Object[len];
    }

    /*
     * Pushes a new element to the stack
     * @param element The element to be pushed
     * @throws StackFullException if the stack is full
     */
    public void push(Type element) throws StackFullException {
        try {
            store[index] = element;
        }
        catch(IndexOutOfBoundsException e) {
            throw new StackFullException();
        }
        index ++;
    }
    /*
     * Pops the top element from the stack and returns it
     * @return The top element (that is now deleted)
     * @throws StackEmptyException if the stack is empty
     */
    public Type pop() throws StackEmptyException  {
        index --;
        try {
            return (Type) store[index];
        }
        catch(IndexOutOfBoundsException e) {
            throw new StackEmptyException();
        }
    }
    /*
     * Computes all elements as string separated by ;
     * @return All elements as string separated by ;
     */
    public String list() {
        String out = "";
        for(int i = 0; i < index; i++) {
            out += store[i] + ";";
        }
        out = out.substring(0, out.length() - 1);
        return out;
    }
    /*
     * Peek the last element of the stack. Does not change the stack.
     * @return The last element of the stack
     */
    public Type peek() {
        return (Type) store[index - 1];
    }
}
