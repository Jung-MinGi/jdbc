package hello.jdbc.domain;

import lombok.Data;

@Data
public class BookDTO {
    private String title;
    private String content;
    private String author;

    public BookDTO(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public BookDTO() {
    }
}
