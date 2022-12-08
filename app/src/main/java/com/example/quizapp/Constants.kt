package com.example.quizapp

object Constants{

    fun getQuestions() : ArrayList<Question>{

        val questionsList= ArrayList<Question>()
        val que1 = Question(1,
            "What country does this flag belong to",
            R.drawable.burundi_flag,
            "burundi",
            "rwanda",
            "kenya",
            "southSudan",
            1)
        val que2 = Question(1,
            "What country does this flag belong to",
            R.drawable.burundi_flag,
            "burundi",
            "rwanda",
            "kenya",
            "southSudan",
            1)
        val que3 = Question(1,
            "What country does this flag belong to",
            R.drawable.burundi_flag,
            "burundi",
            "rwanda",
            "kenya",
            "southSudan",
            1)
        val que4 = Question(1,
            "What country does this flag belong to",
            R.drawable.burundi_flag,
            "burundi",
            "rwanda",
            "kenya",
            "southSudan",
            1)
        val que5 = Question(1,
            "What country does this flag belong to",
            R.drawable.burundi_flag,
            "burundi",
            "rwanda",
            "kenya",
            "southSudan",
            1)
        questionsList.add(que1)
        return questionsList
    }
}