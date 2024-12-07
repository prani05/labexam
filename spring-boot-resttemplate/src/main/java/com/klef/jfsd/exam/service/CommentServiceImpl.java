package com.klef.jfsd.exam.spring_boot_resttemplate;

package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Comment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Override
    public List<Comment> getAllComments() {
        String url = "https://jsonplaceholder.typicode.com/comments";
        RestTemplate restTemplate = new RestTemplate();

        // Fetching comments via GET request
        Comment[] comments = restTemplate.getForObject(url, Comment[].class);

        // Converting array to list
        return Arrays.asList(comments);
    }
}
