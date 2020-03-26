package docs.scanbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import docs.Document;

@Component("passport")
@PropertySource("docs.properties")
public class Passport extends Document {
    @Value("${passport.s}")
    private int s;
    @Value("${passport.num}")
    private int num;

    public Passport() {
    }

    @Autowired
    public Passport(@Value("${passport.name}") String name) {
        super(name);
    }

    public Passport(String name, int s, int num) {
        super(name);
        this.s = s;
        this.num = num;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Passport [name=" + name + ", num=" + num + ", s=" + s + "]";
    }

}