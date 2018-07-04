package com.kodilla.good.patterns.challenge;

import java.util.*;
import java.util.stream.Collectors;

public class MovieStreamMain {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String movies = movieStore.getMovies().values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining(" ! "));

        System.out.print(movies);
    }
}
