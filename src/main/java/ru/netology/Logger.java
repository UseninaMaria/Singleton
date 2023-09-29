package ru.netology;

import java.util.Date;

public class Logger {
    private static Logger logger = null;
    protected int num = 1;

    public void log(String msg) {
        System.out.println("[" + new Date() + " " + num++ + "] " + msg);
    }

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}
