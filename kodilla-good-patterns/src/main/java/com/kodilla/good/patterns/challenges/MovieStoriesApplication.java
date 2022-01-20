package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Collectors;

public class MovieStoriesApplication {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        List<String> movies = movieStore.getMovies().entrySet().stream()
                .flatMap(g -> g.getValue().stream())
                .collect(Collectors.toList());

        movies.stream()
                .map(s -> s + "!")
                .forEach(System.out::println);


    }
}
