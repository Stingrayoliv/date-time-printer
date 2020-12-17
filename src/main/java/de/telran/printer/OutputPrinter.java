package de.telran.printer;

import org.springframework.stereotype.Component;

@Component
public class OutputPrinter {
    public void print(String value) {
        System.out.println(value);
    }
}
