package com.example.alslearningmanagementsystem

import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

object StudentSubmissionRepository {

    private val db = FirebaseFirestore.getInstance()

    // ---------------- QUIZ SUBMISSION ----------------
    suspend fun submitQuiz(
        quizId: String,
        studentId: String,
        answers: List<String>
    ) {
        val quizRef = db.collection("quizzes").document(quizId)

        quizRef.update(
            mapOf(
                "submittedAnswersPerStudent.$studentId" to answers
            )
        ).await()
    }

    // ---------------- ACTIVITY SUBMISSION ----------------
    suspend fun submitActivity(
        activityId: String,
        studentId: String,
        answer: String,
        fileUri: String?
    ) {
        val activityRef = db.collection("activities").document(activityId)

        activityRef.update(
            mapOf(
                "submittedAnswer" to answer,
                "submittedFileUriString" to fileUri,
                "submittedByStudentIds" to com.google.firebase.firestore.FieldValue.arrayUnion(studentId)
            )
        ).await()
    }

    // ---------------- SUMMATIVE SUBMISSION ----------------
    suspend fun submitSummative(
        summativeId: String,
        studentId: String,
        answers: List<String>
    ) {
        val summativeRef = db.collection("summatives").document(summativeId)

        summativeRef.update(
            mapOf(
                "submittedAnswersPerStudent.$studentId" to answers
            )
        ).await()
    }
}
