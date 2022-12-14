package com.example.quizzes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editTextName = findViewById<EditText>(R.id.editTextName)
        val btnStart = findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
            if (editTextName.text.isEmpty()) {
                Toast.makeText(this, "Name is required", Toast.LENGTH_LONG).show()
            } else {
                // move to another screen (aka another activity)
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, editTextName.text.toString()) //an intent can have extra information that you send from one activity to another, which the other activity can retrieve and use
                // the data is sent to the activity you are starting with intent
                // Constants.USER_NAME is the variable name of the object being sent; this is the name that is called when getting the value from the intent Activity
                startActivity(intent)
                finish()
            }
        }
    }
}