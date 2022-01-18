package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {

    //FileReader
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile("names.txt");
        }
        catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }
    }

//    //FileReaderWithoutHandling
//    public static void main(String[] args) {
//        FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();
//        fileReader.readFile();
//    }
}
