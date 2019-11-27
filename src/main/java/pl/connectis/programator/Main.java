package pl.connectis.programator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.connectis.programator.dao.DB;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        DB db = new DB();
        SpringApplication.run(Main.class, args);
    }
}
