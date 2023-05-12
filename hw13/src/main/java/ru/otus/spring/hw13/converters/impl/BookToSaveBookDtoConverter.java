package ru.otus.spring.hw13.converters.impl;

import org.springframework.stereotype.Service;
import ru.otus.spring.hw13.converters.Converter;
import ru.otus.spring.hw13.domain.Book;
import ru.otus.spring.hw13.dto.SaveBookDto;

import java.util.Optional;

import static java.util.Optional.ofNullable;

@Service
public class BookToSaveBookDtoConverter implements Converter<Book, SaveBookDto> {

    @Override
    public Optional<SaveBookDto> convert(Book book) {
        return ofNullable(book).map(this::map);
    }

    private SaveBookDto map(Book book) {
        return SaveBookDto.builder()
                .id(book.getId())
                .title(book.getTitle())
                .genreId(book.getGenreId())
                .authorIds(book.getAuthorIds())
                .build();
    }

}
