package com.example.myquizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    val img = R.drawable.droid

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

// 1
        val question1 = Question(
            1, "What is the primary programming language used for Android app development?",
            img,
            "Java", "Python",
            "Kotlin", "Swift", 3
        )
        questionsList.add(question1)

// 2
        val question2 = Question(
            2, "Which component is responsible for managing the UI of an Android application?",
            img,
            "Activity", "Fragment",
            "Service", "Intent", 1
        )
        questionsList.add(question2)

// 3
        val question3 = Question(
            3, "What layout mechanism is commonly used to define user interface in Android?",
            img,
            "CSS", "Flexbox",
            "XML", "HTML", 3
        )
        questionsList.add(question3)

// 4
        val question4 = Question(
            4, "Which file is used to declare the permissions required by an Android application?",
             img,
            "AndroidManifest.xml", "build.gradle",
            "strings.xml", "styles.xml", 1
        )
        questionsList.add(question4)

// 5
        val question5 = Question(
            5, "What is the purpose of Gradle in Android development?",
            img,
            "Database management", "Dependency management",
            "UI design", "Networking", 2
        )
        questionsList.add(question5)

// 6
        val question6 = Question(
            6, "Which architectural pattern is recommended by Google for developing Android apps?",
            img,
            "MVC", "MVP",
            "MVVM", "MVI", 3
        )
        questionsList.add(question6)

// 7
        val question7 = Question(
            7, "What is the purpose of the 'adb' tool in Android development?",
            img,
            "Application debugging", "Database management",
            "Dependency management", "UI design", 1
        )
        questionsList.add(question7)

// 8
        val question8 = Question(
            8, "What is the minimum Android API level required for supporting Material Design components?",
            img,
            "API level 14 (Android 4.0)", "API level 21 (Android 5.0)",
            "API level 24 (Android 7.0)", "API level 28 (Android 9.0)", 2
        )
        questionsList.add(question8)

// 9
        val question9 = Question(
            9, "Which component is used to perform background tasks independently of the UI in Android?",
            img,
            "Activity", "Service",
            "BroadcastReceiver", "ContentProvider", 2
        )
        questionsList.add(question9)

// 10
        val question10 = Question(
            10, "What is the purpose of the 'R.java' file in an Android project?",
            img,
            "To manage resources", "To define database schema",
            "To declare permissions", "To handle background tasks", 1
        )
        questionsList.add(question10)


        return questionsList
    }
}