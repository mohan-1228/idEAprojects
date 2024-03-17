package edu.missouristate.controller;

import edu.missouristate.model.Comment;
import edu.missouristate.model.Response;
import edu.missouristate.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommentController {
    @Autowired
    CommentService commentService;
    @ResponseBody
    @PostMapping("/comments")
    public Response postComment(@RequestBody Comment comment) {
        try {
            if (commentService.saveComment(comment)) {
                return new Response("success", "Your comments are saved successfully");
            } else {
                return new Response("danger", "Comments not saved. Please try again.");
            }
        } catch(Exception e) {
            return new Response("danger", "Sorry, internal error. Comments not saved.");
        }
    }
}
