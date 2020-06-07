package pro.quiz.QuizApp


object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            id = 1,
            question = "Who Said It?:He'd be a broader guy if he had dropped acid once or gone off to an ashram when he was younger.",
            image = R.drawable.question,
            optionOne = "Bill Gates",
            optionTwo = "Steve Jobs",
            optionThree = "Bill Clinton",
            optionFour = "Nelson Mandela",
            correctAnswer = 2
        )
        questionsList.add(que1)
        //2
        val que2 = Question(
            id = 2,
            question = "Who Said It?:The day is quickly coming when every knee will bow down to a silicon fist, and you will all beg your binary gods for mercy.",
            image = R.drawable.question,
            optionOne = "Steve Jobs",
            optionTwo = "Bill Gates",
            optionThree = "Neither",
            optionFour = "Nelson Mandela",
            correctAnswer = 3
        )
        questionsList.add(que2)
        //3
        val que3 = Question(
            id = 3,
            question = "Who Said It?:The word 'user' is the word used by the computer professional when they mean 'idiot'.",
            image = R.drawable.question,
            optionOne = "Bill Gates",
            optionTwo = "Dave Barry",
            optionThree = "Steve Jobs",
            optionFour = "Nelson Mandela",
            correctAnswer = 2
        )
        questionsList.add(que3)
        //4
        val que4 = Question(
            id = 4,
            question ="Who Said It?:Be nice to nerds. Chances are you'll end up working for one.",
            image = R.drawable.question,
            optionOne = "Bill Gates",
            optionTwo = "Steve Jobs",
            optionThree = "Pee-Wee Herman",
            optionFour = "Nelson Mandela",
            correctAnswer = 1
        )
        questionsList.add(que4)
        //5
        val que5 = Question(
            id = 5,
            question ="Who Said It?:It's rare that you see an artist in his 30s or 40s able to really contribute something amazing.",
            image = R.drawable.question,
            optionOne = "Bill Gates",
            optionTwo = "Steve Jobs",
            optionThree = "Mick Jagger",
            optionFour = "Nelson Mandela",
            correctAnswer = 2
        )
        questionsList.add(que5)
        //6
        val que6 = Question(
            id = 6,
            question ="Who Said It?:I was worth over $1,000,000 when I was 23, and over $10,000,000 when I was 24, and over $100,000,000 when I was 25, and it wasn't that important because I never did it for the money.",
            image = R.drawable.question,
            optionOne = "Bill Gates",
            optionTwo = "Steve Jobs",
            optionThree = "Donald Trump",
            optionFour = "Nelson Mandela",
            correctAnswer = 2
        )
        questionsList.add(que6)
        //7
        val que7 = Question(
            id = 7,
            question ="Who Said It?:I want to put a ding in the universe.",
            image = R.drawable.question,
            optionOne = "Bill Gates",
            optionTwo = "Steve Jobs",
            optionThree = "Barack Obama",
            optionFour = "Nelson Mandela",
            correctAnswer = 2
        )
        questionsList.add(que7)
        //8
        val que8 = Question(
            id = 8,
            question ="Who Said It?:I have $100 billion ... You realize I could spend $3 million a day, every day, for the next 100 years?",
            image = R.drawable.question,
            optionOne = "Bill Gates",
            optionTwo = "Warren Buffett",
            optionThree = "Steve Jobs",
            optionFour = "Nelson Mandela",
            correctAnswer = 1
        )
        questionsList.add(que8)
        //9
        val que9 = Question(
            id = 9,
            image = R.drawable.question,
            question ="Who Said It?:Never trust a computer you can't throw out a window." ,
            optionOne = "Bill Gates",
            optionTwo = "Steve Jobs",
            optionThree = "Steve Wozniak",
            optionFour = "Nelson Mandela",
            correctAnswer = 3
        )
        questionsList.add(que9)
        //10
        val que10 = Question(
            id = 10,
            question ="Who Said It?:Man is still the most extraordinary computer of all." ,
            image = R.drawable.question,
            optionOne = "Bill Gates",
            optionTwo = "Steve Jobs",
            optionThree = "John F. Kennedy ",
            optionFour = "Nelson Mandela",
            correctAnswer = 3
        )
        questionsList.add(que10)




        return questionsList

    }





}