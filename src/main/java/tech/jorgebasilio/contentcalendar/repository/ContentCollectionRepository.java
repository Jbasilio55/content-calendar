package tech.jorgebasilio.contentcalendar.repository;

import org.springframework.stereotype.Repository;
import tech.jorgebasilio.contentcalendar.model.Content;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> content = new ArrayList<>();

    public ContentCollectionRepository(){

    }

    public List<Content> findAll(){
        return content;
    }

    public Optional<Content> findById(Integer id){
        return content.stream().filter(c -> c.id().equals(id)).findFirst();
    }

}
