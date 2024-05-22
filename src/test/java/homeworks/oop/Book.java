package homeworks.oop;

public class Book {
    int id;
    String title;
    boolean available = true;
    Author author = new Author();
    Author[] additionalAuthors;

    private void setId(int id) { this.id = id; }
    private int getId() { return id; }

    private void setTitle(String title) { this.title = title; }
    private String getTitle() { return title; }

    private void setAvailable(boolean available) { this.available = available; }
    private boolean getAvailable() { return available; }

    private void setAuthor(Author author) { this.author = author; }
    private Author getAuthor() { return author; }

    private void setAdditionalAuthors(Author[] additionalAuthors) { this.additionalAuthors = additionalAuthors; }
    private Author[] getAdditionalAuthors() { return additionalAuthors; }

}
