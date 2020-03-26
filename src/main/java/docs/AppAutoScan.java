package docs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import docs.scanbeans.Note;
import docs.scanbeans.Passport;
import docs.scanbeans.Printer;

public class AppAutoScan {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("docs_xml_&_annotation.xml");

        Printer printer = ctx.getBean("printer", Printer.class);
        printer.print(ctx.getBean("passport", Passport.class));
        printer.print(ctx.getBean("note", Note.class));

        ctx.close();
    }
}