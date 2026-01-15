package com.example.quizapp.controller;

import com.example.quizapp.model.QuizQuestion;
import com.example.quizapp.service.QuizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    private final QuizService service;

    public QuizController(QuizService service) {
        this.service = service;
    }

    @GetMapping("/questions")
    public ResponseEntity<?> getQuestions() {
        return ResponseEntity.ok(service.getQuestionsForFrontend());
    }

    @PostMapping("/submit")
    public ResponseEntity<?> submitQuiz(@RequestBody Map<String, Map<Integer, String>> request) {
        Map<Integer, String> answers = request.get("answers");
        return ResponseEntity.ok(service.submitAnswers(answers));
    }

    @PostMapping("/question")
    public ResponseEntity<?> addQuestion(@RequestBody QuizQuestion question) {
        service.addQuestion(question);
        return ResponseEntity.status(201).build();
    }
}
