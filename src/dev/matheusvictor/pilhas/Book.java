package dev.matheusvictor.pilhas;

public class Book {
    private String isbn;

    private String author;

    private int year;

    private String name;

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", name='" + name + '\'' +
                '}';
    }

    public Book() {
    }

    public Book(String isbn, String author, int year, String name) {
        this.isbn = isbn;
        this.author = author;
        this.year = year;
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
