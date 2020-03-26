package docs;

public abstract class Document {
    protected String name;

    public Document() {
    }

    public Document(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Document getDoc() {
        return this;
    }

    @Override
    public String toString() {
        return "Document [name=" + name + "]";
    }

}