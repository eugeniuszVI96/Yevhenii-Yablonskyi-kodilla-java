package com.kodilla.testing.library;

public class Book {

    String title;
    String athor;
    int publicationYear;

    public Book(String title, String athor, int publicationYear) {
        this.title = title;
        this.athor = athor;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAthor() {
        return athor;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAthor(String athor) {
        this.athor = athor;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", athor='" + athor + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (publicationYear != book.publicationYear) return false;
        if (!title.equals(book.title)) return false;
        return athor.equals(book.athor);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + athor.hashCode();
        result = 31 * result + publicationYear;
        return result;
    }
}
