import java.util.Objects;
public class Words {
    private String english;
    private String german;
    private String japanese;

    Words (String eng, String d, String jp){
        this.english = eng;
        this.german = d;
        this.japanese = jp;
    }

    public String getEnglish() {
        return english;
    }
    public void setEnglish(String english) {
        this.english = english;
    }
    public String getGerman() {
        return german;
    }
    public void setGerman(String german) {
        this.german = german;
    }
    public String getJapanese() {
        return japanese;
    }
    public void setJapanese(String japanese) {
        this.japanese = japanese;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Words words = (Words) o;
        return Objects.equals(english, words.english) && Objects.equals(german, words.german) && Objects.equals(japanese, words.japanese);
    }

    @Override
    public int hashCode() {
        return Objects.hash(english, german, japanese);
    }

    @Override
    public String toString() {
        return "Words{" +
                "English ='" + english + '\'' +
                ", German ='" + german + '\'' +
                ", Japanese ='" + japanese + '\'' +
                '}';
    }
}
