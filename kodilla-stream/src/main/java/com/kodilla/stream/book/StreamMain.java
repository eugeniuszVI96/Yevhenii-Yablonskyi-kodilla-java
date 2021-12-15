package com.kodilla.stream.book;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);

        System.out.println("");
//------------------------------------------------------------------------------

        BookDirectory theBookDirectory2 = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory2.getList().stream() //1
                .filter(book -> book.getYearOfPublication() > 2005) //2
                .collect(Collectors.toList()); //3

        System.out.println("# elements: " + theResultListOfBooks.size()); //4
        theResultListOfBooks.stream() //5
                .forEach(System.out::println); //6

        System.out.println("");

//------------------------------------------------------------------------------

        BookDirectory theBookDirectory3 = new BookDirectory();

        Map<String, Book> theResultMapOfBook = theBookDirectory3.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book)); //1

        System.out.println("# elements: " + theResultMapOfBook.size()); //2
        theResultMapOfBook.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue()) //3
                .forEach(System.out::println); //4

        System.out.println("");
//-------------------------------------------------------------------------------

        BookDirectory theBookDirectory4 = new BookDirectory();

        String theResultStringOfBooks = theBookDirectory4.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<",">>"));

        System.out.println(theResultStringOfBooks);
    }
}