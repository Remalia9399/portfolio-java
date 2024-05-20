package pl.coderslab.homeworks.homeworks2;

public class Book {
    private int id;
    private String title;
    private boolean available = true;
    private Author author = new Author();
    private Author[] additionalAuthors;
    private int popularity;

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

    private boolean equals(int id1, int id2) {
        boolean result = false;
        if (id1 == id2) {
            result = true;
        }
        return result;
    }

}

