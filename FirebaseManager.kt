package firebase

import com.google.firebase.firestore.FirebaseFirestore
import com.example.alslearningmanagementsystem.Student
import kotlinx.coroutines.tasks.await

object FirebaseManager {
    private val db = FirebaseFirestore.getInstance()

    suspend fun getStudents(): List<Student> {
        val snapshot = db.collection("students").get().await()
        return snapshot.documents.mapNotNull { doc ->
            doc.toObject(Student::class.java)
        }
    }
}
