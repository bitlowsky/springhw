package docs.configurationbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import docs.beans.Note;
import docs.beans.Passport;
import docs.beans.Printer;

@Configuration
public class SpringConfig {

    @Bean
    public Passport passport() {
        return new Passport("passport", 1234, 999999);
    }

    @Bean
    public Note note() {
        return new Note("note", "shopping");
    }

    @Bean
    public Printer printer() {
        return new Printer();
    }

}