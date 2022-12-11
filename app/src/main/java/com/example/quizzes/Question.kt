package com.example.quizzes

//model is a question
data class Question(
    val id : Int,
    val img : Int,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val answer: Int,
    val question: String = "Which country does this flag represent?",
) //? what if we have the options as an array?
