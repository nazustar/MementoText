package src;

// Originator.
public class TextEditor {
    
    private String content;

    //Constructor.
    public TextEditor (){
        this.content = "";
    }

    public Memento saveText(){
        return new Memento(this.content);
    }
    
    public void undoMemento(Memento memento){
        if(memento != null){
            this.content = memento.getContent();
        }
    }

    // Setters and getters for content.
    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}
