package docs.scanbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import docs.Document;

@Component("note")
@PropertySource("docs.properties")
public class Note extends Document {
    @Value("${note.themeName}")
    private String themeName;

    public Note() {

    }

    @Autowired
    public Note(@Value("${note.name}") String name) {
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