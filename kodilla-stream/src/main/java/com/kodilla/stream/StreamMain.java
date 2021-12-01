package com.kodilla.stream;

import com.kodilla.stream.beautiful.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import javax.crypto.spec.PSource;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
//        System.out.println("Welcome to module 7 - Stream");
//
//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("This is an example text"));
//
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        poemBeautifier.beautify("Text", text -> "[" + text + "]");
//        poemBeautifier.beautify("Text", text -> text.toLowerCase());
//        poemBeautifier.beautify("Text", text -> text.toUpperCase());
//        poemBeautifier.beautify("Text", text -> "\u001B[31m" + text + "\u001B[0m");

//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);

//        People.getList().stream()
//                .forEach(System.out::println);
//
//        System.out.println();
//
//
//        People.getList().stream()
//                .map(s -> s.toUpperCase())
//                .forEach(System.out::println);
//
//        System.out.println("=");
//
//        People.getList().stream()
//                .map(String::toUpperCase)
//                .forEach(s -> System.out.println(s));
//
//        System.out.println();
//
//        People.getList().stream()
//                .filter(s -> s.length() > 11)
//                .forEach(System.out::println);
//
//        System.out.println();
//
//        People.getList().stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0,1).equals("M"))
//                .forEach(System.out::println);

//        BookDirectory theBookDirectory = new BookDirectory();
//        theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);

        //-----------------------------------------------------------------------------

//        BookDirectory theBookDirectory = new BookDirectory();
//        List<Book> theResultListOfBooks = theBookDirectory.getList().stream() //1
//                .filter(book -> book.getYearOfPublication() > 2005) //2
//                .collect(Collectors.toList()); //3
//
//        System.out.println("# elements: " + theResultListOfBooks.size()); //4
//        theResultListOfBooks.stream() //5
//                .forEach(System.out::println); //6

        //----------------------------------------------------------------------------

//        BookDirectory theBookDirectory = new BookDirectory();
//
//        Map<String, Book> theResultMapOfBook = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book)); //1
//
//        System.out.println("# elements: " + theResultMapOfBook.size()); //2
//        theResultMapOfBook.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue()) //3
//                .forEach(System.out::println); //4

        //------------------------------------------------------------------------------

        BookDirectory theBookDirectory = new BookDirectory();

        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<",">>"));

        System.out.println(theResultStringOfBooks);
    }
}
