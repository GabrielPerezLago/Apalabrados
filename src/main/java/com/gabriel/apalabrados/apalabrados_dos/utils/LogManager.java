package com.gabriel.apalabrados.apalabrados_dos.utils;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class LogManager  {
    Logger log ;
    private String className;
    final static ConsoleHandler consoleHandler = new ConsoleHandler();

    public LogManager(String className) {
        this.className = className;
        this.log = Logger.getLogger(className);
    }

    public <T> void getLog( T dato, char type){
        log.addHandler(consoleHandler);

        switch (type){
            case 'i': log.info(dato.toString());
                break;
            case 'w': log.warning(dato.toString());
                break;
            case 'e': log.severe(dato.toString());
                break;
        }

    }
}
