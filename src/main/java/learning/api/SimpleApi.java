package learning.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import learning.model.PageInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleApi {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<String> getHome() throws JsonProcessingException {
        String pageName = new ObjectMapper().writeValueAsString(new PageInfo("home"));
        return new ResponseEntity<>(pageName, HttpStatus.OK);
    }

}
