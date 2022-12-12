package com.example.quizzes

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity(), OnClickListener {

    // helper variables
    private var index = 0
    private var questions : ArrayList<Question>? = null
    private var selectedOptionIdx = 0

    // views
    private var textViewQuestion : TextView? = null
    private var imageViewQuestion : ImageView? = null

    private var progressBar : ProgressBar? = null
    private var textViewProgress : TextView? = null

    private var textViewOption1 : TextView? = null
    private var textViewOption2 : TextView? = null
    private var textViewOption3 : TextView? = null
    private var textViewOption4 : TextView? = null

    private var buttonSubmitAnswer : Button? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // initialize views
        setContentView(R.layout.activity_quiz_questions)

        textViewQuestion = findViewById(R.id.textViewQuestion)
        imageViewQuestion = findViewById(R.id.imageViewQuestionImg)

        progressBar = findViewById(R.id.progressBar)
        textViewProgress = findViewById(R.id.textViewProgress)

        textViewOption1 = findViewById(R.id.textViewOption1)
        textViewOption2 = findViewById(R.id.textViewOption2)
        textViewOption3 = findViewById(R.id.textViewOption3)
        textViewOption4 = findViewById(R.id.textViewOption4)

        buttonSubmitAnswer = findViewById(R.id.btnSubmitAnswer)

        // on click listeners
        textViewOption1?.setOnClickListener(this)
        textViewOption2?.setOnClickListener(this)
        textViewOption3?.setOnClickListener(this)
        textViewOption4?.setOnClickListener(this)
        buttonSubmitAnswer?.setOnClickListener(this)


        questions = Constants.getQuestions()

        setQuestion()
    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion() {

        val question = questions!!.get(index)
        progressBar?.progress = index
        textViewProgress?.text = "${(index + 1)}/${progressBar?.max}"

        textViewQuestion?.text = question.question
        imageViewQuestion?.setImageResource(question.img)

        textViewOption1?.text = question.option1
        textViewOption2?.text = question.option2
        textViewOption3?.text = question.option3
        textViewOption4?.text = question.option4

        if (index + 1 == progressBar!!.max) {
            buttonSubmitAnswer?.text = "Finish"
        }
    }

    private fun resetOptionStyles() {
         val options = ArrayList<TextView>()

        textViewOption1?.let{options.add(0, it)}
        textViewOption2?.let{options.add(1, it)}
        textViewOption3?.let{options.add(2, it)}
        textViewOption4?.let{options.add(3, it)}

        for (option in options){
            option.setTextColor(Color.parseColor("#7a8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    private fun selectedOptionStyles(option: TextView, optionId: Int) {
        resetOptionStyles()
        selectedOptionIdx = optionId
        option.setTextColor(Color.parseColor("#000000"))
        option.setTypeface(option.typeface, Typeface.BOLD)
        option.background = ContextCompat.getDrawable(
            this,
            R.drawable.clicked_option_border_bg
        )
    }

    private fun submit() {

    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.textViewOption1 -> textViewOption1?.let{selectedOptionStyles(it, 1)}
            R.id.textViewOption2 -> textViewOption2?.let{selectedOptionStyles(it, 2)}
            R.id.textViewOption3 -> textViewOption3?.let{selectedOptionStyles(it, 3)}
            R.id.textViewOption4 -> textViewOption4?.let{selectedOptionStyles(it, 4)}
            R.id.btnSubmitAnswer -> buttonSubmitAnswer?.let{submit()}
        }
    }
}