package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedian() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("John Smith", "Secrets of Alamo", 1995, "110/10"));
        bookSet.add(new Book("Dilbert Michigan", "Secretaries and Directors", 2018, "100/4"));
        bookSet.add(new Book("Steve Wolkowitz", "Secret life of programmers", 2002, "115/8"));
        bookSet.add(new Book("Ian Tenewitch", "Secrets of Java", 2017, "120/15"));
        MedianAdapter adapter = new MedianAdapter();
        //When
        int median = adapter.publicationYearMediana(bookSet);
        //Then
        System.out.println(median);
        assertEquals(2017, median);
    }
}
