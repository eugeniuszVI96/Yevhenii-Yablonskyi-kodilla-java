package com.kodilla.stream.beautiful;

public class PoemBeautifier {

    public void beautify(String text, PoemDecorator poemBeautifier) {
        String result = poemBeautifier.decorate(text);
        System.out.println(result);

    }
}
