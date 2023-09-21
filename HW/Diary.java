package HW;
import java.util.ArrayList;
import java.util.List;

public class Diary {
    private List<Note> notes;

    public Diary() {
        this.notes = new ArrayList<>();
    }

    public void addNote(String author, String content) {
        Note note = new Note(author, content);
        notes.add(note);
    }

    public void deleteNote(int index) {
        if (index >= 0 && index < notes.size()) {
            notes.remove(index);
        } else {
            System.out.println("Неправильний індекс нотатки.");
        }
    }

    public void updateNote(int index, String content) {
        if (index >= 0 && index < notes.size()) {
            Note note = notes.get(index);
            note = new Note(note.getAuthor(), content);
            notes.set(index, note);
        } else {
            System.out.println("Неправильний індекс нотатки.");
        }
    }

    public void displayNotes() {
        for (int i = 0; i < notes.size(); i++) {
            Note note = notes.get(i);
            System.out.println("Нотатка #" + (i + 1) + ":");
            System.out.println("Автор: " + note.getAuthor());
            System.out.println("Час створення: " + note.getCreationTime());
            System.out.println("Зміст: " + note.getContent());
            System.out.println();
        }
    }

    // Інші методи, які можуть знадобитися для роботи з щоденником

}




