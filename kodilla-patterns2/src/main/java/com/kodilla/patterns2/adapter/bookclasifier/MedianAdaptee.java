package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistic;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistic {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> signatureBookMap) {
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(signatureBookMap);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> signatureBookMap) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(signatureBookMap);
    }
}
