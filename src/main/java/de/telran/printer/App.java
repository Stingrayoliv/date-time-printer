package de.telran.printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App {
    private DateTimeProvider provider;
    private OutputPrinter printer;

    @Autowired
    public App(DateTimeProvider provider, OutputPrinter printer) {
        this.provider = provider;
        this.printer = printer;
    }

    public void execute() {
        String currentDateTime = provider.getCurrentTime();
        printer.print("Hello World" + currentDateTime);
    }

    public static void main(String[] args) {
//        DateTimeProvider provider=new DateTimeProvider();
//        OutputPrinter printer=new OutputPrinter();
//        App app=new App(provider, printer);
//        app.execute();

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
                //new ClassPathXmlApplicationContext("beans.xml");
        App app = (App)context.getBean("app");
        app.execute();
    }
}
