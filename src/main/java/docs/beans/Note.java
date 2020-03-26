package docs.beans;

import docs.Document;

public class Note extends Document {
    private String themeName;

    public Note() {

    }

    public Note(String name) {
        super(name);
    }

    public Note(String name, String themeName) {
        super(name);
        this.themeName = themeName;
    }

    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    @Override
    public String toString() {
        return "Note [name=" + name + ", themeName=" + themeName + "]";
    }

}