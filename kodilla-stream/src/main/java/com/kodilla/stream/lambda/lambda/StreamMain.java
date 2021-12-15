package com.kodilla.stream.lambda.lambda;

public class StreamMain {

    public static void main(String[] args) {

        // Z obiektu w lambda

//        //Step 1
//        codeToExecute = public void process() {
//            System.out.println("This is an example text.");
//        }
//
//        //Step 2
//        codeToExecute = void () {
//            System.out.println("This is an example text.");
//        }
//
//        //Step 3
//        codeToExecute = () {
//            System.out.println("This is an example text.");
//        }
//
//        //Step 4
//        codeToExecute = () -> {
//            System.out.println("This is an example text.");
//        }
//
//        //Step 5
//        codeToExecute = () -> System.out.println("This is an example text.");
//
//        //Step 6
//        Executor codeToExecute = () -> System.out.println("This is an example text.");

        //------------------------------------------------------------------------------------------

//        //Step 1
//        Processor processor = new Processor();                                // [6]
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();  // [7]
//        processor.execute(executeSaySomething);
//
//        //Step 2
//        Processor processor = new Processor();                                  // [6]
//        Executor codeToExecute = () -> System.out.println("This is an example text.");  // [7]
//        processor.execute(codeToExecute);

        //Step 3
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));
    }
}