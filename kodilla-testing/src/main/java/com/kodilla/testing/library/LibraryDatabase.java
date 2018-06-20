package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {
    // lists books having title beginning with titleFragment
    List<Book> listBooksWithCondition(String littleFragment);

    // list books borrowed by libraryUser
    List<Book> listBookInHandsOff(LibraryUser libraryUser);

    // try to rent a book for libraryUser
    // returns true when success
    // and returns false when book is unavailable to rent
    boolean reantABook(LibraryUser libraryUser, Book book);

    // return all books borrowed by libraryUser to the library
    // returns number of books returned back
    int returnBooks(LibraryUser libraryUser);
}
