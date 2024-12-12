package com.example.hrapplication.HrApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidateController {

    @GetMapping("/notify/{candidateName}")
    public String notifyCandidate(@PathVariable String candidateName) {
        String message = "<html>" +
                         "<body>" +
                         "<h1>Interview Notification</h1>" +
                         "<p>Hello " + candidateName + ",</p>" +
                         "<p>You have been selected for an interview!</p>" +
                         "</body>" +
                         "</html>";
        return message;
    }
}
