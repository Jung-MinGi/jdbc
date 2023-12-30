package hello.jdbc.service;

import hello.jdbc.domain.Book;
import hello.jdbc.domain.BookDTO;
import hello.jdbc.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository repository;

    public Book bookSave(BookDTO book){
        repository.save(book);
        return repository.findById();
    }

    public List<Book> findAll(){
        return repository.findAll();
    }
}
