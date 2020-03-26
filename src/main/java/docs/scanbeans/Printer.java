package docs.scanbeans;

import org.springframework.stereotype.Component;

@Component("printer")
public class Printer {

    public void print(Object object) {
        System.out.println(object);
    }

}