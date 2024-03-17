package edu.missouristate.service;

import edu.missouristate.model.Comment;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    public boolean saveComment(Comment comment) {
            if (comment != null) {

                    return true;

            }
            return false;
        }
}
