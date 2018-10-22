package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Arrays;
import java.util.Map;

public class Statistics implements BookStatistic {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> signatureBookMap) {
        if (signatureBookMap.size() == 0) return 0;
        int sum = 0;
        for (Map.Entry<BookSignature, Book> entry : signatureBookMap.entrySet()) {
            sum += entry.getValue().getPublicationYear();
        }
        return sum / signatureBookMap.size();
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> signatureBookMap) {
        if (signatureBookMap.size() == 0)return 0;
        int[] years = new int[signatureBookMap.size()];
        int n = 0;
        for (Map.Entry<BookSignature, Book> entry : signatureBookMap.entrySet()) {
            years[n] = entry.getValue().getPublicationYear();
            n++;
        }
        Arrays.sort(years);
        if (years.length % 2 == 0) {
            return years[(int)(years.length / 2 + 0.5)];
        } else {
            return years[years.length /2];
        }
    }
}
