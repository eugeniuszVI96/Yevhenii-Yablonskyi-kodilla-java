package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Collectors;

public class MovieStoriesApplication {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String movies = movieStore.getMovies().entrySet().stream()
                .flatMap(g -> g.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(movies);
    }
}
