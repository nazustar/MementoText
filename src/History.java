package src;

import java.util.Stack;

// Caretaker.
public class History {

    private String content;
    Stack<Memento> stack = new Stack<>();

    public History (){
        this.stack = new Stack<>();
    }

    public Memento save(Memento memento){
        return stack.push(memento);
    }

    public Memento undo(){
        if(stack.isEmpty()){
            System.out.println("No hay cambios guardados.");
            return null;
        }else{
            return stack.pop();
        }
    }

}
