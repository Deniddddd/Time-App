package org;

public class App {
    public static void main(String[] args) {
        long seconds = 15973;
        String formattedTime = TimeFormatter.formatSecond(seconds);
        System.out.println("Formatted time: " + formattedTime);
    }
}
