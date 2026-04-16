package src;

import java.util.Stack;

// Originator.
public class TextEditor {
        
    private String newContent;
    private String content;

    Stack<Memento> stack = new Stack<>();

    //Constructor.
    public TextEditor (){
        this.content = "";
    }

    public Memento saveText(){
        return new Memento(this.content);
    }

    public void undoMemento(Memento memento){
        this.content = memento.getContent();
    }

    // Setters and getters for content.
    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}
