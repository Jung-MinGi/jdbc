package hello.jdbc.repository;

import hello.jdbc.domain.Book;
import hello.jdbc.domain.BookDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
@SpringBootTest
class BookRepositoryTest {
    @Autowired
    private DataSource dataSource;


    @Test
    void test(){
        BookRepository bookRepository = new BookRepository(dataSource);
        bookRepository.save(new BookDTO("제목1","컨텐츠1","저자1"));
        Book book = bookRepository.findById();
        Assertions.assertThat(book.getId()).isEqualTo(1);

    }

}