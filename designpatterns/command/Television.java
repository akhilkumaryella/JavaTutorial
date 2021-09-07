package designpatterns.command;

/**
 * its receiver in command pattern
 */
public class Television {

    public void on() {
        System.out.println("Television switched on");
    }

    public void off() {
        System.out.println("Television switched off");
    }
}