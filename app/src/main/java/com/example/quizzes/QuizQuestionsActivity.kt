package com.example.quizzes

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val textViewQuestion = findViewById<TextView>(R.id.textViewQuestion)
        val imageViewQuestion = findViewById<ImageView>(R.id.imageViewQuestionImg)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val textViewProgress = findViewById<TextView>(R.id.textViewProgress)

        val textViewOption1 = findViewById<TextView>(R.id.textViewOption1)
//        val textViewOption2 = findViewbyId<TextView>(R.id.textViewOption2)
//        val textViewOption3 = findViewbyId<TextView>(R.id.textViewOption3)
//        val textViewOption4 = findViewbyId<TextView>(R.id.textViewOption4)
        val buttonSubmitAnswer = findViewById<Button>(R.id.btnSubmitAnswer)


        val questions = Constants.getQuestions()
        Log.i("size of questions: is", "${questions.size}")
    }
}