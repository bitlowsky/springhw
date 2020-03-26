package docs.beans;

import docs.Document;

public class Passport extends Document {
    private int s;
    private int num;

    public Passport() {
    }

    public Passport(String name) {
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