package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> userMap = forum.getForumUsersList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> Period.between(user.getBirthdayDate(), LocalDate.now()).getYears()>=20)
                .filter(user -> user.getPostsQuantity() > 0 )
                .collect(Collectors.toMap(ForumUser::getIdentification, user -> user));

        System.out.println("There are " + userMap.size() + " users");
        userMap.entrySet().stream()
                .forEach(System.out::println);


    }
}
