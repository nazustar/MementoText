package src;

// Memento of the program.
public class Memento {

    private String content;

    public Memento(String content){
        this.content = content;
    }

    // Getter for content.
    public String getContent(){
        return content;
    }
}
