package com.kodilla.stream.lambda.oop;

public class StreamMain {

    public static void main(String[] args) {
        SaySomething saySomething = new SaySomething();
        saySomething.say();

        Processor processor = new Processor();                                // [6]
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();  // [7]
        processor.execute(executeSaySomething);
    }
}