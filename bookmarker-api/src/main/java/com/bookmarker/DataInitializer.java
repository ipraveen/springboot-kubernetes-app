package com.bookmarker;

import com.bookmarker.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookmarkRepository bookmarkRepository;
    @Override
    public void run(String...args){


//        for (int i = 1; i < 50; i++) {
//           //  var bookmark = "Bookmark" + i;
//            // Use FlyWay scripts, this is here just for reference.
//            // bookmarkRepository.save(new Bookmark(null, bookmark, "https://" + bookmark + ".com", Instant.now()));
//        }

    }
}
