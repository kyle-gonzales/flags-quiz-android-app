package com.example.quizzes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class ShowScoreActivity : AppCompatActivity() {


    private var textViewCongrats : TextView? = null
    private var textViewScore : TextView? = null
    private var buttonFinish : Button? = null

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_score)

        textViewCongrats = findViewById(R.id.textViewCongrats)
        textViewScore = findViewById(R.id.textViewScore)
        buttonFinish = findViewById(R.id.buttonFinish)

        val userName : String? = intent.getStringExtra(Constants.USER_NAME)
        val score : Int = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val totalQuestions : Int = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

        textViewCongrats?.text = "Congratulations, ${userName}!"
        textViewScore?.text = "Your Score is ${score}/${totalQuestions}"


        buttonFinish?.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}