package hello;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        Locale locale = args.length == 0 ? locale = Locale.getDefault() : Locale.forLanguageTag(args[0]);
        System.out.println("Locale: " + locale);
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("hello.messages", locale);
            System.out.println(bundle.getString("hello"));
        } catch(MissingResourceException e) {
            System.err.println(e.getMessage());
        }
    }

}
