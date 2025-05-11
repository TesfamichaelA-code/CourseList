package com.example.courselist.model

data class Course(
    val id: Int,
    val title: String,
    val code: String,

    val description: String,
    val credits: Int,

    val prerequisites: List<String>
) {
    companion object {
        val sampleCourses = listOf(
            Course(
                id = 1,
                title = "Fundamentals of Artificial Intelligence (AI)",
                code = "SECT-3141",

                description = "Introduces how computers can think, solve problems, and make decisions using AI techniques.",
                credits = 2,

                prerequisites = listOf("Data Structures and Algorithms")
            ),
            Course(
                id = 2,
                title = "Fundamentals of Cybersecurity",
                code = "SECT-3142",

                description = "Covers basic methods to protect computers and data from hackers and cyber threats.",
                credits = 2,

                prerequisites = listOf("Computer Programming")
            ),
            Course(
                id = 3,
                title = "Computer Graphics",
                code = "SECT-3143",

                description = "Explores techniques for creating images, animations, and visual effects through programming.",
                credits = 3,

                prerequisites = listOf("Object-Oriented Programming (OOP)")
            ),
            Course(
                id = 4,
                title = "Mobile Application Development",
                code = "SECT-3144",

                description = "Focuses on building smartphone applications using Kotlin and Flutter frameworks.",
                credits = 3,

                prerequisites = listOf("Website Development")
            ),
            Course(
                id = 5,
                title = "Operating Systems and System Programming",
                code = "SECT-3145",

                description = "Explains how operating systems manage hardware and software, and how to write system-level code.",
                credits = 3,

                prerequisites = listOf("Computer Architecture")
            ),
            // Prerequisite courses
            Course(
                id = 6,
                title = "Data Structures and Algorithms",
                code = "CS-301",

                description = "Advanced study of data structures and algorithm analysis.",
                credits = 4,

                prerequisites = listOf("Computer Programming I")
            ),
            Course(
                id = 7,
                title = "Computer Programming",
                code = "CS-101",

                description = "Introduction to programming concepts using Python.",
                credits = 3,

                prerequisites = emptyList()
            ),
            Course(
                id = 8,
                title = "Object-Oriented Programming (OOP)",
                code = "CS-201",

                description = "Principles of object-oriented programming using Java.",
                credits = 3,

                prerequisites = listOf("Computer Programming")
            ),
            Course(
                id = 9,
                title = "Website Development",
                code = "CS-202",

                description = "Fundamentals of web development with HTML, CSS, and JavaScript.",
                credits = 3,

                prerequisites = listOf("Computer Programming")
            ),
            Course(
                id = 10,
                title = "Computer Architecture",
                code = "CS-401",

                description = "Study of computer system organization and architecture.",
                credits = 3,

                prerequisites = listOf("Digital Logic Design")
            )
        )
    }
}