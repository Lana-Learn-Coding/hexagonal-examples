package libraryspring;

import library.book.core.BookService;
import library.reader.core.ReaderService;
import library.reader.core.port.outgoing.BookRepo;
import library.reader.core.port.outgoing.ReaderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceBeanConfig {

    @Bean
    @Autowired
    public BookService bookService(library.book.core.port.outgoing.BookRepo bookRepo) {
        return new BookService(bookRepo);
    }

    @Bean
    @Autowired
    public ReaderService readerService(BookRepo bookRepo, ReaderRepo readerRepo) {
        return new ReaderService(bookRepo, readerRepo);
    }
}
