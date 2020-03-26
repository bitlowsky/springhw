package docs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import docs.beans.Note;
import docs.beans.Passport;
import docs.beans.Printer;
import docs.configurationbeans.SpringConfig;

public class AppConfiguration {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        Printer printer = ctx.getBean("printer", Printer.class);
        printer.print(ctx.getBean("passport", Passport.class));
        printer.print(ctx.getBean("note", Note.class));

        ctx.close();
    }
}