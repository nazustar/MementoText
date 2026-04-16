package src;

// Memento of the program.
public class Memento {

    private String content;

    public Memento(String content){
        this.content = content;
    }
    
    // Setters and getters for content.
    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}
