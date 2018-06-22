package com.kodilla.stream.forumUser;

import com.kodilla.stream.book.Book;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "John Smith", 'M',1993, 12, 13, 112));
        forumUserList.add(new ForumUser(2, "Dorothy Newman", 'W',2000, 1, 1, 222));
        forumUserList.add(new ForumUser(3, "Matilda Davies", 'W',1974, 10, 21, 11));
        forumUserList.add(new ForumUser(4, "Owen Rogers", 'M',1989, 3, 18, 77));
        forumUserList.add(new ForumUser(5, "Corinne Foster", 'W',1990, 11, 13, 54));
        forumUserList.add(new ForumUser(6, "John Wolkowitz", 'M',1996, 6, 11, 168));
    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}
