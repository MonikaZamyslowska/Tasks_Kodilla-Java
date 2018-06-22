package com.kodilla.stream;

import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args){
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theListForumUser = theForum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate()
                        .isBefore(LocalDate.of(1998, 06, 22)))
                .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("# elements: " + theListForumUser.size());

            theListForumUser.entrySet().stream()
                    .map(entry -> entry.getKey() + ": " + entry.getValue())
                    .forEach(System.out::println);
    }
}
