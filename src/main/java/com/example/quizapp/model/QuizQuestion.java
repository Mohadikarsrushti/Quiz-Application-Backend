package com.example.quizapp.model;

import lombok.Data;

@Data
public class QuizQuestion {

    private int id;
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctOption;
}
