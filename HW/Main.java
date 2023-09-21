package HW;

public class Main {
    public static void main(String[] args) {
        Diary diary = new Diary();

        diary.addNote("Автор 1", "Перша нотатка.");
        diary.addNote("Автор 2", "Друга нотатка.");
        diary.displayNotes();

        diary.updateNote(0, "Оновлена нотатка.");
        diary.displayNotes();

        diary.deleteNote(1);
        diary.displayNotes();
    }
}

