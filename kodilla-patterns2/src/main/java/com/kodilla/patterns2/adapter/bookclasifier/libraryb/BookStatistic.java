package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistic {
    int averagePublicationYear(Map<BookSignature, Book> signatureBookMap);
    int medianPublicationYear(Map<BookSignature, Book> signatureBookMap);
}
