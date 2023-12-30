package hello.jdbc.domain;

import lombok.Data;

@Data
public class Book {
    private long id;
    private String title;
    private String content;
    private String author;

}
