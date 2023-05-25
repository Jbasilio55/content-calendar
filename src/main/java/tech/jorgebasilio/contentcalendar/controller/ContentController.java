package tech.jorgebasilio.contentcalendar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.jorgebasilio.contentcalendar.repository.ContentCollectionRepository;

@RestController
@RequestMapping("/aoi/content")
public class ContentController {

    private ContentCollectionRepository repository;

    public ContentController(){
        repository = new ContentCollectionRepository();
    }

}
