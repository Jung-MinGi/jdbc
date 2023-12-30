package hello.jdbc.repository;

import com.zaxxer.hikari.HikariDataSource;
import hello.jdbc.domain.Book;
import hello.jdbc.domain.BookDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.List;

class BookRepositoryTest {


    @Test
    void test(){
     Assertions.assertThat("fefef".length()).isEqualTo(5);
    }

}