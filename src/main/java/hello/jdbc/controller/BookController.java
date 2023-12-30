package hello.jdbc.controller;

import hello.jdbc.domain.Book;
import hello.jdbc.domain.BookDTO;
import hello.jdbc.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class BookController {
    private final BookService service;

    @PostMapping("/api/book")
    public ResponseEntity<Book> save(@RequestBody BookDTO bookDTO) {
        Book book = service.bookSave(bookDTO);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
    @GetMapping("/api/book")
    public ResponseEntity<List<Book>> save() {
        List<Book> list = service.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
