package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int identification;
    private final String userName;
    private final char sex;
    private final LocalDate birthdayDate;
    private final int postsQuantity;

    public ForumUser(final int identification, final String userName, final char sex, final int year, final int month, final int day, final int postsQuantity) {
        this.identification = identification;
        this.userName = userName;
        this.sex = sex;
        this.birthdayDate = LocalDate.of(year, month, day);
        this.postsQuantity = postsQuantity;
    }

    public int getIdentification() {
        return identification;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (identification != forumUser.identification) return false;
        if (sex != forumUser.sex) return false;
        if (postsQuantity != forumUser.postsQuantity) return false;
        if (!userName.equals(forumUser.userName)) return false;
        return birthdayDate != null ? birthdayDate.equals(forumUser.birthdayDate) : forumUser.birthdayDate == null;
    }

    @Override
    public int hashCode() {
        int result = identification;
        result = 31 * result + userName.hashCode();
        result = 31 * result + (int) sex;
        result = 31 * result + (birthdayDate != null ? birthdayDate.hashCode() : 0);
        result = 31 * result + postsQuantity;
        return result;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identification=" + identification +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", postsQuantity=" + postsQuantity +
                '}';
    }
}
