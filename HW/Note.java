package HW;


import java.util.Date;

public class Note {
    private String author;
    private String content;
    private Date creationTime;

    public Note(String author, String content) {
        this.author = author;
        this.content = content;
        this.creationTime = new Date();
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    // Інші методи, які можуть знадобитися для роботи з нотаткою

}
