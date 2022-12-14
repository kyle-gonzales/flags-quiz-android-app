package com.example.quizzes

object Constants {

    // whenever you send data from one activity to another, it's good to store the name under which you stored the details that you want to have. It's good to put those values in a constant

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions(): ArrayList<Question> {
        val questions = ArrayList<Question>()

        val question1 = Question(
            1,
            R.drawable.ic_flag_of_belgium,
            "Kuwait",
            "Sweden",
            "Germany",
            "Belgium",
            4
        )
        questions.add(question1)

        val question2 = Question(
            2,
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "France",
            "India",
            "Australia",
            1
        )
        questions.add(question2)

        val question3 = Question(
            3,
            R.drawable.ic_flag_of_germany,
            "Belgium",
            "France",
            "Germany",
            "Denmark",
            3
        )
        questions.add(question3)

        val question4 = Question(
            4,
            R.drawable.ic_flag_of_australia,
            "England",
            "Austria",
            "Australia",
            "New Zealand",
            3
        )
        questions.add(question4)

        val question5 = Question(
            5,
            R.drawable.ic_flag_of_kuwait,
            "Kuwait",
            "India",
            "Jamaica",
            "Egypt",
            1
        )
        questions.add(question5)

        val question6 = Question(
            6,
            R.drawable.ic_flag_of_brazil,
            "Costa Rica",
            "Brazil",
            "Croatia",
            "Libya",
            2
        )
        questions.add(question6)

        val question7 = Question(
            7,
            R.drawable.ic_flag_of_new_zealand,
            "England",
            "Australia",
            "United States of America",
            "New Zealand",
            4
        )
        questions.add(question7)

        val question8 = Question(
            8,
            R.drawable.ic_flag_of_fiji,
            "Your mom",
            "England",
            "Fiji",
            "Austria",
            3
        )
        questions.add(question8)

        val question9 = Question(
            9,
            R.drawable.ic_flag_of_india,
            "India",
            "Egypt",
            "Ivory Coast",
            "Armenia",
            1
        )
        questions.add(question9)

        return questions
    }


}

// store all the different objects (username, questions)