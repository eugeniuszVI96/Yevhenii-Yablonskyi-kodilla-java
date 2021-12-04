package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Forum {

    public final Random random = new Random();
    public final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        for (int i = 0; i < 40; i++) {
            int identification = random.nextInt(9998) + 10000;
            String userName = "User" + (random.nextInt(9998) + 10000);
            String mOrF = "MF";
            char sex = mOrF.charAt(random.nextInt(mOrF.length()));
            int year = random.nextInt(120) + 1900;
            int month = random.nextInt(10) + 1;
            int day = random.nextInt(29) + 1;
            int postsQuantity = random.nextInt(100000);
            forumUsersList.add(new ForumUser(identification, userName, sex, year, month, day, postsQuantity));
        }
    }

    public List<ForumUser> getForumUsersList() {
        return new ArrayList<>(forumUsersList);
    }





}
