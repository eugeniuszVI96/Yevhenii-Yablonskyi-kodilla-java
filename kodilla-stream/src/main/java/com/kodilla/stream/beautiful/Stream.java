package com.kodilla.stream.beautiful;

public class Stream {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Text", text -> "[" + text + "]");
        poemBeautifier.beautify("Text", text -> text.toLowerCase());
        poemBeautifier.beautify("Text", text -> text.toUpperCase());
        poemBeautifier.beautify("Text", text -> "\u001B[31m" + text + "\u001B[0m");
    }
}
