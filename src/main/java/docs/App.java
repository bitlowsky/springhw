package docs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import docs.beans.Note;
import docs.beans.Passport;
import docs.beans.Printer;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("docs_xml_only.xml");

        Printer printer = ctx.getBean("printer", Printer.class);
        printer.print(ctx.getBean("passport", Passport.class));
        printer.print(ctx.getBean("note", Note.class));

        ctx.close();
    }
}