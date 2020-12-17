package de.telran.printer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public DateTimeProvider getDateTimeProvider(){
        return new DateTimeProvider();
    }

    @Bean
    public OutputPrinter getOutputPrinter(){
        return new OutputPrinter();
    }

    @Bean
    public App app(DateTimeProvider provider, OutputPrinter printer){
        return new App(provider, printer);
    }
}
