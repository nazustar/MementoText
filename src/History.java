package src;

import java.util.Stack;

// Caretaker.
public class History {

    Stack<Memento> stack = new Stack<>();

    public History (){
        this.stack = new Stack<>();
    }

    public Memento save(Memento memento){
        return stack.push(memento);
    }

    public Memento undo() {
        if (stack.isEmpty()) {
            System.out.println("No hay cambios para deshacer.");
            return null;
        }

        if (stack.size() == 1) {
            System.out.println("No hay estados anteriores.");
            return stack.peek();
        }

        // Delete actual state.
        stack.pop();

        // Return to old state.
        return stack.peek();
    }
}
