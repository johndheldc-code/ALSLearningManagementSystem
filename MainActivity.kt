package com.example.alslearningmanagementsystem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alslearningmanagementsystem.ui.theme.ALSLearningManagementSystemTheme
import java.text.SimpleDateFormat
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import java.util.Calendar
import android.app.DatePickerDialog
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.IntOffset
import kotlin.math.roundToInt
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material.icons.filled.CalendarToday
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.ui.text.font.FontStyle
import android.app.Activity
import android.os.Build
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.ui.text.style.TextAlign
import coil.compose.rememberAsyncImagePainter
import kotlinx.coroutines.delay
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.ui.draw.alpha
import android.widget.FrameLayout
import android.widget.VideoView
import androidx.compose.ui.viewinterop.AndroidView
import android.view.ViewGroup
import androidx.compose.ui.window.Dialog
import android.content.Context
import android.media.MediaScannerConnection
import android.os.Environment
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.AttachFile
import androidx.compose.material.icons.filled.FileDownload
import androidx.compose.material.icons.filled.Visibility
import java.io.File
import java.io.FileOutputStream
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.TextStyle
import android.content.ContentValues
import android.provider.MediaStore
import androidx.compose.ui.window.DialogProperties
import androidx.activity.compose.BackHandler
import android.graphics.Bitmap
import android.graphics.pdf.PdfRenderer
import android.os.ParcelFileDescriptor
import nl.dionsegijn.konfetti.compose.KonfettiView
import nl.dionsegijn.konfetti.core.PartyFactory
import nl.dionsegijn.konfetti.core.Position
import nl.dionsegijn.konfetti.core.emitter.Emitter
import java.util.concurrent.TimeUnit
import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import android.media.MediaPlayer
import android.util.Log
import androidx.compose.ui.text.input.ImeAction
import kotlin.collections.forEachIndexed
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import android.Manifest
import android.app.DownloadManager
import android.content.BroadcastReceiver
import android.view.animation.OvershootInterpolator
import android.webkit.MimeTypeMap
import android.widget.MediaController
import androidx.compose.animation.animateContentSize
import com.google.firebase.firestore.Query
import coil.compose.rememberAsyncImagePainter
import com.google.firebase.firestore.FieldValue
import com.google.firebase.ktx.Firebase
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.storage.ktx.storage
import java.util.UUID
import com.google.firebase.auth.ktx.auth
import com.google.firebase.Timestamp
import com.google.firebase.firestore.Exclude
import com.google.firebase.firestore.ListenerRegistration
import firebase.FirebaseManager
import java.util.Date
import java.util.Locale
import androidx.compose.foundation.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.*
import androidx.compose.ui.unit.*
import com.itextpdf.text.Document
import com.itextpdf.text.Paragraph
import com.itextpdf.text.pdf.PdfWriter
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.core.net.toUri
import androidx.compose.ui.graphics.asImageBitmap
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.storage.StorageMetadata
import com.google.firebase.storage.StorageReference
import kotlinx.coroutines.CoroutineScope
import androidx.compose.material.icons.filled.Send
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.ui.draw.shadow
import coil.compose.AsyncImagePainter
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import android.content.IntentFilter
import androidx.core.content.ContextCompat
import kotlin.random.Random
import androidx.compose.runtime.mutableStateListOf
import com.google.firebase.firestore.IgnoreExtraProperties
import androidx.compose.foundation.ExperimentalFoundationApi
import coil.compose.AsyncImage
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.collectAsState // Sometimes needed depending on version
import androidx.compose.material3.ripple
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.ui.input.pointer.pointerInput
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.common.MediaItem
import androidx.media3.ui.PlayerView

// -------------------- DATA MODELS --------------------

// ==================== MESSAGE ====================
data class Message(
    var id: String = "",
    val sender: String = "",
    val senderRole: String = "",
    val content: String = "",
    val imageUrl: String? = null,
    val timestamp: Any? = null
) {
    // ✅ CRITICAL: This function prevents crashes
    fun getTimestampLong(): Long {
        return try {
            when (timestamp) {
                is Long -> timestamp
                is com.google.firebase.Timestamp -> timestamp.toDate().time
                else -> System.currentTimeMillis()
            }
        } catch (e: Exception) {
            System.currentTimeMillis() // Fallback
        }
    }
}

// ==================== STUDENT ====================
@IgnoreExtraProperties
data class Student(
    val name: String = "",
    var age: String = "",
    val sex: String = "",
    val contact: String = "",
    val address: String = "",
    var username: String = "",
    var password: String = "",
    val messages: List<Message> = emptyList(),
    var avatarUriString: String? = null,
    val firstName: String = "",
    val middleName: String = "",
    val lastName: String = "",
    val birthday: String = "",
    val houseNo: String = "",
    val street: String = "",
    val barangay: String = "",
    val municipality: String = "",
    val province: String = "",
    val postalCode: String = "",
    val fatherName: String = "",
    val motherName: String = "",
    val guardianName: String = "",
    val guardianContact: String = "",
    var disapprovalReason: String = "",
    val lastSchoolAttended: String = "",
    val yearAttended: String = "",
    val gradeOrYear: String = "",
    val reason: String = "",
    val studentNumber: String = "",
    var status: String = "pending",
    var accountCreated: Boolean = false,
    var id: String = "",
    var uid: String = ""
)

// ==================== MODULE ====================
data class Module(
    val id: String = "",
    val title: String = "",
    val moduleNumber: Int = 0,
    val description: String = "",
    val fileUri: String? = null,
    val totalLessons: Int = 0,
    val completedLessonsPerStudent: Map<String, Int> = emptyMap(),
    val completedLessons: Int = 0
)

// ==================== QUIZ ====================
// ✅ FIXED: Changed submittedAnswersPerStudent to handle nullable strings
data class Quiz(
    var id: String = "",
    val quizNumber: Int = 0,
    val title: String = "",
    val durationMinutes: Int = 0,
    val questions: List<Question> = emptyList(),
    // Keep track of which student IDs have submitted
    val submittedByStudentIds: List<String> = emptyList(),
    // ✅ FIXED: Changed List<String> to List<String?> to allow null answers
    val submittedAnswersPerStudent: Map<String, List<String?>> = emptyMap()
)

// ==================== QUESTION ====================
// ✅ FIXED: Made correctAnswer nullable since ESSAY questions may not have one
data class Question(
    val questionText: String = "",
    val type: QuestionType = QuestionType.MULTIPLE_CHOICE,
    val options: List<String> = emptyList(),
    val correctAnswer: String? = null,  // ✅ FIXED: Made nullable
    var points: Int? = null,
    var possibleAnswers: List<String> = emptyList()
)

// ==================== QUESTION TYPE ====================
enum class QuestionType {
    MULTIPLE_CHOICE,
    IDENTIFICATION,
    ESSAY,
    TRUE_FALSE
}

// ==================== ANNOUNCEMENT ====================
data class Announcement(
    var title: String = "",
    var message: String = "",
    var timestamp: Timestamp? = null,
    var isRead: Boolean = false,
    var isPinned: Boolean = false,
    @get:Exclude var id: String = "" // ✅ Must be var, not val
)

// ==================== ACTIVITY ITEM ====================
data class ActivityItem(
    val id: String = "",
    val title: String = "",
    val description: String = "",
    val type: String = "",
    val fileUri: String? = null,
    var points: Int = 0,
    val fileName: String? = null,
    val submittedByStudentIds: List<String> = emptyList(),
    val submittedAnswersPerStudent: Map<String, String> = emptyMap(), // StudentId -> Text Answer
    val submittedFileUrisPerStudent: Map<String, String> = emptyMap()  // StudentId -> File URL
) {
    @get:Exclude
    val fileUriAsUri: Uri? get() = fileUri?.let { Uri.parse(it) }

    // Helper to check if a specific student has submitted
    fun isStudentSubmitted(uid: String): Boolean = submittedByStudentIds.contains(uid)
}

// ==================== SUMMATIVE ASSESSMENT ====================
// ✅ FIXED: Multiple critical changes
data class SummativeAssessment(
    val id: Int = 0,
    var title: String = "",
    var durationMinutes: Int = 0,
    val questions: List<Question> = emptyList(),  //
    @Deprecated("Use submittedAnswersPerStudent instead")
    var submittedAnswers: Map<Int, String?>? = null,

    val maxRetakes: Int = 2,
    var retakeCount: Int = 0,

    // ✅ FIXED: Changed to handle nullable strings in list
    val submittedAnswersPerStudent: Map<String, List<String?>> = emptyMap()
)

// ==================== STUDENT REPORT ROW ====================
data class StudentReportRow(
    val student: Student,
    val modulesPercent: Int,
    val quizzesPercent: Int,
    val activitiesPercent: Int,
    val summativesPercent: Int,
    val overallPercent: Int
)

// ==================== STUDENT MENU ITEM ====================
data class StudentMenuItem(
    val title: String,
    val route: String,
    val icon: ImageVector,
    val color: Color,
    val badgeCount: Int = 0
)

// ==================== HELPER EXTENSIONS ====================

fun Quiz.getStudentAnswers(studentId: String): List<String?> {
    return submittedAnswersPerStudent[studentId] ?: emptyList()
}


fun Quiz.hasStudentSubmitted(studentId: String): Boolean {
    return submittedByStudentIds.contains(studentId)
}

fun SummativeAssessment.getStudentAnswers(studentId: String): List<String?> {
    return submittedAnswersPerStudent[studentId] ?: emptyList()
}


fun SummativeAssessment.hasStudentSubmitted(studentId: String): Boolean {
    return submittedAnswersPerStudent.containsKey(studentId)
}

fun SummativeAssessment.calculateScore(studentId: String): Pair<Int, Int> {
    val studentAnswers = getStudentAnswers(studentId)

    val totalPoints = questions.sumOf { it.points?.toInt() ?: 0 }

    val earnedPoints = questions.mapIndexed { index, question ->
        val studentAnswer = studentAnswers.getOrNull(index)?.trim()?.lowercase()
        val correctAnswers = (listOfNotNull(question.correctAnswer) + question.possibleAnswers)
            .map { it.trim().lowercase() }

        if (studentAnswer != null && studentAnswer in correctAnswers) {
            question.points?.toInt() ?: 0
        } else {
            0
        }
    }.sum()

    return Pair(earnedPoints, totalPoints)
}

fun SummativeAssessment.isPassing(studentId: String, passingPercentage: Float = 0.6f): Boolean {
    val (earned, total) = calculateScore(studentId)
    if (total == 0) return false
    return (earned.toFloat() / total) >= passingPercentage
}


fun SummativeAssessment.canRetake(studentId: String, passingPercentage: Float = 0.6f): Boolean {
    return hasStudentSubmitted(studentId) &&
            !isPassing(studentId, passingPercentage) &&
            retakeCount < maxRetakes
}

// -------------------- ACTIVITY --------------------
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(this)  // <-- Required before using Firestore
        enableEdgeToEdge()
        setContent {
            ALSLearningManagementSystemTheme {
                FullscreenApp {
                    MainApp()
                }
            }
        }
    }
}

// -------------------- FULLSCREEN WRAPPER --------------------
@Composable
fun FullscreenApp(content: @Composable () -> Unit) {
    val context = LocalContext.current
    if (context is Activity) {
        // Apply immersive mode whenever the composable is recomposed
        LaunchedEffect(Unit) {
            context.enableImmersiveMode()
        }
    }
    content()
}

// -------------------- IMMERSIVE MODE HELPER --------------------
fun Activity.enableImmersiveMode() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
        window.insetsController?.let { controller ->
            controller.hide(WindowInsets.Type.statusBars() or WindowInsets.Type.navigationBars())
            controller.systemBarsBehavior =
                WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
    } else {
        @Suppress("DEPRECATION")
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                        View.SYSTEM_UI_FLAG_FULLSCREEN or
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                )
    }
}

fun safeStudentFromDoc(doc: DocumentSnapshot): Student? {
    return try {
        Student(
            id = doc.id,
            username = doc.getString("username") ?: doc.id,
            name = doc.getString("name") ?: "",
            firstName = doc.getString("firstName") ?: "",
            middleName = doc.getString("middleName") ?: "",
            lastName = doc.getString("lastName") ?: "",
            age = doc.getString("age") ?: "",
            sex = doc.getString("sex") ?: "",
            birthday = doc.getString("birthday") ?: "",
            contact = doc.getString("contact") ?: "",
            address = doc.getString("address") ?: "",
            houseNo = doc.getString("houseNo") ?: "",
            street = doc.getString("street") ?: "",
            barangay = doc.getString("barangay") ?: "",
            municipality = doc.getString("municipality") ?: "",
            province = doc.getString("province") ?: "",
            postalCode = doc.getString("postalCode") ?: "",
            fatherName = doc.getString("fatherName") ?: "",
            motherName = doc.getString("motherName") ?: "",
            guardianName = doc.getString("guardianName") ?: "",
            guardianContact = doc.getString("guardianContact") ?: "",
            lastSchoolAttended = doc.getString("lastSchoolAttended") ?: "",
            yearAttended = doc.getString("yearAttended") ?: "",
            gradeOrYear = doc.getString("gradeOrYear") ?: "",
            studentNumber = doc.getString("studentNumber") ?: "",
            reason = doc.getString("reason") ?: "",
            disapprovalReason = doc.getString("disapprovalReason") ?: "",
            status = doc.getString("status") ?: "approved",
            uid = doc.getString("uid") ?: "", // ✅ ADDED - this is why reports showed nothing
            accountCreated = doc.getBoolean("accountCreated") ?: false, // ✅ ADDED
            password = doc.getString("password") ?: "" // ✅ ADDED if in Student data class
        )
    } catch (_: Exception) {
        null
    }
}



// -------------------- APP ROOT (hoisted shared state) --------------------
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainApp() {

    // ---------------- CONTEXT ----------------
    val appContext = LocalContext.current

    // ---------------- FIRESTORE ----------------
    val db = FirebaseFirestore.getInstance()

    // ---------------- UI STATE ----------------
    var screen by remember { mutableStateOf("login") }
    var role by remember { mutableStateOf("student") }
    var name by remember { mutableStateOf("") }

    var selectedAssessment by remember { mutableStateOf<SummativeAssessment?>(null) }
    var selectedActivity by remember { mutableStateOf<ActivityItem?>(null) }
    var selectedSummativeIndex by remember { mutableStateOf(-1) }
    var selectedQuestionIndex by remember { mutableStateOf(-1) }
    var selectedQuizIndex by remember { mutableStateOf(-1) }
    var selectedQuiz by remember { mutableStateOf<Quiz?>(null) }
    var selectedQuizId by remember { mutableStateOf<String?>(null) }
    var selectedStudent by remember { mutableStateOf<Student?>(null) }
    var approvedStudent by remember { mutableStateOf<Student?>(null) }
    var reviewStudentName by remember { mutableStateOf("") }
    var reviewTitle by remember { mutableStateOf("") }
    var reviewResults by remember { mutableStateOf<List<Pair<String, String>>>(emptyList()) }
    var darkMode by remember { mutableStateOf(false) }
    var notificationsEnabled by remember { mutableStateOf(true) }

    var selectedRetakeSummativeId by remember { mutableStateOf<Int?>(null) }
    var showRetakeConfirmDialog by remember { mutableStateOf(false) }
    var retakeTargetSummative by remember { mutableStateOf<SummativeAssessment?>(null) }

    var showDeleteDialog by remember { mutableStateOf(false) }
    var showDeleteAssessmentDialog by remember { mutableStateOf(false) }

    var studentStatus by remember { mutableStateOf("pending") }
    var studentDoc by remember { mutableStateOf<Student?>(null) }

    // ---------------- DATA LISTS ----------------
    val studentsList = remember { mutableStateListOf<Student>() }
    val archivedStudents = remember { mutableStateListOf<Student>() }
    val pendingRequests = remember { mutableStateListOf<Student>() }

    val modulesList = remember { mutableStateListOf<Module>() }
    val quizzesList = remember { mutableStateListOf<Quiz>() }
    val announcements = remember { mutableStateListOf<Announcement>() }

    val studentActivities = remember { mutableStateListOf<ActivityItem>() }
    val adminActivities = remember { mutableStateListOf<ActivityItem>() }

    val studentAssessments = remember { mutableStateListOf<SummativeAssessment>() }
    val adminAssessments = remember { mutableStateListOf<SummativeAssessment>() }

    val messagesList = remember { mutableStateListOf<Message>() }


    // ---------------- LOADING ----------------
    var studentsLoaded by remember { mutableStateOf(false) }

    // ---------------- REALTIME LISTENERS ----------------
    DisposableEffect(role) {  // 🔑 react to role change

        fun safeStudent(doc: DocumentSnapshot) = try {
            safeStudentFromDoc(doc)
        } catch (_: Exception) { null }

        fun safeQuiz(doc: DocumentSnapshot): Quiz? = try {
            // 1. Parse simple fields
            val quizNumber = doc.getLong("quizNumber")?.toInt() ?: 0
            val title = doc.getString("title") ?: "Untitled Quiz"
            val durationMinutes = doc.getLong("durationMinutes")?.toInt() ?: 0

            // 2. Parse Questions List
            val questions = (doc.get("questions") as? List<Map<String, Any>>)?.map { q ->
                Question(
                    questionText = q["questionText"] as? String ?: "",
                    type = try {
                        QuestionType.valueOf(q["type"] as? String ?: "IDENTIFICATION")
                    } catch(e: Exception) { QuestionType.IDENTIFICATION },
                    options = q["options"] as? List<String> ?: emptyList(),
                    correctAnswer = q["correctAnswer"] as? String ?: "",
                    points = (q["points"] as? Long)?.toInt() ?: 0,
                    possibleAnswers = q["possibleAnswers"] as? List<String> ?: emptyList()
                )
            } ?: emptyList()

            // 3. Parse Metadata for Admin Tracking
            // This is the array that allows the Admin to see who turned it in
            val submittedByStudentIds = doc.get("submittedByStudentIds") as? List<String> ?: emptyList()

            // 4. Parse submittedAnswersPerStudent (Map studentId -> List of answers)
            val submittedAnswersPerStudent = doc.get("submittedAnswersPerStudent") as? Map<String, List<String>> ?: emptyMap()

            // 5. Return Quiz object
            Quiz(
                id = doc.id,
                quizNumber = quizNumber,
                title = title,
                durationMinutes = durationMinutes,
                questions = questions,
                submittedByStudentIds = submittedByStudentIds, // Critical update
                submittedAnswersPerStudent = submittedAnswersPerStudent
            )
        } catch (e: Exception) {
            Log.e("FirestoreError", "Error parsing quiz ${doc.id}: ${e.message}")
            null
        }

        fun safeActivity(doc: DocumentSnapshot) = try {
            ActivityItem(
                id = doc.id,
                title = doc.getString("title") ?: "",
                description = doc.getString("description") ?: "",
                type = doc.getString("type") ?: "",
                points = doc.getLong("points")?.toInt() ?: 0,

                // 🔹 Matching the new Admin upload key
                fileUri = doc.getString("fileUri"),

                // 🔹 Mapping the list of students who submitted
                submittedByStudentIds = doc.get("submittedByStudentIds") as? List<String> ?: emptyList(),

                // 🔹 Mapping the Maps for individual student answers and files
                submittedAnswersPerStudent = doc.get("submittedAnswersPerStudent") as? Map<String, String> ?: emptyMap(),
                submittedFileUrisPerStudent = doc.get("submittedFileUrisPerStudent") as? Map<String, String> ?: emptyMap()
            )
        } catch (e: Exception) {
            android.util.Log.e("FIRESTORE_MAP", "Error mapping Activity: ${e.message}")
            null
        }


        fun safeSummative(doc: DocumentSnapshot) = try {
            SummativeAssessment(
                id = doc.getLong("id")?.toInt() ?: 0,
                title = doc.getString("title") ?: "",
                durationMinutes = doc.getLong("durationMinutes")?.toInt() ?: 0,
                questions = (doc.get("questions") as? List<Map<String, Any>>)?.map { q ->
                    Question(
                        questionText = q["questionText"] as? String ?: "",
                        type = QuestionType.valueOf(q["type"] as? String ?: "IDENTIFICATION"),
                        options = q["options"] as? List<String> ?: emptyList(),
                        correctAnswer = q["correctAnswer"] as? String ?: "",
                        points = (q["points"] as? Long)?.toInt(),
                        possibleAnswers = q["possibleAnswers"] as? List<String> ?: emptyList()
                    )
                }?.toMutableStateList() ?: mutableStateListOf(),
                submittedAnswers = doc.get("submittedAnswers") as? MutableMap<Int, String>,

                // ✅ ADDED: Parse submittedAnswersPerStudent (THIS WAS MISSING!)
                submittedAnswersPerStudent = (doc.get("submittedAnswersPerStudent") as? Map<String, List<String>>)
                    ?.toMutableMap()
                    ?: mutableMapOf(),

                maxRetakes = doc.getLong("maxRetakes")?.toInt() ?: 0,
                retakeCount = doc.getLong("retakeCount")?.toInt() ?: 0
            )
        } catch (_: Exception) { null }

        fun safeModule(doc: DocumentSnapshot) = try {
            Module(
                id = doc.id, // ✅ ADDED
                title = doc.getString("title") ?: "",
                moduleNumber = doc.getLong("moduleNumber")?.toInt() ?: 0,
                description = doc.getString("description") ?: "",
                fileUri = doc.getString("fileUri"),
                totalLessons = doc.getLong("totalLessons")?.toInt() ?: 0,
                completedLessons = doc.getLong("completedLessons")?.toInt() ?: 0,
                completedLessonsPerStudent = doc.get("completedLessonsPerStudent") as? Map<String, Int> ?: emptyMap() // ✅ ADDED
            )
        } catch (_: Exception) { null }

        fun safeMessage(doc: DocumentSnapshot) = try {
            Message(
                id = doc.id,
                sender = doc.getString("sender") ?: "",
                senderRole = doc.getString("senderRole") ?: "",
                content = doc.getString("content") ?: "",
                timestamp = doc.getTimestamp("timestamp")?.toDate()?.time ?: System.currentTimeMillis()
            )
        } catch (_: Exception) { null }


        // --- STUDENTS ---
        val studentsListener = db.collection("students")
            .addSnapshotListener { snapshot, e ->
                if (e != null) { studentsLoaded = true; return@addSnapshotListener }
                studentsList.clear()
                archivedStudents.clear()
                snapshot?.documents?.forEach { doc ->
                    safeStudent(doc)?.let { s ->
                        if (s.status.lowercase() == "archived") archivedStudents.add(s)
                        else studentsList.add(s)
                    }
                }
                studentsLoaded = true
            }

        // --- MESSAGES ---
        val messagesListener = db.collection("messages")
            .orderBy("timestamp")
            .addSnapshotListener { snapshot, e ->
                if (e != null) return@addSnapshotListener
                messagesList.clear()
                snapshot?.documents?.forEach { doc ->
                    safeMessage(doc)?.let { messagesList.add(it) }
                }
            }

        // --- PENDING STUDENTS ---
        val pendingListener = db.collection("students")
            .whereEqualTo("status", "pending")
            .addSnapshotListener { snapshot, e ->
                if (e != null) return@addSnapshotListener
                pendingRequests.clear()
                snapshot?.documents?.forEach { doc ->
                    safeStudent(doc)?.let { pendingRequests.add(it) }
                }
            }

        // --- QUIZZES ---
        val quizzesListener = db.collection("quizzes")
            .addSnapshotListener { snapshot, e ->
                if (e != null) return@addSnapshotListener
                quizzesList.clear()
                snapshot?.documents?.forEach { doc ->
                    safeQuiz(doc)?.let { quizzesList.add(it) }
                }
            }

        // --- ACTIVITIES ---
        val activitiesListener = db.collection("activities")
            .addSnapshotListener { snapshot, e ->
                if (e != null) return@addSnapshotListener
                studentActivities.clear()
                adminActivities.clear()
                snapshot?.documents?.forEach { doc ->
                    safeActivity(doc)?.let { studentActivities.add(it); adminActivities.add(it) }
                }
            }

        // --- SUMMATIVES ---
        val summativesListener = db.collection("summatives")
            .addSnapshotListener { snapshot, e ->
                if (e != null) return@addSnapshotListener
                studentAssessments.clear()
                adminAssessments.clear()
                snapshot?.documents?.forEach { doc ->
                    safeSummative(doc)?.let { studentAssessments.add(it); adminAssessments.add(it) }
                }
            }

        // --- MODULES ---
        val modulesListener = db.collection("modules")
            .addSnapshotListener { snapshot, e ->
                if (e != null) return@addSnapshotListener
                modulesList.clear()
                snapshot?.documents?.forEach { doc ->
                    safeModule(doc)?.let { modulesList.add(it) }
                }
            }
        //----ANNOUNCEMENT---
        val announcementsListener = db.collection("announcements")
            .orderBy("isPinned", Query.Direction.DESCENDING)
            .orderBy("timestamp", Query.Direction.DESCENDING)
            .addSnapshotListener { snapshot, e ->
                if (e != null) {
                    Log.e("MainApp", "Announcements listener error", e)
                    return@addSnapshotListener
                }

                val newList = snapshot?.documents?.mapNotNull { doc ->
                    try {
                        // Use .copy() to bake the ID into a new object instance
                        doc.toObject(Announcement::class.java)?.copy(id = doc.id)
                    } catch (ex: Exception) {
                        Log.e("MainApp", "Mapping error for doc ${doc.id}", ex)
                        null
                    }
                } ?: emptyList()

                // Clear and add triggers the mutableStateListOf to recompose everything
                announcements.clear()
                announcements.addAll(newList)
            }

        onDispose {
            studentsListener?.remove()
            pendingListener.remove()
            quizzesListener.remove()
            activitiesListener.remove()
            summativesListener.remove()
            modulesListener.remove()
            announcementsListener.remove()
            messagesListener.remove()
        }
    }



    // ---------------- STUDENT APPROVAL LISTENER ----------------
    if (screen == "pending_approval" && name.isNotBlank()) {
        DisposableEffect(name) {

            val listener = db.collection("students")
                .whereEqualTo("username", name)   // ✅ no document ID assumption
                .limit(1)
                .addSnapshotListener { snapshot, error ->

                    if (error != null) {
                        Log.e(
                            "MainApp",
                            "Student status listener error: ${error.message}"
                        )
                        return@addSnapshotListener
                    }

                    val doc = snapshot?.documents?.firstOrNull()
                        ?: return@addSnapshotListener

                    val student = try {
                        doc.toObject(Student::class.java)
                    } catch (_: Exception) {
                        null
                    }

                    student?.let {
                        studentDoc = it
                        studentStatus = it.status

                        // ✅ Navigate automatically if approved
                        if (it.status == "approved" && screen == "pending_approval") {
                            approvedStudent = it
                            screen = "signup"
                        } else if (it.status == "disapproved") {
                            Toast.makeText(
                                appContext,
                                "Enrollment disapproved: ${it.disapprovalReason}",
                                Toast.LENGTH_LONG
                            ).show()
                            screen = "login"
                        }
                    }
                }

            onDispose {
                listener.remove()
            }
        }
    }



    // ---------------- LOADING UI ----------------
    if (!studentsLoaded) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
        }
        return
    }


    BackHandler(enabled = true) {
        when (screen) {

            "login", "dashboard" -> {
                (appContext as? Activity)?.finish()
            }

            "enroll",
            "pending_approval",
            "signup" -> {
                screen = "login"
            }

            "admin_enrollments",
            "students",
            "manage_modules",
            "manage_quizzes",
            "quizzes",
            "progress",
            "announcements",
            "settings",
            "admin_reports",
            "messengerList",
            "student_activities",
            "student_summative",
            "admin_activities",
            "admin_summative",
            "student_submitted_items" -> {
                screen = "dashboard"
            }

            "submission_detail_view" -> {
                screen = "student_submitted_items"
            }

            "student_quiz_detail" -> {
                screen = "quizzes"
            }

            "archived_students",
            "student_profile" -> {
                screen = "students"
            }

            "student_view_activity" -> {
                screen = "student_activities"
            }

            "student_summative_detail" -> {
                screen = "student_summative"
            }

            "add_question",
            "edit_activity",
            "view_activity" -> {
                screen = "admin_activities"
            }

            "add_edit_assessment",
            "add_edit_summative_question" -> {
                screen = "admin_summative"
            }

            // ✅ FIXED: was "messenger_chat", should be "messengerChat"
            "messengerChat" -> {
                screen = "messengerList"
            }

            // ✅ ADDED: missing screens
            "manage_modules" -> {
                screen = "dashboard"
            }

            "add_edit_summative_question" -> {
                screen = "add_edit_assessment"
            }

            else -> {
                (appContext as? Activity)?.finish()
            }
        }
    }


    // --- Main Theme & Screens ---
    ALSLearningManagementSystemTheme(darkTheme = darkMode) {
        when (screen) {
            "login" -> LoginScreen(
                onLogin = { selectedRole, userName ->
                    role = selectedRole
                    name = userName
                    screen = "dashboard"   // ← this is the key to navigate
                },
                onEnroll = { screen = "enroll" }
            )



        // --- DASHBOARD ---
            "dashboard" -> when (role) {
                "student" -> {
                    val student = studentsList.firstOrNull {
                        it.username.equals(name, ignoreCase = true)
                    }

                    StudentDashboard(
                        name = student?.name ?: "",
                        studentNumber = student?.studentNumber ?: "",
                        studentUsername = student?.username ?: name,
                        modules = modulesList,
                        activities = studentActivities,
                        quizzes = quizzesList,
                        summatives = studentAssessments,
                        announcements = announcements,
                        onNavigate = { next -> screen = next }
                    )
                }
                "admin" -> AdminDashboard(
                    name = name,
                    adminUsername = name,
                    onLogout = { screen = "login" },
                    onNavigate = { next -> screen = next }
                )
            }

            // --- ENROLLMENT FORM ---
            "enroll" -> EnrollmentFormScreen(
                onSubmit = { student ->
                    name = student.username
                    screen = "pending_approval"
                },
                onCancel = { screen = "login" }
            )


// --- PENDING APPROVAL ---
            "pending_approval" -> PendingApprovalContent(
                username = name,
                onApproved = { approvedStudent = it; screen = "signup" },
                onDisapproved = { reason ->
                    Toast.makeText(appContext, "Enrollment disapproved: $reason", Toast.LENGTH_LONG).show()
                    screen = "login"
                }
            )


            "admin_enrollments" -> {
                val db = FirebaseFirestore.getInstance()

                AdminEnrollmentRequestsScreen(
                    pendingRequests = pendingRequests,
                    onApprove = { student ->
                        db.collection("students")
                            .whereEqualTo("username", student.username)
                            .limit(1)
                            .get()
                            .addOnSuccessListener { snapshot ->
                                val doc = snapshot.documents.firstOrNull()
                                if (doc != null) {
                                    doc.reference.update("status", "approved")
                                        .addOnSuccessListener {
                                            Log.d("AdminApproval", "Student ${student.name} approved")
                                        }
                                        .addOnFailureListener { e ->
                                            Log.e("AdminApproval", "Failed to approve", e)
                                        }
                                }
                            }
                            .addOnFailureListener { e ->
                                Log.e("AdminApproval", "Failed to find student", e)
                            }
                    },
                    onDisapprove = { student, reason ->
                        db.collection("students")
                            .whereEqualTo("username", student.username)
                            .limit(1)
                            .get()
                            .addOnSuccessListener { snapshot ->
                                val doc = snapshot.documents.firstOrNull()
                                if (doc != null) {
                                    doc.reference.update(
                                        mapOf(
                                            "status" to "disapproved",
                                            "disapprovalReason" to reason
                                        )
                                    )
                                        .addOnSuccessListener {
                                            Log.d("AdminDisapproval", "Student ${student.name} disapproved")
                                        }
                                        .addOnFailureListener { e ->
                                            Log.e("AdminDisapproval", "Failed to disapprove", e)
                                        }
                                }
                            }
                            .addOnFailureListener { e ->
                                Log.e("AdminDisapproval", "Failed to find student", e)
                            }
                    },
                    onBack = { screen = "dashboard" }
                )
            }


            "signup" -> {
                approvedStudent?.let { student ->
                    SignUpScreen(
                        student = student,
                        onSignUpComplete = { updatedStudent ->
                            // ✅ SignUpScreen already saved to Firestore with correct uid
                            // Just navigate to login, no duplicate save needed
                            Toast.makeText(appContext, "Account created! Please log in.", Toast.LENGTH_SHORT).show()
                            approvedStudent = null
                            screen = "login"
                        },
                        onCancel = {
                            approvedStudent = null
                            screen = "login"
                        }
                    )
                }
            }
            // --- MANAGE STUDENTS ---
            "students" -> ManageStudentsScreen(
                students = studentsList,
                archivedStudents = archivedStudents,
                onBack = { screen = "dashboard" },
                onStudentSelected = { student -> selectedStudent = student; screen = "student_profile" }
            )

            "archived_students" -> ArchivedStudentsScreen(
                archivedStudents = archivedStudents,
                onRestore = { student ->
                    archivedStudents.remove(student)
                    studentsList.add(student)
                },
                onDelete = { student ->
                    archivedStudents.remove(student)
                },
                onBack = { screen = "students" }
            )

            "student_profile" -> selectedStudent?.let {
                StudentProfileScreen(it) { screen = "students"; selectedStudent = null }
            }

            "manage_modules" -> {
                if (role == "admin") {
                    ManageModulesScreen(
                        modules = modulesList,
                        onBack = { screen = "dashboard" }
                    )
                } else {
                    ModulesScreen(
                        modules = modulesList,
                        onBack = { screen = "dashboard" }
                    )
                }
            }

            // --- QUIZZES ---
            "manage_quizzes" -> ManageQuizzesScreen(
                quizzes = quizzesList,
                onBack = { screen = "dashboard" },
                onAddQuiz = { },
                onEditQuiz = { _, _ -> },
                onDeleteQuiz = { }
            )

            "quizzes" -> StudentQuizzesScreen(
                quizzes = quizzesList,
                onBack = { screen = "dashboard" },
                onQuizSelected = { quizId, quiz ->
                    selectedQuizId = quizId
                    selectedQuiz = quiz
                    screen = "student_quiz_detail"
                }
            )

            "student_quiz_detail" -> selectedQuiz?.let { quiz ->
                QuizDetailScreen(
                    quizId = selectedQuizId ?: quiz.id,
                    quiz = quiz,
                    onBack = {
                        selectedQuiz = null
                        selectedQuizId = null // ✅ Reset ID to prevent state leaking
                        screen = "quizzes"
                    },
                    onSubmissionComplete = {
                        // Because you have a real-time listener in MainApp,
                        // the UI updates automatically when the student saves to DB.
                        selectedQuiz = null
                        selectedQuizId = null
                        screen = "quizzes"
                    }
                )
            }
            // --- SUMMATIVES ---
            "admin_summative" -> ManageSummativesScreen(
                summatives = adminAssessments,
                onBack = { screen = "dashboard" },
                onAddSummative = { /* Listener handles it */ },
                onEditSummative = { index ->
                    selectedSummativeIndex = -1
                    selectedAssessment = null
                },
                onDeleteSummative = { /* Listener handles it */ }
            )

            "add_edit_assessment" -> AddOrEditSummativeScreen(
                existingSummative = selectedAssessment,
                summativeIndex = selectedSummativeIndex.takeIf { it >= 0 },
                onSave = { saved ->
                    // Use document ID if it exists, otherwise create new one
                    val docId = if (saved.id != 0) saved.id.toString() else db.collection("summatives").document().id
                    val finalSummative = if (saved.id == 0) saved.copy(id = docId.hashCode()) else saved

                    db.collection("summatives").document(docId).set(finalSummative)

                    // Reset state and go back
                    selectedSummativeIndex = -1
                    selectedAssessment = null
                    screen = "admin_summative"
                },
                onCancel = {
                    selectedSummativeIndex = -1
                    selectedAssessment = null
                    screen = "admin_summative"
                }
            )

            "student_summative" -> StudentSummativesScreen(
                summatives = studentAssessments,
                onBack = { screen = "dashboard" },
                onSummativeSelected = { summ, index ->
                    selectedAssessment = summ
                    screen = "student_summative_detail"
                },
                onUpdateFirebase = { updatedSummative ->
                    db.collection("summatives")
                        .document(updatedSummative.id.toString())
                        .set(updatedSummative)
                        .addOnFailureListener { e ->
                            Log.e("Firebase", "Update failed", e)
                        }
                },
                retakeSummativeId = selectedRetakeSummativeId
            )

            "student_summative_detail" -> selectedAssessment?.let { summative ->
                SummativeDetailScreen(
                    summative = summative,
                    summativeNumber = adminAssessments.indexOf(summative) + 1,
                    onBack = {
                        selectedAssessment = null
                        screen = "student_summative"
                    },
                    onSaveSubmission = { finalSummative ->
                        val index = adminAssessments.indexOfFirst { it.id == finalSummative.id }
                        if (index != -1) {
                            adminAssessments[index] = finalSummative
                        }

                        val studentIndex = studentAssessments.indexOfFirst { it.id == finalSummative.id }
                        if (studentIndex != -1) {
                            studentAssessments[studentIndex] = finalSummative
                        }

                        selectedAssessment = null
                        screen = "student_summative"
                    }
                )
            }

            // --- PROGRESS ---
            "progress" -> ProgressScreen(
                modules = modulesList,
                quizzes = quizzesList,
                activities = adminActivities,
                summatives = adminAssessments,
                onBack = { screen = "dashboard" },
                onRetakeSummative = { retakeSummative ->
                    selectedRetakeSummativeId = retakeSummative.id
                    screen = "student_summative"
                }
            )


            "student_submitted_items" -> {
                val knownUids = studentsList.map { it.uid }.filter { it.isNotBlank() }.toSet()
                StudentSubmittedItems(
                    quizzes = quizzesList.filter { quiz ->
                        quiz.submittedAnswersPerStudent.keys.any { it in knownUids }
                    },
                    activities = studentActivities.filter { activity ->
                        activity.submittedByStudentIds.any { it in knownUids }
                    },
                    summatives = studentAssessments.filter { summative ->
                        summative.submittedAnswersPerStudent.keys.any { it in knownUids }
                    },
                    studentsList = studentsList,
                    onViewSubmission = { studentName, title, results ->
                        reviewStudentName = studentName
                        reviewTitle = title
                        reviewResults = results
                        screen = "submission_detail_view"
                    },
                    onBack = { screen = "dashboard" }
                )
            }

            "submission_detail_view" -> SubmissionDetailScreen(
                studentName = reviewStudentName,
                title = reviewTitle,
                results = reviewResults,
                onBack = { screen = "student_submitted_items" }
            )


            // --- ANNOUNCEMENTS ---
            "announcements" -> AnnouncementsScreen(
                loggedInUser = name,
                role = role,
                onBack = { screen = "dashboard" }
            )

            // --- SETTINGS ---
            "settings" -> {
                val currentStudent = studentsList.firstOrNull {
                    it.username.equals(name, ignoreCase = true)
                }
                SettingsScreen(
                    role = role,
                    studentName = currentStudent?.name ?: "",
                    studentNumber = currentStudent?.studentNumber ?: "",
                    darkMode = darkMode,
                    notificationsEnabled = notificationsEnabled,
                    onDarkModeChange = { darkMode = it },
                    onNotificationsChange = { notificationsEnabled = it },
                    onBack = { screen = "dashboard" }
                ) { screen = "login" }
            }

            // --- ADMIN REPORTS ---
            "admin_reports" -> AdminReportsScreen(
                students = studentsList,
                modules = modulesList,
                quizzes = quizzesList,
                activities = adminActivities,
                summatives = adminAssessments,
                onBack = { screen = "dashboard" }
            )

            "messengerList" -> StudentsChatListScreen(
                loggedInUser = name, // ✅ Use "admin" or "student"
                onBack = { screen = "dashboard" },
                onStudentSelected = {
                    selectedStudent = it
                    screen = "messengerChat"
                }
            )

            "messengerChat" -> selectedStudent?.let { student ->
                MessengerChatScreen(
                    loggedInUser = name,   // the current user
                    chatPartner = student, // the person we are chatting with
                    onBack = {
                        selectedStudent = null
                        screen = "messengerList"
                    }
                )


            } ?: run {
                // fallback if somehow selectedStudent is null
                screen = "messengerList"
            }

            // --- STUDENT ACTIVITIES ---
            "student_activities" -> ActivitiesScreen(
                activities = studentActivities, // ✅ Pass real-time data
                onBack = { screen = "dashboard" },
                onViewActivity = { activity ->
                    selectedActivity = activity
                    screen = "student_view_activity"
                }
            )

            "student_view_activity" -> selectedActivity?.let {
                StudentViewActivityScreen(activity = it, onBack = { selectedActivity = null; screen = "student_activities" })
            }

            // --- ADMIN ACTIVITIES ---
            "admin_activities" -> AdminActivitiesScreen(
                activities = adminActivities,
                onBack = { screen = "dashboard" },
                onAddActivity = { screen = "add_question" },
                onEditActivity = { activity -> selectedActivity = activity; screen = "edit_activity" },
                onDeleteActivity = { activity ->
                    // optional: handle deletion in your state
                    adminActivities.remove(activity)
                }
            )


            "add_question" -> AddQuestionScreen(onCancel = { screen = "admin_activities" }, onSaveComplete = { screen = "admin_activities" })

            "edit_activity" -> selectedActivity?.let {
                EditActivityScreen(activity = it, onCancel = { selectedActivity = null; screen = "admin_activities" })
            }

            "view_activity" -> selectedActivity?.let { activity ->
                ViewActivityScreen(activity = activity, onBack = { selectedActivity = null; screen = "admin_activities" })
            } ?: run { screen = "admin_activities" }
        }

        // --- DELETE DIALOGS ---
        if (showDeleteDialog && selectedActivity != null) {
            AlertDialog(
                onDismissRequest = { showDeleteDialog = false },
                title = { Text("Delete Activity") },
                text = { Text("Are you sure you want to delete \"${selectedActivity!!.title}\"?") },
                confirmButton = {
                    Button(
                        onClick = { adminActivities.remove(selectedActivity!!); selectedActivity = null; showDeleteDialog = false },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
                    ) { Text("Delete", color = Color.White) }
                },
                dismissButton = { OutlinedButton(onClick = { showDeleteDialog = false }) { Text("Cancel") } }
            )
        }

        if (showDeleteAssessmentDialog && selectedAssessment != null) {
            AlertDialog(
                onDismissRequest = { showDeleteAssessmentDialog = false },
                title = { Text("Delete Assessment") },
                text = { Text("Are you sure you want to delete \"${selectedAssessment!!.title}\"?") },
                confirmButton = {
                    Button(
                        onClick = { adminAssessments.remove(selectedAssessment!!); selectedAssessment = null; showDeleteAssessmentDialog = false },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
                    ) { Text("Delete", color = Color.White) }
                },
                dismissButton = { OutlinedButton(onClick = { showDeleteAssessmentDialog = false }) { Text("Cancel") } }
            )
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    onLogin: (String, String) -> Unit,
    onEnroll: () -> Unit
) {
    val db = remember { FirebaseFirestore.getInstance() }
    val auth = remember { Firebase.auth }
    val scope = rememberCoroutineScope()
    val context = LocalContext.current

    // Premium Green Palette
    val brandGreen = Color(0xFF2E7D32)
    val brandGreenLight = Color(0xFFE8F5E9)
    val brandGreenDark = Color(0xFF1B5E20)
    val softGray = Color(0xFFF0F2F5)

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    var showErrorDialog by remember { mutableStateOf(false) }
    var errorMessage by remember { mutableStateOf("") }
    var isLoading by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(listOf(Color.White, softGray)))
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(brandGreenLight.copy(alpha = 0.6f), Color.Transparent),
                    center = Offset(size.width * 0.9f, size.height * 0.1f),
                    radius = size.width * 0.7f
                )
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(56.dp))

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                TextButton(onClick = onEnroll) {
                    Text("New here? ", color = Color.Gray)
                    Text("Enroll Now", color = brandGreen, fontWeight = FontWeight.ExtraBold)
                    Icon(Icons.Default.ArrowForward, null, Modifier.size(16.dp).padding(start = 4.dp), tint = brandGreen)
                }
            }

            Spacer(Modifier.height(40.dp))

            Surface(
                modifier = Modifier.size(160.dp),
                shape = CircleShape,
                color = Color.White,
                shadowElevation = 20.dp,
                border = BorderStroke(4.dp, brandGreenLight)
            ) {
                Box(contentAlignment = Alignment.Center, modifier = Modifier.padding(20.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.logo_als),
                        contentDescription = "ALS Logo",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Fit
                    )
                }
            }

            Spacer(Modifier.height(32.dp))

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "NAMPICUAN",
                    style = MaterialTheme.typography.displaySmall.copy(
                        fontWeight = FontWeight.Black, letterSpacing = 6.sp, color = brandGreenDark
                    )
                )
                Text(
                    text = "ALTERNATIVE LEARNING SYSTEM",
                    style = MaterialTheme.typography.labelMedium.copy(
                        letterSpacing = 2.sp, fontWeight = FontWeight.Medium, color = brandGreen.copy(alpha = 0.7f)
                    )
                )
            }

            Spacer(Modifier.height(48.dp))

            Surface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(32.dp),
                color = Color.White,
                shadowElevation = 12.dp
            ) {
                Column(modifier = Modifier.padding(28.dp)) {
                    Text(
                        text = "WELCOME BACK",
                        style = MaterialTheme.typography.labelLarge.copy(
                            fontWeight = FontWeight.ExtraBold, letterSpacing = 1.sp, color = Color.Gray.copy(alpha = 0.6f)
                        ),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )

                    Spacer(Modifier.height(24.dp))

                    InputFieldLabel("Username", Color.DarkGray)
                    OutlinedTextField(
                        value = username,
                        onValueChange = { username = it },
                        placeholder = { Text("e.g. juandelacruz") },
                        leadingIcon = { Icon(Icons.Default.Person, null, tint = brandGreen) },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        colors = outlinedFieldColors(brandGreen)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    InputFieldLabel("Password", Color.DarkGray)
                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        placeholder = { Text("••••••••") },
                        leadingIcon = { Icon(Icons.Default.Lock, null, tint = brandGreen) },
                        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                        trailingIcon = {
                            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                                Icon(
                                    imageVector = if (passwordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                                    contentDescription = null, tint = Color.LightGray
                                )
                            }
                        },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        colors = outlinedFieldColors(brandGreen)
                    )

                    Spacer(modifier = Modifier.height(32.dp))

                    Button(
                        onClick = {
                            if (username.isBlank() || password.isBlank()) {
                                errorMessage = "Fields cannot be empty"
                                showErrorDialog = true
                                return@Button
                            }
                            isLoading = true
                            if (username.trim().lowercase() == "admin" && password.trim() == "admin123") {
                                onLogin("admin", "admin") // ✅ changed from "Admin User" to "admin"
                                isLoading = false
                                return@Button
                            }
                            val normalizedUsername = username.trim().lowercase()
                            auth.signInWithEmailAndPassword("${normalizedUsername}@als.edu", password.trim())
                                .addOnSuccessListener {
                                    scope.launch {
                                        try {
                                            val snapshot = db.collection("students").whereEqualTo("username", normalizedUsername).limit(1).get().await()
                                            if (!snapshot.isEmpty) {
                                                val userDoc = snapshot.documents.first()
                                                val status = userDoc.getString("status")?.trim()?.lowercase() ?: "pending"
                                                when (status) {
                                                    "pending" -> { errorMessage = "Enrollment is still pending"; showErrorDialog = true }
                                                    "disapproved" -> { errorMessage = "Enrollment disapproved"; showErrorDialog = true }
                                                    "approved", "active" -> onLogin("student", normalizedUsername)
                                                    else -> { errorMessage = "Account status unknown"; showErrorDialog = true }
                                                }
                                            } else {
                                                errorMessage = "Account not found in database"
                                                showErrorDialog = true
                                            }
                                        } catch (e: Exception) {
                                            errorMessage = "Error: ${e.localizedMessage}"
                                            showErrorDialog = true
                                        } finally { isLoading = false }
                                    }
                                }
                                .addOnFailureListener { e ->
                                    isLoading = false
                                    errorMessage = when {
                                        e.message?.contains("no user record") == true -> "Account not found."
                                        e.message?.contains("password is invalid") == true -> "Incorrect password"
                                        else -> "Login failed: ${e.localizedMessage}"
                                    }
                                    showErrorDialog = true
                                }
                        },
                        modifier = Modifier.fillMaxWidth().height(60.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = brandGreen),
                        shape = RoundedCornerShape(18.dp)
                    ) {
                        if (isLoading) {
                            CircularProgressIndicator(color = Color.White, modifier = Modifier.size(24.dp), strokeWidth = 2.dp)
                        } else {
                            Text("SIGN IN", fontWeight = FontWeight.ExtraBold, fontSize = 16.sp, letterSpacing = 2.sp)
                        }
                    }
                }
            }
            Spacer(Modifier.height(40.dp))
            Text("Nampicuan District © 2026", style = MaterialTheme.typography.labelSmall, color = Color.Gray.copy(alpha = 0.5f))
            Spacer(Modifier.height(24.dp))
        }

        if (showErrorDialog) {
            AlertDialog(
                onDismissRequest = { showErrorDialog = false },
                confirmButton = {
                    TextButton(onClick = { showErrorDialog = false }) {
                        Text("OK", color = brandGreen, fontWeight = FontWeight.Bold)
                    }
                },
                title = { Text("Login Failed", fontWeight = FontWeight.Bold) },
                text = { Text(errorMessage) },
                shape = RoundedCornerShape(24.dp),
                containerColor = Color.White
            )
        }
    }
}

// --- HELPER FUNCTIONS (KEEP THESE AT THE BOTTOM OF THE FILE) ---

@Composable
fun InputFieldLabel(text: String, color: Color) {
    Text(
        text = text,
        style = MaterialTheme.typography.labelLarge,
        fontWeight = FontWeight.Bold,
        color = color,
        modifier = Modifier.padding(start = 4.dp, bottom = 8.dp)
    )
}

@Composable
fun outlinedFieldColors(brandColor: Color) = OutlinedTextFieldDefaults.colors(
    focusedBorderColor = brandColor,
    unfocusedBorderColor = Color(0xFFE8E8E8),
    focusedContainerColor = Color(0xFFF9F9F9),
    unfocusedContainerColor = Color(0xFFF9F9F9),
    cursorColor = brandColor,
    focusedTextColor = Color(0xFF1D1B20),
    unfocusedTextColor = Color(0xFF1D1B20)
)


// ---------------- ENROLLMENT FLOW MANAGER ----------------
@Composable
fun EnrollmentFlowManager(
    onEnrollmentComplete: (Student) -> Unit,
    onCancel: () -> Unit
) {
    var flowState by remember { mutableStateOf<EnrollmentFlowState>(EnrollmentFlowState.FillingForm) }
    var currentStudent by remember { mutableStateOf<Student?>(null) }

    when (flowState) {
        is EnrollmentFlowState.FillingForm -> {
            EnrollmentFormScreen(
                onSubmit = { student ->
                    currentStudent = student
                    flowState = EnrollmentFlowState.WaitingApproval(student.username)
                },
                onCancel = onCancel
            )
        }

        is EnrollmentFlowState.WaitingApproval -> {
            PendingApprovalContent(
                username = (flowState as EnrollmentFlowState.WaitingApproval).username,
                onApproved = { approvedStudent ->
                    currentStudent = approvedStudent
                    flowState = EnrollmentFlowState.CreatingAccount
                },
                onDisapproved = { reason ->
                    flowState = EnrollmentFlowState.Disapproved(reason)
                }
            )
        }

        is EnrollmentFlowState.CreatingAccount -> {
            currentStudent?.let { student ->
                SignUpScreen(
                    student = student,
                    onSignUpComplete = { updatedStudent ->
                        onEnrollmentComplete(updatedStudent)
                    },
                    onCancel = onCancel
                )
            }
        }

        is EnrollmentFlowState.Disapproved -> {
            DisapprovedScreen(
                reason = (flowState as EnrollmentFlowState.Disapproved).reason,
                onTryAgain = {
                    flowState = EnrollmentFlowState.FillingForm
                    currentStudent = null
                },
                onCancel = onCancel
            )
        }
    }
}

sealed class EnrollmentFlowState {
    object FillingForm : EnrollmentFlowState()
    data class WaitingApproval(val username: String) : EnrollmentFlowState()
    object CreatingAccount : EnrollmentFlowState()
    data class Disapproved(val reason: String) : EnrollmentFlowState()
}

@Composable
fun DisapprovedScreen(
    reason: String,
    onTryAgain: () -> Unit,
    onCancel: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFF5F5)),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            shape = RoundedCornerShape(24.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Column(
                modifier = Modifier.padding(32.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    Icons.Default.Cancel,
                    contentDescription = null,
                    tint = Color(0xFFE74C3C),
                    modifier = Modifier.size(64.dp)
                )

                Spacer(Modifier.height(16.dp))

                Text(
                    "Enrollment Disapproved",
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFE74C3C)
                )

                Spacer(Modifier.height(8.dp))

                Text(
                    "Hindi naaprubahan ang iyong enrollment",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray
                )

                Spacer(Modifier.height(24.dp))

                Surface(
                    color = Color(0xFFFFF5F5),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            "Reason / Dahilan:",
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.bodySmall
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(
                            reason,
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }

                Spacer(Modifier.height(24.dp))

                Button(
                    onClick = onTryAgain,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF1976D2)
                    )
                ) {
                    Text("Try Again / Subukan Muli")
                }

                Spacer(Modifier.height(8.dp))

                TextButton(
                    onClick = onCancel,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Cancel / Ikansela")
                }
            }
        }
    }
}

// ---------------- ENROLLMENT FORM SCREEN (SIMPLIFIED) ----------------
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EnrollmentFormScreen(
    onSubmit: (Student) -> Unit,
    onCancel: () -> Unit
) {
    var firstName by remember { mutableStateOf("") }
    var middleName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var birthday by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var sex by remember { mutableStateOf("") }
    var contact by remember { mutableStateOf("") }
    var houseNo by remember { mutableStateOf("") }
    var street by remember { mutableStateOf("") }
    var barangay by remember { mutableStateOf("") }
    var city by remember { mutableStateOf("") }
    var province by remember { mutableStateOf("") }
    var postalCode by remember { mutableStateOf("") }
    var fatherName by remember { mutableStateOf("") }
    var motherName by remember { mutableStateOf("") }
    var guardianName by remember { mutableStateOf("") }
    var guardianContact by remember { mutableStateOf("") }
    var lastSchool by remember { mutableStateOf("") }
    var yearAttended by remember { mutableStateOf("") }
    var gradeOrYear by remember { mutableStateOf("") }
    var reason by remember { mutableStateOf("") }
    var isSubmitting by remember { mutableStateOf(false) }

    val context = LocalContext.current
    val calendar = remember { Calendar.getInstance() }
    val primaryBlue = Color(0xFF1976D2)
    val secondaryBlue = Color(0xFF64B5F6)

    Column(modifier = Modifier.fillMaxSize().background(Color(0xFFF5F7FA)).verticalScroll(rememberScrollState())) {

        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = primaryBlue,
            shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
            shadowElevation = 4.dp
        ) {
            Column(
                modifier = Modifier
                    .background(Brush.verticalGradient(listOf(primaryBlue, secondaryBlue)))
                    .padding(top = 48.dp, bottom = 32.dp, start = 24.dp, end = 24.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(onClick = onCancel, modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)) {
                        Icon(Icons.Default.Close, "Cancel", tint = Color.White)
                    }
                    Spacer(Modifier.width(16.dp))
                    Column {
                        Text("Registration Form", style = MaterialTheme.typography.labelLarge, color = Color.White.copy(0.8f))
                        Text("ENROLLMENT / PAG-EENROL", style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.ExtraBold), color = Color.White)
                    }
                }
            }
        }

        Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(20.dp)) {

            FormSection(title = "Personal Information", subTitle = "Impormasyon tungkol sa Sarili", icon = Icons.Default.Person, accentColor = primaryBlue) {
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    BilingualField(firstName, { firstName = it }, "First Name", "Pangalan", Modifier.weight(1f))
                    BilingualField(lastName, { lastName = it }, "Last Name", "Apelyido", Modifier.weight(1f))
                }
                BilingualField(middleName, { middleName = it }, "Middle Name", "Gitnang Pangalan")

                OutlinedTextField(
                    value = birthday,
                    onValueChange = {},
                    label = { Text("Birthday (Kaarawan)") },
                    readOnly = true,
                    modifier = Modifier.fillMaxWidth().clickable {
                        DatePickerDialog(context, { _, y, m, d ->
                            birthday = "$y-${m+1}-$d"
                            age = (Calendar.getInstance().get(Calendar.YEAR) - y).toString()
                        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show()
                    },
                    enabled = false,
                    shape = RoundedCornerShape(12.dp),
                    trailingIcon = { Icon(Icons.Default.CalendarToday, null) },
                    colors = OutlinedTextFieldDefaults.colors(disabledBorderColor = Color.LightGray, disabledLabelColor = Color.DarkGray, disabledTextColor = Color.Black)
                )

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    BilingualField(age, { age = it }, "Age", "Edad", Modifier.weight(0.4f), readOnly = true)
                    BilingualField(sex, { sex = it }, "Sex", "Kasarian", Modifier.weight(0.6f))
                }
                BilingualField(contact, { contact = it }, "Contact No.", "Numero ng Telepono")
            }

            FormSection(title = "Address Information", subTitle = "Tirahan", icon = Icons.Default.Home, accentColor = Color(0xFF4CAF50)) {
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    BilingualField(houseNo, { houseNo = it }, "House No.", "Numero ng Bahay", Modifier.weight(1f))
                    BilingualField(street, { street = it }, "Street", "Kalye", Modifier.weight(1f))
                }
                BilingualField(barangay, { barangay = it }, "Barangay", "Barangay")
                BilingualField(city, { city = it }, "Municipality/City", "Bayan/Lungsod")
                BilingualField(province, { province = it }, "Province", "Probinsya")
            }

            FormSection(title = "Guardian Info", subTitle = "Impormasyon ng Magulang/Tagapangalaga", icon = Icons.Default.FamilyRestroom, accentColor = Color(0xFFFF9800)) {
                BilingualField(fatherName, { fatherName = it }, "Father's Full Name", "Buong Pangalan ng Tatay")
                BilingualField(motherName, { motherName = it }, "Mother's Full Name", "Buong Pangalan ng Nanay")
                BilingualField(guardianName, { guardianName = it }, "Guardian's Name", "Pangalan ng Tagapangalaga")
                BilingualField(guardianContact, { guardianContact = it }, "Guardian Contact", "Numero ng Tagapangalaga")
            }

            FormSection(title = "Educational History", subTitle = "Kasaysayan ng Pag-aaral", icon = Icons.Default.School, accentColor = Color(0xFF9C27B0)) {
                BilingualField(lastSchool, { lastSchool = it }, "Last School Attended", "Huling Paaralang Pinasukan")
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    BilingualField(
                        value = yearAttended,
                        onValueChange = { yearAttended = it },
                        english = "Year",
                        tagalog = "Taon",
                        modifier = Modifier.weight(1f),
                        keyboardType = KeyboardType.Number
                    )
                    BilingualField(gradeOrYear, { gradeOrYear = it }, "Level", "Grado", Modifier.weight(1f))
                }
                BilingualField(reason, { reason = it }, "Reason for not pursuing regular education", "Dahilan kung bakit hindi nakapag-aral sa regular na paaralan", maxLines = 3)
            }

            // ✅ FIXED SUBMISSION BLOCK
            Column(modifier = Modifier.padding(vertical = 12.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Button(
                    onClick = {
                        if (isSubmitting) return@Button
                        isSubmitting = true

                        val db = FirebaseFirestore.getInstance()

                        val fullName = listOf(firstName, middleName, lastName).joinToString(" ").trim()
                        val fullAddress = listOf(houseNo, street, barangay, city).joinToString(", ")

                        // ✅ CRITICAL FIX: Generate username FIRST, use as document ID
                        val generatedUsername = java.util.UUID.randomUUID().toString().take(8)

                        val student = Student(
                            id = generatedUsername, // ✅ Use username as ID
                            name = fullName,
                            age = age,
                            sex = sex,
                            contact = contact,
                            address = fullAddress,
                            firstName = firstName,
                            middleName = middleName,
                            lastName = lastName,
                            birthday = birthday,
                            houseNo = houseNo,
                            street = street,
                            barangay = barangay,
                            municipality = city,
                            province = province,
                            postalCode = postalCode,
                            fatherName = fatherName,
                            motherName = motherName,
                            guardianName = guardianName,
                            guardianContact = guardianContact,
                            lastSchoolAttended = lastSchool,
                            yearAttended = yearAttended,
                            gradeOrYear = gradeOrYear,
                            reason = reason,
                            username = generatedUsername, // ✅ Same as ID
                            password = "",
                            status = "pending",
                            disapprovalReason = "",
                            uid = "" // Empty until signup
                        )

                        // ✅ CRITICAL FIX: Use username as document ID
                        db.collection("students")
                            .document(generatedUsername) // ✅ username = document ID
                            .set(student)
                            .addOnSuccessListener {
                                Log.d("Enrollment", "Student enrolled: $generatedUsername")
                                onSubmit(student)
                                isSubmitting = false
                            }
                            .addOnFailureListener { e ->
                                Log.e("Enrollment", "Failed to submit", e)
                                Toast.makeText(context, "Submission failed: ${e.message}", Toast.LENGTH_SHORT).show()
                                isSubmitting = false
                            }
                    },
                    modifier = Modifier.fillMaxWidth().height(56.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = primaryBlue),
                    enabled = !isSubmitting
                ) {
                    if (isSubmitting) {
                        CircularProgressIndicator(color = Color.White, modifier = Modifier.size(24.dp))
                    } else {
                        Text("SUBMIT ENROLLMENT (IPASA)", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    }
                }

                OutlinedButton(
                    onClick = onCancel,
                    modifier = Modifier.fillMaxWidth().height(56.dp),
                    shape = RoundedCornerShape(16.dp),
                    enabled = !isSubmitting
                ) {
                    Text("CANCEL (IKANSELA)", color = Color.Gray)
                }
            }
        }
    }
}

@Composable
fun FormSection(
    title: String,
    subTitle: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    accentColor: Color,
    content: @Composable ColumnScope.() -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Surface(modifier = Modifier.size(36.dp), shape = CircleShape, color = accentColor.copy(0.1f)) {
                    Icon(icon, null, tint = accentColor, modifier = Modifier.padding(8.dp))
                }
                Spacer(Modifier.width(12.dp))
                Column {
                    Text(title, fontWeight = FontWeight.ExtraBold, style = MaterialTheme.typography.titleMedium)
                    Text(subTitle, style = MaterialTheme.typography.labelSmall, color = Color.Gray)
                }
            }
            Spacer(Modifier.height(20.dp))
            content()
        }
    }
}

@Composable
fun BilingualField(
    value: String,
    onValueChange: (String) -> Unit,
    english: String,
    tagalog: String,
    modifier: Modifier = Modifier,
    readOnly: Boolean = false,
    maxLines: Int = 1,
    keyboardType: KeyboardType = KeyboardType.Text
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            Column {
                Text(english, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                Text(tagalog, fontSize = 10.sp, color = Color.Gray)
            }
        },
        modifier = modifier.fillMaxWidth().padding(vertical = 4.dp),
        shape = RoundedCornerShape(12.dp),
        readOnly = readOnly,
        maxLines = maxLines,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType)
    )
}

@Composable
fun PendingApprovalContent(
    username: String,
    onApproved: (Student) -> Unit,
    onDisapproved: (String) -> Unit
) {
    val db = FirebaseFirestore.getInstance()
    val primaryBlue = Color(0xFF1976D2)

    DisposableEffect(username) {
        val listener = try {
            db.collection("students")
                .whereEqualTo("username", username)
                .limit(1)
                .addSnapshotListener { snapshot, error ->
                    if (error != null) {
                        Log.e("PendingApproval", "Firestore listener error", error)
                        return@addSnapshotListener
                    }

                    val doc = snapshot?.documents?.firstOrNull()
                    if (doc == null) {
                        Log.d("PendingApproval", "No student document found yet")
                        return@addSnapshotListener
                    }

                    val student = try {
                        doc.toObject(Student::class.java)?.copy(id = doc.id)
                    } catch (e: Exception) {
                        Log.e("PendingApproval", "Failed to parse Student object", e)
                        null
                    } ?: return@addSnapshotListener

                    // FIXED: Properly handle status changes
                    when (student.status ?: "pending") {
                        "approved" -> onApproved(student)
                        "disapproved" -> onDisapproved(student.disapprovalReason ?: "No reason provided")
                        else -> { /* still pending, do nothing */ }
                    }
                }
        } catch (e: Exception) {
            Log.e("PendingApproval", "Failed to attach listener", e)
            null
        }

        onDispose { listener?.remove() }
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            CircularProgressIndicator(color = primaryBlue)
            Spacer(Modifier.height(16.dp))
            Text("Naghihintay ng pag-apruba ng admin...", fontWeight = FontWeight.Medium)
            Text("(Waiting for admin approval)", style = MaterialTheme.typography.bodySmall, color = Color.Gray)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdminEnrollmentRequestsScreen(
    pendingRequests: List<Student>,
    onApprove: (Student) -> Unit,
    onDisapprove: (Student, String) -> Unit,
    onBack: () -> Unit
) {
    var showApproveDialog by remember { mutableStateOf<Student?>(null) }
    var showDisapproveDialog by remember { mutableStateOf<Student?>(null) }
    var disapprovalReason by remember { mutableStateOf("") }

    val headerStartColor = Color(0xFFAED581)
    val headerEndColor = Color(0xFF8BC34A)
    val accentGreen = Color(0xFF689F38)

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF9FBF9))) {
        Column(modifier = Modifier.fillMaxSize()) {

            // --- HEADER ---
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = headerStartColor,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onBack,
                            modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)
                        ) {
                            Icon(Icons.Default.ArrowBack, "Back", tint = Color.White)
                        }
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text("New Admissions", style = MaterialTheme.typography.labelLarge, color = Color.White.copy(0.8f))
                            Text(
                                "ENROLLMENTS",
                                style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.ExtraBold, letterSpacing = 1.sp),
                                color = Color.White
                            )
                        }

                        // ✅ ADDED ONLY: PREMIUM GLASS LOGO CONTAINER
                        Spacer(Modifier.weight(1f))
                        Surface(
                            modifier = Modifier.size(52.dp),
                            shape = CircleShape,
                            color = Color.White.copy(alpha = 0.25f),
                            border = BorderStroke(1.dp, Color.White.copy(alpha = 0.4f))
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.PersonAdd,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(28.dp)
                                )
                            }
                        }
                    }
                }
            }

            if (pendingRequests.isEmpty()) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(Icons.Default.Inbox, null, modifier = Modifier.size(64.dp), tint = Color.LightGray)
                        Text("No pending requests", color = Color.Gray, style = MaterialTheme.typography.bodyLarge)
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp, 24.dp, 16.dp, 24.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    items(
                        items = pendingRequests,
                        key = { it.id }
                    ) { student ->
                        EnrollmentCard(
                            student = student,
                            accentColor = accentGreen,
                            onApprove = { showApproveDialog = student },
                            onDisapprove = { showDisapproveDialog = student }
                        )
                    }
                }
            }
        }
    }

    // --- DIALOGS (LOGIC UNTOUCHED) ---
    showApproveDialog?.let { student ->
        AlertDialog(
            onDismissRequest = { showApproveDialog = null },
            icon = { Icon(Icons.Default.CheckCircle, null, tint = accentGreen) },
            title = { Text("Approve Enrollment") },
            text = { Text("Approve ${student.name} and grant access to the learning modules?") },
            confirmButton = {
                Button(
                    onClick = {
                        onApprove(student)
                        showApproveDialog = null
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = accentGreen)
                ) { Text("Confirm Approval") }
            },
            dismissButton = { TextButton(onClick = { showApproveDialog = null }) { Text("Cancel") } }
        )
    }

    showDisapproveDialog?.let { student ->
        AlertDialog(
            onDismissRequest = {
                showDisapproveDialog = null
                disapprovalReason = ""
            },
            title = { Text("Disapprove Enrollment") },
            text = {
                Column {
                    Text("Reason for rejecting ${student.name}:", style = MaterialTheme.typography.bodyMedium)
                    Spacer(Modifier.height(12.dp))
                    OutlinedTextField(
                        value = disapprovalReason,
                        onValueChange = { disapprovalReason = it },
                        placeholder = { Text("e.g. Incomplete documents") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp)
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        if (disapprovalReason.isNotBlank()) {
                            onDisapprove(student, disapprovalReason)
                            disapprovalReason = ""
                            showDisapproveDialog = null
                        }
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE74C3C))
                ) { Text("Submit Rejection") }
            },
            dismissButton = {
                TextButton(onClick = {
                    showDisapproveDialog = null
                    disapprovalReason = ""
                }) { Text("Go Back") }
            }
        )
    }
}

@Composable
fun EnrollmentCard(
    student: Student,
    accentColor: Color,
    onApprove: () -> Unit,
    onDisapprove: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Surface(modifier = Modifier.size(48.dp), shape = CircleShape, color = accentColor.copy(0.1f)) {
                    Box(contentAlignment = Alignment.Center) {
                        // UPDATED: Safer initial picker
                        val initial = student.lastName.firstOrNull()?.toString() ?:
                        student.name.firstOrNull()?.toString() ?: "?"
                        Text(initial.uppercase(), fontWeight = FontWeight.Bold, color = accentColor, fontSize = 20.sp)
                    }
                }
                Spacer(Modifier.width(12.dp))
                Column(Modifier.weight(1f)) {
                    Text(student.name, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                    Text("${student.age} yrs • ${student.sex}", style = MaterialTheme.typography.bodySmall, color = Color.Gray)
                }
                Surface(color = Color(0xFFFFF3E0), shape = RoundedCornerShape(8.dp)) {
                    Text(
                        "PENDING",
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                        style = MaterialTheme.typography.labelSmall,
                        color = Color(0xFFE65100),
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Divider(Modifier.padding(vertical = 16.dp), thickness = 0.5.dp, color = Color.LightGray.copy(0.5f))

            InfoRow(Icons.Default.Phone, "Contact", student.contact)
            InfoRow(Icons.Default.Home, "Address", student.address)

            if (!student.lastSchoolAttended.isNullOrBlank()) {
                InfoRow(Icons.Default.School, "Prev. School", student.lastSchoolAttended)
            }

            Spacer(Modifier.height(20.dp))

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                OutlinedButton(
                    onClick = onDisapprove,
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(1.dp, Color(0xFFE74C3C)),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFFE74C3C))
                ) { Text("Reject") }

                Button(
                    onClick = onApprove,
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = accentColor)
                ) { Text("Approve") }
            }
        }
    }
}
@Composable
fun InfoRow(icon: androidx.compose.ui.graphics.vector.ImageVector, label: String, value: String) {
    Row(modifier = Modifier.padding(vertical = 2.dp), verticalAlignment = Alignment.Top) {
        Icon(icon, null, modifier = Modifier.size(14.dp).padding(top = 2.dp), tint = Color.Gray)
        Spacer(Modifier.width(8.dp))
        Text("$label: ", style = MaterialTheme.typography.bodySmall, fontWeight = FontWeight.Bold, color = Color.Gray)
        Text(value, style = MaterialTheme.typography.bodySmall, color = Color.DarkGray)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(
    student: Student,
    onSignUpComplete: (Student) -> Unit,
    onCancel: () -> Unit
) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    var isSubmitting by remember { mutableStateOf(false) }

    val context = LocalContext.current
    val auth = remember { Firebase.auth }

    val primaryBlue = Color(0xFF1976D2)
    val gradientBrush = Brush.verticalGradient(listOf(Color(0xFF42A5F5), Color(0xFF1E88E5)))

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(gradientBrush),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            shape = RoundedCornerShape(28.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(12.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(32.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Surface(
                    modifier = Modifier.size(72.dp),
                    shape = CircleShape,
                    color = primaryBlue.copy(alpha = 0.1f)
                ) {
                    Icon(
                        imageVector = Icons.Default.HowToReg,
                        contentDescription = null,
                        tint = primaryBlue,
                        modifier = Modifier.padding(16.dp)
                    )
                }

                Spacer(Modifier.height(20.dp))

                Text(
                    text = "Account Setup",
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Gumawa ng account para makapagsimula",
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )

                Spacer(Modifier.height(32.dp))

                OutlinedTextField(
                    value = username,
                    onValueChange = { username = it },
                    label = { Text("Username") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    leadingIcon = { Icon(Icons.Default.Person, null) },
                    singleLine = true
                )

                Spacer(Modifier.height(16.dp))

                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Password") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    leadingIcon = { Icon(Icons.Default.Lock, null) },
                    visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    trailingIcon = {
                        IconButton(onClick = { passwordVisible = !passwordVisible }) {
                            val icon = if (passwordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff
                            Icon(icon, null)
                        }
                    },
                    singleLine = true
                )

                Spacer(Modifier.height(16.dp))

                OutlinedTextField(
                    value = confirmPassword,
                    onValueChange = { confirmPassword = it },
                    label = { Text("Confirm Password") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    visualTransformation = PasswordVisualTransformation(),
                    singleLine = true
                )

                Spacer(Modifier.height(32.dp))

                Button(
                    onClick = {
                        if (password != confirmPassword) {
                            Toast.makeText(context, "Passwords do not match!", Toast.LENGTH_SHORT).show()
                            return@Button
                        }

                        if (username.isBlank() || password.isBlank()) {
                            Toast.makeText(context, "Please fill in all fields", Toast.LENGTH_SHORT).show()
                            return@Button
                        }

                        isSubmitting = true

                        // 1. Create Firebase Auth Account
                        auth.createUserWithEmailAndPassword(
                            "${username}@als.edu",
                            password
                        )
                            .addOnSuccessListener { authResult ->
                                val firebaseUid = authResult.user?.uid ?: ""

                                // 2. Prepare the updated student object
                                val updatedStudent = student.copy(
                                    username = username,
                                    password = password,
                                    uid = firebaseUid,
                                    status = "active",
                                    accountCreated = true
                                )

                                // 3. Update the existing document in Firestore
                                // Using student.id ensures we don't create a duplicate!
                                FirebaseFirestore.getInstance()
                                    .collection("students")
                                    .document(student.id)
                                    .set(updatedStudent)
                                    .addOnSuccessListener {
                                        onSignUpComplete(updatedStudent)
                                    }
                                    .addOnFailureListener { e ->
                                        isSubmitting = false
                                        Log.e("SignUp", "Firestore Error", e)
                                        Toast.makeText(context, "Database error: ${e.message}", Toast.LENGTH_LONG).show()
                                    }
                            }
                            .addOnFailureListener { e ->
                                isSubmitting = false
                                Log.e("SignUp", "Auth Error", e)
                                Toast.makeText(context, "Registration error: ${e.message}", Toast.LENGTH_LONG).show()
                            }
                    },
                    modifier = Modifier.fillMaxWidth().height(56.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = primaryBlue),
                    enabled = !isSubmitting
                ) {
                    if (isSubmitting) {
                        CircularProgressIndicator(color = Color.White, modifier = Modifier.size(24.dp))
                    } else {
                        Text("FINISH (TAPUSIN)", fontWeight = FontWeight.Bold)
                    }
                }

                TextButton(onClick = onCancel, enabled = !isSubmitting) {
                    Text("Cancel", color = Color.Gray)
                }
            }
        }
    }
}



/* ---------------- DASHBOARD HEADER ---------------- */
@Composable
fun DashboardHeader(
    name: String,
    gradientColors: List<Color>,
    userType: String,
    avatarUri: Uri? = null, // This should be the URL fetched from Firestore
    studentNumber: String = "",
    onAvatarSelected: (Uri) -> Unit = {}
) {
    var showChangeAvatarDialog by remember { mutableStateOf(false) }
    var avatarLoaded by remember { mutableStateOf(false) }
    val context = LocalContext.current

    // Detect correct permission for Android version
    val storagePermission = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        Manifest.permission.READ_MEDIA_IMAGES
    } else {
        Manifest.permission.READ_EXTERNAL_STORAGE
    }

    val permissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { granted ->
        if (!granted) {
            Toast.makeText(context, "Permission denied.", Toast.LENGTH_SHORT).show()
        }
    }

    val avatarLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        uri?.let {
            avatarLoaded = false
            onAvatarSelected(it) // This sends the URI to the parent to upload to Firebase
        }
    }

    val avatarAlpha by animateFloatAsState(targetValue = if (avatarLoaded) 1f else 0f)

    fun pickAvatar() {
        permissionLauncher.launch(storagePermission)
        avatarLauncher.launch("image/*")
    }

    // --- PREMIUM CURVED HEADER CONTAINER ---
    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 40.dp),
        shadowElevation = 10.dp
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Brush.verticalGradient(gradientColors))
                .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp),
            contentAlignment = Alignment.Center
        ) {
            // Role Badge (Top Right)
            Surface(
                color = Color.White.copy(alpha = 0.2f),
                shape = RoundedCornerShape(12.dp),
                border = BorderStroke(1.dp, Color.White.copy(alpha = 0.3f)),
                modifier = Modifier.align(Alignment.TopEnd)
            ) {
                Text(
                    text = userType.uppercase(),
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
                    style = MaterialTheme.typography.labelSmall.copy(
                        color = Color.White,
                        fontWeight = FontWeight.Black,
                        letterSpacing = 1.sp
                    )
                )
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                // Avatar Section
                Box(
                    modifier = Modifier.size(110.dp),
                    contentAlignment = Alignment.BottomEnd
                ) {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        shape = CircleShape,
                        color = Color.White.copy(alpha = 0.3f),
                        border = BorderStroke(3.dp, Color.White),
                        shadowElevation = 8.dp
                    ) {
                        if (avatarUri != null) {
                            Image(
                                painter = rememberAsyncImagePainter(
                                    model = avatarUri,
                                    onState = { if (it is AsyncImagePainter.State.Success) avatarLoaded = true }
                                ),
                                contentDescription = "Avatar",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clickable { showChangeAvatarDialog = true }
                                    .alpha(avatarAlpha),
                                contentScale = ContentScale.Crop
                            )
                        } else {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clickable { showChangeAvatarDialog = true },
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = name.firstOrNull()?.toString() ?: "?",
                                    color = Color.White,
                                    fontSize = 42.sp,
                                    fontWeight = FontWeight.ExtraBold
                                )
                            }
                        }
                    }

                    // Camera Icon Button
                    Surface(
                        modifier = Modifier
                            .size(34.dp)
                            .offset(x = 2.dp, y = 2.dp)
                            .clickable { showChangeAvatarDialog = true },
                        shape = CircleShape,
                        color = Color.White,
                        shadowElevation = 4.dp
                    ) {
                        Icon(
                            imageVector = Icons.Default.CameraAlt,
                            contentDescription = "Edit",
                            modifier = Modifier.padding(7.dp),
                            tint = gradientColors.first() // Matches the header color
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = name,
                    style = MaterialTheme.typography.headlineSmall.copy(
                        fontWeight = FontWeight.Black,
                        color = Color.White
                    )
                )

                if (studentNumber.isNotBlank()) {
                    Surface(
                        color = Color.White.copy(alpha = 0.2f),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.padding(top = 4.dp)
                    ) {
                        Text(
                            text = studentNumber,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp),
                            style = MaterialTheme.typography.bodySmall.copy(
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        )
                    }
                }
            }
        }
    }

    if (showChangeAvatarDialog) {
        AlertDialog(
            onDismissRequest = { showChangeAvatarDialog = false },
            title = { Text("Update Profile Picture", fontWeight = FontWeight.Bold) },
            text = { Text("Would you like to select a new photo for your profile?") },
            confirmButton = {
                Button(
                    onClick = {
                        pickAvatar()
                        showChangeAvatarDialog = false
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = gradientColors.first()),
                    shape = RoundedCornerShape(12.dp)
                ) { Text("Choose Photo") }
            },
            dismissButton = {
                TextButton(onClick = { showChangeAvatarDialog = false }) { Text("Cancel") }
            },
            shape = RoundedCornerShape(28.dp),
            containerColor = Color.White
        )
    }
}


@Composable
fun StudentDashboard(
    name: String,
    studentNumber: String,
    studentUsername: String,
    modules: List<Module>,
    activities: List<ActivityItem>,
    quizzes: List<Quiz>,
    summatives: List<SummativeAssessment>,
    announcements: List<Announcement>,
    onNavigate: (String) -> Unit
) {
    val storage = FirebaseStorage.getInstance().reference
    val db = FirebaseFirestore.getInstance()

    val studentUid = remember { Firebase.auth.currentUser?.uid ?: "" }

    var studentAvatarUri by remember { mutableStateOf<Uri?>(null) }
    val unreadMessageCount = remember { mutableStateOf(0) }
    val unreadAnnouncementCount = remember { mutableStateOf(0) }

    LaunchedEffect(studentUsername) {
        db.collection("students")
            .whereEqualTo("username", studentUsername)
            .get()
            .addOnSuccessListener { snapshot ->
                if (!snapshot.isEmpty) {
                    val url = snapshot.documents[0].getString("avatarUrl")
                    if (!url.isNullOrBlank()) {
                        studentAvatarUri = Uri.parse(url)
                    }
                }
            }
    }

    // ✅ ADDED: Unread announcements count
    LaunchedEffect(announcements) {
        if (announcements.isEmpty()) return@LaunchedEffect

        var unread = 0
        var checked = 0

        announcements.forEach { ann ->
            db.collection("announcements")
                .document(ann.id)
                .collection("readBy")
                .document(studentUsername)
                .get()
                .addOnSuccessListener { snap ->
                    val isRead = snap.getBoolean("isRead") ?: false
                    if (!isRead) unread++
                    checked++
                    if (checked == announcements.size) {
                        unreadAnnouncementCount.value = unread
                    }
                }
        }
    }

    // ✅ Real-time unread message listener
    DisposableEffect(studentUsername) {
        val messageListeners = mutableListOf<ListenerRegistration>()
        val unreadPerChat = mutableMapOf<String, Boolean>()

        fun updateTotal() {
            unreadMessageCount.value = unreadPerChat.values.count { it }
        }

        db.collection("students")
            .whereEqualTo("status", "active")
            .get()
            .addOnSuccessListener { snapshot ->
                val otherUsernames = snapshot.documents
                    .mapNotNull { it.getString("username") }
                    .filter { it != studentUsername && it.isNotBlank() }
                    .plus("admin")

                otherUsernames.forEach { other ->
                    val chatDocId = listOf(studentUsername, other)
                        .sorted()
                        .joinToString("_")

                    db.collection("readChats")
                        .document(studentUsername)
                        .collection("chats")
                        .document(other)
                        .get()
                        .addOnSuccessListener { readDoc ->
                            val lastReadAt = readDoc.getLong("lastReadAt") ?: 0L

                            val listener = db.collection("chats")
                                .document(chatDocId)
                                .collection("messages")
                                .orderBy("timestamp", Query.Direction.DESCENDING)
                                .limit(1)
                                .addSnapshotListener { msgSnapshot, _ ->
                                    val lastMsg = msgSnapshot?.documents?.firstOrNull()
                                    val sender = lastMsg?.getString("sender") ?: ""
                                    val msgTime = (lastMsg?.get("timestamp") as? com.google.firebase.Timestamp)?.seconds ?: 0L
                                    unreadPerChat[other] = sender != studentUsername && msgTime > lastReadAt
                                    updateTotal()
                                }

                            messageListeners.add(listener)
                        }
                }
            }

        onDispose {
            messageListeners.forEach { it.remove() }
        }
    }

    // ✅ Badge counts based on actual completion status
    val pendingQuizzes = quizzes.count { !it.submittedAnswersPerStudent.containsKey(studentUid) }
    val pendingActivities = activities.count { !it.submittedByStudentIds.contains(studentUid) }
    val pendingSummatives = summatives.count { !it.submittedAnswersPerStudent.containsKey(studentUid) }

    val menuItems = listOf(
        StudentMenuItem("Modules", "manage_modules", Icons.Default.MenuBook, Color(0xFFFFC107), modules.size),
        StudentMenuItem("Quizzes", "quizzes", Icons.Default.Quiz, Color(0xFF2196F3), pendingQuizzes),
        StudentMenuItem("Activities", "student_activities", Icons.Default.Extension, Color(0xFF009688), pendingActivities),
        StudentMenuItem("Announcements", "announcements", Icons.Default.Campaign, Color(0xFFFF9800), unreadAnnouncementCount.value), // ✅ UPDATED
        StudentMenuItem("Assessment", "student_summative", Icons.Default.AssignmentTurnedIn, Color(0xFFE91E63), pendingSummatives),
        StudentMenuItem("Progress", "progress", Icons.Default.BarChart, Color(0xFF4CAF50)),
        StudentMenuItem("Messages", "messengerList", Icons.Default.Forum, Color(0xFF673AB7), unreadMessageCount.value),
        StudentMenuItem("Settings", "settings", Icons.Default.Settings, Color(0xFF607D8B))
    )

    Column(modifier = Modifier.fillMaxSize().background(Color(0xFFF8F9FA))) {

        DashboardHeader(
            name = name,
            gradientColors = listOf(Color(0xFF80DEEA), Color(0xFF4DD0E1)),
            userType = "Student",
            avatarUri = studentAvatarUri,
            studentNumber = studentNumber,
            onAvatarSelected = { uri ->
                studentAvatarUri = uri
                val avatarRef = storage.child("avatars/students/$studentUsername.jpg")
                avatarRef.putFile(uri).addOnSuccessListener {
                    avatarRef.downloadUrl.addOnSuccessListener { downloadUri ->
                        db.collection("students")
                            .whereEqualTo("username", studentUsername)
                            .get()
                            .addOnSuccessListener { snapshot ->
                                if (!snapshot.isEmpty) {
                                    db.collection("students")
                                        .document(snapshot.documents[0].id)
                                        .update("avatarUrl", downloadUri.toString())
                                }
                            }
                    }
                }
            }
        )

        Column(modifier = Modifier.padding(horizontal = 24.dp).offset(y = (-20).dp)) {
            ProgressSection(moduleCount = modules.size, quizCount = quizzes.size)
        }

        Text(
            text = "LEARNING PATHWAY",
            modifier = Modifier.padding(start = 28.dp, bottom = 12.dp),
            style = MaterialTheme.typography.labelMedium.copy(
                letterSpacing = 1.2.sp,
                color = Color.Gray.copy(alpha = 0.8f),
                fontWeight = FontWeight.ExtraBold
            )
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(items = menuItems) { item ->
                StudentGridCard(item) { onNavigate(item.route) }
            }
        }
    }
}


@Composable
fun ProgressSection(moduleCount: Int, quizCount: Int) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Row(
            modifier = Modifier.padding(24.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(contentAlignment = Alignment.Center) {
                CircularProgressIndicator(
                    progress = { 0.75f },
                    modifier = Modifier.size(54.dp),
                    color = Color(0xFF00BCD4),
                    strokeWidth = 6.dp,
                    strokeCap = StrokeCap.Round,
                    trackColor = Color(0xFFE0F7FA)
                )
                Text("75%", fontSize = 11.sp, fontWeight = FontWeight.Bold, color = Color(0xFF00838F))
            }

            Spacer(Modifier.width(20.dp))

            Column {
                Text(
                    "Keep it up, Learner!",
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.ExtraBold)
                )
                Text(
                    "You have $moduleCount modules & $quizCount quizzes active",
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            }
        }
    }
}

@Composable
fun StudentGridCard(item: StudentMenuItem, onClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val scale by animateFloatAsState(if (isPressed) 0.95f else 1f, label = "scale")

    Box(modifier = Modifier.fillMaxWidth()) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(145.dp)
                .graphicsLayer(scaleX = scale, scaleY = scale)
                .clickable(
                    interactionSource = interactionSource,
                    indication = ripple(color = item.color.copy(alpha = 0.1f)),
                    onClick = onClick
                ),
            shape = RoundedCornerShape(32.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize().padding(20.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.Start
            ) {
                Surface(
                    modifier = Modifier.size(48.dp),
                    shape = RoundedCornerShape(16.dp),
                    color = item.color.copy(alpha = 0.12f)
                ) {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        tint = item.color,
                        modifier = Modifier.padding(12.dp)
                    )
                }

                Column {
                    Text(
                        item.title,
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Black,
                            color = Color(0xFF263238),
                            letterSpacing = (-0.5).sp
                        )
                    )
                    Text(
                        if (item.badgeCount > 0) "${item.badgeCount} Pending" else "Up to date",
                        style = MaterialTheme.typography.labelSmall,
                        color = if (item.badgeCount > 0) item.color else Color.LightGray,
                        fontWeight = if (item.badgeCount > 0) FontWeight.Bold else FontWeight.Normal
                    )
                }
            }
        }

        if (item.badgeCount > 0) {
            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(14.dp)
                    .size(24.dp)
                    .background(item.color, CircleShape)
                    .border(3.dp, Color.White, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = if (item.badgeCount > 9) "9+" else item.badgeCount.toString(),
                    color = Color.White,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StudentQuizzesScreen(
    quizzes: List<Quiz>,
    onBack: () -> Unit,
    onQuizSelected: (String, Quiz) -> Unit // ✅ FIXED: Pass both ID and Quiz object
) {
    val currentStudentId = FirebaseAuth.getInstance().currentUser?.uid
    val headerStartColor = Color(0xFF2196F3)
    val headerEndColor = Color(0xFF1565C0)

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
        Column(modifier = Modifier.fillMaxSize()) {
            // --- HEADER ---
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = headerStartColor,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onBack,
                            modifier = Modifier.size(40.dp).background(Color.White.copy(0.2f), CircleShape)
                        ) {
                            Icon(Icons.Default.ArrowBack, "Back", tint = Color.White, modifier = Modifier.size(20.dp))
                        }
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text("Evaluation", style = MaterialTheme.typography.labelLarge, color = Color.White.copy(0.8f))
                            Text("QUIZZES", style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.ExtraBold), color = Color.White)
                        }
                        Spacer(Modifier.weight(1f))
                        Surface(modifier = Modifier.size(52.dp), shape = CircleShape, color = Color.White.copy(0.25f)) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(Icons.Default.Quiz, null, tint = Color.White, modifier = Modifier.size(28.dp))
                            }
                        }
                    }
                }
            }

            if (quizzes.isEmpty()) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text("No quizzes assigned yet.", color = Color.Gray)
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp, 24.dp, 16.dp, 24.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    items(quizzes.size) { index ->
                        val quiz = quizzes[index]
                        val isSubmitted = currentStudentId != null && quiz.submittedAnswersPerStudent.containsKey(currentStudentId)

                        Card(
                            modifier = Modifier.fillMaxWidth().clickable {
                                // ✅ FIXED: Pass quiz.id (assuming Quiz has an id field)
                                onQuizSelected(quiz.id ?: index.toString(), quiz)
                            },
                            shape = RoundedCornerShape(20.dp),
                            elevation = CardDefaults.cardElevation(if (isSubmitted) 0.dp else 2.dp),
                            colors = CardDefaults.cardColors(containerColor = if (isSubmitted) Color(0xFFE0E0E0).copy(0.5f) else Color.White)
                        ) {
                            Column(modifier = Modifier.padding(20.dp)) {
                                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                                    Column(Modifier.weight(1f)) {
                                        Text("QUIZ ${index + 1}", color = if (isSubmitted) Color.Gray else headerStartColor, fontWeight = FontWeight.Bold)
                                        Text(quiz.title, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
                                    }
                                    if (isSubmitted) Icon(Icons.Default.CheckCircle, null, tint = Color(0xFF4CAF50))
                                }

                                Spacer(Modifier.height(16.dp))

                                Button(
                                    onClick = { onQuizSelected(quiz.id ?: index.toString(), quiz) },
                                    modifier = Modifier.fillMaxWidth(),
                                    shape = RoundedCornerShape(12.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = if (isSubmitted) Color.Gray.copy(0.2f) else headerStartColor,
                                        contentColor = if (isSubmitted) Color.Gray else Color.White
                                    )
                                ) {
                                    Icon(if (isSubmitted) Icons.Default.Visibility else Icons.Default.PlayArrow, null, Modifier.size(18.dp))
                                    Spacer(Modifier.width(8.dp))
                                    Text(if (isSubmitted) "View Submission" else "Start Quiz", fontWeight = FontWeight.Bold)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizDetailScreen(
    quizId: String,
    quiz: Quiz,
    onBack: () -> Unit,
    onSubmissionComplete: () -> Unit = {} // ✅ ADDED: Callback for when submission is done
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val currentStudentId = remember { FirebaseAuth.getInstance().currentUser?.uid ?: "" }

    val answers = remember { mutableStateMapOf<Int, String>() }
    var isSubmitted by remember { mutableStateOf(false) }
    var showReviewDialog by remember { mutableStateOf(false) }
    var timeLeft by remember { mutableStateOf(quiz.durationMinutes * 60) }
    var flashRed by remember { mutableStateOf(false) }

    val headerStartColor = Color(0xFF2196F3)
    val headerEndColor = Color(0xFF1565C0)

    // Load initial state
    LaunchedEffect(quiz, currentStudentId) {
        if (currentStudentId.isNotEmpty()) {
            val previousSubmission = quiz.submittedAnswersPerStudent[currentStudentId]
            if (previousSubmission != null) {
                previousSubmission.forEachIndexed { index, ans ->
                    if (ans != null) answers[index] = ans
                }
                isSubmitted = true
            }
        }
    }

    // Timer Logic
    LaunchedEffect(isSubmitted) {
        if (!isSubmitted && timeLeft > 0) {
            while (timeLeft > 0) {
                kotlinx.coroutines.delay(1000L)
                timeLeft--
                if (timeLeft <= 30) flashRed = !flashRed
            }
            if (timeLeft <= 0 && !isSubmitted) {
                submitQuizHelper(scope, quizId, currentStudentId, quiz.questions.size, answers, context) {
                    isSubmitted = true
                    onSubmissionComplete() // ✅ ADDED: Notify parent
                }
            }
        }
    }

    val timerText = String.format("%02d:%02d", timeLeft / 60, timeLeft % 60)

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
        Column(modifier = Modifier.fillMaxSize()) {
            // --- HEADER ---
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = headerStartColor,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                        .padding(top = 48.dp, bottom = 24.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = onBack, modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)) {
                            Icon(Icons.Default.ArrowBack, "Back", tint = Color.White)
                        }
                        Column(modifier = Modifier.padding(start = 16.dp).weight(1f)) {
                            Text(quiz.title.uppercase(), style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.ExtraBold, color = Color.White)
                            Text(if (isSubmitted) "REVIEW MODE" else "QUIZ IN PROGRESS", style = MaterialTheme.typography.labelSmall, color = Color.White.copy(0.7f))
                        }
                        if (!isSubmitted) {
                            Surface(color = if (timeLeft <= 30 && flashRed) Color.Red else Color.White.copy(0.15f), shape = RoundedCornerShape(12.dp)) {
                                Text(timerText, modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp), color = Color.White, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                }
            }

            // --- QUESTIONS ---
            LazyColumn(
                modifier = Modifier.weight(1f),
                contentPadding = PaddingValues(16.dp, 20.dp, 16.dp, 100.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(quiz.questions.size) { index ->
                    val question = quiz.questions[index]
                    val studentAnswer = answers[index] ?: ""

                    Card(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(20.dp), colors = CardDefaults.cardColors(containerColor = Color.White)) {
                        Column(Modifier.padding(20.dp)) {
                            Text("${index + 1}. ${question.questionText}", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                            Spacer(Modifier.height(16.dp))

                            if (!isSubmitted) {
                                when (question.type) {
                                    QuestionType.MULTIPLE_CHOICE, QuestionType.TRUE_FALSE -> {
                                        val options = if (question.type == QuestionType.TRUE_FALSE) listOf("True", "False") else question.options
                                        options.forEach { option ->
                                            val selected = studentAnswer == option
                                            Row(
                                                Modifier.fillMaxWidth().clickable { answers[index] = option }.padding(vertical = 4.dp),
                                                verticalAlignment = Alignment.CenterVertically
                                            ) {
                                                RadioButton(selected = selected, onClick = { answers[index] = option })
                                                Text(option)
                                            }
                                        }
                                    }
                                    else -> {
                                        OutlinedTextField(
                                            value = studentAnswer,
                                            onValueChange = { answers[index] = it },
                                            modifier = Modifier.fillMaxWidth(),
                                            placeholder = { Text("Answer...") }
                                        )
                                    }
                                }
                            } else {
                                Text("Your Answer: ${if(studentAnswer.isEmpty()) "(No Answer)" else studentAnswer}", color = headerEndColor, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                }
            }
        }

        if (!isSubmitted) {
            Button(
                onClick = { showReviewDialog = true },
                modifier = Modifier.align(Alignment.BottomCenter).fillMaxWidth().padding(20.dp).height(56.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = headerStartColor)
            ) {
                Text("Submit Quiz", fontWeight = FontWeight.Bold)
            }
        }
    }

    if (showReviewDialog) {
        AlertDialog(
            onDismissRequest = { showReviewDialog = false },
            title = { Text("Confirm Submission") },
            text = { Text("Do you want to submit your answers now?") },
            confirmButton = {
                TextButton(onClick = {
                    showReviewDialog = false
                    submitQuizHelper(scope, quizId, currentStudentId, quiz.questions.size, answers, context) {
                        isSubmitted = true
                        onSubmissionComplete() // ✅ ADDED: Notify parent
                    }
                }) { Text("Submit") }
            },
            dismissButton = { TextButton(onClick = { showReviewDialog = false }) { Text("Cancel") } }
        )
    }
}

private fun submitQuizHelper(
    scope: CoroutineScope,
    quizId: String,
    studentId: String,
    questionCount: Int,
    answers: Map<Int, String>,
    context: android.content.Context,
    onSuccess: () -> Unit
) {
    if (studentId.isEmpty()) {
        Toast.makeText(context, "User ID not found!", Toast.LENGTH_SHORT).show()
        return
    }

    val answerList = List(questionCount) { index -> answers[index] ?: "" }

    scope.launch(Dispatchers.IO) {
        try {
            val db = com.google.firebase.ktx.Firebase.firestore
            val quizRef = db.collection("quizzes").document(quizId)

            quizRef.update(
                "submittedAnswersPerStudent.$studentId", answerList,
                "submittedByStudentIds", com.google.firebase.firestore.FieldValue.arrayUnion(studentId)
            ).await()

            val submissionData = hashMapOf(
                "answers" to answerList,
                "submittedAt" to com.google.firebase.firestore.FieldValue.serverTimestamp()
            )
            quizRef.collection("submissions").document(studentId).set(submissionData).await()

            withContext(Dispatchers.Main) {
                Toast.makeText(context, "Quiz Submitted!", Toast.LENGTH_SHORT).show()
                onSuccess()
            }
        } catch (e: Exception) {
            withContext(Dispatchers.Main) {
                android.util.Log.e("QUIZ_ERROR", "Submit failed", e)
                Toast.makeText(context, "Error: ${e.message}", Toast.LENGTH_LONG).show()
            }
        }
    }
}


/* ---------------- ADMIN DASHBOARD (original UI preserved) ---------------- */
@Composable
fun AdminDashboard(
    name: String,
    adminUsername: String,
    onLogout: () -> Unit,
    onNavigate: (String) -> Unit
) {
    val storage = FirebaseStorage.getInstance().reference
    val db = FirebaseFirestore.getInstance()
    var adminAvatarUri by remember { mutableStateOf<Uri?>(null) }

    var activeStudentCount by remember { mutableStateOf("...") }
    var pendingEnrollmentCount by remember { mutableStateOf("...") }

    // ✅ Load Avatar
    LaunchedEffect(adminUsername) {
        db.collection("admins")
            .whereEqualTo("username", adminUsername)
            .get()
            .addOnSuccessListener { snapshot ->
                if (!snapshot.isEmpty) {
                    val url = snapshot.documents[0].getString("avatarUrl")
                    if (!url.isNullOrBlank()) {
                        adminAvatarUri = Uri.parse(url)
                    }
                }
            }
    }

    // ✅ Real-time Firestore Listeners
    LaunchedEffect(Unit) {
        db.collection("students").addSnapshotListener { snapshot, _ ->
            activeStudentCount = snapshot?.size()?.toString() ?: "0"
        }

        db.collection("students")
            .whereEqualTo("status", "pending")
            .addSnapshotListener { snapshot, _ ->
                pendingEnrollmentCount = snapshot?.size()?.toString() ?: "0"
            }
    }

    val menuItems = listOf(
        AdminMenuItem("Students", "students", Icons.Default.People, Color(0xFF2E7D32)),
        AdminMenuItem("Modules", "manage_modules", Icons.Default.MenuBook, Color(0xFFFBC02D)),
        AdminMenuItem("Quizzes", "manage_quizzes", Icons.Default.Quiz, Color(0xFF1976D2)),
        AdminMenuItem("Activities", "admin_activities", Icons.Default.Architecture, Color(0xFF00796B)),
        AdminMenuItem("Assessment", "admin_summative", Icons.Default.Assignment, Color(0xFFC2185B)),
        AdminMenuItem("Enrollments", "admin_enrollments", Icons.Default.PersonAdd, Color(0xFF689F38)),
        AdminMenuItem("Announcements", "announcements", Icons.Default.Campaign, Color(0xFFE65100)),
        AdminMenuItem("Reports", "admin_reports", Icons.Default.Assessment, Color(0xFF303F9F)),
        AdminMenuItem("Messages", "messengerList", Icons.Default.Email, Color(0xFF7B1FA2)),
        AdminMenuItem("Submissions", "student_submitted_items", Icons.Default.CloudUpload, Color(0xFF0097A7)),
        AdminMenuItem("Settings", "settings", Icons.Default.Settings, Color(0xFF455A64))
    )

    Column(modifier = Modifier.fillMaxSize().background(Color(0xFFF8F9F8))) {

        DashboardHeader(
            name = name,
            gradientColors = listOf(Color(0xFF2D6A4F), Color(0xFF40916C)),
            userType = "Administrator",
            avatarUri = adminAvatarUri,
            onAvatarSelected = { uri ->
                adminAvatarUri = uri
                val avatarRef = storage.child("avatars/admins/$adminUsername.jpg")
                avatarRef.putFile(uri).addOnSuccessListener {
                    avatarRef.downloadUrl.addOnSuccessListener { downloadUri ->
                        db.collection("admins")
                            .whereEqualTo("username", adminUsername)
                            .get()
                            .addOnSuccessListener { snapshot ->
                                if (snapshot.documents.isNotEmpty()) {
                                    db.collection("admins")
                                        .document(snapshot.documents[0].id)
                                        .update("avatarUrl", downloadUri.toString())
                                }
                            }
                    }
                }
            }
        )

        // --- STATS BAR ---
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .offset(y = (-24).dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            QuickStatCard(
                label = "Active Students",
                value = activeStudentCount,
                icon = Icons.Default.Group,
                modifier = Modifier.weight(1f)
            )
            QuickStatCard(
                label = "Enrollment Requests",
                value = pendingEnrollmentCount,
                icon = Icons.Default.HourglassEmpty,
                modifier = Modifier.weight(1f)
            )
        }

        Text(
            "MANAGEMENT CONSOLE",
            modifier = Modifier.padding(start = 24.dp, bottom = 12.dp),
            style = MaterialTheme.typography.labelMedium.copy(
                letterSpacing = 1.8.sp,
                fontWeight = FontWeight.Black
            ),
            color = Color(0xFF52796F)
        )

        // --- GRID AREA ---
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(16.dp, 0.dp, 16.dp, 32.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(items = menuItems) { item ->
                // ✅ Check if this card needs a badge
                val badgeValue = if (item.route == "admin_enrollments") {
                    pendingEnrollmentCount.toIntOrNull() ?: 0
                } else {
                    0
                }

                AdminGridCard(
                    item = item,
                    badgeCount = badgeValue // Pass the count to the Card
                ) {
                    onNavigate(item.route)
                }
            }
        }
    }
}

// --- UI COMPONENTS ---

@Composable
fun AdminGridCard(
    item: AdminMenuItem,
    badgeCount: Int = 0, // Add this parameter to accept a count
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val scale by animateFloatAsState(
        targetValue = if (isPressed) 0.96f else 1f,
        label = "press_scale"
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(140.dp) // Slightly increased height for better balance with badges
            .graphicsLayer(scaleX = scale, scaleY = scale)
            .clickable(
                interactionSource = interactionSource,
                indication = ripple(color = item.color.copy(alpha = 0.2f)),
                onClick = onClick
            ),
        shape = RoundedCornerShape(28.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            // Background Decorative Element
            Surface(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .offset(x = 10.dp, y = (-10).dp)
                    .size(70.dp),
                shape = CircleShape,
                color = item.color.copy(alpha = 0.04f)
            ) {}

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // --- ICON BOX WITH BADGE ---
                Box(contentAlignment = Alignment.TopEnd) {
                    Surface(
                        modifier = Modifier.size(52.dp),
                        shape = RoundedCornerShape(16.dp),
                        color = item.color.copy(alpha = 0.12f)
                    ) {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                            tint = item.color,
                            modifier = Modifier.padding(12.dp)
                        )
                    }

                    // ✅ THE BADGE
                    if (badgeCount > 0) {
                        Surface(
                            modifier = Modifier
                                .size(22.dp)
                                .offset(x = 6.dp, y = (-6).dp), // Pop it out slightly
                            shape = CircleShape,
                            color = Color(0xFFD32F2F), // Use a soft red/alert color
                            border = BorderStroke(2.dp, Color.White) // White border makes it pop
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Text(
                                    text = if (badgeCount > 99) "99+" else badgeCount.toString(),
                                    style = MaterialTheme.typography.labelSmall.copy(
                                        color = Color.White,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 9.sp
                                    )
                                )
                            }
                        }
                    }
                }

                Spacer(Modifier.height(12.dp))

                Text(
                    item.title,
                    style = MaterialTheme.typography.labelLarge.copy(
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 0.3.sp,
                        color = Color(0xFF263238)
                    )
                )
            }
        }
    }
}

@Composable
fun QuickStatCard(label: String, value: String, icon: ImageVector, modifier: Modifier) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    value,
                    style = MaterialTheme.typography.headlineSmall.copy(
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Black
                    )
                )
                Icon(
                    icon,
                    null,
                    tint = Color(0xFF4CAF50),
                    modifier = Modifier.size(20.dp).alpha(0.7f)
                )
            }
            Text(
                label.uppercase(),
                style = MaterialTheme.typography.labelSmall.copy(
                    fontSize = 9.sp,
                    letterSpacing = 1.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold
                )
            )
        }
    }
}

data class AdminMenuItem(
    val title: String,
    val route: String,
    val icon: ImageVector,
    val color: Color
)



/* ---------------- DASHBOARD CARD (original press animation preserved) ---------------- */
    @Composable
    fun DashboardCard(title: String, iconRes: Int, color: Color, onClick: () -> Unit) {
        var pressed by remember { mutableStateOf(false) }
        val scale by animateFloatAsState(if (pressed) 0.95f else 1f)

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
                .graphicsLayer { scaleX = scale; scaleY = scale }
                .pointerInput(Unit) {
                    detectTapGestures(
                        onPress = {
                            pressed = true
                            val success = tryAwaitRelease() // built-in suspend function in Compose
                            pressed = false
                            if (success) onClick()
                        }
                    )
                },
            colors = CardDefaults.cardColors(containerColor = color.copy(alpha = 0.1f))
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = iconRes),
                    contentDescription = title,
                    tint = Color.Unspecified,
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                )
            }
        }
    }


/* ----------------- Modules Screen ----------------- */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModulesScreen(
    modules: SnapshotStateList<Module>,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    var showPreviewDialog by remember { mutableStateOf(false) }
    var selectedUri by remember { mutableStateOf<Uri?>(null) }

    var isDownloading by remember { mutableStateOf(false) }
    var showFinishedDialog by remember { mutableStateOf(false) }
    var currentDownloadName by remember { mutableStateOf("") }

    val db = FirebaseFirestore.getInstance()
    val headerStartColor = Color(0xFFFFB300)
    val headerEndColor = Color(0xFFFFC107)

    DisposableEffect(context) {
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                val id = intent?.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID, -1L)
                if (id != -1L) {
                    isDownloading = false
                    showFinishedDialog = true
                }
            }
        }
        val filter = IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE)
        ContextCompat.registerReceiver(context, receiver, filter, ContextCompat.RECEIVER_EXPORTED)
        onDispose { context.unregisterReceiver(receiver) }
    }

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
        Column(modifier = Modifier.fillMaxSize()) {

            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = headerStartColor,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onBack,
                            modifier = Modifier.size(40.dp).background(Color.White.copy(0.2f), CircleShape)
                        ) { Icon(Icons.Default.ArrowBack, "Back", tint = Color.White, modifier = Modifier.size(20.dp)) }

                        Spacer(Modifier.width(16.dp))

                        Column {
                            Text("Study Materials", style = MaterialTheme.typography.labelLarge, color = Color.White.copy(0.8f))
                            Text("LEARNING MODULES", style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.ExtraBold, letterSpacing = 0.5.sp), color = Color.White)
                        }

                        Spacer(Modifier.weight(1f))
                        Surface(
                            modifier = Modifier.size(52.dp),
                            shape = CircleShape,
                            color = Color.White.copy(alpha = 0.25f),
                            border = BorderStroke(1.dp, Color.White.copy(alpha = 0.4f))
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.MenuBook,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(28.dp)
                                )
                            }
                        }
                    }
                }
            }

            if (modules.isEmpty()) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator(color = headerStartColor)
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp, 24.dp, 16.dp, 24.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    items(items = modules.distinctBy { it.id }.sortedBy { it.moduleNumber }, key = { it.id }) { module ->
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(20.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White)
                        ) {
                            Column(modifier = Modifier.padding(20.dp)) {
                                Surface(color = headerStartColor.copy(0.1f), shape = RoundedCornerShape(8.dp)) {
                                    Text("MODULE ${module.moduleNumber}", modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp), style = MaterialTheme.typography.labelMedium, color = headerStartColor, fontWeight = FontWeight.ExtraBold)
                                }
                                Spacer(modifier = Modifier.height(12.dp))
                                Text(text = module.title, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
                                Text(text = module.description, style = MaterialTheme.typography.bodyMedium, color = Color.Gray)

                                if (!module.fileUri.isNullOrEmpty()) {
                                    HorizontalDivider(Modifier.padding(vertical = 16.dp), thickness = 0.5.dp, color = Color.LightGray.copy(0.5f))
                                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                                        Button(
                                            onClick = { selectedUri = Uri.parse(module.fileUri); showPreviewDialog = true },
                                            modifier = Modifier.weight(1f),
                                            shape = RoundedCornerShape(12.dp),
                                            colors = ButtonDefaults.buttonColors(containerColor = headerStartColor)
                                        ) {
                                            Icon(Icons.Default.Visibility, null, modifier = Modifier.size(18.dp))
                                            Spacer(Modifier.width(8.dp))
                                            Text("Open")
                                        }

                                        OutlinedButton(
                                            onClick = {
                                                val uriString = module.fileUri ?: ""

                                                // ✅ FIXED: decode URL first to handle %2F, %20 etc.
                                                val decodedUrl = try {
                                                    java.net.URLDecoder.decode(uriString, "UTF-8")
                                                } catch (e: Exception) { uriString }
                                                val pathBeforeQuery = decodedUrl.substringBefore("?")
                                                val extension = pathBeforeQuery.substringAfterLast(".", "pdf")

                                                val sanitizedTitle = module.title.replace(Regex("[^a-zA-Z0-9]"), "_")
                                                val safeName = "${sanitizedTitle}_M${module.moduleNumber}.$extension"
                                                currentDownloadName = safeName
                                                isDownloading = true
                                                downloadFile(context, uriString, safeName)
                                            },
                                            modifier = Modifier.weight(1f),
                                            shape = RoundedCornerShape(12.dp),
                                            border = BorderStroke(1.5.dp, headerStartColor.copy(0.5f))
                                        ) {
                                            Icon(Icons.Default.Download, null, modifier = Modifier.size(18.dp), tint = headerStartColor)
                                            Spacer(Modifier.width(8.dp))
                                            Text("Save", color = headerStartColor)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (showFinishedDialog) {
            AlertDialog(
                onDismissRequest = { showFinishedDialog = false },
                icon = { Icon(Icons.Default.CheckCircle, null, tint = Color(0xFF4CAF50), modifier = Modifier.size(48.dp)) },
                title = { Text("Download Complete", fontWeight = FontWeight.Bold) },
                text = { Text("The module '$currentDownloadName' has been saved successfully to your Downloads folder.") },
                confirmButton = {
                    Button(onClick = { showFinishedDialog = false }, colors = ButtonDefaults.buttonColors(containerColor = headerStartColor)) { Text("Done") }
                }
            )
        }

        if (isDownloading) {
            Dialog(onDismissRequest = { isDownloading = false }) {
                Surface(modifier = Modifier.width(300.dp), shape = RoundedCornerShape(28.dp), color = Color.White) {
                    Column(modifier = Modifier.padding(24.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                        CircularProgressIndicator(color = headerStartColor)
                        Spacer(Modifier.height(20.dp))
                        Text("Starting Download...", fontWeight = FontWeight.Bold)
                        Text(currentDownloadName, style = MaterialTheme.typography.bodySmall, color = Color.Gray, textAlign = TextAlign.Center)
                    }
                }
            }
        }
    }

    if (showPreviewDialog && selectedUri != null) {
        FilePreviewDialog(uri = selectedUri!!) {
            showPreviewDialog = false
            selectedUri = null
        }
    }
}

fun downloadFile(context: Context, url: String, fileName: String) {
    try {
        val downloadManager = context.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
        val request = DownloadManager.Request(Uri.parse(url))
            .setTitle(fileName)
            .setDescription("Downloading ALS Material")
            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName)

        val extension = fileName.substringAfterLast(".", "")
        val mimeType = MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension)
        if (mimeType != null) {
            request.setMimeType(mimeType)
        }

        downloadManager.enqueue(request)
    } catch (e: Exception) {
        Toast.makeText(context, "Download error: ${e.message}", Toast.LENGTH_LONG).show()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProgressScreen(
    modules: List<Module>,
    quizzes: List<Quiz>,
    activities: List<ActivityItem>,
    summatives: List<SummativeAssessment>,
    onBack: () -> Unit,
    onRetakeSummative: ((SummativeAssessment) -> Unit)? = null
) {
    val currentStudentId = FirebaseAuth.getInstance().currentUser?.uid

    // Theme Colors
    val baseGold = Color(0xFFF2994A) // Golden Orange
    val lightGold = Color(0xFFF2C94C) // Sun Yellow

    var showBadge by remember { mutableStateOf(false) }
    var badgeMessage by remember { mutableStateOf("") }
    val trophyAnim = remember { Animatable(0f) }
    val textAnim = remember { Animatable(0f) }

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFFDFCFB))) {
        Column(modifier = Modifier.fillMaxSize()) {

            // --- PREMIUM ROUNDED HEADER (Standardized) ---
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = baseGold,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(baseGold, lightGold)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onBack,
                            modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)
                        ) {
                            Icon(Icons.Default.ArrowBack, "Back", tint = Color.White)
                        }
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text("Your Achievement", style = MaterialTheme.typography.labelLarge, color = Color.White.copy(0.8f))
                            Text(
                                "MY PROGRESS",
                                style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.ExtraBold, letterSpacing = 1.sp),
                                color = Color.White
                            )
                        }

                        // ✅ ADDED: CONSISTENT PREMIUM GLASS LOGO CONTAINER
                        Spacer(Modifier.weight(1f))
                        Surface(
                            modifier = Modifier.size(52.dp),
                            shape = CircleShape,
                            color = Color.White.copy(alpha = 0.25f),
                            border = BorderStroke(1.dp, Color.White.copy(alpha = 0.4f))
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.MilitaryTech, // Award/Achievement Icon
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(30.dp)
                                )
                            }
                        }
                    }
                }
            }

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp, 24.dp, 16.dp, 40.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                // --- SECTIONS (Logic Untouched) ---
                item { SectionHeader("Lessons & Modules", Icons.Default.MenuBook) }
                items(modules.size) { index ->
                    val module = modules[index]
                    val progress = if (module.totalLessons > 0) module.completedLessons.toFloat() / module.totalLessons else 0f
                    val status = if (module.completedLessons >= module.totalLessons && module.totalLessons > 0) "Accomplished" else "Ongoing"

                    ProgressCard(
                        title = module.title,
                        status = status,
                        progress = progress,
                        details = "${module.completedLessons} / ${module.totalLessons} lessons",
                        accentColor = Color(0xFFFFB300)
                    ) {
                        if (status == "Accomplished") { badgeMessage = "Mastered ${module.title}!"; showBadge = true }
                    }
                }

                // --- QUIZZES SECTION (Logic Untouched) ---
                item { SectionHeader("Assessments & Quizzes", Icons.Default.Quiz) }
                items(quizzes.size) { index ->
                    val quiz = quizzes[index]
                    val studentAnswers = currentStudentId?.let { quiz.submittedAnswersPerStudent[it] }
                    val isSubmitted = studentAnswers != null
                    val totalPoints = quiz.questions.sumOf { it.points ?: 0 }
                    val earnedPoints = if (isSubmitted && studentAnswers != null) {
                        quiz.questions.mapIndexed { qIndex, q ->
                            val studentAns = studentAnswers.getOrNull(qIndex)
                            val corrects = listOfNotNull(q.correctAnswer?.trim()) + (q.possibleAnswers?.map { it.trim() } ?: emptyList())
                            if (studentAns?.trim() in corrects) q.points ?: 0 else 0
                        }.sum()
                    } else 0

                    val progress = if (totalPoints > 0) earnedPoints.toFloat() / totalPoints else 0f
                    val status = if (!isSubmitted) "Ongoing" else if (progress >= 0.5f) "Accomplished" else "Failed"

                    ProgressCard(quiz.title, status, progress, "Score: $earnedPoints / $totalPoints", Color(0xFF2196F3)) {
                        if (status == "Accomplished") { badgeMessage = "Aced the ${quiz.title}!"; showBadge = true }
                    }
                }

                // --- ACTIVITIES SECTION (Logic Untouched) ---
                if (activities.isNotEmpty()) {
                    item { SectionHeader("Practical Activities", Icons.Default.Architecture) }
                    items(activities.size) { index ->
                        val activity = activities[index]
                        val isSubmitted = currentStudentId?.let { activity.submittedByStudentIds.contains(it) } ?: false
                        val status = if (isSubmitted) "Accomplished" else "Ongoing"

                        ProgressCard(activity.title, status, if (isSubmitted) 1f else 0f, "Total Points: ${activity.points}", Color(0xFF4CAF50)) {
                            if (status == "Accomplished") { badgeMessage = "Completed ${activity.title}!"; showBadge = true }
                        }
                    }
                }

                // --- SUMMATIVES SECTION (Logic Untouched) ---
                if (summatives.isNotEmpty()) {
                    item { SectionHeader("Final Examinations", Icons.Default.Gavel) }
                    items(summatives.size) { index ->
                        val summative = summatives[index]
                        val studentSummAnswers = currentStudentId?.let { summative.submittedAnswersPerStudent[it] }
                        val isSummSubmitted = studentSummAnswers != null
                        val totalPoints = summative.questions.sumOf { it.points ?: 0 }
                        val earnedPoints = if (isSummSubmitted && studentSummAnswers != null) {
                            summative.questions.mapIndexed { qIndex, q ->
                                val studentAns = studentSummAnswers.getOrNull(qIndex)
                                val corrects = listOfNotNull(q.correctAnswer?.trim()) + (q.possibleAnswers?.map { it.trim() } ?: emptyList())
                                if (studentAns?.trim() in corrects) q.points ?: 0 else 0
                            }.sum()
                        } else 0

                        val progress = if (totalPoints > 0) earnedPoints.toFloat() / totalPoints else 0f
                        val status = if (!isSummSubmitted) "Ongoing" else if (progress >= 0.6f) "Accomplished" else "Retake"
                        val retakesLeft = summative.maxRetakes - summative.retakeCount

                        ProgressCard(
                            summative.title, status, progress, "Result: $earnedPoints / $totalPoints", Color(0xFFFF5722),
                            showRetakeButton = status == "Retake" && onRetakeSummative != null,
                            retakesLeft = retakesLeft
                        ) {
                            if (status == "Accomplished") { badgeMessage = "Passed the Final!"; showBadge = true }
                            else if (status == "Retake") onRetakeSummative?.invoke(summative)
                        }
                    }
                }
            }
        }

        // --- CELEBRATION OVERLAY ---
        if (showBadge) {
            val context = LocalContext.current
            LaunchedEffect(Unit) {
                MediaPlayer.create(context, R.raw.success)?.apply { start(); setOnCompletionListener { release() } }
                trophyAnim.animateTo(1f, tween(600, easing = OvershootInterpolator().toEasing()))
                textAnim.animateTo(1f, tween(600, delayMillis = 200, easing = EaseOutBounce))
                delay(2000)
                showBadge = false
                trophyAnim.snapTo(0f); textAnim.snapTo(0f)
            }
            Box(Modifier.fillMaxSize().background(Color.Black.copy(0.6f)).clickable(enabled = false) {}, contentAlignment = Alignment.Center) {
                KonfettiView(Modifier.fillMaxSize(), listOf(PartyFactory(Emitter(2, TimeUnit.SECONDS).perSecond(50)).spread(360).position(Position.Relative(0.5, 0.3)).build()))
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(Icons.Default.Stars, null, tint = lightGold, modifier = Modifier.size(120.dp).graphicsLayer { scaleX = trophyAnim.value; scaleY = trophyAnim.value; rotationZ = trophyAnim.value * 360 })
                    Text("GREAT JOB!", style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.ExtraBold, color = Color.White, shadow = Shadow(Color.Black, Offset(4f, 4f), 8f)), modifier = Modifier.graphicsLayer { scaleX = textAnim.value; scaleY = textAnim.value })
                    Text(badgeMessage, color = Color.White.copy(0.9f), fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp))
                }
            }
        }
    }
}

@Composable
fun SectionHeader(title: String, icon: androidx.compose.ui.graphics.vector.ImageVector) {
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(bottom = 8.dp)) {
        Icon(icon, null, tint = Color.Gray, modifier = Modifier.size(18.dp))
        Spacer(Modifier.width(8.dp))
        Text(title, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = Color.Gray)
    }
}

@Composable
fun ProgressCard(
    title: String,
    status: String,
    progress: Float,
    details: String,
    accentColor: Color,
    showRetakeButton: Boolean = false,
    retakesLeft: Int = 0,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth().clickable { onClick() },
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(title, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.ExtraBold, modifier = Modifier.weight(1f))
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = when(status) {
                        "Accomplished" -> Color(0xFFE8F5E9); "Retake", "Ongoing" -> Color(0xFFFFF8E1); else -> Color(0xFFFFEBEE)
                    }
                ) {
                    Text(
                        status.uppercase(),
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Bold,
                        color = when(status) {
                            "Accomplished" -> Color(0xFF2E7D32); "Retake", "Ongoing" -> Color(0xFFF57F17); else -> Color(0xFFC62828)
                        }
                    )
                }
            }
            Spacer(Modifier.height(16.dp))
            LinearProgressIndicator(
                progress = { progress },
                modifier = Modifier.fillMaxWidth().height(10.dp).clip(CircleShape),
                color = accentColor,
                trackColor = accentColor.copy(0.1f)
            )
            Row(modifier = Modifier.padding(top = 8.dp), verticalAlignment = Alignment.CenterVertically) {
                Text(details, style = MaterialTheme.typography.bodySmall, color = Color.Gray)
                Spacer(Modifier.weight(1f))
                Text("${(progress * 100).toInt()}%", fontWeight = FontWeight.Bold, color = accentColor)
            }

            if (showRetakeButton) {
                Button(
                    onClick = onClick,
                    modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF9800))
                ) {
                    Text("Attempt Retake ($retakesLeft left)", fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

// Helper to convert interpolator to easing
fun android.view.animation.Interpolator.toEasing() = Easing { x -> getInterpolation(x) }

    /* ---------------- MANAGE STUDENTS ---------------- */
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun ManageStudentsScreen(
        students: SnapshotStateList<Student>,
        archivedStudents: SnapshotStateList<Student>,
        onBack: () -> Unit,
        onStudentSelected: (Student) -> Unit
    ) {
        val headerStartColor = Color(0xFF4CAF50)
        val headerEndColor = Color(0xFF388E3C)
        val context = LocalContext.current

        var searchQuery by remember { mutableStateOf("") }
        var editingStudent by remember { mutableStateOf<Student?>(null) }
        var showAddStudent by remember { mutableStateOf(false) }
        var studentToArchive by remember { mutableStateOf<Student?>(null) }
        var showArchivedScreen by remember { mutableStateOf(false) }
        var showArchiveDialog by remember { mutableStateOf(false) }
        var isProcessing by remember { mutableStateOf(false) }

        val db = Firebase.firestore

        // --- SUB SCREEN: ARCHIVED STUDENTS ---
        if (showArchivedScreen) {
            ArchivedStudentsScreen(
                archivedStudents = archivedStudents,
                onRestore = { student ->
                    isProcessing = true
                    // ✅ FIXED: Use student.id (which is same as username)
                    val docId = student.id.ifBlank { student.username }
                    db.collection("students").document(docId)
                        .update("status", "active")
                        .addOnCompleteListener { isProcessing = false }
                },
                onDelete = { student ->
                    isProcessing = true
                    // ✅ FIXED: Use student.id (which is same as username)
                    val docId = student.id.ifBlank { student.username }
                    db.collection("students").document(docId)
                        .delete()
                        .addOnSuccessListener {
                            Toast.makeText(context, "Record permanently deleted", Toast.LENGTH_SHORT).show()
                        }
                        .addOnCompleteListener { isProcessing = false }
                },
                onBack = { showArchivedScreen = false }
            )
            if (isProcessing) GlobalLoadingOverlay("Processing...")
            return
        }

        // --- SUB SCREEN: ADD/EDIT STUDENT ---
        if (showAddStudent) {
            AddStudentScreen(
                existingStudent = editingStudent,
                onSave = { student ->
                    isProcessing = true

                    if (editingStudent != null) {
                        // ✅ EDIT MODE - Update existing student
                        val targetId = editingStudent!!.id.ifBlank { editingStudent!!.username }

                        db.collection("students").document(targetId)
                            .set(student.copy(
                                id = targetId, // ✅ Preserve existing ID
                                username = editingStudent!!.username, // ✅ Preserve username
                                uid = editingStudent!!.uid, // ✅ Keep existing UID
                                status = editingStudent!!.status,
                                accountCreated = editingStudent!!.accountCreated
                            ))
                            .addOnSuccessListener {
                                showAddStudent = false
                                editingStudent = null
                                Toast.makeText(context, "Record updated successfully", Toast.LENGTH_SHORT).show()
                            }
                            .addOnFailureListener { e ->
                                Toast.makeText(context, "Update failed: ${e.message}", Toast.LENGTH_LONG).show()
                            }
                            .addOnCompleteListener { isProcessing = false }
                    } else {
                        // ✅ NEW STUDENT MODE
                        // Student object from AddStudentScreen has:
                        // - id = username
                        // - username = same value
                        // - uid = Firebase Auth UID

                        val docId = student.username // ✅ Use username as document ID

                        db.collection("students")
                            .document(docId) // ✅ Consistent with EnrollmentFormScreen
                            .set(student.copy(
                                id = docId // ✅ Ensure id matches document ID
                            ))
                            .addOnSuccessListener {
                                showAddStudent = false
                                Toast.makeText(context, "Account created successfully", Toast.LENGTH_SHORT).show()
                            }
                            .addOnFailureListener { e ->
                                Toast.makeText(context, "Save failed: ${e.message}", Toast.LENGTH_LONG).show()
                            }
                            .addOnCompleteListener { isProcessing = false }
                    }
                },
                onCancel = {
                    editingStudent = null
                    showAddStudent = false
                }
            )
            if (isProcessing) GlobalLoadingOverlay("Processing...")
            return
        }

        // --- MAIN UI ---
        Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
            Column(modifier = Modifier.fillMaxSize()) {
                // --- HEADER ---
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = headerStartColor,
                    shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                    shadowElevation = 8.dp
                ) {
                    Column(
                        modifier = Modifier
                            .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                            .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            IconButton(
                                onClick = onBack,
                                modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)
                            ) {
                                Icon(Icons.Default.ArrowBack, null, tint = Color.White)
                            }
                            Spacer(Modifier.width(16.dp))
                            Column {
                                Text(
                                    "User Management",
                                    color = Color.White.copy(0.8f),
                                    style = MaterialTheme.typography.labelMedium
                                )
                                Text(
                                    "STUDENTS",
                                    style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
                                    color = Color.White
                                )
                            }
                            Spacer(Modifier.weight(1f))

                            // --- GLASS LOGO CONTAINER ---
                            Surface(
                                modifier = Modifier.size(52.dp),
                                shape = CircleShape,
                                color = Color.White.copy(alpha = 0.25f),
                                border = BorderStroke(1.dp, Color.White.copy(alpha = 0.4f))
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Icon(
                                        Icons.Default.People,
                                        null,
                                        tint = Color.White,
                                        modifier = Modifier.size(28.dp)
                                    )
                                }
                            }
                        }
                    }
                }

                // --- STATS SECTION ---
                Row(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    StatCard(
                        title = "Active",
                        count = students.size.toString(),
                        icon = Icons.Default.CheckCircle,
                        color = headerStartColor,
                        modifier = Modifier.weight(1f)
                    )
                    StatCard(
                        title = "Archived",
                        count = archivedStudents.size.toString(),
                        icon = Icons.Default.Inventory,
                        color = Color.Gray,
                        modifier = Modifier.weight(1f)
                    )
                }

                // --- SEARCH BAR ---
                Row(
                    Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    OutlinedTextField(
                        value = searchQuery,
                        onValueChange = { searchQuery = it },
                        placeholder = { Text("Search by name or LRN...") },
                        modifier = Modifier.weight(1f),
                        shape = RoundedCornerShape(12.dp),
                        leadingIcon = { Icon(Icons.Default.Search, null) },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = Color.White,
                            unfocusedContainerColor = Color.White,
                            focusedBorderColor = headerStartColor,
                            unfocusedBorderColor = Color.Transparent
                        )
                    )
                    Spacer(Modifier.width(12.dp))
                    IconButton(
                        onClick = { showArchivedScreen = true },
                        modifier = Modifier.background(Color.White, RoundedCornerShape(12.dp)).size(52.dp)
                    ) {
                        Icon(Icons.Default.Archive, null, tint = Color.Gray)
                    }
                }

                // --- STUDENT LIST ---
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp, 16.dp, 16.dp, 100.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    val filtered = students.filter {
                        it.name.contains(searchQuery, true) || it.studentNumber.contains(searchQuery)
                    }
                    items(filtered, key = { it.id.ifBlank { it.username } }) { student ->
                        StudentCard(
                            student = student,
                            onView = { onStudentSelected(student) },
                            onEdit = {
                                editingStudent = student
                                showAddStudent = true
                            },
                            onArchive = {
                                studentToArchive = student
                                showArchiveDialog = true
                            }
                        )
                    }
                }
            }

            // --- MODERN FAB ---
            FloatingActionButton(
                onClick = { showAddStudent = true },
                containerColor = headerStartColor,
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.align(Alignment.BottomEnd).padding(24.dp)
            ) {
                Row(
                    Modifier.padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(Icons.Default.PersonAdd, null, tint = Color.White)
                    Spacer(Modifier.width(8.dp))
                    Text("Register", color = Color.White, fontWeight = FontWeight.Bold)
                }
            }

            if (isProcessing) GlobalLoadingOverlay("Updating Database...")
        }

        // --- ARCHIVE DIALOG ---
        if (showArchiveDialog && studentToArchive != null) {
            AlertDialog(
                onDismissRequest = { showArchiveDialog = false },
                title = { Text("Archive Student") },
                text = { Text("Move ${studentToArchive!!.name} to safe storage?") },
                confirmButton = {
                    TextButton(onClick = {
                        isProcessing = true
                        // ✅ FIXED: Use student.id (which is same as username)
                        val docId = studentToArchive!!.id.ifBlank { studentToArchive!!.username }
                        db.collection("students").document(docId)
                            .update("status", "archived")
                            .addOnCompleteListener {
                                isProcessing = false
                                showArchiveDialog = false
                                studentToArchive = null
                            }
                    }) {
                        Text("Archive", color = Color.Red, fontWeight = FontWeight.Bold)
                    }
                },
                dismissButton = {
                    TextButton(onClick = { showArchiveDialog = false }) {
                        Text("Cancel")
                    }
                }
            )
        }
    }

// --- HELPER COMPONENTS (unchanged) ---

@Composable
fun StatCard(title: String, count: String, icon: ImageVector, color: Color, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier.size(36.dp).background(color.copy(0.1f), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(icon, null, tint = color, modifier = Modifier.size(18.dp))
            }
            Spacer(Modifier.width(12.dp))
            Column {
                Text(count, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                Text(title, style = MaterialTheme.typography.labelSmall, color = Color.Gray)
            }
        }
    }
}

@Composable
fun GlobalLoadingOverlay(message: String) {
    Box(
        modifier = Modifier.fillMaxSize().background(Color.Black.copy(0.45f)).clickable(enabled = false) {},
        contentAlignment = Alignment.Center
    ) {
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(
                Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CircularProgressIndicator(color = Color(0xFF4CAF50))
                Spacer(Modifier.height(16.dp))
                Text(message, fontWeight = FontWeight.Medium)
            }
        }
    }
}

@Composable
fun StudentCard(student: Student, onView: () -> Unit, onEdit: () -> Unit, onArchive: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(Modifier.padding(20.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Surface(
                    Modifier.size(48.dp),
                    CircleShape,
                    Color(0xFF4CAF50).copy(0.1f)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Text(
                            student.name.take(1).uppercase(),
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF4CAF50)
                        )
                    }
                }
                Spacer(Modifier.width(16.dp))
                Column(Modifier.weight(1f)) {
                    Text(student.name, fontWeight = FontWeight.Bold)
                    Text(
                        "LRN: ${student.studentNumber}",
                        style = MaterialTheme.typography.bodySmall,
                        color = Color.Gray
                    )
                }
                IconButton(onClick = onEdit) {
                    Icon(Icons.Default.Edit, null, tint = Color.Gray)
                }
            }
            Spacer(Modifier.height(12.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(
                    onClick = onView,
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50))
                ) {
                    Text("Profile")
                }
                OutlinedButton(onClick = onArchive, modifier = Modifier.weight(1f)) {
                    Text("Archive", color = Color.Red)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddStudentScreen(
    existingStudent: Student? = null,
    onSave: (Student) -> Unit, // ✅ CHANGED: Only pass Student (UID is inside)
    onCancel: () -> Unit
) {
    val headerStartColor = Color(0xFF4CAF50)
    val headerEndColor = Color(0xFF388E3C)
    val context = LocalContext.current
    val calendar = remember { Calendar.getInstance() }
    val scope = rememberCoroutineScope() // ✅ ADDED for Firebase calls

    // --- STATES ---
    var firstName by remember { mutableStateOf(existingStudent?.firstName ?: "") }
    var middleName by remember { mutableStateOf(existingStudent?.middleName ?: "") }
    var lastName by remember { mutableStateOf(existingStudent?.lastName ?: "") }
    var birthday by remember { mutableStateOf(existingStudent?.birthday ?: "") }
    var age by remember { mutableStateOf(existingStudent?.age ?: "") }
    var sex by remember { mutableStateOf(existingStudent?.sex ?: "") }
    var contact by remember { mutableStateOf(existingStudent?.contact ?: "") }
    var studentNumber by remember { mutableStateOf(existingStudent?.studentNumber ?: "") }
    var barangay by remember { mutableStateOf(existingStudent?.barangay ?: "") }
    var municipality by remember { mutableStateOf(existingStudent?.municipality ?: "") }
    var guardianName by remember { mutableStateOf(existingStudent?.guardianName ?: "") }
    var guardianContact by remember { mutableStateOf(existingStudent?.guardianContact ?: "") }

    // Academic States
    var lastSchool by remember { mutableStateOf(existingStudent?.lastSchoolAttended ?: "") }
    var yearAttended by remember { mutableStateOf(existingStudent?.yearAttended ?: "") }
    var gradeLevel by remember { mutableStateOf(existingStudent?.gradeOrYear ?: "") }

    // Credentials
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }

    // Dialog State
    var showSuccessDialog by remember { mutableStateOf(false) }
    var isCreating by remember { mutableStateOf(false) } // ✅ ADDED loading state

    val textFieldColors = OutlinedTextFieldDefaults.colors(
        focusedBorderColor = headerStartColor,
        unfocusedBorderColor = Color.LightGray.copy(0.4f),
        focusedContainerColor = Color.White,
        unfocusedContainerColor = Color.White,
        cursorColor = headerStartColor,
        focusedLabelColor = headerStartColor
    )

    if (showSuccessDialog) {
        SuccessDialog(
            isEdit = existingStudent != null,
            onConfirm = {
                showSuccessDialog = false
                onCancel() // ✅ Close screen after success
            }
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF0F2F5))
            .verticalScroll(rememberScrollState())
    ) {
        // --- HEADER ---
        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = headerStartColor,
            shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
            shadowElevation = 8.dp
        ) {
            Column(
                modifier = Modifier
                    .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                    .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(
                        onClick = onCancel,
                        modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)
                    ) {
                        Icon(Icons.Default.Close, "Cancel", tint = Color.White)
                    }
                    Spacer(Modifier.width(16.dp))
                    Column {
                        Text(
                            text = if (existingStudent == null) "New Registration" else "Update Record",
                            style = MaterialTheme.typography.labelLarge,
                            color = Color.White.copy(0.8f)
                        )
                        Text(
                            text = if (existingStudent == null) "ADD STUDENT" else "EDIT STUDENT",
                            style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.ExtraBold),
                            color = Color.White
                        )
                    }
                }
            }
        }

        Spacer(Modifier.height(24.dp))

        // --- CREDENTIALS (NEW ONLY) ---
        if (existingStudent == null) {
            FormCard(title = "Login Credentials", icon = Icons.Default.Lock) {
                OutlinedTextField(
                    value = username,
                    onValueChange = { username = it.lowercase().replace(" ", "") },
                    label = { Text("Username") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = textFieldColors,
                    singleLine = true,
                    enabled = !isCreating
                )
                Spacer(Modifier.height(12.dp))
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Password") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = textFieldColors,
                    visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    trailingIcon = {
                        IconButton(onClick = { passwordVisible = !passwordVisible }) {
                            Icon(if (passwordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff, null)
                        }
                    },
                    singleLine = true,
                    enabled = !isCreating
                )
                Spacer(Modifier.height(12.dp))
                OutlinedTextField(
                    value = confirmPassword,
                    onValueChange = { confirmPassword = it },
                    label = { Text("Confirm Password") },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = textFieldColors,
                    visualTransformation = PasswordVisualTransformation(),
                    singleLine = true,
                    isError = confirmPassword.isNotBlank() && password != confirmPassword,
                    enabled = !isCreating
                )
            }
        }

        // --- PERSONAL INFO ---
        FormCard(title = "Personal Information", icon = Icons.Default.Person) {
            OutlinedTextField(value = firstName, onValueChange = { firstName = it }, label = { Text("First Name") }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp), colors = textFieldColors, enabled = !isCreating)
            Spacer(Modifier.height(12.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                OutlinedTextField(value = middleName, onValueChange = { middleName = it }, label = { Text("Middle Name") }, modifier = Modifier.weight(1f), shape = RoundedCornerShape(12.dp), colors = textFieldColors, enabled = !isCreating)
                OutlinedTextField(value = lastName, onValueChange = { lastName = it }, label = { Text("Last Name") }, modifier = Modifier.weight(1f), shape = RoundedCornerShape(12.dp), colors = textFieldColors, enabled = !isCreating)
            }
            Spacer(Modifier.height(12.dp))
            OutlinedTextField(
                value = birthday, onValueChange = {}, label = { Text("Birthday") }, readOnly = true,
                trailingIcon = {
                    IconButton(onClick = {
                        if (!isCreating) {
                            DatePickerDialog(context, { _, y, m, d ->
                                birthday = String.format("%04d-%02d-%02d", y, m + 1, d)
                                val today = Calendar.getInstance()
                                var calcAge = today.get(Calendar.YEAR) - y
                                if (today.get(Calendar.MONTH) < m || (today.get(Calendar.MONTH) == m && today.get(Calendar.DAY_OF_MONTH) < d)) calcAge--
                                age = calcAge.toString()
                            }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show()
                        }
                    }) { Icon(Icons.Default.CalendarToday, null, tint = headerStartColor) }
                }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp), colors = textFieldColors
            )
            Spacer(Modifier.height(12.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                OutlinedTextField(value = age, onValueChange = {}, label = { Text("Age") }, readOnly = true, modifier = Modifier.weight(1f), shape = RoundedCornerShape(12.dp), colors = textFieldColors)
                OutlinedTextField(value = sex, onValueChange = { sex = it }, label = { Text("Sex") }, modifier = Modifier.weight(1f), shape = RoundedCornerShape(12.dp), colors = textFieldColors, enabled = !isCreating)
            }
            Spacer(Modifier.height(12.dp))
            OutlinedTextField(value = studentNumber, onValueChange = { studentNumber = it }, label = { Text("LRN") }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp), colors = textFieldColors, enabled = !isCreating)
        }

        // --- ACADEMIC HISTORY ---
        FormCard(title = "Educational Background", icon = Icons.Default.School) {
            OutlinedTextField(value = lastSchool, onValueChange = { lastSchool = it }, label = { Text("Last School Attended") }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp), colors = textFieldColors, enabled = !isCreating)
            Spacer(Modifier.height(12.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                OutlinedTextField(value = yearAttended, onValueChange = { yearAttended = it }, label = { Text("Year Attended") }, modifier = Modifier.weight(1f), shape = RoundedCornerShape(12.dp), colors = textFieldColors, enabled = !isCreating)
                OutlinedTextField(value = gradeLevel, onValueChange = { gradeLevel = it }, label = { Text("Grade Level") }, modifier = Modifier.weight(1f), shape = RoundedCornerShape(12.dp), colors = textFieldColors, enabled = !isCreating)
            }
        }

        // --- ADDRESS & CONTACT ---
        FormCard(title = "Address & Contact", icon = Icons.Default.Home) {
            OutlinedTextField(value = contact, onValueChange = { contact = it }, label = { Text("Contact Number") }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp), colors = textFieldColors, enabled = !isCreating)
            Spacer(Modifier.height(12.dp))
            OutlinedTextField(value = barangay, onValueChange = { barangay = it }, label = { Text("Barangay") }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp), colors = textFieldColors, enabled = !isCreating)
            Spacer(Modifier.height(12.dp))
            OutlinedTextField(value = municipality, onValueChange = { municipality = it }, label = { Text("Municipality") }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp), colors = textFieldColors, enabled = !isCreating)
        }

        // --- GUARDIAN ---
        FormCard(title = "Guardian Info", icon = Icons.Default.FamilyRestroom) {
            OutlinedTextField(value = guardianName, onValueChange = { guardianName = it }, label = { Text("Guardian Name") }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp), colors = textFieldColors, enabled = !isCreating)
            Spacer(Modifier.height(12.dp))
            OutlinedTextField(value = guardianContact, onValueChange = { guardianContact = it }, label = { Text("Guardian Contact") }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp), colors = textFieldColors, enabled = !isCreating)
        }

        // --- FINAL ACTIONS ---
        Column(Modifier.padding(20.dp)) {
            Button(
                onClick = {
                    // ✅ VALIDATION
                    if (existingStudent == null) {
                        if (username.isBlank()) {
                            Toast.makeText(context, "Username is required", Toast.LENGTH_SHORT).show()
                            return@Button
                        }
                        if (password.length < 6) {
                            Toast.makeText(context, "Password must be at least 6 characters", Toast.LENGTH_SHORT).show()
                            return@Button
                        }
                        if (password != confirmPassword) {
                            Toast.makeText(context, "Passwords do not match", Toast.LENGTH_SHORT).show()
                            return@Button
                        }
                    }

                    if (firstName.isBlank() || lastName.isBlank()) {
                        Toast.makeText(context, "First and Last name are required", Toast.LENGTH_SHORT).show()
                        return@Button
                    }

                    val fullName = listOf(firstName, middleName, lastName).filter { it.isNotBlank() }.joinToString(" ")
                    val fullAddress = listOf(barangay, municipality).filter { it.isNotBlank() }.joinToString(", ")

                    // ✅ CREATE FIREBASE AUTH ACCOUNT (NEW STUDENTS ONLY)
                    if (existingStudent == null) {
                        isCreating = true

                        scope.launch {
                            try {
                                // 1. Create Firebase Auth account
                                val authResult = Firebase.auth.createUserWithEmailAndPassword(
                                    "${username}@als.edu", // ✅ changed from @alsapp.local
                                    password
                                ).await()

                                // 2. Get the UID
                                val firebaseUid = authResult.user?.uid ?: ""

                                // 3. Create Student object with UID
                                val studentData = Student(
                                    name = fullName,
                                    firstName = firstName,
                                    middleName = middleName,
                                    lastName = lastName,
                                    age = age,
                                    sex = sex,
                                    contact = contact,
                                    address = fullAddress,
                                    studentNumber = studentNumber,
                                    birthday = birthday,
                                    barangay = barangay,
                                    municipality = municipality,
                                    guardianName = guardianName,
                                    guardianContact = guardianContact,
                                    lastSchoolAttended = lastSchool,
                                    yearAttended = yearAttended,
                                    gradeOrYear = gradeLevel,
                                    username = username,
                                    password = password,
                                    uid = firebaseUid, // ✅ UID ADDED!
                                    status = "approved",
                                    accountCreated = true
                                )

                                withContext(Dispatchers.Main) {
                                    onSave(studentData)
                                    isCreating = false
                                    showSuccessDialog = true
                                }
                            } catch (e: Exception) {
                                withContext(Dispatchers.Main) {
                                    isCreating = false
                                    Toast.makeText(
                                        context,
                                        "Error creating account: ${e.message}",
                                        Toast.LENGTH_LONG
                                    ).show()
                                }
                            }
                        }
                    } else {
                        // ✅ EDIT MODE - Just update student data (keep existing UID)
                        val studentData = existingStudent.copy(
                            name = fullName,
                            firstName = firstName,
                            middleName = middleName,
                            lastName = lastName,
                            age = age,
                            sex = sex,
                            contact = contact,
                            address = fullAddress,
                            studentNumber = studentNumber,
                            birthday = birthday,
                            barangay = barangay,
                            municipality = municipality,
                            guardianName = guardianName,
                            guardianContact = guardianContact,
                            lastSchoolAttended = lastSchool,
                            yearAttended = yearAttended,
                            gradeOrYear = gradeLevel
                        )

                        onSave(studentData)
                        showSuccessDialog = true
                    }
                },
                modifier = Modifier.fillMaxWidth().height(56.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = headerStartColor),
                enabled = !isCreating
            ) {
                if (isCreating) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(24.dp),
                        color = Color.White,
                        strokeWidth = 2.dp
                    )
                } else {
                    Text(
                        if (existingStudent == null) "Create Account" else "Save Changes",
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            TextButton(
                onClick = onCancel,
                modifier = Modifier.fillMaxWidth(),
                enabled = !isCreating
            ) {
                Text("Discard Changes", color = Color.Gray)
            }
        }
        Spacer(Modifier.height(40.dp))
    }
}

// --- SUCCESS DIALOG COMPONENT ---
@Composable
fun SuccessDialog(isEdit: Boolean, onConfirm: () -> Unit) {
    AlertDialog(
        onDismissRequest = onConfirm,
        confirmButton = {
            Button(onClick = onConfirm, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50))) {
                Text("Done")
            }
        },
        title = {
            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
                Icon(Icons.Default.CheckCircle, null, tint = Color(0xFF4CAF50), modifier = Modifier.size(64.dp))
                Spacer(Modifier.height(16.dp))
                Text(if (isEdit) "Update Successful" else "Account Created")
            }
        },
        text = {
            Text(
                if (isEdit) "The student's record has been successfully updated in the database."
                else "The new student account has been created with Firebase Authentication and added to the database.",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        },
        shape = RoundedCornerShape(24.dp),
        containerColor = Color.White
    )
}

@Composable
fun FormCard(title: String, icon: androidx.compose.ui.graphics.vector.ImageVector, content: @Composable ColumnScope.() -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(1.dp)
    ) {
        Column(Modifier.padding(20.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(icon, null, tint = Color(0xFF4CAF50), modifier = Modifier.size(18.dp))
                Spacer(Modifier.width(8.dp))
                Text(title, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold)
            }
            Spacer(Modifier.height(16.dp))
            content()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ArchivedStudentsScreen(
    archivedStudents: SnapshotStateList<Student>,
    onRestore: (Student) -> Unit,
    onDelete: (Student) -> Unit,
    onBack: () -> Unit
) {
    val headerStartColor = Color(0xFF4CAF50)
    val headerEndColor = Color(0xFF388E3C)
    val restoreBlue = Color(0xFF1976D2)

    var searchQuery by remember { mutableStateOf("") }
    var studentToRestore by remember { mutableStateOf<Student?>(null) }
    var studentToDelete by remember { mutableStateOf<Student?>(null) }
    var showRestoreDialog by remember { mutableStateOf(false) }
    var showDeleteDialog by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF0F2F5))
    ) {
        // --- HEADER ---
        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = headerStartColor,
            shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
            shadowElevation = 8.dp
        ) {
            Column(
                modifier = Modifier
                    .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                    .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(
                        onClick = onBack,
                        modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)
                    ) {
                        Icon(Icons.Default.ArrowBack, "Back", tint = Color.White)
                    }
                    Spacer(Modifier.width(16.dp))
                    Column {
                        Text("Safe Storage", style = MaterialTheme.typography.labelLarge, color = Color.White.copy(0.8f))
                        Text("ARCHIVE", style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold), color = Color.White)
                    }
                }
            }
        }

        // --- SEARCH ---
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            placeholder = { Text("Search archived students...") },
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            shape = RoundedCornerShape(12.dp),
            leadingIcon = { Icon(Icons.Default.Search, null) },
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedBorderColor = headerStartColor,
                unfocusedBorderColor = Color.Transparent
            )
        )

        // --- LIST ---
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp, 0.dp, 16.dp, 100.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            val filtered = archivedStudents.filter {
                it.name.contains(searchQuery, true) || it.studentNumber.contains(searchQuery)
            }
            items(filtered, key = { it.id.ifBlank { it.username } }) { student ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(2.dp)
                ) {
                    Column(Modifier.padding(20.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Column(Modifier.weight(1f)) {
                                Text(student.name, fontWeight = FontWeight.Bold, style = MaterialTheme.typography.titleMedium)
                                Text("LRN: ${student.studentNumber}", color = Color.Gray, style = MaterialTheme.typography.bodySmall)
                            }
                            // ✅ Added Grade Level Badge for better identification
                            if (student.gradeOrYear.isNotBlank()) {
                                Surface(
                                    color = Color.Gray.copy(0.1f),
                                    shape = RoundedCornerShape(8.dp)
                                ) {
                                    Text(
                                        text = student.gradeOrYear,
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                        style = MaterialTheme.typography.labelSmall,
                                        color = Color.Gray
                                    )
                                }
                            }
                        }

                        Divider(Modifier.padding(vertical = 12.dp), thickness = 0.5.dp, color = Color.LightGray.copy(0.5f))

                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            Button(
                                onClick = { studentToRestore = student; showRestoreDialog = true },
                                modifier = Modifier.weight(1f),
                                colors = ButtonDefaults.buttonColors(containerColor = restoreBlue),
                                shape = RoundedCornerShape(12.dp)
                            ) {
                                Icon(Icons.Default.SettingsBackupRestore, null, modifier = Modifier.size(16.dp))
                                Spacer(Modifier.width(8.dp))
                                Text("Restore")
                            }
                            OutlinedButton(
                                onClick = { studentToDelete = student; showDeleteDialog = true },
                                modifier = Modifier.weight(1f),
                                shape = RoundedCornerShape(12.dp),
                                border = BorderStroke(1.dp, Color.Red.copy(0.3f))
                            ) {
                                Text("Delete Forever", color = Color.Red)
                            }
                        }
                    }
                }
            }
        }
    }

    // --- DIALOGS ---
    if (showRestoreDialog && studentToRestore != null) {
        AlertDialog(
            onDismissRequest = { showRestoreDialog = false },
            title = { Text("Restore Student") },
            text = { Text("Move ${studentToRestore!!.name} back to the active students list?") },
            confirmButton = {
                TextButton(onClick = { onRestore(studentToRestore!!); showRestoreDialog = false }) {
                    Text("Restore", color = restoreBlue, fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = { TextButton(onClick = { showRestoreDialog = false }) { Text("Cancel") } }
        )
    }

    if (showDeleteDialog && studentToDelete != null) {
        AlertDialog(
            onDismissRequest = { showDeleteDialog = false },
            title = { Text("Permanent Deletion", color = Color.Red) },
            text = { Text("This will permanently remove ${studentToDelete!!.name} and all their records from Firebase. This action cannot be undone.") },
            confirmButton = {
                TextButton(onClick = { onDelete(studentToDelete!!); showDeleteDialog = false }) {
                    Text("Delete Forever", color = Color.Red, fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = { TextButton(onClick = { showDeleteDialog = false }) { Text("Cancel") } }
        )
    }
}

@Composable
fun InfoRow(icon: androidx.compose.ui.graphics.vector.ImageVector, text: String) {
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(vertical = 2.dp)) {
        Icon(icon, null, tint = Color.Gray, modifier = Modifier.size(14.dp))
        Spacer(Modifier.width(8.dp))
        Text(text, style = MaterialTheme.typography.bodySmall, color = Color.Gray)
    }
}

// ✅ StudentProfileScreen stays the same
@Composable
fun StudentProfileScreen(student: Student, onBack: () -> Unit) {
    val headerStartColor = Color(0xFF4CAF50)
    val headerEndColor = Color(0xFF388E3C)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF0F2F5))
            .verticalScroll(rememberScrollState())
    ) {
        // --- HEADER ---
        Surface(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
            shadowElevation = 8.dp
        ) {
            Column(
                modifier = Modifier
                    .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                    .padding(top = 48.dp, bottom = 40.dp, start = 20.dp, end = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = onBack,
                        modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)
                    ) {
                        Icon(Icons.Default.ArrowBack, "Back", tint = Color.White)
                    }
                    Spacer(Modifier.weight(1f))
                    Text(
                        "STUDENT PROFILE",
                        style = MaterialTheme.typography.labelLarge,
                        color = Color.White.copy(0.8f),
                        letterSpacing = 2.sp
                    )
                    Spacer(Modifier.weight(1f))
                    Spacer(Modifier.width(48.dp))
                }

                Spacer(Modifier.height(24.dp))

                Surface(
                    modifier = Modifier.size(100.dp),
                    shape = CircleShape,
                    color = Color.White.copy(alpha = 0.2f),
                    border = BorderStroke(2.dp, Color.White)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Text(
                            text = student.name.take(1).uppercase(),
                            style = MaterialTheme.typography.displayMedium.copy(
                                fontWeight = FontWeight.Black,
                                color = Color.White
                            )
                        )
                    }
                }

                Spacer(Modifier.height(16.dp))

                Text(
                    text = student.name.uppercase(),
                    style = MaterialTheme.typography.headlineSmall.copy(
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White,
                        letterSpacing = 1.sp
                    )
                )

                Surface(
                    color = Color.White.copy(0.2f),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.padding(top = 8.dp)
                ) {
                    Text(
                        text = "ID: ${student.studentNumber.ifBlank { "N/A" }}",
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                        style = MaterialTheme.typography.labelMedium,
                        color = Color.White
                    )
                }
            }
        }

        Spacer(Modifier.height(24.dp))

        ProfileSection(title = "General Information", icon = Icons.Default.Info) {
            DetailItem(label = "Sex", value = student.sex)
            DetailItem(label = "Age", value = student.age)
            DetailItem(label = "Birthday", value = student.birthday)
            DetailItem(label = "Contact", value = student.contact)
        }

        ProfileSection(title = "Parents & Guardian", icon = Icons.Default.FamilyRestroom) {
            DetailItem(label = "Father", value = student.fatherName)
            DetailItem(label = "Mother", value = student.motherName)
            DetailItem(label = "Guardian", value = student.guardianName)
            DetailItem(label = "Guardian Contact", value = student.guardianContact)
        }

        ProfileSection(title = "Academic Background", icon = Icons.Default.School) {
            DetailItem(label = "Previous School", value = student.lastSchoolAttended)
            DetailItem(label = "Year Attended", value = student.yearAttended)
            DetailItem(label = "Grade / Year", value = student.gradeOrYear)
        }

        ProfileSection(title = "Residential Address", icon = Icons.Default.LocationOn) {
            Text(
                text = student.address.ifBlank { "No address provided" },
                style = MaterialTheme.typography.bodyMedium,
                color = Color.DarkGray,
                modifier = Modifier.padding(top = 4.dp)
            )
        }

        Spacer(Modifier.height(40.dp))
    }
}

@Composable
fun ProfileSection(
    title: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    content: @Composable ColumnScope.() -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(icon, null, tint = Color(0xFF4CAF50), modifier = Modifier.size(20.dp))
                Spacer(Modifier.width(12.dp))
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray
                    )
                )
            }
            Divider(Modifier.padding(vertical = 12.dp), thickness = 0.5.dp, color = Color.LightGray.copy(0.4f))
            content()
        }
    }
}

@Composable
fun DetailItem(label: String, value: String) {
    if (value.isNotBlank()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = label, style = MaterialTheme.typography.bodyMedium, color = Color.Gray)
            Text(text = value, style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Bold, color = Color.DarkGray)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun AnnouncementsScreen(
    loggedInUser: String,
    role: String,
    onBack: () -> Unit
) {
    val db = FirebaseFirestore.getInstance()
    val localAnnouncements = remember { mutableStateListOf<Announcement>() }
    val readStatus = remember { mutableStateMapOf<String, Boolean>() }

    var editingAnnouncement by remember { mutableStateOf<Announcement?>(null) }
    var showEditDialog by remember { mutableStateOf(false) }

    val orangeGold = Color(0xFFF2994A)
    val amberYellow = Color(0xFFF2C94C)

    // ✅ FIXED: Single orderBy + in-memory sort (no composite index needed)
    DisposableEffect(Unit) {
        val listener = db.collection("announcements")
            .orderBy("timestamp", Query.Direction.DESCENDING)
            .addSnapshotListener { snapshot, error ->
                if (error != null) {
                    Log.e("ANNOUNCEMENTS", "Listener error: ${error.message}")
                    return@addSnapshotListener
                }

                snapshot?.let {
                    val newList = it.documents.mapNotNull { doc ->
                        try {
                            doc.toObject(Announcement::class.java)?.copy(id = doc.id)
                        } catch (ex: Exception) {
                            Log.e("ANNOUNCEMENTS", "Mapping error for doc ${doc.id}", ex)
                            null
                        }
                    }

                    // ✅ Sort in-memory: pinned first, then by timestamp
                    localAnnouncements.clear()
                    localAnnouncements.addAll(
                        newList.sortedWith(
                            compareByDescending<Announcement> { it.isPinned }
                                .thenByDescending { it.timestamp?.seconds ?: 0L }
                        )
                    )

                    if (role == "student") {
                        newList.forEach { ann ->
                            db.collection("announcements")
                                .document(ann.id)
                                .collection("readBy")
                                .document(loggedInUser)
                                .get()
                                .addOnSuccessListener { snap ->
                                    readStatus[ann.id] = snap.getBoolean("isRead") ?: false
                                }
                        }
                    }
                }
            }
        onDispose { listener.remove() }
    }

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFFDFCFB))) {
        Column(modifier = Modifier.fillMaxSize()) {

            // --- HEADER ---
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = orangeGold,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(orangeGold, amberYellow)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onBack,
                            modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)
                        ) {
                            Icon(Icons.Default.ArrowBack, "Back", tint = Color.White)
                        }
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text("Campus News", style = MaterialTheme.typography.labelLarge, color = Color.White.copy(0.8f))
                            Text(
                                "ANNOUNCEMENTS",
                                style = MaterialTheme.typography.headlineSmall.copy(
                                    fontWeight = FontWeight.ExtraBold,
                                    letterSpacing = 1.sp
                                ),
                                color = Color.White
                            )
                        }
                        Spacer(Modifier.weight(1f))
                        Surface(
                            modifier = Modifier.size(52.dp),
                            shape = CircleShape,
                            color = Color.White.copy(alpha = 0.25f),
                            border = BorderStroke(1.dp, Color.White.copy(alpha = 0.4f))
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.Campaign,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(28.dp)
                                )
                            }
                        }
                    }
                }
            }

            if (localAnnouncements.isEmpty()) {
                EmptyAnnouncementsView(orangeGold)
            } else {
                LazyColumn(
                    modifier = Modifier.weight(1f),
                    contentPadding = PaddingValues(16.dp, 24.dp, 16.dp, 120.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(items = localAnnouncements, key = { it.id }) { item ->
                        AnnouncementCard(
                            announcement = item,
                            isRead = readStatus[item.id] ?: false,
                            role = role,
                            loggedInUser = loggedInUser,
                            accentColor = orangeGold,
                            modifier = Modifier.animateItem(),
                            onReadToggle = { newValue ->
                                readStatus[item.id] = newValue
                            },
                            onEditClick = {
                                editingAnnouncement = item
                                showEditDialog = true
                            }
                        )
                    }
                }
            }
        }

        if (role == "admin") {
            AdminPostBar(accentColor = orangeGold)
        }

        if (showEditDialog && editingAnnouncement != null) {
            EditAnnouncementDialog(
                announcement = editingAnnouncement!!,
                accentColor = orangeGold,
                onDismiss = {
                    showEditDialog = false
                    editingAnnouncement = null
                },
                onConfirm = { id, newTitle, newMsg ->
                    if (id.isNotEmpty()) {
                        db.collection("announcements").document(id)
                            .update(
                                "title", newTitle,
                                "message", newMsg
                            )
                            .addOnSuccessListener {
                                Log.d("ANNOUNCEMENTS", "Edit successful")
                                showEditDialog = false
                                editingAnnouncement = null
                            }
                            .addOnFailureListener { e ->
                                Log.e("ANNOUNCEMENTS", "Edit failed: ${e.message}")
                            }
                    }
                }
            )
        }
    }
}
@Composable
fun AnnouncementCard(
    announcement: Announcement,
    isRead: Boolean,
    role: String,
    loggedInUser: String,
    accentColor: Color,
    modifier: Modifier = Modifier,
    onReadToggle: (Boolean) -> Unit = {},
    onEditClick: () -> Unit = {}
) {
    val db = FirebaseFirestore.getInstance()
    val isPinned = announcement.isPinned

    // ✅ ADDED: delete confirmation dialog state
    var showDeleteDialog by remember { mutableStateOf(false) }

    val backgroundColor by animateColorAsState(
        targetValue = when {
            isPinned -> Color(0xFFFFFDE7)
            isRead -> Color(0xFFF2F2F2)
            else -> Color.White
        },
        label = "bgColor"
    )

    // ✅ ADDED: Delete confirmation dialog
    if (showDeleteDialog) {
        AlertDialog(
            onDismissRequest = { showDeleteDialog = false },
            icon = {
                Icon(
                    Icons.Default.Delete,
                    contentDescription = null,
                    tint = Color(0xFFE74C3C),
                    modifier = Modifier.size(36.dp)
                )
            },
            title = { Text("Delete Announcement", fontWeight = FontWeight.Bold) },
            text = { Text("Are you sure you want to delete \"${announcement.title}\"? This cannot be undone.") },
            confirmButton = {
                Button(
                    onClick = {
                        showDeleteDialog = false
                        db.collection("announcements")
                            .document(announcement.id)
                            .delete()
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE74C3C))
                ) { Text("Delete", color = Color.White) }
            },
            dismissButton = {
                TextButton(onClick = { showDeleteDialog = false }) { Text("Cancel") }
            }
        )
    }

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        elevation = CardDefaults.cardElevation(if (isPinned) 4.dp else 1.dp),
        border = if (isPinned) BorderStroke(1.5.dp, accentColor.copy(0.4f)) else null
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (!isRead && role == "student") {
                    Box(Modifier.size(8.dp).background(accentColor, CircleShape))
                    Spacer(Modifier.width(8.dp))
                }
                if (isPinned) {
                    Surface(
                        color = accentColor.copy(0.15f),
                        shape = RoundedCornerShape(6.dp),
                        border = BorderStroke(1.dp, accentColor.copy(0.3f))
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 3.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                Icons.Default.PushPin,
                                "Pinned",
                                tint = accentColor,
                                modifier = Modifier.size(12.dp)
                            )
                            Spacer(Modifier.width(4.dp))
                            Text(
                                "PINNED",
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.ExtraBold,
                                color = accentColor,
                                fontSize = 10.sp
                            )
                        }
                    }
                    Spacer(Modifier.width(8.dp))
                }

                Text(
                    announcement.title,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = if (isRead && role == "student") Color.Gray else Color.Black
                )
                Spacer(Modifier.weight(1f))
                Text(
                    formatAnnouncementDate(announcement.timestamp),
                    style = MaterialTheme.typography.labelSmall,
                    color = Color.Gray
                )
            }

            Text(
                announcement.message,
                style = MaterialTheme.typography.bodyMedium,
                color = if (isRead && role == "student") Color.Gray else Color.DarkGray,
                modifier = Modifier.padding(vertical = 12.dp),
                lineHeight = 20.sp
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (role == "student") {
                    TextButton(onClick = {
                        val newValue = !isRead
                        onReadToggle(newValue)
                        db.collection("announcements")
                            .document(announcement.id)
                            .collection("readBy")
                            .document(loggedInUser)
                            .set(mapOf("isRead" to newValue))
                            .addOnFailureListener {
                                onReadToggle(!newValue)
                            }
                    }) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                if (isRead) Icons.Default.MarkEmailUnread else Icons.Default.MarkEmailRead,
                                null,
                                tint = accentColor,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(Modifier.width(4.dp))
                            Text(
                                if (isRead) "Mark as New" else "Mark as Read",
                                color = accentColor
                            )
                        }
                    }
                } else {
                    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                        IconButton(onClick = onEditClick) {
                            Icon(Icons.Default.Edit, "Edit", tint = Color.Gray)
                        }
                        IconButton(onClick = {
                            db.collection("announcements")
                                .document(announcement.id)
                                .update("isPinned", !isPinned)
                        }) {
                            Icon(
                                Icons.Default.PushPin,
                                "Pin",
                                tint = if (isPinned) accentColor else Color.Gray
                            )
                        }
                        // ✅ CHANGED: now shows dialog instead of deleting immediately
                        IconButton(onClick = { showDeleteDialog = true }) {
                            Icon(
                                Icons.Default.Delete,
                                "Delete",
                                tint = Color(0xFFE74C3C).copy(alpha = 0.7f)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun EditAnnouncementDialog(
    announcement: Announcement,
    accentColor: Color,
    onDismiss: () -> Unit,
    onConfirm: (String, String, String) -> Unit
) {
    // ✅ FIX 3: key() forces state reset when editing a different announcement
    key(announcement.id) {
        var editTitle by remember { mutableStateOf(announcement.title) }
        var editMsg by remember { mutableStateOf(announcement.message) }

        AlertDialog(
            onDismissRequest = onDismiss,
            title = { Text("Edit Announcement", fontWeight = FontWeight.Bold) },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    OutlinedTextField(
                        value = editTitle,
                        onValueChange = { editTitle = it },
                        label = { Text("Title") },
                        modifier = Modifier.fillMaxWidth(),
                        singleLine = true,
                        colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = accentColor)
                    )
                    OutlinedTextField(
                        value = editMsg,
                        onValueChange = { editMsg = it },
                        label = { Text("Message") },
                        modifier = Modifier.fillMaxWidth(),
                        minLines = 3,
                        colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = accentColor)
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        if (editTitle.isNotBlank() && editMsg.isNotBlank()) {
                            onConfirm(announcement.id, editTitle, editMsg)
                        }
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = accentColor)
                ) { Text("Save Changes") }
            },
            dismissButton = {
                TextButton(onClick = onDismiss) { Text("Cancel") }
            }
        )
    }
}

@Composable
fun BoxScope.AdminPostBar(accentColor: Color) {
    val db = FirebaseFirestore.getInstance()
    var isExpanded by remember { mutableStateOf(false) }
    var title by remember { mutableStateOf("") }
    var msg by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.align(Alignment.BottomCenter).animateContentSize(),
        shadowElevation = 16.dp,
        shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp),
        color = Color.White
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            if (!isExpanded) {
                Button(
                    onClick = { isExpanded = true },
                    modifier = Modifier.fillMaxWidth().height(50.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = accentColor)
                ) {
                    Icon(Icons.Default.Add, null)
                    Spacer(Modifier.width(8.dp))
                    Text("Create New Announcement", fontWeight = FontWeight.Bold)
                }
            } else {
                OutlinedTextField(
                    value = title,
                    onValueChange = { title = it },
                    label = { Text("Title") },
                    modifier = Modifier.fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = accentColor)
                )
                Spacer(Modifier.height(8.dp))
                OutlinedTextField(
                    value = msg,
                    onValueChange = { msg = it },
                    label = { Text("Message") },
                    modifier = Modifier.fillMaxWidth(),
                    minLines = 3,
                    colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = accentColor)
                )
                Row(
                    Modifier.fillMaxWidth().padding(top = 12.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    TextButton(onClick = {
                        isExpanded = false
                        title = ""
                        msg = ""
                    }) { Text("Cancel") }
                    Button(
                        onClick = {
                            if (title.isNotBlank() && msg.isNotBlank()) {
                                val data = mapOf(
                                    "title" to title,
                                    "message" to msg,
                                    "timestamp" to FieldValue.serverTimestamp(),
                                    "isPinned" to false,
                                    "isRead" to false
                                )
                                db.collection("announcements").add(data)
                                    .addOnSuccessListener {
                                        title = ""
                                        msg = ""
                                        isExpanded = false
                                    }
                                    .addOnFailureListener { e ->
                                        Log.e("ANNOUNCEMENTS", "Post failed: ${e.message}")
                                    }
                            }
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = accentColor)
                    ) { Text("Post Now") }
                }
            }
        }
    }
}

@Composable
fun EmptyAnnouncementsView(color: Color) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(Icons.Default.Campaign, null, modifier = Modifier.size(80.dp), tint = color.copy(alpha = 0.2f))
        Spacer(Modifier.height(16.dp))
        Text("No announcements yet.", color = Color.Gray, style = MaterialTheme.typography.bodyLarge)
    }
}

private fun formatAnnouncementDate(timestamp: com.google.firebase.Timestamp?): String {
    if (timestamp == null) return ""
    val date = timestamp.toDate()
    val now = Calendar.getInstance()
    val postDate = Calendar.getInstance().apply { time = date }
    return when {
        now.get(Calendar.DATE) == postDate.get(Calendar.DATE) -> "Today"
        now.get(Calendar.DATE) - postDate.get(Calendar.DATE) == 1 -> "Yesterday"
        else -> SimpleDateFormat("MMM dd", Locale.getDefault()).format(date)
    }
}


// --- Messenger Chat Screen (Detail View) ---
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MessengerChatScreen(
    loggedInUser: String,
    chatPartner: Student,
    onBack: () -> Unit
) {
    val db = FirebaseFirestore.getInstance()
    val storage = FirebaseStorage.getInstance()
    val brandGreen = Color(0xFF4CAF50)
    val brandGreenDark = Color(0xFF388E3C)

    var currentMessage by remember { mutableStateOf("") }
    val messages = remember { mutableStateListOf<Message>() }
    val scrollState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    var isUploading by remember { mutableStateOf(false) }

    var partnerAvatarUrl by remember { mutableStateOf<String?>(null) }

    if (loggedInUser.isBlank()) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(Icons.Default.Error, null, tint = Color.Red, modifier = Modifier.size(64.dp))
                Spacer(Modifier.height(16.dp))
                Text("Not logged in", color = Color.Gray)
                Button(onClick = onBack) { Text("Go Back") }
            }
        }
        return
    }

    val chatDocId = remember(loggedInUser, chatPartner.username) {
        listOf(loggedInUser, chatPartner.username)
            .filter { it.isNotBlank() }
            .sorted()
            .joinToString("_")
    }

    LaunchedEffect(chatPartner.username) {
        if (chatPartner.username != "admin") {
            db.collection("students")
                .whereEqualTo("username", chatPartner.username)
                .limit(1)
                .get()
                .addOnSuccessListener { snapshot ->
                    val url = snapshot.documents.firstOrNull()?.getString("avatarUrl")
                    if (!url.isNullOrBlank()) partnerAvatarUrl = url
                }
        }
    }

    LaunchedEffect(Unit) {
        Log.d("MESSENGER", "Chat opened")
        Log.d("MESSENGER", "Logged in user: $loggedInUser")
        Log.d("MESSENGER", "Chat partner: ${chatPartner.username}")
        Log.d("MESSENGER", "Chat doc ID: $chatDocId")
    }

    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        uri?.let { selectedUri ->
            isUploading = true
            val fileName = "chat_images/${UUID.randomUUID()}.jpg"
            val fileRef = storage.reference.child(fileName)

            fileRef.putFile(selectedUri)
                .addOnSuccessListener {
                    fileRef.downloadUrl.addOnSuccessListener { downloadUrl ->
                        val msgData = hashMapOf(
                            "sender" to loggedInUser,
                            "content" to "Sent an image",
                            "imageUrl" to downloadUrl.toString(),
                            "timestamp" to FieldValue.serverTimestamp()
                        )
                        db.collection("chats").document(chatDocId)
                            .collection("messages").add(msgData)
                            .addOnSuccessListener { isUploading = false }
                            .addOnFailureListener { e ->
                                Log.e("MESSENGER", "Image upload failed: ${e.message}")
                                isUploading = false
                            }
                    }
                }
                .addOnFailureListener { e ->
                    Log.e("MESSENGER", "Storage upload failed: ${e.message}")
                    isUploading = false
                }
        }
    }

    DisposableEffect(chatDocId) {
        val registration = db.collection("chats").document(chatDocId)
            .collection("messages")
            .orderBy("timestamp", Query.Direction.ASCENDING)
            .addSnapshotListener { snapshots, error ->
                if (error != null) {
                    Log.e("MESSENGER", "Listener error: ${error.message}")
                    return@addSnapshotListener
                }

                snapshots?.let {
                    messages.clear()
                    val newMessages = it.documents.mapNotNull { doc ->
                        try {
                            Message(
                                id = doc.id,
                                sender = doc.getString("sender") ?: "",
                                content = doc.getString("content") ?: "",
                                imageUrl = doc.getString("imageUrl"),
                                timestamp = doc.get("timestamp")
                            )
                        } catch (e: Exception) {
                            Log.e("MESSENGER", "Message parse error: ${e.message}")
                            null
                        }
                    }
                    messages.addAll(newMessages)

                    if (messages.isNotEmpty()) {
                        coroutineScope.launch {
                            try {
                                scrollState.animateScrollToItem(messages.size - 1)
                            } catch (e: Exception) {
                                Log.e("MESSENGER", "Scroll error: ${e.message}")
                            }
                        }
                    }
                }
            }
        onDispose {
            registration.remove()
            Log.d("MESSENGER", "Listener removed")
        }
    }

    Scaffold(
        topBar = {
            Surface(
                shadowElevation = 8.dp,
                color = brandGreen,
                shape = RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp)
            ) {
                CenterAlignedTopAppBar(
                    title = {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Surface(
                                modifier = Modifier.size(38.dp),
                                shape = CircleShape,
                                color = Color.White.copy(0.2f)
                            ) {
                                if (!partnerAvatarUrl.isNullOrBlank()) {
                                    AsyncImage(
                                        model = partnerAvatarUrl,
                                        contentDescription = "Avatar",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(CircleShape),
                                        contentScale = ContentScale.Crop
                                    )
                                } else {
                                    Box(contentAlignment = Alignment.Center) {
                                        Text(
                                            chatPartner.name.take(1).uppercase(),
                                            color = Color.White,
                                            fontWeight = FontWeight.Bold
                                        )
                                    }
                                }
                            }
                            Spacer(Modifier.width(12.dp))
                            Column {
                                Text(
                                    text = if (chatPartner.username == "admin" && loggedInUser != "admin")
                                        "ALS Admin Support"
                                    else
                                        chatPartner.name,
                                    style = MaterialTheme.typography.titleMedium.copy(
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color = Color.White
                                )
                                Text(
                                    text = if (chatPartner.username == "admin")
                                        "Administrator"
                                    else
                                        "Student",
                                    style = MaterialTheme.typography.labelSmall,
                                    color = Color.White.copy(0.8f)
                                )
                            }
                        }
                    },
                    navigationIcon = {
                        IconButton(onClick = onBack) {
                            Icon(Icons.Default.ArrowBack, null, tint = Color.White)
                        }
                    },
                    colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                        containerColor = Color.Transparent
                    ),
                    modifier = Modifier.background(
                        Brush.verticalGradient(listOf(brandGreen, brandGreenDark))
                    )
                )
            }
        },
        bottomBar = {
            Surface(
                tonalElevation = 2.dp,
                color = Color.White,
                modifier = Modifier.navigationBarsPadding().imePadding()
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = { launcher.launch("image/*") },
                        enabled = !isUploading
                    ) {
                        if (isUploading) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(24.dp),
                                strokeWidth = 2.dp,
                                color = brandGreen
                            )
                        } else {
                            Icon(Icons.Default.AddPhotoAlternate, "Attach", tint = brandGreen)
                        }
                    }
                    OutlinedTextField(
                        value = currentMessage,
                        onValueChange = { currentMessage = it },
                        modifier = Modifier.weight(1f),
                        placeholder = { Text("Type a message...") },
                        shape = RoundedCornerShape(28.dp),
                        colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = brandGreen)
                    )
                    Spacer(Modifier.width(8.dp))
                    FilledIconButton(
                        onClick = {
                            if (currentMessage.isNotBlank()) {
                                val msgData = hashMapOf(
                                    "sender" to loggedInUser,
                                    "content" to currentMessage,
                                    "timestamp" to FieldValue.serverTimestamp()
                                )
                                db.collection("chats")
                                    .document(chatDocId)
                                    .collection("messages")
                                    .add(msgData)
                                    .addOnSuccessListener { currentMessage = "" }
                                    .addOnFailureListener { e ->
                                        Log.e("MESSENGER", "Send failed: ${e.message}")
                                    }
                            }
                        },
                        colors = IconButtonDefaults.filledIconButtonColors(containerColor = brandGreen)
                    ) {
                        Icon(Icons.Default.Send, null, tint = Color.White)
                    }
                }
            }
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(Color(0xFFF0F2F5))
        ) {
            if (messages.isEmpty()) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Icon(Icons.Default.Chat, null, modifier = Modifier.size(64.dp), tint = Color.Gray.copy(0.3f))
                    Spacer(Modifier.height(16.dp))
                    Text("No messages yet", color = Color.Gray, style = MaterialTheme.typography.bodyLarge)
                    Text("Start the conversation!", color = Color.Gray, style = MaterialTheme.typography.bodySmall)
                }
            } else {
                LazyColumn(
                    state = scrollState,
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(messages, key = { it.id }) { msg ->
                        ChatBubble(
                            msg = msg,
                            isCurrentUser = msg.sender == loggedInUser
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ChatBubble(msg: Message, isCurrentUser: Boolean) {
    val brandGreen = Color(0xFF4CAF50)
    val alignment = if (isCurrentUser) Alignment.End else Alignment.Start
    val bubbleColor = if (isCurrentUser) brandGreen else Color.White
    val contentColor = if (isCurrentUser) Color.White else Color(0xFF1D1B20)

    var showFullDate by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 2.dp),
        horizontalAlignment = alignment
    ) {
        Surface(
            color = bubbleColor,
            shape = RoundedCornerShape(
                topStart = 16.dp,
                topEnd = 16.dp,
                bottomStart = if (isCurrentUser) 16.dp else 4.dp,
                bottomEnd = if (isCurrentUser) 4.dp else 16.dp
            ),
            shadowElevation = 1.dp,
            modifier = Modifier.clickable { showFullDate = !showFullDate }
        ) {
            Column(modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)) {
                if (!msg.imageUrl.isNullOrBlank()) {
                    AsyncImage(
                        model = msg.imageUrl,
                        contentDescription = "Shared Image",
                        modifier = Modifier
                            .sizeIn(maxWidth = 240.dp, maxHeight = 320.dp)
                            .clip(RoundedCornerShape(12.dp)),
                        contentScale = ContentScale.Fit,
                        error = rememberAsyncImagePainter(model = R.drawable.ic_launcher_foreground)
                    )
                    if (msg.content.isNotBlank() && msg.content != "Sent an image") {
                        Spacer(Modifier.height(6.dp))
                    }
                }

                if (msg.content.isNotBlank() && msg.content != "Sent an image") {
                    Text(text = msg.content, color = contentColor, style = MaterialTheme.typography.bodyLarge)
                }

                val timeText = try {
                    SimpleDateFormat("h:mm a", Locale.getDefault()).format(msg.getTimestampLong())
                } catch (e: Exception) { "Just now" }

                val fullDateText = try {
                    SimpleDateFormat("MMM dd, yyyy · h:mm a", Locale.getDefault()).format(msg.getTimestampLong())
                } catch (e: Exception) { "Just now" }

                AnimatedVisibility(visible = showFullDate) {
                    Text(
                        text = fullDateText,
                        style = MaterialTheme.typography.labelSmall,
                        color = contentColor.copy(alpha = 0.7f),
                        modifier = Modifier.align(Alignment.End).padding(top = 4.dp)
                    )
                }

                if (!showFullDate) {
                    Text(
                        text = timeText,
                        style = MaterialTheme.typography.labelSmall,
                        color = contentColor.copy(alpha = 0.6f),
                        modifier = Modifier.align(Alignment.End).padding(top = 4.dp)
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StudentsChatListScreen(
    loggedInUser: String,
    onBack: () -> Unit,
    onStudentSelected: (Student) -> Unit
) {
    val db = FirebaseFirestore.getInstance()
    val brandGreen = Color(0xFF4CAF50)
    val brandGreenDark = Color(0xFF388E3C)

    val students = remember { mutableStateListOf<Student>() }
    val lastMessages = remember { mutableStateMapOf<String, Message>() }
    val listeners = remember { mutableStateMapOf<String, ListenerRegistration>() }
    val avatarUrls = remember { mutableStateMapOf<String, String>() }
    val readChats = remember { mutableStateMapOf<String, Long>() }

    DisposableEffect(loggedInUser) {
        val studentsListener = db.collection("students")
            .addSnapshotListener { snapshots, _ ->
                snapshots?.let {
                    val fetched = it.documents.mapNotNull { doc ->
                        try {
                            Student(
                                name = doc.getString("name") ?: "Unknown",
                                username = doc.getString("username") ?: "",
                                id = doc.id,
                                studentNumber = doc.getString("studentNumber") ?: "",
                                status = doc.getString("status") ?: "pending"
                            )
                        } catch (e: Exception) {
                            Log.e("MESSENGER", "Parse error: ${e.message}")
                            null
                        }
                    }

                    students.clear()

                    if (loggedInUser == "admin") {
                        students.addAll(
                            fetched.filter {
                                it.username != "admin" &&
                                        it.username.isNotBlank() &&
                                        it.status == "active"
                            }
                        )
                    } else {
                        students.add(
                            Student(
                                name = "Admin Support",
                                username = "admin",
                                id = "admin",
                                studentNumber = "OFFICIAL",
                                status = "active"
                            )
                        )
                    }

                    it.documents.forEach { doc ->
                        val username = doc.getString("username") ?: ""
                        val avatarUrl = doc.getString("avatarUrl") ?: ""
                        if (username.isNotBlank() && avatarUrl.isNotBlank()) {
                            avatarUrls[username] = avatarUrl
                        }
                    }

                    students.forEach { student ->
                        val other = student.username
                        if (other.isNotBlank() && !listeners.containsKey(other)) {
                            val chatDocId = listOf(loggedInUser, other)
                                .filter { it.isNotBlank() }
                                .sorted()
                                .joinToString("_")

                            listeners[other] = db.collection("chats")
                                .document(chatDocId)
                                .collection("messages")
                                .orderBy("timestamp", Query.Direction.DESCENDING)
                                .limit(1)
                                .addSnapshotListener { msgs, _ ->
                                    msgs?.documents?.firstOrNull()?.let { d ->
                                        try {
                                            lastMessages[other] = Message(
                                                id = d.id,
                                                sender = d.getString("sender") ?: "",
                                                content = d.getString("content") ?: "",
                                                imageUrl = d.getString("imageUrl"),
                                                timestamp = d.get("timestamp")
                                            )
                                        } catch (e: Exception) {
                                            Log.e("MESSENGER", "Message parse error: ${e.message}")
                                        }
                                    }
                                }
                        }
                    }
                }
            }

        val readListener = db.collection("readChats")
            .document(loggedInUser)
            .collection("chats")
            .addSnapshotListener { snapshot, _ ->
                snapshot?.documents?.forEach { doc ->
                    readChats[doc.id] = doc.getLong("lastReadAt") ?: 0L
                }
            }

        onDispose {
            studentsListener.remove()
            readListener.remove()
            listeners.values.forEach { it.remove() }
        }
    }

    // ✅ Student: dedicated support UI
    if (loggedInUser != "admin") {
        val adminStudent = Student(
            name = "Admin Support",
            username = "admin",
            id = "admin",
            studentNumber = "OFFICIAL",
            status = "active"
        )
        val lastMsg = lastMessages["admin"]
        val lastMsgTime = (lastMsg?.timestamp as? com.google.firebase.Timestamp)?.seconds ?: 0L
        val lastReadTime = readChats["admin"] ?: 0L
        val hasNewMessage = lastMsg != null
                && lastMsg.sender != loggedInUser
                && lastMsgTime > lastReadTime

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF8F9FA))
        ) {
            Column(modifier = Modifier.fillMaxSize()) {

                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = brandGreen,
                    shape = RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 40.dp),
                    shadowElevation = 8.dp
                ) {
                    Column(
                        modifier = Modifier
                            .background(Brush.verticalGradient(listOf(brandGreen, brandGreenDark)))
                            .padding(top = 48.dp, bottom = 40.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            IconButton(onClick = onBack) {
                                Icon(Icons.Default.ArrowBack, null, tint = Color.White)
                            }
                            Spacer(Modifier.weight(1f))
                        }

                        Surface(
                            modifier = Modifier.size(80.dp),
                            shape = CircleShape,
                            color = Color.White.copy(alpha = 0.2f),
                            border = BorderStroke(2.dp, Color.White.copy(alpha = 0.5f))
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.SupportAgent,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(44.dp)
                                )
                            }
                        }

                        Spacer(Modifier.height(16.dp))

                        Text(
                            "ALS Support Center",
                            style = MaterialTheme.typography.headlineSmall.copy(
                                fontWeight = FontWeight.ExtraBold,
                                color = Color.White
                            )
                        )
                        Spacer(Modifier.height(4.dp))
                        Text(
                            "We're here to help you succeed",
                            style = MaterialTheme.typography.bodyMedium.copy(
                                color = Color.White.copy(alpha = 0.8f)
                            )
                        )
                    }
                }

                Spacer(Modifier.height(24.dp))

                Text(
                    "YOUR SUPPORT CHANNEL",
                    modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp),
                    style = MaterialTheme.typography.labelMedium.copy(
                        letterSpacing = 1.2.sp,
                        color = Color.Gray.copy(alpha = 0.7f),
                        fontWeight = FontWeight.ExtraBold
                    )
                )

                // ✅ Support card with OFFICIAL badge pinned to top right
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .clickable {
                            val now = System.currentTimeMillis() / 1000
                            readChats["admin"] = now
                            db.collection("readChats")
                                .document(loggedInUser)
                                .collection("chats")
                                .document("admin")
                                .set(mapOf("lastReadAt" to now))
                            onStudentSelected(adminStudent)
                        },
                    shape = RoundedCornerShape(24.dp),
                    color = Color.White,
                    shadowElevation = 4.dp
                ) {
                    Box {
                        Row(
                            modifier = Modifier.padding(20.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box {
                                Surface(
                                    modifier = Modifier.size(64.dp),
                                    shape = CircleShape,
                                    color = brandGreen.copy(0.1f),
                                    border = BorderStroke(2.dp, brandGreen.copy(0.3f))
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Icon(
                                            Icons.Default.SupportAgent,
                                            null,
                                            tint = brandGreen,
                                            modifier = Modifier.size(32.dp)
                                        )
                                    }
                                }
                                if (hasNewMessage) {
                                    Surface(
                                        modifier = Modifier
                                            .size(16.dp)
                                            .align(Alignment.TopEnd),
                                        shape = CircleShape,
                                        color = Color.Red,
                                        border = BorderStroke(2.dp, Color.White)
                                    ) {}
                                }
                            }

                            Spacer(Modifier.width(16.dp))

                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    "ALS Admin Support",
                                    fontWeight = FontWeight.ExtraBold,
                                    fontSize = 16.sp,
                                    color = Color(0xFF1D1B20)
                                )
                                Spacer(Modifier.height(4.dp))
                                Text(
                                    text = when {
                                        lastMsg == null -> "Send a message to get started"
                                        !lastMsg.imageUrl.isNullOrBlank() -> "📷 Sent a photo"
                                        lastMsg.sender == loggedInUser -> "You: ${lastMsg.content}"
                                        else -> lastMsg.content
                                    },
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = if (hasNewMessage) Color.Black else Color.Gray,
                                    fontWeight = if (hasNewMessage) FontWeight.SemiBold else FontWeight.Normal
                                )
                            }

                            Column(horizontalAlignment = Alignment.End) {
                                if (lastMsg != null) {
                                    val time = (lastMsg.timestamp as? com.google.firebase.Timestamp)?.toDate()
                                        ?: java.util.Date()
                                    Text(
                                        text = SimpleDateFormat("h:mm a", Locale.getDefault()).format(time),
                                        style = MaterialTheme.typography.labelSmall,
                                        color = if (hasNewMessage) brandGreen else Color.LightGray
                                    )
                                }
                                if (hasNewMessage) {
                                    Spacer(Modifier.height(4.dp))
                                    Surface(
                                        shape = CircleShape,
                                        color = brandGreen
                                    ) {
                                        Text(
                                            "NEW",
                                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                                            style = MaterialTheme.typography.labelSmall,
                                            color = Color.White,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 9.sp
                                        )
                                    }
                                }
                            }
                        }

                        // ✅ OFFICIAL badge pinned to top right corner of card
                        Surface(
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(12.dp),
                            shape = RoundedCornerShape(8.dp),
                            color = brandGreen.copy(0.1f)
                        ) {
                            Text(
                                "OFFICIAL",
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
                                style = MaterialTheme.typography.labelSmall,
                                color = brandGreen,
                                fontWeight = FontWeight.Bold,
                                fontSize = 10.sp
                            )
                        }
                    }
                }

                Spacer(Modifier.height(24.dp))

                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    shape = RoundedCornerShape(20.dp),
                    color = brandGreen.copy(alpha = 0.08f)
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Default.Info,
                            null,
                            tint = brandGreen,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(Modifier.width(12.dp))
                        Text(
                            "You can ask your teacher or admin about your modules, quizzes, activities, and enrollment concerns.",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color(0xFF2E7D32),
                            lineHeight = 18.sp
                        )
                    }
                }
            }
        }
        return
    }

    // ✅ Admin: full chat list with search
    var searchQuery by remember { mutableStateOf("") }

    val sortedStudents = students
        .filter { it.name.contains(searchQuery, ignoreCase = true) }
        .sortedByDescending {
            val msg = lastMessages[it.username]
            (msg?.timestamp as? com.google.firebase.Timestamp)?.seconds ?: 0L
        }

    Column(modifier = Modifier.fillMaxSize().background(Color(0xFFF8F9FA))) {
        Surface(
            modifier = Modifier.fillMaxWidth(),
            shadowElevation = 8.dp,
            shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
            color = brandGreen
        ) {
            Column(
                modifier = Modifier
                    .background(Brush.verticalGradient(listOf(brandGreen, brandGreenDark)))
                    .padding(top = 44.dp, bottom = 20.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = onBack) {
                        Icon(Icons.Default.ArrowBack, null, tint = Color.White)
                    }
                    Text(
                        text = "Messages",
                        style = MaterialTheme.typography.headlineSmall,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.weight(1f)
                    )
                    Surface(
                        modifier = Modifier.size(52.dp).padding(end = 8.dp),
                        shape = CircleShape,
                        color = Color.White.copy(alpha = 0.25f),
                        border = BorderStroke(1.dp, Color.White.copy(alpha = 0.4f))
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Icon(
                                imageVector = Icons.Default.Chat,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(24.dp)
                            )
                        }
                    }
                }

                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 8.dp),
                    placeholder = { Text("Search conversations...", color = Color.White.copy(0.7f)) },
                    leadingIcon = { Icon(Icons.Default.Search, null, tint = Color.White) },
                    shape = RoundedCornerShape(16.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color.White.copy(0.15f),
                        unfocusedContainerColor = Color.White.copy(0.1f),
                        focusedBorderColor = Color.White,
                        unfocusedBorderColor = Color.Transparent,
                        focusedTextColor = Color.White,
                        unfocusedTextColor = Color.White
                    )
                )
            }
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(vertical = 12.dp)
        ) {
            items(sortedStudents, key = { it.username }) { student ->
                val lastMsg = lastMessages[student.username]
                val lastMsgTime = (lastMsg?.timestamp as? com.google.firebase.Timestamp)?.seconds ?: 0L
                val lastReadTime = readChats[student.username] ?: 0L
                val hasNewMessage = lastMsg != null
                        && lastMsg.sender != loggedInUser
                        && lastMsgTime > lastReadTime

                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp, vertical = 4.dp)
                        .clickable {
                            val now = System.currentTimeMillis() / 1000
                            readChats[student.username] = now
                            db.collection("readChats")
                                .document(loggedInUser)
                                .collection("chats")
                                .document(student.username)
                                .set(mapOf("lastReadAt" to now))
                            onStudentSelected(student)
                        },
                    shape = RoundedCornerShape(16.dp),
                    color = Color.White,
                    shadowElevation = 1.dp
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box {
                            Surface(
                                modifier = Modifier.size(56.dp),
                                shape = CircleShape,
                                color = Color(0xFFF1F3F4)
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    when {
                                        !avatarUrls[student.username].isNullOrBlank() -> AsyncImage(
                                            model = avatarUrls[student.username],
                                            contentDescription = "Avatar",
                                            modifier = Modifier.fillMaxSize().clip(CircleShape),
                                            contentScale = ContentScale.Crop
                                        )
                                        else -> Text(
                                            student.name.take(1).uppercase(),
                                            fontWeight = FontWeight.Bold,
                                            color = Color.Gray
                                        )
                                    }
                                }
                            }
                            if (hasNewMessage) {
                                Surface(
                                    modifier = Modifier.size(14.dp).align(Alignment.TopEnd),
                                    shape = CircleShape,
                                    color = Color.Red,
                                    border = BorderStroke(2.dp, Color.White)
                                ) {}
                            }
                        }
                        Spacer(Modifier.width(16.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = student.name,
                                fontWeight = if (hasNewMessage) FontWeight.ExtraBold else FontWeight.Bold,
                                fontSize = 16.sp,
                                color = Color(0xFF1D1B20)
                            )
                            val displayPreview = when {
                                lastMsg == null -> "Start a conversation"
                                !lastMsg.imageUrl.isNullOrBlank() -> "📷 Sent a photo"
                                lastMsg.sender == loggedInUser -> "You: ${lastMsg.content}"
                                else -> lastMsg.content
                            }
                            Text(
                                text = displayPreview,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                style = MaterialTheme.typography.bodyMedium,
                                color = if (hasNewMessage) Color.Black else Color.Gray
                            )
                        }
                        if (lastMsg != null) {
                            val time = (lastMsg.timestamp as? com.google.firebase.Timestamp)?.toDate()
                                ?: java.util.Date()
                            Text(
                                text = SimpleDateFormat("h:mm a", Locale.getDefault()).format(time),
                                style = MaterialTheme.typography.labelSmall,
                                color = if (hasNewMessage) brandGreen else Color.LightGray
                            )
                        }
                    }
                }
            }
        }
    }
}

/* ---------------- MANAGE QUIZZES SCREEN ---------------- */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ManageQuizzesScreen(
    quizzes: MutableList<Quiz>,
    onBack: () -> Unit,
    onAddQuiz: (Quiz) -> Unit,
    onEditQuiz: (Quiz, Int) -> Unit,
    onDeleteQuiz: (Int) -> Unit
) {
    val db = FirebaseFirestore.getInstance()
    val context = LocalContext.current

    var showAddQuizScreen by remember { mutableStateOf(false) }
    var editingQuizIndex by remember { mutableStateOf(-1) }
    var showDeleteDialog by remember { mutableStateOf(false) }
    var quizToDelete by remember { mutableStateOf<Quiz?>(null) } // ✅ FIXED: store quiz object instead of index

    val headerStartColor = Color(0xFF2196F3)
    val headerEndColor = Color(0xFF1565C0)

    if (showAddQuizScreen) {
        AddOrEditQuizScreen(
            quizIndex = quizzes.size,
            onSave = { quiz ->
                val existingIndex = quizzes.indexOfFirst { it.id == quiz.id }
                if (existingIndex == -1) onAddQuiz(quiz)
                showAddQuizScreen = false
            },
            onCancel = { showAddQuizScreen = false }
        )
        return
    }

    if (editingQuizIndex != -1) {
        val quiz = quizzes[editingQuizIndex]
        AddOrEditQuizScreen(
            existingQuiz = quiz,
            quizIndex = editingQuizIndex,
            onSave = { updatedQuiz ->
                onEditQuiz(updatedQuiz, editingQuizIndex)
                editingQuizIndex = -1
            },
            onCancel = { editingQuizIndex = -1 }
        )
        return
    }

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
        Column(modifier = Modifier.fillMaxSize()) {

            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = headerStartColor,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onBack,
                            modifier = Modifier
                                .size(40.dp)
                                .background(Color.White.copy(0.2f), CircleShape)
                        ) {
                            Icon(Icons.Default.ArrowBack, "Back", tint = Color.White, modifier = Modifier.size(20.dp))
                        }

                        Spacer(Modifier.width(16.dp))

                        Column {
                            Text("Assessments", style = MaterialTheme.typography.labelLarge, color = Color.White.copy(0.8f))
                            Text(
                                "MANAGE QUIZZES",
                                style = MaterialTheme.typography.headlineSmall.copy(
                                    fontWeight = FontWeight.ExtraBold,
                                    letterSpacing = 1.sp
                                ),
                                color = Color.White
                            )
                        }

                        Spacer(Modifier.weight(1f))
                        Surface(
                            modifier = Modifier.size(52.dp),
                            shape = CircleShape,
                            color = Color.White.copy(alpha = 0.25f),
                            border = BorderStroke(1.dp, Color.White.copy(alpha = 0.4f))
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.Quiz,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(28.dp)
                                )
                            }
                        }
                    }
                }
            }

            if (quizzes.isEmpty()) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text("No quizzes created yet", color = Color.Gray)
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp, 24.dp, 16.dp, 100.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    items(quizzes.size) { index ->
                        val quiz = quizzes[index]
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(24.dp),
                            elevation = CardDefaults.cardElevation(2.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White)
                        ) {
                            Column(modifier = Modifier.padding(20.dp)) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.Top
                                ) {
                                    Column(modifier = Modifier.weight(1f)) {
                                        Surface(
                                            color = headerStartColor.copy(0.1f),
                                            shape = RoundedCornerShape(8.dp)
                                        ) {
                                            Text(
                                                "Quiz ${quiz.quizNumber}",
                                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                                style = MaterialTheme.typography.labelSmall,
                                                color = headerStartColor,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                        Spacer(Modifier.height(8.dp))
                                        Text(
                                            quiz.title,
                                            style = MaterialTheme.typography.titleLarge,
                                            fontWeight = FontWeight.ExtraBold,
                                            color = Color(0xFF2D3436)
                                        )
                                    }

                                    // ✅ FIXED: store quiz object on click
                                    IconButton(
                                        onClick = {
                                            quizToDelete = quiz
                                            showDeleteDialog = true
                                        },
                                        modifier = Modifier.background(Color(0xFFFFEBEE), CircleShape).size(36.dp)
                                    ) {
                                        Icon(Icons.Default.DeleteForever, null, tint = Color.Red, modifier = Modifier.size(20.dp))
                                    }
                                }

                                Row(
                                    modifier = Modifier.padding(vertical = 12.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(Icons.Default.Timer, null, tint = Color.Gray, modifier = Modifier.size(16.dp))
                                    Spacer(Modifier.width(4.dp))
                                    Text("${quiz.durationMinutes} mins", style = MaterialTheme.typography.bodySmall, color = Color.Gray)

                                    Spacer(Modifier.width(16.dp))

                                    Icon(Icons.Default.QuestionAnswer, null, tint = Color.Gray, modifier = Modifier.size(16.dp))
                                    Spacer(Modifier.width(4.dp))
                                    Text("${quiz.questions.size} Questions", style = MaterialTheme.typography.bodySmall, color = Color.Gray)
                                }

                                Divider(thickness = 0.5.dp, color = Color.LightGray.copy(0.5f))

                                Spacer(Modifier.height(12.dp))

                                Button(
                                    onClick = { editingQuizIndex = index },
                                    modifier = Modifier.fillMaxWidth(),
                                    shape = RoundedCornerShape(12.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = headerStartColor)
                                ) {
                                    Icon(Icons.Default.Edit, null, modifier = Modifier.size(18.dp))
                                    Spacer(Modifier.width(8.dp))
                                    Text("Edit Quiz Content", fontWeight = FontWeight.Bold)
                                }
                            }
                        }
                    }
                }
            }
        }

        FloatingActionButton(
            onClick = { showAddQuizScreen = true },
            containerColor = headerStartColor,
            contentColor = Color.White,
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(24.dp)
        ) {
            Row(Modifier.padding(horizontal = 16.dp), verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Default.Add, contentDescription = null)
                Spacer(Modifier.width(8.dp))
                Text("New Quiz", fontWeight = FontWeight.Bold)
            }
        }

        // ✅ FIXED: delete by quiz object, not by index
        if (showDeleteDialog && quizToDelete != null) {
            AlertDialog(
                onDismissRequest = {
                    showDeleteDialog = false
                    quizToDelete = null
                },
                title = { Text("Delete Quiz") },
                text = { Text("Permanently delete '${quizToDelete?.title}'? All associated questions and student results will be lost.") },
                confirmButton = {
                    TextButton(onClick = {
                        val quiz = quizToDelete!!
                        if (quiz.id.isNotBlank()) {
                            db.collection("quizzes").document(quiz.id).delete()
                                .addOnSuccessListener {
                                    val index = quizzes.indexOfFirst { it.id == quiz.id }
                                    if (index != -1) onDeleteQuiz(index)
                                    Toast.makeText(context, "Quiz removed", Toast.LENGTH_SHORT).show()
                                }
                        }
                        showDeleteDialog = false
                        quizToDelete = null
                    }) { Text("Confirm Delete", color = Color.Red) }
                },
                dismissButton = {
                    TextButton(onClick = {
                        showDeleteDialog = false
                        quizToDelete = null
                    }) { Text("Cancel") }
                }
            )
        }
    }
}
/* ---------------- ADD / EDIT QUIZ ---------------- */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddOrEditQuizScreen(
    existingQuiz: Quiz? = null,
    quizIndex: Int? = null,
    onSave: (Quiz) -> Unit,
    onCancel: () -> Unit
) {
    val db = FirebaseFirestore.getInstance()
    val context = LocalContext.current

    // --- QUIZ LEVEL STATE ---
    var title by remember { mutableStateOf(existingQuiz?.title ?: "") }
    var duration by remember { mutableStateOf(existingQuiz?.durationMinutes?.toString() ?: "") }
    val questions = remember {
        mutableStateListOf<Question>().apply {
            if (existingQuiz != null) addAll(existingQuiz.questions)
        }
    }

    // --- TEMPORARY INPUT STATE ---
    var questionText by remember { mutableStateOf("") }
    var questionType by remember { mutableStateOf(QuestionType.MULTIPLE_CHOICE) }
    var optionsText by remember { mutableStateOf("") }
    var correctAnswer by remember { mutableStateOf("") }
    var pointsText by remember { mutableStateOf("") }
    var possibleAnswersText by remember { mutableStateOf("") }

    // Consistent Indigo Theme
    val headerStartColor = Color(0xFF2196F3)
    val headerEndColor = Color(0xFF1565C0)

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            /* ---------------- MODERN GRADIENT HEADER ---------------- */
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = headerStartColor,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onCancel,
                            modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)
                        ) {
                            Icon(Icons.Default.ArrowBack, "Back", tint = Color.White)
                        }
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text(
                                if (existingQuiz == null) "New Assessment" else "Update Assessment",
                                style = MaterialTheme.typography.labelLarge,
                                color = Color.White.copy(0.8f)
                            )
                            Text(
                                if (existingQuiz == null) "CREATE QUIZ" else "EDIT QUIZ",
                                style = MaterialTheme.typography.headlineSmall.copy(
                                    fontWeight = FontWeight.ExtraBold,
                                    letterSpacing = 1.sp
                                ),
                                color = Color.White
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.height(24.dp))

            /* ---------------- SECTION: QUIZ CONFIGURATION ---------------- */
            Card(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Column(modifier = Modifier.padding(20.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
                    Text("General Settings", fontWeight = FontWeight.Bold, color = headerStartColor)

                    OutlinedTextField(
                        value = title,
                        onValueChange = { title = it },
                        label = { Text("Quiz Title") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp)
                    )

                    OutlinedTextField(
                        value = duration,
                        onValueChange = { duration = it },
                        label = { Text("Duration (minutes)") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        leadingIcon = { Icon(Icons.Default.Timer, null, tint = headerStartColor) }
                    )
                }
            }

            Spacer(Modifier.height(16.dp))

            /* ---------------- SECTION: QUESTION COMPOSER ---------------- */
            Card(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(2.dp),
                border = BorderStroke(1.dp, headerStartColor.copy(0.3f))
            ) {
                Column(modifier = Modifier.padding(20.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Default.AddCircle, contentDescription = null, tint = headerStartColor)
                        Spacer(Modifier.width(8.dp))
                        Text("Question Composer", fontWeight = FontWeight.Bold, color = headerStartColor)
                    }

                    OutlinedTextField(
                        value = questionText,
                        onValueChange = { questionText = it },
                        label = { Text("Enter Question") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp)
                    )

                    // Type Selector
                    Row(modifier = Modifier.fillMaxWidth().horizontalScroll(rememberScrollState())) {
                        QuestionType.values().forEach { type ->
                            FilterChip(
                                selected = (questionType == type),
                                onClick = { questionType = type },
                                label = { Text(type.name) },
                                modifier = Modifier.padding(end = 8.dp),
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = headerStartColor,
                                    selectedLabelColor = Color.White
                                )
                            )
                        }
                    }

                    // Dynamic Fields
                    when (questionType) {
                        QuestionType.MULTIPLE_CHOICE -> {
                            OutlinedTextField(value = optionsText, onValueChange = { optionsText = it }, label = { Text("Options (A, B, C, D)") }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp))
                            OutlinedTextField(value = correctAnswer, onValueChange = { correctAnswer = it }, label = { Text("Correct Answer") }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp))
                        }
                        QuestionType.IDENTIFICATION -> {
                            OutlinedTextField(value = correctAnswer, onValueChange = { correctAnswer = it }, label = { Text("Required Answer") }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp))
                            OutlinedTextField(value = possibleAnswersText, onValueChange = { possibleAnswersText = it }, label = { Text("Alternatives (comma separated)") }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp))
                        }
                        QuestionType.TRUE_FALSE -> {
                            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                                FilterChip(selected = correctAnswer == "True", onClick = { correctAnswer = "True" }, label = { Text("TRUE") })
                                Spacer(Modifier.width(16.dp))
                                FilterChip(selected = correctAnswer == "False", onClick = { correctAnswer = "False" }, label = { Text("FALSE") })
                            }
                        }
                        else -> {}
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        OutlinedTextField(
                            value = pointsText,
                            onValueChange = { pointsText = it },
                            label = { Text("Points") },
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(12.dp),
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                        )
                        Spacer(Modifier.width(12.dp))
                        Button(
                            onClick = {
                                if (questionText.isNotBlank()) {
                                    val newQuestion = Question(
                                        questionText = questionText,
                                        type = questionType,
                                        options = optionsText.split(",").map { it.trim() }.filter { it.isNotEmpty() },
                                        correctAnswer = correctAnswer.trim(),
                                        points = pointsText.toIntOrNull() ?: 0,
                                        possibleAnswers = possibleAnswersText.split(",").map { it.trim() }.filter { it.isNotEmpty() }
                                    )
                                    questions.add(newQuestion)
                                    questionText = ""; optionsText = ""; correctAnswer = ""; pointsText = ""; possibleAnswersText = ""
                                }
                            },
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50))
                        ) {
                            Text("Add Item")
                        }
                    }
                }
            }

            /* ---------------- SECTION: REVIEW QUESTIONS ---------------- */
            if (questions.isNotEmpty()) {
                Spacer(Modifier.height(16.dp))
                Text("Review Questions (${questions.size})", fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 24.dp), color = Color.Gray)

                questions.forEachIndexed { index, q ->
                    key(index, q.questionText) {
                        Card(
                            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 6.dp),
                            shape = RoundedCornerShape(16.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White)
                        ) {
                            Row(Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                                Surface(color = headerStartColor.copy(0.1f), shape = CircleShape, modifier = Modifier.size(32.dp)) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Text("${index + 1}", color = headerStartColor, fontWeight = FontWeight.Bold)
                                    }
                                }
                                Spacer(Modifier.width(12.dp))
                                Text(q.questionText, modifier = Modifier.weight(1f), style = MaterialTheme.typography.bodyMedium, maxLines = 1, overflow = TextOverflow.Ellipsis)
                                IconButton(onClick = { questions.removeAt(index) }) {
                                    Icon(Icons.Default.RemoveCircleOutline, contentDescription = "Remove", tint = Color.Red.copy(alpha = 0.6f))
                                }
                            }
                        }
                    }
                }
            }

            /* ---------------- ACTIONS: SAVE / CANCEL ---------------- */
            Row(
                modifier = Modifier.fillMaxWidth().padding(24.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                TextButton(onClick = onCancel, modifier = Modifier.weight(1f)) {
                    Text("Discard", color = Color.Gray)
                }

                Button(
                    modifier = Modifier.weight(1.5f),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = headerStartColor),
                    onClick = {
                        val dur = duration.toIntOrNull() ?: 0
                        if (title.isNotBlank() && dur > 0 && questions.isNotEmpty()) {
                            val idToUse = existingQuiz?.id?.ifBlank { null } ?: db.collection("quizzes").document().id
                            val quizToSave = Quiz(
                                id = idToUse,
                                quizNumber = existingQuiz?.quizNumber ?: (quizIndex?.plus(1) ?: 1),
                                title = title,
                                durationMinutes = dur,
                                questions = questions.toMutableList(),
                                submittedAnswersPerStudent = existingQuiz?.submittedAnswersPerStudent ?: emptyMap()
                            )

                            db.collection("quizzes").document(idToUse).set(quizToSave)
                                .addOnSuccessListener {
                                    Toast.makeText(context, "Quiz saved", Toast.LENGTH_SHORT).show()
                                    onSave(quizToSave)
                                }
                        }
                    }
                ) {
                    Text("Save Quiz", fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

/* ---------------- MANAGE MODULES SCREEN (FINAL FIX) ---------------- */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ManageModulesScreen(
    modules: SnapshotStateList<Module>,
    onBack: () -> Unit
) {
    var showAddModuleScreen by remember { mutableStateOf(false) }
    var editingIndex by remember { mutableStateOf(-1) }
    var moduleToDelete by remember { mutableStateOf<Module?>(null) }
    var isDeleting by remember { mutableStateOf(false) }
    var showPreviewDialog by remember { mutableStateOf(false) }
    var previewUri by remember { mutableStateOf<Uri?>(null) }

    val context = LocalContext.current
    val db = FirebaseFirestore.getInstance()
    val storage = FirebaseStorage.getInstance()

    val headerStartColor = Color(0xFFFFB300)
    val headerEndColor = Color(0xFFFFC107)

    if (showAddModuleScreen) {
        val nextNumber = if (modules.isEmpty()) 1 else (modules.maxOf { it.moduleNumber }) + 1
        AddOrEditModuleScreen(
            moduleNumber = nextNumber,
            onSave = { showAddModuleScreen = false },
            onCancel = { showAddModuleScreen = false }
        )
        return
    }

    if (editingIndex != -1) {
        val moduleToEdit = modules.getOrNull(editingIndex)
        if (moduleToEdit != null) {
            AddOrEditModuleScreen(
                existingModule = moduleToEdit,
                onSave = { editingIndex = -1 },
                onCancel = { editingIndex = -1 }
            )
            return
        }
    }

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
        Column(modifier = Modifier.fillMaxSize()) {
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = headerStartColor,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onBack,
                            modifier = Modifier.size(40.dp).background(Color.White.copy(0.2f), CircleShape)
                        ) { Icon(Icons.Default.ArrowBack, "Back", tint = Color.White, modifier = Modifier.size(20.dp)) }
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text("Curriculum", style = MaterialTheme.typography.labelLarge, color = Color.White.copy(0.8f))
                            Text("MANAGE MODULES", style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.ExtraBold, letterSpacing = 1.sp), color = Color.White)
                        }
                        Spacer(Modifier.weight(1f))
                        Surface(modifier = Modifier.size(52.dp), shape = CircleShape, color = Color.White.copy(0.25f), border = BorderStroke(1.dp, Color.White.copy(0.4f))) {
                            Box(contentAlignment = Alignment.Center) { Icon(Icons.Default.MenuBook, null, tint = Color.White, modifier = Modifier.size(28.dp)) }
                        }
                    }
                }
            }

            if (modules.isEmpty()) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text("No modules uploaded yet", color = Color.Gray)
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp, 12.dp, 16.dp, 100.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    items(
                        items = modules.sortedBy { it.moduleNumber },
                        key = { it.id.ifEmpty { "temp_${it.moduleNumber}_${it.title.hashCode()}" } }
                    ) { module ->
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(20.dp),
                            elevation = CardDefaults.cardElevation(2.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White)
                        ) {
                            Column(Modifier.padding(20.dp)) {
                                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                                    Surface(color = headerStartColor.copy(0.1f), shape = CircleShape) {
                                        Text(
                                            "Module ${module.moduleNumber}",
                                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                                            style = MaterialTheme.typography.labelLarge,
                                            color = headerStartColor,
                                            fontWeight = FontWeight.Bold
                                        )
                                    }
                                    IconButton(
                                        onClick = { moduleToDelete = module },
                                        modifier = Modifier.size(32.dp),
                                        enabled = !isDeleting
                                    ) {
                                        Icon(Icons.Default.Delete, null, tint = Color.Red.copy(0.7f), modifier = Modifier.size(20.dp))
                                    }
                                }
                                Spacer(Modifier.height(12.dp))
                                Text(module.title, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold, color = Color(0xFF2D3436))
                                Text(module.description, style = MaterialTheme.typography.bodyMedium, color = Color.Gray, modifier = Modifier.padding(vertical = 4.dp))
                                HorizontalDivider(Modifier.padding(vertical = 12.dp), thickness = 0.5.dp, color = Color.LightGray.copy(0.5f))
                                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                                    Button(
                                        onClick = {
                                            if (!module.fileUri.isNullOrEmpty()) {
                                                previewUri = Uri.parse(module.fileUri)
                                                showPreviewDialog = true
                                            }
                                        },
                                        modifier = Modifier.weight(1f),
                                        colors = ButtonDefaults.buttonColors(containerColor = headerStartColor),
                                        shape = RoundedCornerShape(12.dp),
                                        enabled = !module.fileUri.isNullOrEmpty()
                                    ) {
                                        Icon(Icons.Default.Visibility, null, modifier = Modifier.size(16.dp))
                                        Spacer(Modifier.width(8.dp))
                                        Text("Open")
                                    }
                                    OutlinedButton(
                                        onClick = { editingIndex = modules.indexOf(module) },
                                        modifier = Modifier.weight(1f),
                                        shape = RoundedCornerShape(12.dp),
                                        border = BorderStroke(1.5.dp, headerStartColor.copy(0.5f))
                                    ) {
                                        Icon(Icons.Default.Edit, null, modifier = Modifier.size(16.dp), tint = headerStartColor)
                                        Spacer(Modifier.width(8.dp))
                                        Text("Edit", color = headerStartColor)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        FloatingActionButton(
            onClick = { showAddModuleScreen = true },
            containerColor = headerStartColor,
            contentColor = Color.White,
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.align(Alignment.BottomEnd).padding(24.dp)
        ) {
            Row(Modifier.padding(horizontal = 16.dp), verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Default.Add, null)
                Spacer(Modifier.width(8.dp))
                Text("Add Module", fontWeight = FontWeight.Bold)
            }
        }

        if (moduleToDelete != null) {
            AlertDialog(
                onDismissRequest = { if (!isDeleting) moduleToDelete = null },
                title = { Text(if (isDeleting) "Deleting..." else "Delete Module") },
                text = {
                    if (isDeleting) {
                        Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                            CircularProgressIndicator(color = headerStartColor)
                        }
                    } else {
                        Text("Are you sure you want to delete '${moduleToDelete?.title}'? This will remove the module and its associated cloud file.")
                    }
                },
                confirmButton = {
                    if (!isDeleting) {
                        Button(
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                            onClick = {
                                isDeleting = true
                                val m = moduleToDelete!!
                                db.collection("modules").document(m.id).delete()
                                    .addOnSuccessListener {
                                        // ✅ ADDED: Renumber remaining modules after delete
                                        val remaining = modules
                                            .filter { it.id != m.id }
                                            .sortedBy { it.moduleNumber }

                                        remaining.forEachIndexed { index, module ->
                                            db.collection("modules")
                                                .document(module.id)
                                                .update("moduleNumber", index + 1)
                                        }

                                        if (!m.fileUri.isNullOrEmpty()) {
                                            storage.getReferenceFromUrl(m.fileUri).delete()
                                                .addOnCompleteListener {
                                                    isDeleting = false
                                                    moduleToDelete = null
                                                }
                                        } else {
                                            isDeleting = false
                                            moduleToDelete = null
                                        }
                                    }
                                    .addOnFailureListener {
                                        isDeleting = false
                                        moduleToDelete = null
                                        Toast.makeText(context, "Delete failed", Toast.LENGTH_SHORT).show()
                                    }
                            }
                        ) { Text("Confirm", color = Color.White) }
                    }
                },
                dismissButton = {
                    if (!isDeleting) {
                        TextButton(onClick = { moduleToDelete = null }) { Text("Cancel") }
                    }
                }
            )
        }

        if (showPreviewDialog && previewUri != null) {
            FilePreviewDialog(uri = previewUri!!) { showPreviewDialog = false }
        }
    }
}

@Composable
fun FilePreviewDialog(uri: Uri, onDismiss: () -> Unit) {
    val context = LocalContext.current
    var localFile by remember { mutableStateOf<File?>(null) }
    var mimeType by remember { mutableStateOf<String?>(null) }
    var loading by remember { mutableStateOf(true) }
    var pdfRenderer by remember { mutableStateOf<PdfRenderer?>(null) }
    var currentPage by remember { mutableStateOf(0) }
    var totalPages by remember { mutableStateOf(0) }

    var scale by remember { mutableStateOf(1f) }
    var offsetX by remember { mutableStateOf(0f) }
    var offsetY by remember { mutableStateOf(0f) }

    // ✅ ExoPlayer for video
    val exoPlayer = remember { ExoPlayer.Builder(context).build() }

    LaunchedEffect(uri) {
        withContext(Dispatchers.IO) {
            try {
                val ref = FirebaseStorage.getInstance().getReferenceFromUrl(uri.toString())
                val metadata = ref.metadata.await()
                val type = metadata.contentType ?: "application/octet-stream"
                val ext = MimeTypeMap.getSingleton().getExtensionFromMimeType(type) ?: "bin"
                val file = File(context.cacheDir, "pv_${System.currentTimeMillis()}.$ext")
                ref.getFile(file).await()

                if (type == "application/pdf") {
                    val fd = ParcelFileDescriptor.open(file, ParcelFileDescriptor.MODE_READ_ONLY)
                    pdfRenderer = PdfRenderer(fd)
                    totalPages = pdfRenderer!!.pageCount
                }

                withContext(Dispatchers.Main) {
                    localFile = file
                    mimeType = type
                    loading = false

                    if (type.startsWith("video/")) {
                        val mediaItem = MediaItem.fromUri(file.toUri())
                        exoPlayer.setMediaItem(mediaItem)
                        exoPlayer.prepare()
                        exoPlayer.playWhenReady = true
                    }
                }
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    Toast.makeText(context, "Error loading file", Toast.LENGTH_SHORT).show()
                    onDismiss()
                }
            }
        }
    }

    LaunchedEffect(currentPage) {
        scale = 1f
        offsetX = 0f
        offsetY = 0f
    }

    DisposableEffect(Unit) {
        onDispose {
            pdfRenderer?.close()
            localFile?.delete()
            exoPlayer.release()
        }
    }

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            modifier = Modifier.fillMaxWidth().wrapContentHeight(),
            shape = RoundedCornerShape(16.dp),
            color = Color.White
        ) {
            Box(modifier = Modifier.padding(16.dp), contentAlignment = Alignment.Center) {
                when {
                    loading -> CircularProgressIndicator(color = Color(0xFF1976D2))

                    // ✅ PDF with zoom & pan
                    pdfRenderer != null -> {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            val bitmap = remember(currentPage) {
                                val page = pdfRenderer!!.openPage(currentPage)
                                val bmap = Bitmap.createBitmap(page.width, page.height, Bitmap.Config.ARGB_8888)
                                page.render(bmap, null, null, PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY)
                                page.close()
                                bmap.asImageBitmap()
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .heightIn(max = 450.dp)
                                    .clip(RoundedCornerShape(8.dp))
                                    .pointerInput(Unit) {
                                        detectTransformGestures { _, pan, zoom, _ ->
                                            scale = (scale * zoom).coerceIn(1f, 5f)
                                            if (scale > 1f) {
                                                offsetX += pan.x
                                                offsetY += pan.y
                                            } else {
                                                offsetX = 0f
                                                offsetY = 0f
                                            }
                                        }
                                    }
                                    .pointerInput(Unit) {
                                        detectTapGestures(onDoubleTap = {
                                            scale = 1f
                                            offsetX = 0f
                                            offsetY = 0f
                                        })
                                    }
                            ) {
                                Image(
                                    bitmap = bitmap,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .graphicsLayer(
                                            scaleX = scale,
                                            scaleY = scale,
                                            translationX = offsetX,
                                            translationY = offsetY
                                        ),
                                    contentScale = ContentScale.Fit
                                )
                            }

                            HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp), color = Color.LightGray)

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                TextButton(
                                    onClick = { if (currentPage > 0) currentPage-- },
                                    enabled = currentPage > 0
                                ) {
                                    Icon(Icons.Default.ChevronLeft, null, tint = Color(0xFF1976D2))
                                    Text("Prev", color = Color(0xFF1976D2))
                                }
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text("${currentPage + 1} / $totalPages", color = Color.Black, fontWeight = FontWeight.Bold)
                                    if (scale > 1f) {
                                        Text("Double tap to reset", style = MaterialTheme.typography.labelSmall, color = Color.Gray)
                                    }
                                }
                                TextButton(
                                    onClick = { if (currentPage < totalPages - 1) currentPage++ },
                                    enabled = currentPage < totalPages - 1
                                ) {
                                    Text("Next", color = Color(0xFF1976D2))
                                    Icon(Icons.Default.ChevronRight, null, tint = Color(0xFF1976D2))
                                }
                            }
                        }
                    }

                    // ✅ IMAGE with zoom & pan
                    mimeType?.startsWith("image/") == true -> {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .heightIn(max = 400.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .pointerInput(Unit) {
                                    detectTransformGestures { _, pan, zoom, _ ->
                                        scale = (scale * zoom).coerceIn(1f, 5f)
                                        if (scale > 1f) {
                                            offsetX += pan.x
                                            offsetY += pan.y
                                        } else {
                                            offsetX = 0f
                                            offsetY = 0f
                                        }
                                    }
                                }
                                .pointerInput(Unit) {
                                    detectTapGestures(onDoubleTap = {
                                        scale = 1f
                                        offsetX = 0f
                                        offsetY = 0f
                                    })
                                }
                        ) {
                            Image(
                                painter = rememberAsyncImagePainter(localFile),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .graphicsLayer(
                                        scaleX = scale,
                                        scaleY = scale,
                                        translationX = offsetX,
                                        translationY = offsetY
                                    ),
                                contentScale = ContentScale.Fit
                            )
                        }
                        if (scale > 1f) {
                            Text("Double tap to reset", style = MaterialTheme.typography.labelSmall, color = Color.Gray, modifier = Modifier.padding(top = 4.dp))
                        }
                    }

                    // ✅ VIDEO with ExoPlayer
                    mimeType?.startsWith("video/") == true -> {
                        AndroidView(
                            factory = { ctx ->
                                PlayerView(ctx).apply {
                                    player = exoPlayer
                                    useController = true
                                }
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(300.dp)
                                .clip(RoundedCornerShape(8.dp))
                        )
                    }

                    // ✅ UNSUPPORTED
                    else -> Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(24.dp)
                    ) {
                        Icon(Icons.Default.InsertDriveFile, null, tint = Color.Gray, modifier = Modifier.size(64.dp))
                        Spacer(Modifier.height(12.dp))
                        Text("Preview not supported", color = Color.Gray)
                    }
                }

                IconButton(onClick = onDismiss, modifier = Modifier.align(Alignment.TopEnd)) {
                    Icon(Icons.Default.Close, null, tint = Color.Black)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddOrEditModuleScreen(
    existingModule: Module? = null,
    moduleNumber: Int = 1,
    onSave: () -> Unit,
    onCancel: () -> Unit
) {
    val scrollState = rememberScrollState()
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

    // --- State Management ---
    var title by remember { mutableStateOf(existingModule?.title ?: "") }
    var description by remember { mutableStateOf(existingModule?.description ?: "") }
    var localFileUri by remember { mutableStateOf<Uri?>(null) }

    // Dialog & Progress State
    var isUploading by remember { mutableStateOf(false) }
    var uploadStatus by remember { mutableStateOf("") }
    var uploadProgress by remember { mutableStateOf(0f) }
    var showUploadPrompt by remember { mutableStateOf(false) }

    val db = FirebaseFirestore.getInstance()
    val storageRef = FirebaseStorage.getInstance().reference
    val modulesCollection = db.collection("modules")

    val headerStartColor = Color(0xFFFFB300)
    val headerEndColor = Color(0xFFFFC107)

    val fileLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri -> if (uri != null) localFileUri = uri }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) }
    ) { paddingValues ->
        Box(modifier = Modifier.fillMaxSize().padding(paddingValues)) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF0F2F5))
                    .verticalScroll(scrollState)
            ) {
                /* --- HEADER --- */
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = headerStartColor,
                    shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                    shadowElevation = 8.dp
                ) {
                    Column(
                        modifier = Modifier
                            .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                            .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            IconButton(
                                onClick = { if (!isUploading) onCancel() },
                                modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)
                            ) {
                                Icon(Icons.Default.ArrowBack, "Back", tint = Color.White)
                            }
                            Spacer(Modifier.width(16.dp))
                            Column {
                                Text(
                                    if (existingModule == null) "New Curriculum" else "Update Curriculum",
                                    style = MaterialTheme.typography.labelLarge, color = Color.White.copy(0.8f)
                                )
                                Text(
                                    if (existingModule == null) "ADD MODULE" else "EDIT MODULE",
                                    style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.ExtraBold, letterSpacing = 1.sp),
                                    color = Color.White
                                )
                            }
                        }
                    }
                }

                Spacer(Modifier.height(24.dp))

                /* --- FORM CARD --- */
                Card(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                    shape = RoundedCornerShape(24.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column(modifier = Modifier.padding(20.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
                        Text("Module Details", fontWeight = FontWeight.Bold, color = headerStartColor)
                        OutlinedTextField(
                            value = title,
                            onValueChange = { title = it },
                            label = { Text("Module Title") },
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(12.dp),
                            enabled = !isUploading
                        )
                        OutlinedTextField(
                            value = description,
                            onValueChange = { description = it },
                            label = { Text("Description") },
                            modifier = Modifier.fillMaxWidth(),
                            minLines = 3,
                            shape = RoundedCornerShape(12.dp),
                            enabled = !isUploading
                        )
                    }
                }

                Spacer(Modifier.height(16.dp))

                /* --- FILE CARD --- */
                Card(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                    shape = RoundedCornerShape(24.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Text("Learning Materials", fontWeight = FontWeight.Bold, color = headerStartColor)
                        Spacer(Modifier.height(16.dp))

                        val hasFile = localFileUri != null || (existingModule?.fileUri?.isNotBlank() == true)
                        if (hasFile) {
                            Surface(
                                modifier = Modifier.fillMaxWidth(),
                                color = headerStartColor.copy(0.05f),
                                shape = RoundedCornerShape(12.dp),
                                border = BorderStroke(1.dp, headerStartColor.copy(0.2f))
                            ) {
                                Row(modifier = Modifier.padding(12.dp), verticalAlignment = Alignment.CenterVertically) {
                                    Icon(Icons.Default.Description, null, tint = headerStartColor)
                                    Spacer(Modifier.width(12.dp))
                                    Column(modifier = Modifier.weight(1f)) {
                                        val displayName = localFileUri?.lastPathSegment ?: "Current Module File"
                                        Text(displayName, style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.SemiBold, maxLines = 1, overflow = TextOverflow.Ellipsis)
                                        Text(if (localFileUri != null) "Local file selected" else "File stored in cloud", style = MaterialTheme.typography.labelSmall, color = Color.Gray)
                                    }
                                    IconButton(onClick = { showUploadPrompt = true }, enabled = !isUploading) {
                                        Icon(Icons.Default.Edit, "Change", tint = headerStartColor)
                                    }
                                }
                            }
                        } else {
                            Button(
                                onClick = { showUploadPrompt = true },
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(12.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = headerStartColor.copy(0.1f)),
                                enabled = !isUploading
                            ) {
                                Icon(Icons.Default.CloudUpload, null, tint = headerStartColor)
                                Spacer(Modifier.width(8.dp))
                                Text("Add Material", color = headerStartColor)
                            }
                        }
                    }
                }

                /* --- ACTION BUTTONS --- */
                Row(
                    modifier = Modifier.fillMaxWidth().padding(24.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    TextButton(onClick = onCancel, modifier = Modifier.weight(1f), enabled = !isUploading) {
                        Text("Cancel", color = Color.Gray)
                    }

                    Button(
                        modifier = Modifier.weight(1.5f),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = headerStartColor),
                        enabled = !isUploading && title.isNotBlank(),
                        onClick = {
                            isUploading = true
                            scope.launch {
                                try {
                                    var finalFileUri = existingModule?.fileUri ?: ""

                                    // 1. Storage Upload
                                    localFileUri?.let { uri ->
                                        uploadStatus = "Preparing upload..."
                                        val fileName = "modules/${System.currentTimeMillis()}"
                                        val fileRef = storageRef.child(fileName)
                                        val uploadTask = fileRef.putFile(uri)

                                        uploadTask.addOnProgressListener { snapshot ->
                                            val progress = (100.0 * snapshot.bytesTransferred / snapshot.totalByteCount)
                                            uploadProgress = (progress / 100.0).toFloat()
                                            uploadStatus = "Uploading File: ${progress.toInt()}%"
                                        }.await()

                                        finalFileUri = fileRef.downloadUrl.await().toString()
                                    }

                                    // 2. Database Save (FIXED LOGIC)
                                    uploadStatus = "Saving Module Details..."
                                    uploadProgress = 1f

                                    // PRE-GENERATE THE ID IF NEW
                                    val docRef = if (existingModule == null) {
                                        modulesCollection.document()
                                    } else {
                                        modulesCollection.document(existingModule.id)
                                    }

                                    val finalModule = Module(
                                        id = docRef.id, // SET THE ID PROPERTY HERE
                                        moduleNumber = existingModule?.moduleNumber ?: moduleNumber,
                                        title = title,
                                        description = description,
                                        fileUri = finalFileUri,
                                        totalLessons = existingModule?.totalLessons ?: 0,
                                        completedLessons = existingModule?.completedLessons ?: 0,
                                        completedLessonsPerStudent = existingModule?.completedLessonsPerStudent ?: emptyMap()
                                    )

                                    docRef.set(finalModule).await()

                                    uploadStatus = "Success!"
                                    kotlinx.coroutines.delay(800)
                                    onSave()
                                } catch (e: Exception) {
                                    isUploading = false
                                    snackbarHostState.showSnackbar("Error: ${e.localizedMessage}")
                                }
                            }
                        }
                    ) {
                        Text(if (existingModule == null) "Create Module" else "Save Changes", fontWeight = FontWeight.Bold)
                    }
                }
            }

            /* --- UPLOAD PROMPT DIALOG --- */
            if (showUploadPrompt) {
                AlertDialog(
                    onDismissRequest = { showUploadPrompt = false },
                    title = { Text("Upload File") },
                    text = { Text("Would you like to select a document or media file from your device for this module?") },
                    confirmButton = {
                        Button(
                            colors = ButtonDefaults.buttonColors(containerColor = headerStartColor),
                            onClick = {
                                showUploadPrompt = false
                                fileLauncher.launch("*/*")
                            }
                        ) { Text("Select File") }
                    },
                    dismissButton = {
                        TextButton(onClick = { showUploadPrompt = false }) { Text("Cancel") }
                    }
                )
            }

            /* --- PROGRESS DIALOG --- */
            if (isUploading) {
                Dialog(onDismissRequest = { }) {
                    Surface(
                        modifier = Modifier.width(300.dp),
                        shape = RoundedCornerShape(28.dp),
                        color = Color.White
                    ) {
                        Column(
                            modifier = Modifier.padding(28.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            CircularProgressIndicator(
                                progress = uploadProgress,
                                color = headerStartColor,
                                strokeWidth = 6.dp,
                                modifier = Modifier.size(80.dp)
                            )
                            Spacer(Modifier.height(24.dp))
                            Text(uploadStatus, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdminReportsScreen(
    students: List<Student>,
    modules: List<Module>,
    quizzes: List<Quiz>,
    activities: List<ActivityItem>,
    summatives: List<SummativeAssessment>,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val baseColor = Color(0xFF3949AB)
    val headerEndColor = Color(0xFF5C6BC0)

    fun computeModuleProgressPercentFor(student: Student): Float {
        val valid = modules.filter { it.totalLessons > 0 }
        if (valid.isEmpty()) return 0f
        val sum = valid.sumOf { it.completedLessonsPerStudent[student.uid] ?: 0 }
        val total = valid.sumOf { it.totalLessons }
        return if (total == 0) 0f else sum.toFloat() / total.toFloat()
    }

    fun computeQuizScorePercentFor(student: Student): Float {
        var totalPoints = 0
        var earned = 0
        quizzes.forEach { q ->
            totalPoints += q.questions.sumOf { it.points ?: 0 }
            val submitted = q.submittedAnswersPerStudent[student.uid]
            if (!submitted.isNullOrEmpty()) {
                q.questions.forEachIndexed { idx, question ->
                    val studentAns = submitted.getOrNull(idx)?.trim()?.lowercase()
                    val correctAns = question.correctAnswer?.trim()?.lowercase()
                    if (studentAns != null && studentAns == correctAns) {
                        earned += question.points ?: 0
                    }
                }
            }
        }
        return if (totalPoints == 0) 0f else earned.toFloat() / totalPoints.toFloat()
    }

    fun computeActivityCompletionPercentFor(student: Student): Float {
        if (activities.isEmpty()) return 0f
        val completed = activities.count { it.submittedByStudentIds.contains(student.uid) }
        return completed.toFloat() / activities.size.toFloat()
    }

    fun computeSummativeScorePercentFor(student: Student): Float {
        var totalPoints = 0
        var earned = 0
        summatives.forEach { s ->
            totalPoints += s.questions.sumOf { it.points ?: 0 }
            val submitted = s.submittedAnswersPerStudent[student.uid]
            if (!submitted.isNullOrEmpty()) {
                s.questions.forEachIndexed { idx, q ->
                    val studentAns = submitted.getOrNull(idx)?.trim()?.lowercase()
                    val correctAns = q.correctAnswer?.trim()?.lowercase()
                    if (studentAns != null && studentAns == correctAns) {
                        earned += q.points ?: 0
                    }
                }
            }
        }
        return if (totalPoints == 0) 0f else earned.toFloat() / totalPoints.toFloat()
    }

    // ✅ FIXED: Filter by uid only — no status check
    val validStudents by remember(students) {
        derivedStateOf {
            students.filter { it.uid.isNotBlank() }
        }
    }

    val reportRows by remember(validStudents, modules, quizzes, activities, summatives) {
        derivedStateOf {
            validStudents.map { s ->
                val m = (computeModuleProgressPercentFor(s) * 100).roundToInt()
                val q = (computeQuizScorePercentFor(s) * 100).roundToInt()
                val a = (computeActivityCompletionPercentFor(s) * 100).roundToInt()
                val su = (computeSummativeScorePercentFor(s) * 100).roundToInt()
                val o = (m + q + a + su) / 4
                StudentReportRow(s, m, q, a, su, o)
            }
        }
    }

    var selectedStudent by remember { mutableStateOf<StudentReportRow?>(null) }
    var showIndividualDialog by remember { mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
        Column(modifier = Modifier.fillMaxSize()) {

            // --- HEADER ---
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = baseColor,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(baseColor, headerEndColor)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onBack,
                            modifier = Modifier.size(40.dp).background(Color.White.copy(0.2f), CircleShape)
                        ) {
                            Icon(Icons.Default.ArrowBack, "Back", tint = Color.White, modifier = Modifier.size(20.dp))
                        }
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text("Analytics Dashboard", style = MaterialTheme.typography.labelLarge, color = Color.White.copy(0.8f))
                            Text(
                                "STUDENT REPORTS",
                                style = MaterialTheme.typography.headlineSmall.copy(
                                    fontWeight = FontWeight.ExtraBold,
                                    letterSpacing = 1.sp
                                ),
                                color = Color.White
                            )
                        }
                        Spacer(Modifier.weight(1f))
                        Surface(
                            modifier = Modifier.size(52.dp),
                            shape = CircleShape,
                            color = Color.White.copy(alpha = 0.25f),
                            border = BorderStroke(1.dp, Color.White.copy(alpha = 0.4f))
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.Assessment,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(28.dp)
                                )
                            }
                        }
                    }
                }
            }

            Column(
                modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(16.dp)
            ) {
                val avgOverall = if (reportRows.isEmpty()) 0 else reportRows.map { it.overallPercent }.average().roundToInt()
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    SummaryCard("Students", "${validStudents.size}", Icons.Default.People, baseColor, Modifier.weight(1f))
                    SummaryCard("Avg Score", "$avgOverall%", Icons.Default.Insights, Color(0xFF4CAF50), Modifier.weight(1f))
                }

                Spacer(modifier = Modifier.height(24.dp))
                Text("Performance Ranking", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(12.dp))

                if (reportRows.isEmpty()) {
                    Box(
                        modifier = Modifier.fillMaxWidth().padding(top = 48.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                Icons.Default.People,
                                null,
                                modifier = Modifier.size(64.dp),
                                tint = Color.Gray.copy(0.3f)
                            )
                            Spacer(Modifier.height(16.dp))
                            Text("No students found.", color = Color.Gray)
                        }
                    }
                }

                reportRows.sortedByDescending { it.overallPercent }.forEach { row ->
                    Card(
                        modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp).clickable {
                            selectedStudent = row
                            showIndividualDialog = true
                        },
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        elevation = CardDefaults.cardElevation(2.dp)
                    ) {
                        Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                            Surface(modifier = Modifier.size(40.dp), shape = CircleShape, color = baseColor.copy(0.1f)) {
                                Box(contentAlignment = Alignment.Center) {
                                    Text(row.student.name.take(1), fontWeight = FontWeight.Bold, color = baseColor)
                                }
                            }
                            Column(modifier = Modifier.padding(start = 12.dp).weight(1f)) {
                                Text(row.student.name, fontWeight = FontWeight.Bold)
                                Text("Click for details", style = MaterialTheme.typography.labelSmall, color = Color.Gray)
                            }
                            Surface(
                                shape = RoundedCornerShape(8.dp),
                                color = if (row.overallPercent >= 75) Color(0xFFE8F5E9) else Color(0xFFFFEBEE)
                            ) {
                                Text(
                                    "${row.overallPercent}%",
                                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
                                    fontWeight = FontWeight.ExtraBold,
                                    color = if (row.overallPercent >= 75) Color(0xFF2E7D32) else Color(0xFFC62828)
                                )
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(100.dp))
            }
        }

        // Export button
        Surface(modifier = Modifier.align(Alignment.BottomCenter), shadowElevation = 16.dp, color = Color.White) {
            Button(
                onClick = { generateReportText(context, reportRows) },
                modifier = Modifier.fillMaxWidth().padding(20.dp).height(56.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = baseColor)
            ) {
                Icon(Icons.Default.Download, null)
                Spacer(Modifier.width(8.dp))
                Text("Export All Data (TXT)", fontWeight = FontWeight.Bold)
            }
        }
    }

    // --- INDIVIDUAL STUDENT DIALOG ---
    if (showIndividualDialog && selectedStudent != null) {
        val r = selectedStudent!!
        AlertDialog(
            onDismissRequest = { showIndividualDialog = false },
            properties = DialogProperties(usePlatformDefaultWidth = false),
            modifier = Modifier.padding(24.dp),
            content = {
                Surface(shape = RoundedCornerShape(28.dp), color = Color.White) {
                    Column(modifier = Modifier.padding(24.dp)) {
                        Text(r.student.name, style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(20.dp))

                        val stats = listOf(
                            Triple("Modules", r.modulesPercent, baseColor),
                            Triple("Quizzes", r.quizzesPercent, Color(0xFF009688)),
                            Triple("Activities", r.activitiesPercent, Color(0xFF4CAF50)),
                            Triple("Summative", r.summativesPercent, Color(0xFFFF5722))
                        )

                        stats.forEach { (label, percent, color) ->
                            Column(modifier = Modifier.padding(vertical = 8.dp)) {
                                Row {
                                    Text(label, modifier = Modifier.weight(1f))
                                    Text("$percent%", fontWeight = FontWeight.Bold, color = color)
                                }
                                LinearProgressIndicator(
                                    progress = { percent / 100f },
                                    modifier = Modifier.fillMaxWidth().height(8.dp).clip(CircleShape),
                                    color = color,
                                    trackColor = color.copy(0.1f)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(24.dp))
                        Button(
                            onClick = { showIndividualDialog = false },
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = baseColor)
                        ) {
                            Text("Dismiss")
                        }
                    }
                }
            }
        )
    }
}

@Composable
private fun SummaryCard(title: String, value: String, icon: ImageVector, color: Color, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
            Surface(modifier = Modifier.size(40.dp), shape = RoundedCornerShape(12.dp), color = color.copy(0.1f)) {
                Icon(icon, null, tint = color, modifier = Modifier.padding(8.dp))
            }
            Column(modifier = Modifier.padding(start = 12.dp)) {
                Text(title, style = MaterialTheme.typography.labelSmall, color = Color.Gray)
                Text(value, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.ExtraBold)
            }
        }
    }
}

private fun generateReportText(context: android.content.Context, reportRows: List<StudentReportRow>) {
    try {
        val timestamp = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Date())
        val content = buildString {
            appendLine("STUDENT PROGRESS REPORTS")
            appendLine("Generated: ${SimpleDateFormat("MMM dd, yyyy HH:mm", Locale.getDefault()).format(Date())}")
            appendLine("=".repeat(50))
            appendLine()

            reportRows.sortedByDescending { it.overallPercent }.forEach { r ->
                appendLine("Student: ${r.student.name}")
                appendLine("Overall Score: ${r.overallPercent}%")
                appendLine("  - Modules: ${r.modulesPercent}%")
                appendLine("  - Quizzes: ${r.quizzesPercent}%")
                appendLine("  - Activities: ${r.activitiesPercent}%")
                appendLine("  - Summatives: ${r.summativesPercent}%")
                appendLine("-".repeat(50))
            }

            appendLine()
            appendLine("SUMMARY")
            appendLine("Total Students: ${reportRows.size}")
            appendLine("Average Overall: ${reportRows.map { it.overallPercent }.average().roundToInt()}%")
        }

        val fileName = "StudentReports_$timestamp.txt"
        saveTextToDownloads(context, fileName, content)
        Toast.makeText(context, "Report saved to Downloads/$fileName", Toast.LENGTH_LONG).show()

    } catch (e: Exception) {
        Log.e("REPORTS", "Export error: ${e.message}")
        Toast.makeText(context, "Export failed: ${e.message}", Toast.LENGTH_LONG).show()
    }
}

    // ------------------- ACTIVITIES SCREEN -------------------
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun ActivitiesScreen(
        activities: List<ActivityItem>,
        onBack: () -> Unit,
        onViewActivity: (ActivityItem) -> Unit
    ) {
        val headerStartColor = Color(0xFF00796B)
        val headerEndColor = Color(0xFF009688)

        val context = LocalContext.current
        val uid = Firebase.auth.currentUser?.uid ?: "unknown"

        val submissions = remember(activities) {
            activities.associate { activity ->
                activity.id to activity.submittedByStudentIds.contains(uid)
            }
        }

        Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
            Column(modifier = Modifier.fillMaxSize()) {

                // --- HEADER ---
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = headerStartColor,
                    shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                    shadowElevation = 8.dp
                ) {
                    Column(
                        modifier = Modifier
                            .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                            .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            IconButton(
                                onClick = onBack,
                                modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)
                            ) {
                                Icon(Icons.Default.ArrowBack, "Back", tint = Color.White)
                            }
                            Spacer(Modifier.width(16.dp))
                            Column {
                                Text(
                                    "Learning Path",
                                    style = MaterialTheme.typography.labelLarge,
                                    color = Color.White.copy(0.7f)
                                )
                                Text(
                                    "ACTIVITIES",
                                    style = MaterialTheme.typography.headlineSmall.copy(
                                        fontWeight = FontWeight.ExtraBold,
                                        letterSpacing = 1.sp
                                    ),
                                    color = Color.White
                                )
                            }

                            // ✅ ADDED: CONSISTENT PREMIUM GLASS LOGO
                            Spacer(Modifier.weight(1f))
                            Surface(
                                modifier = Modifier.size(52.dp),
                                shape = CircleShape,
                                color = Color.White.copy(alpha = 0.25f),
                                border = BorderStroke(1.dp, Color.White.copy(alpha = 0.4f))
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Icon(
                                        imageVector = Icons.Default.Assignment,
                                        contentDescription = null,
                                        tint = Color.White,
                                        modifier = Modifier.size(28.dp)
                                    )
                                }
                            }
                        }
                    }
                }

                // --- CONTENT (Logic Untouched) ---
                if (activities.isEmpty()) {
                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(Icons.Default.Info, null, tint = Color.LightGray, modifier = Modifier.size(48.dp))
                            Text("No activities found.", color = Color.Gray, style = MaterialTheme.typography.bodyLarge)
                        }
                    }
                } else {
                    LazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(16.dp, 24.dp, 16.dp, 32.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        items(activities) { activity ->
                            val isSubmitted = submissions[activity.id] == true

                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable { onViewActivity(activity) },
                                shape = RoundedCornerShape(24.dp),
                                elevation = CardDefaults.cardElevation(if (isSubmitted) 1.dp else 4.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = if (isSubmitted) Color(0xFFF8F9FA) else Color.White
                                )
                            ) {
                                Column(modifier = Modifier.padding(20.dp)) {
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Surface(
                                            color = if (isSubmitted) Color.Gray.copy(0.1f) else headerStartColor.copy(0.1f),
                                            shape = RoundedCornerShape(8.dp)
                                        ) {
                                            Text(
                                                activity.type.uppercase(),
                                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                                style = MaterialTheme.typography.labelSmall,
                                                fontWeight = FontWeight.Bold,
                                                color = if (isSubmitted) Color.Gray else headerStartColor
                                            )
                                        }

                                        Spacer(Modifier.weight(1f))

                                        if (isSubmitted) {
                                            Surface(
                                                color = Color(0xFFE8F5E9),
                                                shape = CircleShape
                                            ) {
                                                Row(
                                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                                    verticalAlignment = Alignment.CenterVertically
                                                ) {
                                                    Icon(Icons.Default.Check, null, tint = Color(0xFF2E7D32), modifier = Modifier.size(14.dp))
                                                    Spacer(Modifier.width(4.dp))
                                                    Text("COMPLETED", style = MaterialTheme.typography.labelSmall, color = Color(0xFF2E7D32), fontWeight = FontWeight.Bold)
                                                }
                                            }
                                        }
                                    }

                                    Text(
                                        text = activity.title,
                                        style = MaterialTheme.typography.titleLarge,
                                        fontWeight = FontWeight.Bold,
                                        color = if (isSubmitted) Color.Gray else Color(0xFF2D3436),
                                        modifier = Modifier.padding(vertical = 12.dp)
                                    )

                                    Text(
                                        text = activity.description,
                                        style = MaterialTheme.typography.bodyMedium,
                                        color = Color.Gray,
                                        maxLines = 2,
                                        overflow = TextOverflow.Ellipsis,
                                        lineHeight = 20.sp
                                    )

                                    HorizontalDivider(
                                        modifier = Modifier.padding(vertical = 16.dp),
                                        thickness = 0.5.dp,
                                        color = Color.LightGray.copy(0.5f)
                                    )

                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Row(verticalAlignment = Alignment.CenterVertically) {
                                            Icon(
                                                imageVector = Icons.Default.Stars,
                                                contentDescription = null,
                                                modifier = Modifier.size(18.dp),
                                                tint = if (isSubmitted) Color.Gray else Color(0xFFFFB300)
                                            )
                                            Spacer(Modifier.width(6.dp))
                                            Text(
                                                "${activity.points} Points",
                                                style = MaterialTheme.typography.labelLarge,
                                                fontWeight = FontWeight.Bold,
                                                color = if (isSubmitted) Color.Gray else Color(0xFF2D3436)
                                            )
                                        }

                                        Text(
                                            if (isSubmitted) "Review Details" else "Begin Activity",
                                            style = MaterialTheme.typography.labelLarge,
                                            color = if (isSubmitted) Color.Gray else headerStartColor,
                                            fontWeight = FontWeight.ExtraBold
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StudentViewActivityScreen(
    activity: ActivityItem,
    onBack: () -> Unit,
    onSubmissionComplete: () -> Unit = {}
) {
    val context = LocalContext.current
    val headerStartColor = Color(0xFF00796B)
    val headerEndColor = Color(0xFF009688)
    val scope = rememberCoroutineScope()
    val uid = remember { Firebase.auth.currentUser?.uid ?: "unknown" }

    val hasSubmitted = remember(activity) { activity.submittedByStudentIds.contains(uid) }

    var answer by remember { mutableStateOf(activity.submittedAnswersPerStudent[uid] ?: "") }
    var uploadedFileUri by remember { mutableStateOf<Uri?>(null) }
    var showSubmitDialog by remember { mutableStateOf(false) }
    var isUploading by remember { mutableStateOf(false) }
    var showFilePreview by remember { mutableStateOf(false) }

    val filePickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri -> uploadedFileUri = uri }

    val storage = Firebase.storage
    val db = Firebase.firestore

    fun saveSubmission(fileUrl: String?) {
        scope.launch {
            try {
                val activityRef = db.collection("activities").document(activity.id)

                val updates = hashMapOf<String, Any>(
                    "submittedByStudentIds" to FieldValue.arrayUnion(uid),
                    "submittedAnswersPerStudent.$uid" to answer,
                )

                fileUrl?.let { updates["submittedFileUrisPerStudent.$uid"] = it }

                activityRef.update(updates).await()

                val submissionData = hashMapOf(
                    "studentId" to uid,
                    "answer" to answer,
                    "submittedFileUri" to (fileUrl ?: ""),
                    "timestamp" to FieldValue.serverTimestamp()
                )
                activityRef.collection("submissions").document(uid).set(submissionData).await()

                Toast.makeText(context, "Work Submitted Successfully!", Toast.LENGTH_SHORT).show()
                onSubmissionComplete()
                onBack()
            } catch (e: Exception) {
                isUploading = false
                Toast.makeText(context, "Error: ${e.message}", Toast.LENGTH_LONG).show()
            }
        }
    }

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            // --- HEADER ---
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = headerStartColor,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onBack,
                            modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)
                        ) {
                            Icon(Icons.Default.ArrowBack, "Back", tint = Color.White)
                        }
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text(
                                if (hasSubmitted) "Submission Review" else "Activity Workspace",
                                style = MaterialTheme.typography.labelLarge,
                                color = Color.White.copy(0.7f)
                            )
                            Text(
                                if (hasSubmitted) "TURNED IN" else "SUBMIT WORK",
                                style = MaterialTheme.typography.headlineSmall.copy(
                                    fontWeight = FontWeight.ExtraBold,
                                    letterSpacing = 1.sp
                                ),
                                color = Color.White
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.height(24.dp))

            // --- INSTRUCTIONS CARD ---
            Card(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(modifier = Modifier.padding(24.dp)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Surface(color = headerStartColor.copy(0.1f), shape = RoundedCornerShape(8.dp)) {
                            Text(
                                activity.type.uppercase(),
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
                                color = headerStartColor,
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Text("${activity.points} Pts", fontWeight = FontWeight.Bold, color = headerStartColor)
                    }

                    Spacer(Modifier.height(16.dp))
                    Text(activity.title, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
                    Text(activity.description, style = MaterialTheme.typography.bodyMedium, color = Color.Gray)

                    if (!activity.fileUri.isNullOrBlank()) {
                        Spacer(Modifier.height(16.dp))
                        OutlinedButton(
                            onClick = { showFilePreview = true },
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Icon(Icons.Default.Description, null)
                            Spacer(Modifier.width(8.dp))
                            Text("View Instructions File")
                        }
                    }
                }
            }

            Spacer(Modifier.height(16.dp))

            // --- INPUT AREA ---
            Card(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(modifier = Modifier.padding(24.dp)) {
                    Text("Your Submission", fontWeight = FontWeight.Bold, color = headerStartColor)
                    Spacer(Modifier.height(12.dp))

                    OutlinedTextField(
                        value = answer,
                        onValueChange = { if (!hasSubmitted) answer = it },
                        readOnly = hasSubmitted,
                        placeholder = { Text("Enter your response here...") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        minLines = 3
                    )

                    Spacer(Modifier.height(16.dp))

                    val existingFileUrl = activity.submittedFileUrisPerStudent[uid]

                    Surface(
                        onClick = { if (!hasSubmitted) filePickerLauncher.launch("*/*") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        color = if (uploadedFileUri != null || !existingFileUrl.isNullOrEmpty()) Color(0xFFE8F5E9) else Color(0xFFF5F6F7)
                    ) {
                        Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                if (uploadedFileUri != null || !existingFileUrl.isNullOrEmpty()) Icons.Default.CheckCircle else Icons.Default.AttachFile,
                                contentDescription = null,
                                tint = if (uploadedFileUri != null || !existingFileUrl.isNullOrEmpty()) Color(0xFF2E7D32) else Color.Gray
                            )
                            Spacer(Modifier.width(12.dp))
                            Text(
                                text = when {
                                    uploadedFileUri != null -> uploadedFileUri?.lastPathSegment ?: "File Attached"
                                    !existingFileUrl.isNullOrEmpty() -> "Document Submitted"
                                    else -> "Attach File (Optional)"
                                },
                                color = if (uploadedFileUri != null || !existingFileUrl.isNullOrEmpty()) Color(0xFF2E7D32) else Color.Gray
                            )
                        }
                    }

                    if (!hasSubmitted) {
                        Spacer(Modifier.height(24.dp))
                        Button(
                            onClick = { showSubmitDialog = true },
                            modifier = Modifier.fillMaxWidth().height(56.dp),
                            shape = RoundedCornerShape(16.dp),
                            enabled = !isUploading && (answer.isNotBlank() || uploadedFileUri != null),
                            colors = ButtonDefaults.buttonColors(containerColor = headerStartColor)
                        ) {
                            if (isUploading) {
                                CircularProgressIndicator(modifier = Modifier.size(24.dp), color = Color.White)
                            } else {
                                Text("Submit Activity", fontWeight = FontWeight.Bold)
                            }
                        }
                    } else {
                        Spacer(Modifier.height(16.dp))
                        Text(
                            "You have already turned this in.",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.Gray
                        )
                    }
                }
            }
            Spacer(Modifier.height(40.dp))
        }
    }

    if (showSubmitDialog) {
        AlertDialog(
            onDismissRequest = { showSubmitDialog = false },
            title = { Text("Confirm Submission") },
            text = { Text("Are you sure you want to turn this in? You cannot edit it later.") },
            confirmButton = {
                TextButton(onClick = {
                    showSubmitDialog = false
                    isUploading = true
                    scope.launch {
                        try {
                            val fileUrl = uploadedFileUri?.let { uri ->
                                val ref = storage.reference.child("activity_submissions/${activity.id}/$uid")
                                ref.putFile(uri).await()
                                ref.downloadUrl.await().toString()
                            }
                            saveSubmission(fileUrl)
                        } catch (e: Exception) {
                            isUploading = false
                            Toast.makeText(context, "Upload Error: ${e.message}", Toast.LENGTH_SHORT).show()
                        }
                    }
                }) { Text("Submit", color = headerStartColor) }
            },
            dismissButton = { TextButton(onClick = { showSubmitDialog = false }) { Text("Cancel") } }
        )
    }

    if (showFilePreview && !activity.fileUri.isNullOrBlank()) {
        FilePreviewDialog(uri = Uri.parse(activity.fileUri), onDismiss = { showFilePreview = false })
    }
}



// --- FULL SUMMATIVE SYSTEM ---

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StudentSummativesScreen(
    summatives: SnapshotStateList<SummativeAssessment>,
    onBack: () -> Unit,
    onSummativeSelected: (SummativeAssessment, Int) -> Unit,
    onUpdateFirebase: (SummativeAssessment) -> Unit,
    retakeSummativeId: Int? = null
) {
    val studentId = remember { Firebase.auth.currentUser?.uid ?: "Unknown_Student" }
    val headerStartColor = Color(0xFFFF5722)
    val headerEndColor = Color(0xFFFF8A65)

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
        Column(modifier = Modifier.fillMaxSize()) {

            // --- HEADER ---
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = headerStartColor,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onBack,
                            modifier = Modifier.size(40.dp).background(Color.White.copy(0.2f), CircleShape)
                        ) {
                            Icon(Icons.Default.ArrowBack, "Back", tint = Color.White, modifier = Modifier.size(20.dp))
                        }
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text("Final Evaluation", style = MaterialTheme.typography.labelLarge, color = Color.White.copy(0.8f))
                            Text("ASSESSMENT", style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.ExtraBold), color = Color.White)
                        }
                        Spacer(Modifier.weight(1f))
                        Surface(
                            modifier = Modifier.size(52.dp),
                            shape = CircleShape,
                            color = Color.White.copy(alpha = 0.25f),
                            border = BorderStroke(1.dp, Color.White.copy(alpha = 0.4f))
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.AssignmentTurnedIn,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(28.dp)
                                )
                            }
                        }
                    }
                }
            }

            // --- ASSESSMENT LIST ---
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp, 24.dp, 16.dp, 24.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                if (summatives.isEmpty()) {
                    item {
                        Box(Modifier.fillParentMaxSize(), contentAlignment = Alignment.Center) {
                            Text("No summative assessments available", color = Color.Gray)
                        }
                    }
                } else {
                    itemsIndexed(summatives) { index, summative ->
                        val studentSubmission = summative.submittedAnswersPerStudent[studentId]
                        val isSubmitted = studentSubmission != null

                        val totalPoints = summative.questions.sumOf { it.points?.toInt() ?: 0 }
                        val earnedPoints = if (isSubmitted && studentSubmission != null) {
                            summative.questions.mapIndexed { qIndex, q ->
                                val studentAns = studentSubmission.getOrNull(qIndex)?.trim()?.lowercase() ?: ""
                                val correctAns = q.correctAnswer?.trim()?.lowercase() ?: ""
                                if (studentAns == correctAns && studentAns.isNotEmpty()) q.points?.toInt() ?: 0 else 0
                            }.sum()
                        } else 0

                        val scorePercentage = if (totalPoints > 0) earnedPoints.toFloat() / totalPoints else 0f
                        val canRetake = isSubmitted && scorePercentage < 0.6f && (summative.retakeCount < summative.maxRetakes)
                        val retakesExhausted = isSubmitted && summative.retakeCount >= summative.maxRetakes
                        val isRetakeTarget = retakeSummativeId == summative.id

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable(enabled = !isSubmitted || isRetakeTarget) {
                                    onSummativeSelected(summative, index + 1)
                                },
                            shape = RoundedCornerShape(24.dp),
                            elevation = CardDefaults.cardElevation(if (isSubmitted) 0.dp else 4.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = if (isSubmitted && !isRetakeTarget) Color(0xFFE0E0E0).copy(0.4f) else Color.White
                            )
                        ) {
                            Column(modifier = Modifier.padding(20.dp)) {
                                Row(verticalAlignment = Alignment.Top) {
                                    Column(modifier = Modifier.weight(1f)) {
                                        Text("FINAL EXAM", style = MaterialTheme.typography.labelSmall, color = if (isSubmitted) Color.Gray else headerStartColor, fontWeight = FontWeight.Bold)
                                        Text(summative.title, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.ExtraBold)
                                    }

                                    if (isSubmitted) {
                                        Column(horizontalAlignment = Alignment.End) {
                                            StatusBadge(
                                                text = if (scorePercentage >= 0.6f) "PASSED" else "FAILED",
                                                color = if (scorePercentage >= 0.6f) Color(0xFF4CAF50) else Color(0xFFF44336)
                                            )
                                            if (retakesExhausted) {
                                                Spacer(Modifier.height(4.dp))
                                                StatusBadge(text = "NO RETAKES LEFT", color = Color(0xFF757575))
                                            }
                                        }
                                    }
                                }

                                Spacer(Modifier.height(16.dp))
                                Row {
                                    InfoIconLabel(Icons.Default.Timer, "${summative.durationMinutes}m")
                                    Spacer(Modifier.width(16.dp))
                                    InfoIconLabel(Icons.Default.List, "${summative.questions.size} Items")
                                }

                                if (isSubmitted) {
                                    HorizontalDivider(Modifier.padding(vertical = 16.dp), thickness = 0.5.dp)
                                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                                        Column {
                                            Text("Result", style = MaterialTheme.typography.labelSmall, color = Color.Gray)
                                            Text("$earnedPoints / $totalPoints pts", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                                        }

                                        if ((isRetakeTarget || canRetake) && !retakesExhausted) {
                                            RetakeSection(
                                                summative = summative,
                                                studentId = studentId,
                                                onConfirmRetake = { updated ->
                                                    onUpdateFirebase(updated)
                                                    onSummativeSelected(updated, index + 1)
                                                },
                                                primaryColor = headerStartColor
                                            )
                                        }
                                    }
                                } else {
                                    Spacer(Modifier.height(20.dp))
                                    Button(
                                        onClick = { onSummativeSelected(summative, index + 1) },
                                        modifier = Modifier.fillMaxWidth(),
                                        colors = ButtonDefaults.buttonColors(containerColor = headerStartColor)
                                    ) {
                                        Text("Begin Assessment", fontWeight = FontWeight.Bold)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun StatusBadge(text: String, color: Color) {
    Surface(
        color = color.copy(0.1f),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, color.copy(0.2f))
    ) {
        Text(text = text, modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp), style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.ExtraBold, color = color)
    }
}

@Composable
fun InfoIconLabel(icon: ImageVector, text: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(icon, null, modifier = Modifier.size(14.dp), tint = Color.Gray)
        Spacer(Modifier.width(4.dp))
        Text(text, style = MaterialTheme.typography.bodySmall, color = Color.Gray)
    }
}

@Composable
fun RetakeSection(
    summative: SummativeAssessment,
    studentId: String,
    onConfirmRetake: (SummativeAssessment) -> Unit,
    primaryColor: Color
) {
    var showRetakeDialog by remember { mutableStateOf(false) }
    var isSaving by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()
    val context = LocalContext.current

    Button(
        onClick = { showRetakeDialog = true },
        colors = ButtonDefaults.buttonColors(containerColor = primaryColor),
        shape = RoundedCornerShape(8.dp),
        enabled = !isSaving
    ) {
        Icon(Icons.Default.Refresh, null, modifier = Modifier.size(14.dp))
        Spacer(Modifier.width(6.dp))
        Text("Retake")
    }

    if (showRetakeDialog) {
        AlertDialog(
            onDismissRequest = { if (!isSaving) showRetakeDialog = false },
            title = { Text("Confirm Retake") },
            text = { Text("You have ${summative.maxRetakes - summative.retakeCount} retakes left. Previous answers will be cleared. Continue?") },
            confirmButton = {
                Button(
                    onClick = {
                        isSaving = true
                        val updatedSubmissions = summative.submittedAnswersPerStudent.toMutableMap()
                        updatedSubmissions.remove(studentId)
                        val updated = summative.copy(
                            submittedAnswersPerStudent = updatedSubmissions,
                            retakeCount = summative.retakeCount + 1
                        )

                        // ✅ FIXED: Save retake to Firestore BEFORE proceeding
                        scope.launch {
                            try {
                                Firebase.firestore
                                    .collection("summatives")
                                    .document(summative.id.toString())
                                    .set(updated)
                                    .await()

                                withContext(Dispatchers.Main) {
                                    isSaving = false
                                    showRetakeDialog = false
                                    onConfirmRetake(updated)
                                }
                            } catch (e: Exception) {
                                withContext(Dispatchers.Main) {
                                    isSaving = false
                                    Toast.makeText(context, "Error: ${e.message}", Toast.LENGTH_SHORT).show()
                                }
                            }
                        }
                    },
                    enabled = !isSaving
                ) {
                    if (isSaving) {
                        CircularProgressIndicator(modifier = Modifier.size(16.dp), color = Color.White, strokeWidth = 2.dp)
                    } else {
                        Text("Confirm")
                    }
                }
            },
            dismissButton = {
                TextButton(
                    onClick = { showRetakeDialog = false },
                    enabled = !isSaving
                ) { Text("Cancel") }
            }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SummativeDetailScreen(
    summative: SummativeAssessment,
    summativeNumber: Int,
    onBack: () -> Unit,
    onSaveSubmission: (SummativeAssessment) -> Unit
) {
    val currentOnSaveSubmission by rememberUpdatedState(onSaveSubmission)
    val studentId = remember { Firebase.auth.currentUser?.uid ?: "Unknown_Student" }
    val headerStartColor = Color(0xFFFF5722)
    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    val db = remember { Firebase.firestore }

    val answers = remember(summative) {
        mutableStateMapOf<Int, String>().apply {
            summative.submittedAnswersPerStudent[studentId]?.forEachIndexed { index, ans ->
                put(index, ans ?: "")
            }
        }
    }

    var isSubmitted by remember(summative) {
        mutableStateOf(summative.submittedAnswersPerStudent.containsKey(studentId))
    }
    var timeLeft by remember { mutableStateOf(summative.durationMinutes * 60) }
    var showReviewDialog by remember { mutableStateOf(false) }
    var isSaving by remember { mutableStateOf(false) }

    val performSubmission = {
        isSaving = true
        scope.launch {
            try {
                val submissionList = List(summative.questions.size) { index -> answers[index] ?: "" }
                val updatedSubmissions = summative.submittedAnswersPerStudent.toMutableMap()
                updatedSubmissions[studentId] = submissionList

                val finalSummative = summative.copy(
                    submittedAnswersPerStudent = updatedSubmissions
                )

                db.collection("summatives")
                    .document(summative.id.toString())
                    .set(finalSummative)
                    .await()

                val submissionData = hashMapOf(
                    "answers" to submissionList,
                    "submittedAt" to FieldValue.serverTimestamp()
                )
                db.collection("summatives")
                    .document(summative.id.toString())
                    .collection("submissions")
                    .document(studentId)
                    .set(submissionData)
                    .await()

                withContext(Dispatchers.Main) {
                    isSubmitted = true
                    Toast.makeText(context, "Assessment Submitted!", Toast.LENGTH_SHORT).show()
                    currentOnSaveSubmission(finalSummative)
                    isSaving = false
                    showReviewDialog = false
                    onBack()
                }
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    isSaving = false
                    Toast.makeText(context, "Error: ${e.message}", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    LaunchedEffect(isSubmitted) {
        if (!isSubmitted) {
            while (timeLeft > 0) {
                kotlinx.coroutines.delay(1000L)
                timeLeft--
            }
            if (!isSubmitted) performSubmission()
        }
    }

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
        Column {
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = headerStartColor,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 4.dp
            ) {
                Row(
                    modifier = Modifier.padding(top = 48.dp, bottom = 24.dp, start = 20.dp, end = 20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = onBack, enabled = !isSaving) {
                        Icon(Icons.Default.ArrowBack, null, tint = Color.White)
                    }
                    Column(modifier = Modifier.weight(1f).padding(start = 12.dp)) {
                        Text("ASSESSMENT $summativeNumber", style = MaterialTheme.typography.labelSmall, color = Color.White.copy(0.7f))
                        Text(summative.title.uppercase(), color = Color.White, fontWeight = FontWeight.Bold)
                    }
                    if (!isSubmitted) {
                        Text(
                            text = String.format("%02d:%02d", timeLeft / 60, timeLeft % 60),
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            LazyColumn(
                modifier = Modifier.weight(1f).padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(top = 16.dp, bottom = 100.dp)
            ) {
                items(summative.questions.size) { index ->
                    val question = summative.questions[index]
                    val currentAnswer = answers[index] ?: ""

                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Text(text = question.questionText, fontWeight = FontWeight.Bold)
                            Spacer(modifier = Modifier.height(12.dp))

                            if (!isSubmitted) {
                                QuestionInput(
                                    question = question,
                                    currentAnswer = currentAnswer,
                                    onAnswerChange = { answers[index] = it },
                                    primaryColor = headerStartColor
                                )
                            } else {
                                ResultView(
                                    question = question,
                                    studentAnswer = currentAnswer,
                                    accentColor = headerStartColor
                                )
                            }
                        }
                    }
                }
            }
        }

        if (!isSubmitted) {
            Surface(
                modifier = Modifier.align(Alignment.BottomCenter),
                color = Color.White,
                shadowElevation = 16.dp
            ) {
                Button(
                    onClick = { showReviewDialog = true },
                    modifier = Modifier.fillMaxWidth().padding(20.dp).height(56.dp),
                    enabled = !isSaving,
                    colors = ButtonDefaults.buttonColors(containerColor = headerStartColor),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    if (isSaving) {
                        CircularProgressIndicator(modifier = Modifier.size(24.dp), color = Color.White, strokeWidth = 2.dp)
                    } else {
                        Text("Submit Exam", fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }

    if (showReviewDialog) {
        AlertDialog(
            onDismissRequest = { if (!isSaving) showReviewDialog = false },
            title = { Text("Submit Assessment?") },
            text = { Text("You cannot edit your answers after submitting. Proceed to finalize your score?") },
            confirmButton = {
                Button(
                    onClick = { performSubmission() },
                    enabled = !isSaving,
                    colors = ButtonDefaults.buttonColors(containerColor = headerStartColor)
                ) {
                    if (isSaving) Text("Submitting...") else Text("Confirm")
                }
            },
            dismissButton = {
                TextButton(onClick = { showReviewDialog = false }, enabled = !isSaving) {
                    Text("Cancel")
                }
            }
        )
    }
}

@Composable
fun QuestionInput(question: Question, currentAnswer: String, onAnswerChange: (String) -> Unit, primaryColor: Color) {
    when (question.type) {
        QuestionType.MULTIPLE_CHOICE, QuestionType.TRUE_FALSE -> {
            val options = if (question.type == QuestionType.TRUE_FALSE) listOf("True", "False") else question.options
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                options.forEach { option ->
                    val isSelected = currentAnswer == option
                    Surface(
                        modifier = Modifier.fillMaxWidth().clickable { onAnswerChange(option) },
                        shape = RoundedCornerShape(12.dp),
                        color = if (isSelected) primaryColor.copy(0.1f) else Color(0xFFF8F9FA),
                        border = BorderStroke(1.dp, if (isSelected) primaryColor else Color.LightGray.copy(0.3f))
                    ) {
                        Row(Modifier.padding(12.dp), verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(selected = isSelected, onClick = { onAnswerChange(option) }, colors = RadioButtonDefaults.colors(selectedColor = primaryColor))
                            Text(option)
                        }
                    }
                }
            }
        }
        else -> {
            OutlinedTextField(value = currentAnswer, onValueChange = onAnswerChange, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp))
        }
    }
}

@Composable
fun ResultView(question: Question, studentAnswer: String, accentColor: Color) {
    val isEssay = question.type == QuestionType.ESSAY
    val correctAnswers = (listOfNotNull(question.correctAnswer) + (question.possibleAnswers ?: emptyList())).map { it.trim().lowercase() }
    val isCorrect = studentAnswer.trim().lowercase() in correctAnswers

    Column {
        val bgColor = when {
            isEssay -> Color.Blue.copy(0.1f)
            isCorrect -> Color(0xFF4CAF50).copy(0.1f)
            else -> Color(0xFFF44336).copy(0.1f)
        }
        Surface(color = bgColor, shape = RoundedCornerShape(12.dp)) {
            Row(Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                Text(studentAnswer.ifEmpty { "No Answer" }, Modifier.weight(1f), fontWeight = FontWeight.Bold)
                Icon(
                    imageVector = if (isEssay) Icons.Default.HistoryEdu else if (isCorrect) Icons.Default.CheckCircle else Icons.Default.Cancel,
                    contentDescription = null,
                    tint = if (isEssay) Color.Blue else if (isCorrect) Color(0xFF4CAF50) else Color(0xFFF44336)
                )
            }
        }
        if (!isEssay && !isCorrect) Text("Correct: ${question.correctAnswer}", color = accentColor, style = MaterialTheme.typography.labelSmall)
    }
}

fun getMimeType(context: android.content.Context, uri: Uri): String? {
    return context.contentResolver.getType(uri)
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdminActivitiesScreen(
    activities: List<ActivityItem>,
    onBack: () -> Unit,
    onAddActivity: () -> Unit,
    onEditActivity: (ActivityItem) -> Unit,
    onDeleteActivity: (ActivityItem) -> Unit
) {
    val headerStartColor = Color(0xFF00796B)
    val headerEndColor = Color(0xFF009688)
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    val storage = Firebase.storage
    val firestore = Firebase.firestore

    var selectedActivity by remember { mutableStateOf<ActivityItem?>(null) }
    var activityToDelete by remember { mutableStateOf<ActivityItem?>(null) }
    var showDeleteDialog by remember { mutableStateOf(false) }
    var isDeleting by remember { mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
        if (selectedActivity == null) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(bottom = 100.dp)
            ) {
                // --- HEADER ---
                item {
                    Surface(
                        modifier = Modifier.fillMaxWidth(),
                        color = headerStartColor,
                        shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                        shadowElevation = 8.dp
                    ) {
                        Column(
                            modifier = Modifier
                                .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                                .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                IconButton(
                                    onClick = onBack,
                                    modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)
                                ) { Icon(Icons.Default.ArrowBack, "Back", tint = Color.White) }

                                Spacer(Modifier.width(16.dp))

                                Column {
                                    Text("Curriculum", style = MaterialTheme.typography.labelLarge, color = Color.White.copy(0.7f))
                                    Text("ACTIVITIES", style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.ExtraBold, letterSpacing = 1.sp), color = Color.White)
                                }

                                Spacer(Modifier.weight(1f))

                                // ✅ ADDED ONLY: PREMIUM GLASS LOGO CONTAINER
                                Surface(
                                    modifier = Modifier.size(52.dp),
                                    shape = CircleShape,
                                    color = Color.White.copy(alpha = 0.25f),
                                    border = BorderStroke(1.dp, Color.White.copy(alpha = 0.4f))
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Icon(
                                            imageVector = Icons.Default.Assignment,
                                            contentDescription = null,
                                            tint = Color.White,
                                            modifier = Modifier.size(28.dp)
                                        )
                                    }
                                }
                            }
                        }
                    }
                    if (isDeleting) {
                        LinearProgressIndicator(modifier = Modifier.fillMaxWidth(), color = Color.Red)
                    }
                    Spacer(Modifier.height(20.dp))
                }

                // --- LIST ---
                if (activities.isEmpty()) {
                    item {
                        Box(Modifier.fillParentMaxSize(), contentAlignment = Alignment.Center) {
                            Text("No activities found.", color = Color.Gray)
                        }
                    }
                } else {
                    items(
                        items = activities,
                        key = { it.id }
                    ) { activity ->
                        ActivityAdminCard(
                            activity = activity,
                            headerColor = headerStartColor,
                            onReview = { selectedActivity = activity },
                            onEdit = { onEditActivity(activity) },
                            onDelete = {
                                activityToDelete = activity
                                showDeleteDialog = true
                            }
                        )
                    }
                }
            }

            // Floating Action Button
            FloatingActionButton(
                onClick = onAddActivity,
                containerColor = headerStartColor,
                contentColor = Color.White,
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.align(Alignment.BottomEnd).padding(24.dp)
            ) {
                Row(Modifier.padding(horizontal = 16.dp), verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Default.Add, null)
                    Spacer(Modifier.width(8.dp))
                    Text("New Activity", fontWeight = FontWeight.Bold)
                }
            }
        } else {
            ViewActivityScreen(activity = selectedActivity!!) { selectedActivity = null }
        }
    }

    // --- DELETE DIALOG (LOGIC UNTOUCHED) ---
    if (showDeleteDialog && activityToDelete != null) {
        AlertDialog(
            onDismissRequest = { if (!isDeleting) showDeleteDialog = false },
            title = { Text("Delete Activity") },
            text = { Text("Permanently remove '${activityToDelete!!.title}'? This cannot be undone.") },
            confirmButton = {
                Button(
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                    onClick = {
                        val toDelete = activityToDelete!!
                        isDeleting = true
                        showDeleteDialog = false

                        scope.launch {
                            try {
                                if (!toDelete.fileUri.isNullOrBlank()) {
                                    try {
                                        storage.getReferenceFromUrl(toDelete.fileUri).delete().await()
                                    } catch (e: Exception) { Log.e("Delete", "Storage file not found or already gone") }
                                }
                                firestore.collection("activities").document(toDelete.id).delete().await()
                                onDeleteActivity(toDelete)
                                Toast.makeText(context, "Deleted successfully", Toast.LENGTH_SHORT).show()
                            } catch (e: Exception) {
                                Toast.makeText(context, "Error: ${e.message}", Toast.LENGTH_LONG).show()
                            } finally {
                                isDeleting = false
                                activityToDelete = null
                            }
                        }
                    }
                ) { Text("Delete", color = Color.White) }
            },
            dismissButton = {
                TextButton(onClick = { showDeleteDialog = false }, enabled = !isDeleting) { Text("Cancel") }
            }
        )
    }
}

@Composable
fun ActivityAdminCard(
    activity: ActivityItem,
    headerColor: Color,
    onReview: () -> Unit,
    onEdit: () -> Unit,
    onDelete: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 6.dp),
        shape = RoundedCornerShape(24.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                Surface(color = headerColor.copy(0.1f), shape = RoundedCornerShape(8.dp)) {
                    Text(activity.type.uppercase(), modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp), style = MaterialTheme.typography.labelSmall, color = headerColor, fontWeight = FontWeight.Bold)
                }
                Text("${activity.points} pts", style = MaterialTheme.typography.labelMedium, color = Color(0xFF2E7D32), fontWeight = FontWeight.Bold)
            }

            Spacer(Modifier.height(12.dp))
            Text(activity.title, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
            Text(activity.description, maxLines = 1, overflow = TextOverflow.Ellipsis, color = Color.Gray)

            HorizontalDivider(Modifier.padding(vertical = 12.dp), thickness = 0.5.dp)

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(onClick = onReview, modifier = Modifier.weight(1f), colors = ButtonDefaults.buttonColors(containerColor = headerColor)) {
                    Text("Review", fontSize = 12.sp)
                }
                OutlinedButton(onClick = onEdit, modifier = Modifier.weight(0.8f)) {
                    Text("Edit", fontSize = 12.sp)
                }
                IconButton(onClick = onDelete, modifier = Modifier.background(Color(0xFFFFEBEE), CircleShape)) {
                    Icon(Icons.Default.Delete, null, tint = Color.Red)
                }
            }
        }
    }
}

// -------------------- VIEW ACTIVITY --------------------
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewActivityScreen(
    activity: ActivityItem,
    onBack: () -> Unit
) {
    // --- MATCHED PREMIUM TEAL THEME ---
    val headerStartColor = Color(0xFF00796B)
    val headerEndColor = Color(0xFF009688)
    var showFilePreview by remember { mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            // --- GRADIENT HEADER ---
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = headerStartColor,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onBack,
                            modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)
                        ) {
                            Icon(Icons.Default.ArrowBack, "Back", tint = Color.White)
                        }
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text(
                                activity.type.uppercase(),
                                style = MaterialTheme.typography.labelLarge,
                                color = Color.White.copy(0.7f),
                                fontWeight = FontWeight.Bold,
                                letterSpacing = 1.sp
                            )
                            Text(
                                "Activity Details",
                                style = MaterialTheme.typography.headlineSmall.copy(
                                    fontWeight = FontWeight.ExtraBold,
                                    letterSpacing = 0.5.sp
                                ),
                                color = Color.White
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.height(24.dp))

            // --- MAIN CONTENT CARD ---
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(modifier = Modifier.padding(24.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Overview",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = headerStartColor
                        )

                        Surface(
                            color = Color(0xFF4CAF50).copy(0.1f),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(
                                text = "${activity.points} Points",
                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                                style = MaterialTheme.typography.labelLarge,
                                color = Color(0xFF2E7D32),
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }

                    Spacer(Modifier.height(16.dp))

                    Text(
                        text = activity.title,
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color(0xFF2D3436)
                    )

                    Spacer(Modifier.height(16.dp))

                    // Updated to Material 3 HorizontalDivider
                    HorizontalDivider(thickness = 0.5.dp, color = Color.LightGray.copy(0.5f))

                    Spacer(Modifier.height(16.dp))

                    Text(
                        text = "Instructions",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray
                    )

                    Spacer(Modifier.height(8.dp))

                    Text(
                        text = activity.description,
                        style = MaterialTheme.typography.bodyLarge.copy(
                            lineHeight = 26.sp,
                            color = Color(0xFF636E72)
                        )
                    )
                }
            }

            // --- ATTACHMENTS SECTION ---
            if (!activity.fileUri.isNullOrBlank()) {
                Spacer(Modifier.height(16.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    shape = RoundedCornerShape(24.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                ) {
                    Column(modifier = Modifier.padding(24.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                Icons.Default.Description,
                                contentDescription = null,
                                tint = headerStartColor,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(Modifier.width(12.dp))
                            Text(
                                text = "Resource Material",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF2D3436)
                            )
                        }

                        Spacer(Modifier.height(20.dp))

                        Button(
                            onClick = { showFilePreview = true },
                            modifier = Modifier.fillMaxWidth().height(56.dp),
                            shape = RoundedCornerShape(16.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = headerStartColor)
                        ) {
                            Icon(Icons.Default.Visibility, contentDescription = null)
                            Spacer(Modifier.width(12.dp))
                            Text("Open Attachment", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                        }

                        Spacer(Modifier.height(12.dp))

                        Text(
                            text = "Please review the attached material carefully before starting your work.",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.Gray,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }

            Spacer(Modifier.height(40.dp))
        }
    }

    // --- File Preview Logic ---
    if (showFilePreview && !activity.fileUri.isNullOrBlank()) {
        FilePreviewDialog(
            uri = Uri.parse(activity.fileUri),
            onDismiss = { showFilePreview = false }
        )
    }
}
// -------------------- EDIT ACTIVITY --------------------
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditActivityScreen(
    activity: ActivityItem,
    onCancel: () -> Unit
) {
    // --- MATCHED TEAL THEME ---
    val headerStartColor = Color(0xFF00796B)
    val headerEndColor = Color(0xFF009688)

    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    // --- State (Pre-filled with existing data) ---
    var title by remember { mutableStateOf(activity.title) }
    var description by remember { mutableStateOf(activity.description) }
    var selectedType by remember { mutableStateOf(activity.type) }
    var points by remember { mutableStateOf(activity.points.toString()) }
    var mediaUri by remember { mutableStateOf<Uri?>(activity.fileUri?.let { Uri.parse(it) }) }
    var isSaving by remember { mutableStateOf(false) }
    var mediaChanged by remember { mutableStateOf(false) }

    val activityTypes = listOf("General", "Assignment", "Project")

    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
        uri?.let {
            mediaUri = it
            mediaChanged = true
        }
    }

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
        Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {

            // --- PREMIUM GRADIENT HEADER ---
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = headerStartColor,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onCancel,
                            modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)
                        ) {
                            Icon(Icons.Default.ArrowBack, "Back", tint = Color.White)
                        }
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text(
                                "Management",
                                style = MaterialTheme.typography.labelLarge,
                                color = Color.White.copy(0.7f)
                            )
                            Text(
                                "EDIT ACTIVITY",
                                style = MaterialTheme.typography.headlineSmall.copy(
                                    fontWeight = FontWeight.ExtraBold,
                                    letterSpacing = 1.sp
                                ),
                                color = Color.White
                            )
                        }
                    }
                }
            }

            if (isSaving) {
                LinearProgressIndicator(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(0xFF4CAF50),
                    trackColor = Color.LightGray.copy(0.3f)
                )
            }

            Spacer(Modifier.height(24.dp))

            // --- DETAILS CARD ---
            Card(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Column(modifier = Modifier.padding(24.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
                    Text("Update Information", fontWeight = FontWeight.Bold, color = headerStartColor)

                    OutlinedTextField(
                        value = title,
                        onValueChange = { title = it },
                        label = { Text("Title") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = headerStartColor, focusedLabelColor = headerStartColor)
                    )

                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                        OutlinedTextField(
                            value = points,
                            onValueChange = { if (it.all { char -> char.isDigit() }) points = it },
                            label = { Text("Points") },
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(12.dp),
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                            colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = headerStartColor, focusedLabelColor = headerStartColor)
                        )

                        // Type Selection Dropdown
                        var expanded by remember { mutableStateOf(false) }
                        ExposedDropdownMenuBox(
                            expanded = expanded,
                            onExpandedChange = { expanded = !expanded },
                            modifier = Modifier.weight(1.5f)
                        ) {
                            OutlinedTextField(
                                value = selectedType,
                                onValueChange = {},
                                readOnly = true,
                                label = { Text("Category") },
                                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                                modifier = Modifier.menuAnchor(),
                                shape = RoundedCornerShape(12.dp),
                                colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = headerStartColor, focusedLabelColor = headerStartColor)
                            )
                            ExposedDropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                                activityTypes.forEach { typeOption ->
                                    DropdownMenuItem(
                                        text = { Text(typeOption) },
                                        onClick = { selectedType = typeOption; expanded = false }
                                    )
                                }
                            }
                        }
                    }

                    OutlinedTextField(
                        value = description,
                        onValueChange = { description = it },
                        label = { Text("Instructions") },
                        modifier = Modifier.fillMaxWidth(),
                        minLines = 3,
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = headerStartColor, focusedLabelColor = headerStartColor)
                    )
                }
            }

            Spacer(Modifier.height(16.dp))

            // --- MEDIA CARD ---
            Card(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Column(modifier = Modifier.padding(24.dp)) {
                    Text("Media Attachment", fontWeight = FontWeight.Bold, color = headerStartColor)
                    Spacer(Modifier.height(16.dp))

                    if (mediaUri != null) {
                        Box(modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(16.dp))) {
                            MediaPreview(
                                uri = mediaUri!!,
                                mimeType = if (mediaChanged) context.contentResolver.getType(mediaUri!!) else "image/*",
                                context = context
                            )
                            IconButton(
                                onClick = { launcher.launch("*/*") },
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(8.dp)
                                    .background(Color.Black.copy(0.6f), CircleShape)
                                    .size(36.dp)
                            ) {
                                Icon(Icons.Default.Edit, "Change", tint = Color.White, modifier = Modifier.size(20.dp))
                            }
                        }
                    } else {
                        Button(
                            onClick = { launcher.launch("*/*") },
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(16.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = headerStartColor.copy(0.08f)),
                            border = BorderStroke(1.dp, headerStartColor.copy(0.2f))
                        ) {
                            Icon(Icons.Default.CloudUpload, null, tint = headerStartColor)
                            Spacer(Modifier.width(8.dp))
                            Text("Attach Resource", color = headerStartColor, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }

            // --- ACTIONS ---
            Row(
                modifier = Modifier.fillMaxWidth().padding(24.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                TextButton(
                    onClick = onCancel,
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Discard", color = Color.Gray)
                }

                Button(
                    onClick = {
                        isSaving = true
                        scope.launch {
                            try {
                                val db = Firebase.firestore
                                val storageRef = Firebase.storage.reference
                                var downloadUrl: String? = null
                                var fileName: String? = activity.fileName

                                if (mediaChanged && mediaUri != null) {
                                    val uploadResult = safeUploadMediaWithName(mediaUri!!, storageRef, context)
                                    downloadUrl = uploadResult.downloadUrl
                                    fileName = uploadResult.fileName
                                }

                                val updates = mutableMapOf<String, Any>(
                                    "title" to title,
                                    "description" to description,
                                    "type" to selectedType,
                                    "points" to (points.toIntOrNull() ?: 0)
                                )

                                if (downloadUrl != null) {
                                    updates["fileUri"] = downloadUrl
                                    updates["fileName"] = fileName ?: "file"
                                }

                                db.collection("activities").document(activity.id).update(updates).await()
                                Toast.makeText(context, "Activity Updated", Toast.LENGTH_SHORT).show()
                                onCancel()
                            } catch (e: Exception) {
                                Toast.makeText(context, "Error: ${e.message}", Toast.LENGTH_LONG).show()
                            } finally {
                                isSaving = false
                            }
                        }
                    },
                    modifier = Modifier.weight(1.8f).height(56.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = headerStartColor),
                    enabled = !isSaving
                ) {
                    if (isSaving) {
                        CircularProgressIndicator(modifier = Modifier.size(24.dp), color = Color.White, strokeWidth = 3.dp)
                    } else {
                        Text("Update Changes", fontWeight = FontWeight.ExtraBold)
                    }
                }
            }
            Spacer(Modifier.height(32.dp))
        }
    }
}

// -------------------- ADD QUESTION --------------------
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddQuestionScreen(
    onSaveComplete: () -> Unit,
    onCancel: () -> Unit
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    // --- State ---
    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    var points by remember { mutableStateOf("") }
    var selectedType by remember { mutableStateOf("General") }
    var mediaUri by remember { mutableStateOf<Uri?>(null) }
    var isUploading by remember { mutableStateOf(false) }

    val activityTypes = listOf("General", "Assignment", "Project")

    // --- MATCHED PREMIUM TEAL THEME ---
    val headerStartColor = Color(0xFF00796B)
    val headerEndColor = Color(0xFF009688)

    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
        mediaUri = uri
    }

    val storageRef = Firebase.storage.reference
    val firestore = Firebase.firestore

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            // --- PREMIUM GRADIENT HEADER ---
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = headerStartColor,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onCancel,
                            modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)
                        ) {
                            Icon(Icons.Default.ArrowBack, "Back", tint = Color.White)
                        }
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text(
                                "Management",
                                style = MaterialTheme.typography.labelLarge,
                                color = Color.White.copy(0.7f)
                            )
                            Text(
                                "CREATE ACTIVITY",
                                style = MaterialTheme.typography.headlineSmall.copy(
                                    fontWeight = FontWeight.ExtraBold,
                                    letterSpacing = 1.sp
                                ),
                                color = Color.White
                            )
                        }
                    }
                }
            }

            // --- UPLOAD PROGRESS INDICATOR ---
            if (isUploading) {
                LinearProgressIndicator(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(0xFF4CAF50), // Green for progress
                    trackColor = headerStartColor.copy(0.2f)
                )
            }

            Spacer(Modifier.height(24.dp))

            // --- INPUTS CARD ---
            Card(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Column(modifier = Modifier.padding(24.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
                    Text("Activity Details", fontWeight = FontWeight.Bold, color = headerStartColor)

                    OutlinedTextField(
                        value = title,
                        onValueChange = { title = it },
                        label = { Text("Title") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = headerStartColor,
                            focusedLabelColor = headerStartColor
                        )
                    )

                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                        OutlinedTextField(
                            value = points,
                            onValueChange = { if (it.all { char -> char.isDigit() }) points = it },
                            label = { Text("Points") },
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(12.dp),
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = headerStartColor,
                                focusedLabelColor = headerStartColor
                            )
                        )

                        // --- IMPROVED EXPOSED DROPDOWN ---
                        var expanded by remember { mutableStateOf(false) }
                        ExposedDropdownMenuBox(
                            expanded = expanded,
                            onExpandedChange = { expanded = !expanded },
                            modifier = Modifier.weight(1.5f)
                        ) {
                            OutlinedTextField(
                                value = selectedType,
                                onValueChange = {},
                                readOnly = true,
                                label = { Text("Category") },
                                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                                modifier = Modifier.menuAnchor(),
                                shape = RoundedCornerShape(12.dp),
                                colors = OutlinedTextFieldDefaults.colors(
                                    focusedBorderColor = headerStartColor,
                                    focusedLabelColor = headerStartColor
                                )
                            )
                            ExposedDropdownMenu(
                                expanded = expanded,
                                onDismissRequest = { expanded = false }
                            ) {
                                activityTypes.forEach { type ->
                                    DropdownMenuItem(
                                        text = { Text(type) },
                                        onClick = { selectedType = type; expanded = false }
                                    )
                                }
                            }
                        }
                    }

                    OutlinedTextField(
                        value = description,
                        onValueChange = { description = it },
                        label = { Text("Instructions") },
                        modifier = Modifier.fillMaxWidth(),
                        minLines = 4,
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = headerStartColor,
                            focusedLabelColor = headerStartColor
                        )
                    )
                }
            }

            Spacer(Modifier.height(16.dp))

            // --- MEDIA ATTACHMENT CARD ---
            Card(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Column(modifier = Modifier.padding(24.dp)) {
                    Text("Resource Material", fontWeight = FontWeight.Bold, color = headerStartColor)
                    Spacer(Modifier.height(16.dp))

                    if (mediaUri != null) {
                        Box(modifier = Modifier.clip(RoundedCornerShape(16.dp))) {
                            MediaPreview(uri = mediaUri!!, mimeType = context.contentResolver.getType(mediaUri!!), context = context)
                            IconButton(
                                onClick = { mediaUri = null },
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(8.dp)
                                    .background(Color.Black.copy(0.6f), CircleShape)
                                    .size(32.dp)
                            ) {
                                Icon(Icons.Default.Close, null, tint = Color.White, modifier = Modifier.size(18.dp))
                            }
                        }
                    } else {
                        Button(
                            onClick = { launcher.launch("*/*") },
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(16.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = headerStartColor.copy(0.08f)),
                            border = BorderStroke(1.dp, headerStartColor.copy(0.2f))
                        ) {
                            Icon(Icons.Default.CloudUpload, contentDescription = null, tint = headerStartColor)
                            Spacer(Modifier.width(12.dp))
                            Text("Upload File or Image", color = headerStartColor, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }

            // --- BOTTOM ACTION BUTTONS ---
            Row(
                Modifier.fillMaxWidth().padding(24.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                TextButton(
                    onClick = onCancel,
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Discard", color = Color.Gray, fontWeight = FontWeight.SemiBold)
                }

                Button(
                    onClick = {
                        if (title.isNotBlank() && description.isNotBlank()) {
                            isUploading = true
                            scope.launch {
                                try {
                                    val uploadResult = mediaUri?.let { uri ->
                                        safeUploadMediaWithName(uri, storageRef, context)
                                    }

                                    saveActivityToFirestore(
                                        firestore,
                                        title,
                                        description,
                                        selectedType,
                                        points.toIntOrNull() ?: 0,
                                        uploadResult?.downloadUrl,
                                        uploadResult?.fileName
                                    )

                                    Toast.makeText(context, "Activity Published!", Toast.LENGTH_SHORT).show()
                                    onSaveComplete()
                                } catch (e: Exception) {
                                    Toast.makeText(context, "Upload Failed: ${e.message}", Toast.LENGTH_LONG).show()
                                } finally {
                                    isUploading = false
                                }
                            }
                        } else {
                            Toast.makeText(context, "Title and Description are required", Toast.LENGTH_SHORT).show()
                        }
                    },
                    modifier = Modifier.weight(1.8f).height(56.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = headerStartColor),
                    shape = RoundedCornerShape(16.dp),
                    enabled = !isUploading
                ) {
                    if (isUploading) {
                        CircularProgressIndicator(modifier = Modifier.size(24.dp), color = Color.White, strokeWidth = 3.dp)
                    } else {
                        Icon(Icons.Default.Check, null)
                        Spacer(Modifier.width(8.dp))
                        Text("Publish Activity", fontWeight = FontWeight.ExtraBold)
                    }
                }
            }
            Spacer(Modifier.height(32.dp))
        }
    }
}

@Composable
fun MediaPreview(uri: Uri, mimeType: String?, context: Context) {
    Card(shape = RoundedCornerShape(12.dp), elevation = CardDefaults.cardElevation(4.dp)) {
        when {
            mimeType?.startsWith("image/") == true -> {
                Image(
                    painter = rememberAsyncImagePainter(uri),
                    contentDescription = "Selected Image",
                    modifier = Modifier.fillMaxWidth().height(200.dp),
                    contentScale = ContentScale.Crop
                )
            }
            mimeType?.startsWith("video/") == true -> {
                AndroidView(
                    factory = { ctx ->
                        VideoView(ctx).apply {
                            setVideoURI(uri)
                            // Added MediaController for play/pause support
                            val controller = MediaController(ctx)
                            controller.setAnchorView(this)
                            setMediaController(controller)
                            setOnPreparedListener { start() }
                        }
                    },
                    modifier = Modifier.fillMaxWidth().height(250.dp)
                )
            }
            else -> {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth().padding(16.dp)
                ) {
                    Icon(Icons.Default.AttachFile, contentDescription = null, tint = Color.Gray)
                    Spacer(Modifier.width(12.dp))
                    Text(
                        text = "Attached: ${uri.lastPathSegment ?: "Document"}",
                        style = MaterialTheme.typography.bodyMedium,
                        fontStyle = FontStyle.Italic
                    )
                }
            }
        }
    }
}

data class UploadResult(val downloadUrl: String, val fileName: String)

suspend fun safeUploadMediaWithName(uri: Uri, storageRef: StorageReference, context: Context): UploadResult {
    return withContext(Dispatchers.IO) {
        val id = UUID.randomUUID().toString()
        val originalName = uri.lastPathSegment ?: "$id.bin"
        val safeName = originalName.takeIf { it.isNotBlank() } ?: "$id.bin"
        val ref = storageRef.child("activities/$id/$safeName")
        val mimeType = context.contentResolver.getType(uri) ?: "application/octet-stream"
        val metadata = StorageMetadata.Builder().setContentType(mimeType).build()

        val tempFile = File(context.cacheDir, safeName)
        context.contentResolver.openInputStream(uri)?.use { input ->
            FileOutputStream(tempFile).use { output -> input.copyTo(output) }
        }
        val tempUri = Uri.fromFile(tempFile)

        ref.putFile(tempUri, metadata).await()
        val downloadUrl = ref.downloadUrl.await().toString()
        tempFile.delete()
        UploadResult(downloadUrl = downloadUrl, fileName = safeName)
    }
}

suspend fun saveActivityToFirestore(
    firestore: FirebaseFirestore,
    title: String,
    description: String,
    type: String,
    points: Int,
    fileUrl: String?,
    fileName: String?
) {
    val id = UUID.randomUUID().toString()
    val activityData = hashMapOf(
        "id" to id,
        "title" to title,
        "description" to description,
        "type" to type,
        "points" to points,
        "fileUri" to fileUrl, // Key updated to match module logic
        "fileName" to fileName,
        "timestamp" to FieldValue.serverTimestamp()
    )
    firestore.collection("activities").document(id).set(activityData).await()
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ManageSummativesScreen(
    summatives: MutableList<SummativeAssessment>,
    onBack: () -> Unit,
    onAddSummative: () -> Unit, // ✅ Changed: just a callback, no parameter
    onEditSummative: (Int) -> Unit, // ✅ Changed: just pass index
    onDeleteSummative: () -> Unit // ✅ Changed: just a callback
) {
    val context = LocalContext.current
    val db = remember { Firebase.firestore }

    var showAddScreen by remember { mutableStateOf(false) }
    var editingSummativeIndex by remember { mutableStateOf(-1) }
    var showDeleteDialog by remember { mutableStateOf(false) }
    var indexToDelete by remember { mutableStateOf(-1) }

    val headerStartColor = Color(0xFFFF5722)
    val headerEndColor = Color(0xFFFF8A65)

    // NAVIGATION: Add Screen
    if (showAddScreen) {
        AddOrEditSummativeScreen(
            onSave = { newSummative ->
                db.collection("summatives").document(newSummative.id.toString()).set(newSummative)
                    .addOnSuccessListener {
                        showAddScreen = false
                        onAddSummative() // ✅ Just notify, listener handles the rest
                    }
            },
            onCancel = { showAddScreen = false }
        )
        return
    }

    // NAVIGATION: Edit Screen
    if (editingSummativeIndex != -1) {
        val summativeToEdit = summatives.getOrNull(editingSummativeIndex)
        if (summativeToEdit != null) {
            AddOrEditSummativeScreen(
                existingSummative = summativeToEdit,
                onSave = { updated ->
                    db.collection("summatives").document(updated.id.toString()).set(updated)
                        .addOnSuccessListener {
                            onEditSummative(editingSummativeIndex) // ✅ Just notify
                            editingSummativeIndex = -1
                        }
                },
                onCancel = { editingSummativeIndex = -1 }
            )
            return
        }
    }

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
        Column(modifier = Modifier.fillMaxSize()) {

            // --- HEADER ---
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = headerStartColor,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = onBack, modifier = Modifier.size(40.dp).background(Color.White.copy(0.2f), CircleShape)) {
                            Icon(Icons.Default.ArrowBack, "Back", tint = Color.White)
                        }
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text("Final Exams", style = MaterialTheme.typography.labelLarge, color = Color.White.copy(0.8f))
                            Text("ASSESSMENT", style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.ExtraBold), color = Color.White)
                        }

                        // ✅ ADDED ONLY: PREMIUM GLASS LOGO CONTAINER
                        Spacer(Modifier.weight(1f))
                        Surface(
                            modifier = Modifier.size(52.dp),
                            shape = CircleShape,
                            color = Color.White.copy(alpha = 0.25f),
                            border = BorderStroke(1.dp, Color.White.copy(alpha = 0.4f))
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.Assessment,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(28.dp)
                                )
                            }
                        }
                    }
                }
            }

            // --- LIST CONTENT ---
            if (summatives.isEmpty()) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text("No assessments found.", color = Color.Gray)
                }
            } else {
                val displayList = remember(summatives.size) { summatives.distinctBy { it.id } }

                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp, 24.dp, 16.dp, 100.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    items(
                        items = displayList,
                        key = { it.id }
                    ) { summ ->
                        SummativeAdminCard(
                            summative = summ,
                            headerColor = headerStartColor,
                            onEdit = {
                                editingSummativeIndex = summatives.indexOfFirst { it.id == summ.id }
                            },
                            onDelete = {
                                indexToDelete = summatives.indexOfFirst { it.id == summ.id }
                                showDeleteDialog = true
                            }
                        )
                    }
                }
            }
        }

        ExtendedFloatingActionButton(
            onClick = { showAddScreen = true },
            containerColor = headerStartColor,
            contentColor = Color.White,
            modifier = Modifier.align(Alignment.BottomEnd).padding(24.dp),
            icon = { Icon(Icons.Default.Add, null) },
            text = { Text("New Summative") }
        )
    }

    // --- DELETE DIALOG ---
    if (showDeleteDialog && indexToDelete != -1) {
        val targetSummative = summatives.getOrNull(indexToDelete)
        if (targetSummative != null) {
            AlertDialog(
                onDismissRequest = { showDeleteDialog = false },
                title = { Text("Delete Assessment") },
                text = { Text("Permanently delete '${targetSummative.title}'?") },
                confirmButton = {
                    TextButton(onClick = {
                        val idToDelete = targetSummative.id.toString()
                        db.collection("summatives").document(idToDelete).delete()
                            .addOnSuccessListener {
                                onDeleteSummative() // ✅ Just notify
                                showDeleteDialog = false
                                indexToDelete = -1
                                Toast.makeText(context, "Deleted", Toast.LENGTH_SHORT).show()
                            }
                    }) { Text("Delete", color = Color.Red, fontWeight = FontWeight.Bold) }
                },
                dismissButton = {
                    TextButton(onClick = {
                        showDeleteDialog = false
                        indexToDelete = -1
                    }) { Text("Cancel") }
                }
            )
        }
    }
}
@Composable
fun SummativeAdminCard(
    summative: SummativeAssessment,
    headerColor: Color,
    onEdit: () -> Unit,
    onDelete: () -> Unit
) {
    // Optimization: Only re-calculate points if the summative data actually changes
    val totalPoints = remember(summative) {
        summative.questions?.sumOf { it.points?.toInt() ?: 0 } ?: 0
    }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(24.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Surface(
                    color = headerColor.copy(0.1f),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        "EXAM",
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                        style = MaterialTheme.typography.labelSmall,
                        color = headerColor,
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(Modifier.weight(1f))
                Text(
                    "${summative.durationMinutes} min",
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            }

            Text(
                summative.title,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            // --- QUICK STATS ROW ---
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                InfoTag(Icons.Default.List, "${summative.questions?.size ?: 0} Items")
                // Displaying max retakes vs current usage
                InfoTag(Icons.Default.Refresh, "Limit: ${summative.maxRetakes}")
                InfoTag(Icons.Default.Stars, "$totalPoints Pts")
            }

            HorizontalDivider(
                modifier = Modifier.padding(vertical = 16.dp),
                thickness = 0.5.dp,
                color = Color.LightGray.copy(0.5f)
            )

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(
                    onClick = onEdit,
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = headerColor)
                ) {
                    Icon(Icons.Default.Edit, null, modifier = Modifier.size(16.dp))
                    Spacer(Modifier.width(8.dp))
                    Text("Manage")
                }

                IconButton(
                    onClick = onDelete,
                    modifier = Modifier
                        .size(48.dp)
                        .background(Color(0xFFFFEBEE), RoundedCornerShape(12.dp))
                ) {
                    Icon(Icons.Default.DeleteOutline, null, tint = Color.Red)
                }
            }
        }
    }
}

@Composable
fun InfoTag(icon: ImageVector, text: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(icon, null, modifier = Modifier.size(14.dp), tint = Color.Gray)
        Spacer(Modifier.width(4.dp))
        Text(text, style = MaterialTheme.typography.bodySmall, color = Color.Gray)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddOrEditSummativeScreen(
    existingSummative: SummativeAssessment? = null,
    summativeIndex: Int? = null,
    onSave: (SummativeAssessment) -> Unit,
    onCancel: () -> Unit
) {
    // --- STATE MANAGEMENT ---
    var title by remember { mutableStateOf(existingSummative?.title ?: "") }
    var duration by remember { mutableStateOf(existingSummative?.durationMinutes?.toString() ?: "30") }
    var maxRetakes by remember { mutableStateOf(existingSummative?.maxRetakes?.toString() ?: "1") }

    val questions = remember {
        mutableStateListOf<Question>().apply {
            existingSummative?.questions?.let { addAll(it) }
        }
    }

    var questionText by remember { mutableStateOf("") }
    var questionType by remember { mutableStateOf(QuestionType.MULTIPLE_CHOICE) }
    var optionsText by remember { mutableStateOf("") }
    var correctAnswer by remember { mutableStateOf("") }
    var pointsText by remember { mutableStateOf("5") }
    var possibleAnswersText by remember { mutableStateOf("") }

    val headerStartColor = Color(0xFFFF5722)
    val headerEndColor = Color(0xFFFF8A65)

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
        Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {

            // --- HEADER ---
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = headerStartColor,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = onCancel, modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)) {
                            Icon(Icons.Default.ArrowBack, "Back", tint = Color.White)
                        }
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text(if (existingSummative == null) "New Assessment" else "Update Exam", color = Color.White.copy(0.8f), style = MaterialTheme.typography.labelLarge)
                            Text("ASSESSMENT EDITOR", style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.ExtraBold), color = Color.White)
                        }
                    }
                }
            }

            Spacer(Modifier.height(24.dp))

            // --- SECTION 1: EXAM CONFIGURATION ---
            Card(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(modifier = Modifier.padding(20.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
                    Text("General Settings", fontWeight = FontWeight.Bold, color = headerStartColor)

                    OutlinedTextField(
                        value = title,
                        onValueChange = { title = it },
                        label = { Text("Exam Title") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp)
                    )

                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                        OutlinedTextField(
                            value = duration,
                            onValueChange = { if(it.all { char -> char.isDigit() }) duration = it },
                            label = { Text("Mins") },
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(12.dp),
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                        )
                        OutlinedTextField(
                            value = maxRetakes,
                            onValueChange = { if(it.all { char -> char.isDigit() }) maxRetakes = it },
                            label = { Text("Retakes") },
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(12.dp),
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                        )
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            // --- SECTION 2: QUESTION COMPOSER ---
            Card(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                border = BorderStroke(1.dp, headerStartColor.copy(0.2f))
            ) {
                Column(modifier = Modifier.padding(20.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    Text("Add Question", fontWeight = FontWeight.Bold, color = headerStartColor)

                    OutlinedTextField(
                        value = questionText,
                        onValueChange = { questionText = it },
                        label = { Text("Question Text") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp)
                    )

                    Row(modifier = Modifier.horizontalScroll(rememberScrollState()).padding(vertical = 4.dp)) {
                        QuestionType.entries.forEach { type ->
                            FilterChip(
                                selected = questionType == type,
                                onClick = {
                                    questionType = type
                                    correctAnswer = ""
                                },
                                label = { Text(type.name.lowercase().replaceFirstChar { it.uppercase() }) },
                                modifier = Modifier.padding(end = 8.dp),
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = headerStartColor,
                                    selectedLabelColor = Color.White
                                )
                            )
                        }
                    }

                    when (questionType) {
                        QuestionType.MULTIPLE_CHOICE -> {
                            OutlinedTextField(value = optionsText, onValueChange = { optionsText = it }, label = { Text("Options (A, B, C, D)") }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp))
                            OutlinedTextField(value = correctAnswer, onValueChange = { correctAnswer = it }, label = { Text("Correct Option") }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp))
                        }
                        QuestionType.IDENTIFICATION -> {
                            OutlinedTextField(value = correctAnswer, onValueChange = { correctAnswer = it }, label = { Text("Primary Answer") }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp))
                            OutlinedTextField(value = possibleAnswersText, onValueChange = { possibleAnswersText = it }, label = { Text("Accepted Variants (comma separated)") }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(12.dp))
                        }
                        QuestionType.TRUE_FALSE -> {
                            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                listOf("True", "False").forEach { choice ->
                                    val isSel = correctAnswer == choice
                                    Button(
                                        onClick = { correctAnswer = choice },
                                        modifier = Modifier.weight(1f),
                                        colors = ButtonDefaults.buttonColors(containerColor = if(isSel) headerStartColor else Color(0xFFF0F2F5)),
                                        shape = RoundedCornerShape(8.dp)
                                    ) {
                                        Text(choice, color = if(isSel) Color.White else Color.Black)
                                    }
                                }
                            }
                        }
                        else -> {}
                    }

                    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(top = 8.dp)) {
                        OutlinedTextField(value = pointsText, onValueChange = { pointsText = it }, label = { Text("Pts") }, modifier = Modifier.width(80.dp), keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number), shape = RoundedCornerShape(12.dp))
                        Spacer(Modifier.width(12.dp))
                        Button(
                            onClick = {
                                if (questionText.isNotBlank()) {
                                    questions.add(Question(
                                        questionText = questionText,
                                        type = questionType,
                                        options = optionsText.split(",").map { it.trim() }.filter { it.isNotEmpty() },
                                        correctAnswer = correctAnswer,
                                        points = pointsText.toIntOrNull() ?: 5,
                                        possibleAnswers = possibleAnswersText.split(",").map { it.trim() }.filter { it.isNotEmpty() }
                                    ))
                                    questionText = ""; optionsText = ""; correctAnswer = ""; pointsText = "5"; possibleAnswersText = ""
                                }
                            },
                            modifier = Modifier.fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Icon(Icons.Default.Add, null)
                            Spacer(Modifier.width(8.dp))
                            Text("Insert Question")
                        }
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            // --- SECTION 3: QUESTION PREVIEW ---
            Text("Review Questions (${questions.size})", modifier = Modifier.padding(horizontal = 24.dp), style = MaterialTheme.typography.labelLarge, color = Color.Gray)

            questions.forEachIndexed { index, q ->
                Card(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 4.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Row(Modifier.padding(12.dp), verticalAlignment = Alignment.CenterVertically) {
                        Surface(color = headerStartColor.copy(0.1f), shape = CircleShape, modifier = Modifier.size(24.dp)) {
                            Box(contentAlignment = Alignment.Center) {
                                Text("${index + 1}", color = headerStartColor, style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.Bold)
                            }
                        }
                        Spacer(Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(q.questionText, style = MaterialTheme.typography.bodyMedium, maxLines = 1, overflow = TextOverflow.Ellipsis)
                            Text("${q.type.name} • ${q.points} Pts", style = MaterialTheme.typography.labelSmall, color = Color.Gray)
                        }
                        IconButton(onClick = { questions.removeAt(index) }) {
                            Icon(Icons.Default.Delete, null, tint = Color.Red.copy(0.6f), modifier = Modifier.size(20.dp))
                        }
                    }
                }
            }

            // --- FINAL ACTIONS ---
            Row(modifier = Modifier.fillMaxWidth().padding(24.dp), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                TextButton(onClick = onCancel, modifier = Modifier.weight(1f)) { Text("Discard") }
                Button(
                    modifier = Modifier.weight(1.5f),
                    colors = ButtonDefaults.buttonColors(containerColor = headerStartColor),
                    shape = RoundedCornerShape(16.dp),
                    onClick = {
                        if (title.isNotBlank() && questions.isNotEmpty()) {
                            // FIXED: Added Random import
                            val finalId = existingSummative?.id ?: (Random.nextInt(1000000, 9999999))

                            val newSummative = SummativeAssessment(
                                id = finalId,
                                title = title,
                                durationMinutes = duration.toIntOrNull() ?: 30,
                                // FIXED: Using .toMutableList() to match MutableList parameter
                                questions = questions.toMutableList(),
                                maxRetakes = maxRetakes.toIntOrNull() ?: 1,
                                retakeCount = existingSummative?.retakeCount ?: 0,
                                submittedAnswers = existingSummative?.submittedAnswers ?: mutableMapOf()
                            )
                            onSave(newSummative)
                        }
                    }
                ) {
                    Text("Save Exam", fontWeight = FontWeight.Bold)
                }
            }
            Spacer(Modifier.height(40.dp))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddOrEditSummativeQuestionScreen(
    existingQuestion: Question? = null,
    onSave: (Question) -> Unit,
    onCancel: () -> Unit
) {
    val headerStartColor = Color(0xFFFF5722)
    val headerEndColor = Color(0xFFFF8A65)

    var questionText by remember { mutableStateOf(existingQuestion?.questionText ?: "") }
    var questionType by remember { mutableStateOf(existingQuestion?.type ?: QuestionType.MULTIPLE_CHOICE) }
    var pointsText by remember { mutableStateOf(existingQuestion?.points?.toString() ?: "5") }

    // Using a list state that is easier to modify without triggering unnecessary recompositions
    var optionsList by remember {
        mutableStateOf(existingQuestion?.options ?: listOf("", "", "", ""))
    }
    var correctAnswer by remember { mutableStateOf(existingQuestion?.correctAnswer ?: "") }
    var possibleAnswersText by remember { mutableStateOf(existingQuestion?.possibleAnswers?.joinToString(", ") ?: "") }

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF0F2F5))) {
        Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {

            // --- HEADER ---
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = headerStartColor,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(headerStartColor, headerEndColor)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onCancel,
                            modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)
                        ) {
                            Icon(Icons.Default.Close, "Close", tint = Color.White)
                        }
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text(if (existingQuestion == null) "New Item" else "Edit Item", color = Color.White.copy(0.8f))
                            Text("QUESTION EDITOR", style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.ExtraBold), color = Color.White)
                        }
                    }
                }
            }

            Spacer(Modifier.height(24.dp))

            Card(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(modifier = Modifier.padding(20.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {

                    Text("Question Details", fontWeight = FontWeight.Bold, color = headerStartColor)

                    OutlinedTextField(
                        value = questionText,
                        onValueChange = { questionText = it },
                        label = { Text("Question Text") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp)
                    )

                    OutlinedTextField(
                        value = pointsText,
                        onValueChange = { if (it.all { c -> c.isDigit() }) pointsText = it },
                        label = { Text("Points Allocation") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        leadingIcon = { Icon(Icons.Default.Stars, null, tint = headerStartColor) }
                    )

                    Text("Question Type", style = MaterialTheme.typography.labelMedium, color = Color.Gray)
                    Row(modifier = Modifier.horizontalScroll(rememberScrollState()), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        // Use .entries instead of .values()
                        QuestionType.entries.forEach { type ->
                            FilterChip(
                                selected = questionType == type,
                                onClick = {
                                    questionType = type
                                    // Clear answers to prevent type-mismatch data
                                    if(existingQuestion?.type != type) correctAnswer = ""
                                },
                                label = { Text(type.name.replace("_", " ").lowercase().replaceFirstChar { it.uppercase() }) },
                                colors = FilterChipDefaults.filterChipColors(selectedContainerColor = headerStartColor, selectedLabelColor = Color.White)
                            )
                        }
                    }

                    HorizontalDivider(thickness = 0.5.dp, color = Color.LightGray.copy(0.5f))

                    when (questionType) {
                        QuestionType.MULTIPLE_CHOICE -> {
                            Text("Options (Select the correct one)", style = MaterialTheme.typography.labelSmall, color = headerStartColor)
                            optionsList.forEachIndexed { index, opt ->
                                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(vertical = 4.dp)) {
                                    RadioButton(
                                        selected = (correctAnswer == opt && opt.isNotBlank()),
                                        onClick = { correctAnswer = opt },
                                        colors = RadioButtonDefaults.colors(selectedColor = headerStartColor)
                                    )
                                    OutlinedTextField(
                                        value = opt,
                                        onValueChange = { newValue ->
                                            val newList = optionsList.toMutableList()
                                            if (correctAnswer == opt) correctAnswer = newValue
                                            newList[index] = newValue
                                            optionsList = newList
                                        },
                                        placeholder = { Text("Option ${index + 1}") },
                                        modifier = Modifier.weight(1f),
                                        shape = RoundedCornerShape(12.dp)
                                    )
                                }
                            }
                        }

                        QuestionType.IDENTIFICATION -> {
                            OutlinedTextField(
                                value = correctAnswer,
                                onValueChange = { correctAnswer = it },
                                label = { Text("Primary Answer") },
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(12.dp)
                            )
                            OutlinedTextField(
                                value = possibleAnswersText,
                                onValueChange = { possibleAnswersText = it },
                                label = { Text("Accepted Variants (comma separated)") },
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(12.dp)
                            )
                        }

                        QuestionType.TRUE_FALSE -> {
                            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                                listOf("True", "False").forEach { choice ->
                                    FilterChip(
                                        modifier = Modifier.weight(1f),
                                        selected = correctAnswer == choice,
                                        onClick = { correctAnswer = choice },
                                        label = { Text(choice, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center) },
                                        shape = RoundedCornerShape(12.dp)
                                    )
                                }
                            }
                        }

                        else -> { // Essay
                            Surface(
                                color = Color(0xFFFFF3E0),
                                shape = RoundedCornerShape(12.dp),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    "Note: Essay questions are manually graded and won't have an automated 'correct' answer.",
                                    modifier = Modifier.padding(16.dp),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = Color(0xFFE65100)
                                )
                            }
                            correctAnswer = ""
                        }
                    }
                }
            }

            // --- BOTTOM ACTIONS ---
            Row(
                modifier = Modifier.fillMaxWidth().padding(24.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                TextButton(onClick = onCancel, modifier = Modifier.weight(1f)) {
                    Text("Discard", color = Color.Gray)
                }
                Button(
                    onClick = {
                        if (questionText.isNotBlank()) {
                            onSave(
                                Question(
                                    questionText = questionText,
                                    type = questionType,
                                    options = if (questionType == QuestionType.MULTIPLE_CHOICE) optionsList.filter { it.isNotBlank() } else emptyList(),
                                    correctAnswer = correctAnswer,
                                    points = pointsText.toIntOrNull() ?: 1,
                                    possibleAnswers = possibleAnswersText.split(",").map { it.trim() }.filter { it.isNotEmpty() }
                                )
                            )
                        }
                    },
                    modifier = Modifier.weight(1.5f),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = headerStartColor)
                ) {
                    Text("Save Question", fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    role: String,
    studentName: String = "", // ✅ ADDED
    studentNumber: String = "", // ✅ ADDED
    darkMode: Boolean,
    notificationsEnabled: Boolean,
    onDarkModeChange: (Boolean) -> Unit,
    onNotificationsChange: (Boolean) -> Unit,
    onBack: () -> Unit,
    onLogout: () -> Unit
) {
    var showLogoutDialog by remember { mutableStateOf(false) }
    val scale = remember { Animatable(1f) }

    val baseSlate = Color(0xFF607D8B)
    val darkSlate = Color(0xFF455A64)

    val backgroundColor by animateColorAsState(
        targetValue = if (darkMode) Color(0xFF121212) else Color(0xFFF8F9FA),
        animationSpec = tween(500)
    )

    val cardColor = if (darkMode) Color(0xFF1E1E1E) else Color.White
    val textColor = if (darkMode) Color.White else Color.Black

    Box(modifier = Modifier.fillMaxSize().background(backgroundColor)) {
        Column(modifier = Modifier.fillMaxSize()) {

            // --- HEADER ---
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = baseSlate,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(baseSlate, darkSlate)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onBack,
                            modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)
                        ) {
                            Icon(Icons.Default.ArrowBack, "Back", tint = Color.White)
                        }
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text("Preferences", style = MaterialTheme.typography.labelLarge, color = Color.White.copy(0.8f))
                            Text(
                                "SETTINGS",
                                style = MaterialTheme.typography.headlineSmall.copy(
                                    fontWeight = FontWeight.ExtraBold,
                                    letterSpacing = 1.sp
                                ),
                                color = Color.White
                            )
                        }
                        Spacer(Modifier.weight(1f))
                        Icon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = null,
                            tint = Color.White.copy(0.3f),
                            modifier = Modifier.size(44.dp)
                        )
                    }
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // --- PREFERENCES SECTION ---
                Text("App Preferences", fontWeight = FontWeight.Bold, color = Color.Gray, fontSize = 14.sp)

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = cardColor),
                    elevation = CardDefaults.cardElevation(2.dp)
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        SettingsToggleRow(
                            icon = if (darkMode) Icons.Default.DarkMode else Icons.Default.LightMode,
                            title = "Dark Mode",
                            checked = darkMode,
                            onCheckedChange = onDarkModeChange,
                            accentColor = Color(0xFFFFD54F)
                        )
                        Divider(
                            modifier = Modifier.padding(horizontal = 16.dp),
                            thickness = 0.5.dp,
                            color = Color.LightGray.copy(0.4f)
                        )
                        SettingsToggleRow(
                            icon = Icons.Default.Notifications,
                            title = "Notifications",
                            checked = notificationsEnabled,
                            onCheckedChange = onNotificationsChange,
                            accentColor = Color(0xFF42A5F5)
                        )
                    }
                }

                // --- PROFILE SECTION (Students only) ---
                if (role == "student") {
                    Text("User Account", fontWeight = FontWeight.Bold, color = Color.Gray, fontSize = 14.sp)
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(20.dp),
                        colors = CardDefaults.cardColors(containerColor = cardColor),
                        elevation = CardDefaults.cardElevation(2.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(20.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            // ✅ Replaced avatar image with initial letter
                            Surface(
                                modifier = Modifier.size(60.dp),
                                shape = CircleShape,
                                color = baseSlate.copy(0.15f),
                                border = BorderStroke(2.dp, baseSlate.copy(0.5f))
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Text(
                                        text = studentName.take(1).uppercase(),
                                        fontWeight = FontWeight.ExtraBold,
                                        fontSize = 24.sp,
                                        color = baseSlate
                                    )
                                }
                            }
                            Spacer(Modifier.width(16.dp))
                            Column {
                                // ✅ Real student name
                                Text(
                                    text = studentName.ifBlank { "Student" },
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp,
                                    color = textColor
                                )
                                // ✅ Real LRN
                                Text(
                                    text = if (studentNumber.isNotBlank()) "LRN: $studentNumber" else "No LRN on file",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = Color.Gray
                                )
                                Surface(
                                    modifier = Modifier.padding(top = 4.dp),
                                    shape = RoundedCornerShape(4.dp),
                                    color = baseSlate.copy(0.1f)
                                ) {
                                    Text(
                                        "ACTIVE STUDENT",
                                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = baseSlate
                                    )
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(40.dp))

                // --- LOGOUT BUTTON ---
                Button(
                    onClick = { showLogoutDialog = true },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .graphicsLayer(scaleX = scale.value, scaleY = scale.value)
                        .pointerInput(Unit) {
                            detectTapGestures(onPress = {
                                scale.animateTo(0.95f)
                                tryAwaitRelease()
                                scale.animateTo(1f)
                            })
                        },
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEF5350))
                ) {
                    Icon(Icons.Default.Logout, null)
                    Spacer(Modifier.width(8.dp))
                    Text("Logout from App", fontWeight = FontWeight.Bold)
                }
            }
        }
    }

    // --- LOGOUT DIALOG ---
    if (showLogoutDialog) {
        AlertDialog(
            onDismissRequest = { showLogoutDialog = false },
            icon = { Icon(Icons.Default.Warning, contentDescription = null, tint = Color(0xFFEF5350)) },
            title = { Text("Confirm Logout") },
            text = { Text("Are you sure you want to sign out? You will need to log in again to access your modules.") },
            confirmButton = {
                Button(
                    onClick = { showLogoutDialog = false; onLogout() },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEF5350))
                ) { Text("Logout") }
            },
            dismissButton = {
                TextButton(onClick = { showLogoutDialog = false }) { Text("Cancel") }
            }
        )
    }
}

@Composable
fun SettingsToggleRow(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    accentColor: Color
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Surface(
            modifier = Modifier.size(36.dp),
            shape = RoundedCornerShape(10.dp),
            color = accentColor.copy(0.1f)
        ) {
            Icon(icon, null, tint = accentColor, modifier = Modifier.padding(8.dp))
        }
        Spacer(Modifier.width(16.dp))
        Text(
            title,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.weight(1f)
        )
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.White,
                checkedTrackColor = accentColor
            )
        )
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StudentSubmittedItems(
    quizzes: List<Quiz>,
    activities: List<ActivityItem>,
    summatives: List<SummativeAssessment>,
    studentsList: List<Student>,
    onViewSubmission: (studentName: String, title: String, results: List<Pair<String, String>>) -> Unit,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    // ✅ FIXED: derivedStateOf so it recomputes when studentsList changes
    val studentLookup by remember(studentsList) {
        derivedStateOf {
            val byUid = studentsList.filter { it.uid.isNotBlank() }.associateBy { it.uid }
            val byUsername = studentsList.associateBy { it.username }
            byUid to byUsername
        }
    }

    fun getStudentName(uid: String): String {
        return studentLookup.first[uid]?.name
            ?: studentLookup.second[uid]?.name
            ?: "Student ($uid)" // ✅ shows uid for debugging if still not found
    }

    val primaryTeal = Color(0xFF009688)
    val secondaryTeal = Color(0xFF26A69A)

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF9FAFB))) {
        Column(modifier = Modifier.fillMaxSize()) {

            // --- HEADER ---
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = primaryTeal,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .background(Brush.verticalGradient(listOf(primaryTeal, secondaryTeal)))
                        .padding(top = 48.dp, bottom = 32.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onBack,
                            modifier = Modifier.background(Color.White.copy(0.2f), CircleShape)
                        ) {
                            Icon(Icons.Default.ArrowBack, "Back", tint = Color.White)
                        }
                        Spacer(Modifier.width(16.dp))
                        Column {
                            Text("Review Center", style = MaterialTheme.typography.labelLarge, color = Color.White.copy(0.8f))
                            Text("SUBMISSIONS", style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.ExtraBold), color = Color.White)
                        }
                        Spacer(Modifier.weight(1f))
                        Surface(
                            modifier = Modifier.size(52.dp),
                            shape = CircleShape,
                            color = Color.White.copy(alpha = 0.25f),
                            border = BorderStroke(1.dp, Color.White.copy(alpha = 0.4f))
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.FactCheck,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(28.dp)
                                )
                            }
                        }
                    }
                }
            }

            Column(
                modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(vertical = 16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                // --- QUIZZES ---
                AdminSubmissionCard(
                    title = "Quiz Results",
                    items = quizzes,
                    accentColor = Color(0xFF2196F3),
                    getStudentSubmissions = { quiz ->
                        quiz.submittedAnswersPerStudent.keys.map { uid ->
                            val name = getStudentName(uid)
                            val answers = quiz.submittedAnswersPerStudent[uid] ?: emptyList()
                            val correct = answers.mapIndexed { i, ans ->
                                val q = quiz.questions.getOrNull(i)
                                q?.correctAnswer?.trim()?.lowercase() == ans?.trim()?.lowercase()
                            }.count { it }
                            val total = quiz.questions.size
                            Triple(name, "Score: $correct/$total", uid)
                        }
                    },
                    onRowClick = { quiz, uid ->
                        val name = getStudentName(uid)
                        val ans = quiz.submittedAnswersPerStudent[uid] ?: emptyList()
                        val results = quiz.questions.mapIndexed { i, q ->
                            q.questionText to (ans.getOrNull(i) ?: "N/A")
                        }
                        onViewSubmission(name, quiz.title, results)
                    },
                    onDownload = { quiz, uid ->
                        val name = getStudentName(uid)
                        val ans = quiz.submittedAnswersPerStudent[uid] ?: emptyList()
                        val content = buildString {
                            appendLine("Quiz: ${quiz.title}")
                            appendLine("Student: $name")
                            appendLine("Date: ${java.text.SimpleDateFormat("MMM dd, yyyy", java.util.Locale.getDefault()).format(java.util.Date())}")
                            appendLine()
                            quiz.questions.forEachIndexed { i, q ->
                                appendLine("Question ${i + 1}: ${q.questionText}")
                                appendLine("Answer: ${ans.getOrNull(i) ?: "No answer"}")
                                appendLine()
                            }
                        }
                        saveTextToDownloads(context, "Quiz_${name}_${quiz.title}.txt", content)
                        Toast.makeText(context, "Downloaded to Downloads folder", Toast.LENGTH_SHORT).show()
                    }
                )

                // --- ACTIVITIES ---
                AdminSubmissionCard(
                    title = "Activity Files",
                    items = activities,
                    accentColor = Color(0xFF009688),
                    getStudentSubmissions = { activity ->
                        activity.submittedByStudentIds.map { uid ->
                            val name = getStudentName(uid)
                            val hasFile = !activity.submittedFileUrisPerStudent[uid].isNullOrBlank()
                            val hasText = !activity.submittedAnswersPerStudent[uid].isNullOrBlank()
                            val summary = when {
                                hasFile && hasText -> "File + Text submitted"
                                hasFile -> "File submitted"
                                hasText -> "Text submitted"
                                else -> "Submission recorded"
                            }
                            Triple(name, summary, uid)
                        }
                    },
                    onRowClick = { activity, uid ->
                        val name = getStudentName(uid)
                        val fileUrl = activity.submittedFileUrisPerStudent[uid]
                        val textContent = activity.submittedAnswersPerStudent[uid]
                        if (!fileUrl.isNullOrBlank()) {
                            try {
                                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(fileUrl))
                                context.startActivity(intent)
                            } catch (e: Exception) {
                                Toast.makeText(context, "Cannot open file: ${e.message}", Toast.LENGTH_SHORT).show()
                            }
                        } else if (!textContent.isNullOrBlank()) {
                            onViewSubmission(name, activity.title, listOf("Submitted Content" to textContent))
                        } else {
                            Toast.makeText(context, "No content to view", Toast.LENGTH_SHORT).show()
                        }
                    },
                    onDownload = { activity, uid ->
                        val name = getStudentName(uid)
                        val fileUrl = activity.submittedFileUrisPerStudent[uid]
                        val textContent = activity.submittedAnswersPerStudent[uid]
                        if (!fileUrl.isNullOrBlank()) {
                            scope.launch {
                                try {
                                    val storageRef = Firebase.storage.getReferenceFromUrl(fileUrl)
                                    val fileName = "Activity_${name}_${activity.title}_${storageRef.name}"
                                    val downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                                    val localFile = File(downloadsDir, fileName)
                                    storageRef.getFile(localFile).await()
                                    withContext(Dispatchers.Main) {
                                        Toast.makeText(context, "Downloaded: $fileName", Toast.LENGTH_SHORT).show()
                                    }
                                } catch (e: Exception) {
                                    withContext(Dispatchers.Main) {
                                        try {
                                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(fileUrl))
                                            context.startActivity(intent)
                                            Toast.makeText(context, "Opening file in browser...", Toast.LENGTH_SHORT).show()
                                        } catch (ex: Exception) {
                                            Toast.makeText(context, "Cannot download: ${ex.message}", Toast.LENGTH_SHORT).show()
                                        }
                                    }
                                }
                            }
                        } else if (!textContent.isNullOrBlank()) {
                            val content = buildString {
                                appendLine("Activity: ${activity.title}")
                                appendLine("Student: $name")
                                appendLine()
                                appendLine(textContent)
                            }
                            saveTextToDownloads(context, "Activity_${name}_${activity.title}.txt", content)
                            Toast.makeText(context, "Downloaded to Downloads folder", Toast.LENGTH_SHORT).show()
                        } else {
                            Toast.makeText(context, "No content to download", Toast.LENGTH_SHORT).show()
                        }
                    },
                    showFileIcon = { activity, uid ->
                        !activity.submittedFileUrisPerStudent[uid].isNullOrBlank()
                    }
                )

                // --- SUMMATIVES ---
                AdminSubmissionCard(
                    title = "Final Assessments",
                    items = summatives,
                    accentColor = Color(0xFFFF5722),
                    getStudentSubmissions = { summative ->
                        summative.submittedAnswersPerStudent.keys.map { uid ->
                            val name = getStudentName(uid)
                            val answers = summative.submittedAnswersPerStudent[uid] ?: emptyList()
                            val totalPoints = summative.questions.sumOf { it.points?.toInt() ?: 0 }
                            val earnedPoints = summative.questions.mapIndexed { i, q ->
                                val studentAns = answers.getOrNull(i)?.trim()?.lowercase() ?: ""
                                val correctAns = q.correctAnswer?.trim()?.lowercase() ?: ""
                                if (studentAns == correctAns && studentAns.isNotEmpty()) q.points?.toInt() ?: 0 else 0
                            }.sum()
                            val percentage = if (totalPoints > 0) (earnedPoints.toFloat() / totalPoints * 100).toInt() else 0
                            val status = if (percentage >= 60) "PASSED" else "FAILED"
                            Triple(name, "$earnedPoints/$totalPoints pts - $status", uid)
                        }
                    },
                    onRowClick = { summative, uid ->
                        val name = getStudentName(uid)
                        val ans = summative.submittedAnswersPerStudent[uid] ?: emptyList()
                        val results = summative.questions.mapIndexed { i, q ->
                            q.questionText to (ans.getOrNull(i) ?: "N/A")
                        }
                        onViewSubmission(name, summative.title, results)
                    },
                    onDownload = { summative, uid ->
                        val name = getStudentName(uid)
                        val answers = summative.submittedAnswersPerStudent[uid] ?: emptyList()
                        val totalPoints = summative.questions.sumOf { it.points?.toInt() ?: 0 }
                        val earnedPoints = summative.questions.mapIndexed { i, q ->
                            val studentAns = answers.getOrNull(i)?.trim()?.lowercase() ?: ""
                            val correctAns = q.correctAnswer?.trim()?.lowercase() ?: ""
                            if (studentAns == correctAns && studentAns.isNotEmpty()) q.points?.toInt() ?: 0 else 0
                        }.sum()
                        val percentage = if (totalPoints > 0) (earnedPoints.toFloat() / totalPoints * 100).toInt() else 0
                        val content = buildString {
                            appendLine("Summative Assessment: ${summative.title}")
                            appendLine("Student: $name")
                            appendLine("Score: $earnedPoints / $totalPoints points ($percentage%)")
                            appendLine("Status: ${if (percentage >= 60) "PASSED" else "FAILED"}")
                            appendLine()
                            summative.questions.forEachIndexed { i, q ->
                                val studentAns = answers.getOrNull(i) ?: "No answer"
                                val isCorrect = studentAns.trim().lowercase() == q.correctAnswer?.trim()?.lowercase()
                                appendLine("Question ${i + 1} (${q.points ?: 0} points): ${q.questionText}")
                                appendLine("Student Answer: $studentAns")
                                appendLine("Correct Answer: ${q.correctAnswer}")
                                appendLine("Result: ${if (isCorrect) "✓ Correct" else "✗ Incorrect"}")
                                appendLine()
                            }
                        }
                        saveTextToDownloads(context, "Summative_${name}_${summative.title}.txt", content)
                        Toast.makeText(context, "Downloaded to Downloads folder", Toast.LENGTH_SHORT).show()
                    }
                )

                Spacer(Modifier.height(40.dp))
            }
        }
    }
}

@Composable
fun <T> AdminSubmissionCard(
    title: String,
    items: List<T>,
    accentColor: Color,
    getStudentSubmissions: (T) -> List<Triple<String, String, String>>,
    onRowClick: (T, String) -> Unit,
    onDownload: ((T, String) -> Unit)? = null,
    showFileIcon: ((T, String) -> Boolean)? = null
) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth().clickable { expanded = !expanded }.padding(vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(modifier = Modifier.size(40.dp), shape = CircleShape, color = accentColor.copy(0.1f)) {
                    Icon(Icons.Default.Folder, null, tint = accentColor, modifier = Modifier.padding(10.dp))
                }
                Spacer(Modifier.width(12.dp))
                Text(title, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.ExtraBold, modifier = Modifier.weight(1f))
                Icon(imageVector = if (expanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore, contentDescription = null, tint = Color.Gray)
            }

            AnimatedVisibility(visible = expanded) {
                Column(modifier = Modifier.padding(top = 16.dp)) {
                    if (items.isEmpty()) {
                        Text(
                            "No submissions yet",
                            modifier = Modifier.padding(8.dp),
                            color = Color.Gray,
                            style = MaterialTheme.typography.bodySmall
                        )
                    } else {
                        items.forEach { item ->
                            getStudentSubmissions(item).forEach { (name, summary, uid) ->
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 4.dp)
                                        .background(accentColor.copy(0.05f), RoundedCornerShape(12.dp))
                                        .padding(12.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .weight(1f)
                                            .clickable { onRowClick(item, uid) }
                                            .padding(4.dp)
                                    ) {
                                        Text(name, fontWeight = FontWeight.Bold, color = Color(0xFF2D3436))
                                        Spacer(Modifier.height(4.dp))
                                        Row(verticalAlignment = Alignment.CenterVertically) {
                                            if (showFileIcon?.invoke(item, uid) == true) {
                                                Icon(
                                                    Icons.Default.AttachFile,
                                                    null,
                                                    modifier = Modifier.size(14.dp),
                                                    tint = accentColor
                                                )
                                                Spacer(Modifier.width(4.dp))
                                            }
                                            Text(
                                                summary,
                                                fontSize = 12.sp,
                                                color = Color.Gray,
                                                maxLines = 1,
                                                overflow = TextOverflow.Ellipsis
                                            )
                                        }
                                    }
                                    if (onDownload != null) {
                                        IconButton(
                                            onClick = { onDownload(item, uid) },
                                            modifier = Modifier
                                                .size(36.dp)
                                                .background(accentColor, CircleShape)
                                        ) {
                                            Icon(
                                                Icons.Default.Download,
                                                contentDescription = "Download",
                                                tint = Color.White,
                                                modifier = Modifier.size(18.dp)
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SubmissionDetailScreen(
    studentName: String,
    title: String,
    results: List<Pair<String, String>>,
    onBack: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(studentName, style = MaterialTheme.typography.titleMedium)
                        Text(title, style = MaterialTheme.typography.bodySmall)
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBack) { Icon(Icons.Default.ArrowBack, "Back") }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF009688),
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(padding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(results.size) { index ->
                val (question, answer) = results[index]
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(2.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Surface(
                            color = Color(0xFF009688).copy(0.1f),
                            shape = RoundedCornerShape(6.dp)
                        ) {
                            Text(
                                "Question ${index + 1}",
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF009688)
                            )
                        }
                        Spacer(Modifier.height(12.dp))
                        Text(
                            question,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color(0xFF2D3436)
                        )
                        HorizontalDivider(modifier = Modifier.padding(vertical = 12.dp), thickness = 0.5.dp, color = Color.LightGray)
                        Text(
                            "Student's Answer:",
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.Gray,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(Modifier.height(8.dp))
                        Surface(
                            modifier = Modifier.fillMaxWidth(),
                            color = Color(0xFFF8F9FA),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Text(
                                answer.ifBlank { "(No answer provided)" },
                                modifier = Modifier.padding(12.dp),
                                style = MaterialTheme.typography.bodyMedium,
                                color = if (answer.isBlank()) Color.Gray else Color.Black
                            )
                        }
                    }
                }
            }
        }
    }
}

fun saveTextToDownloads(context: android.content.Context, fileName: String, content: String) {
    try {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
            val resolver = context.contentResolver
            val contentValues = android.content.ContentValues().apply {
                put(android.provider.MediaStore.Downloads.DISPLAY_NAME, fileName)
                put(android.provider.MediaStore.Downloads.MIME_TYPE, "text/plain")
                put(android.provider.MediaStore.Downloads.RELATIVE_PATH, android.os.Environment.DIRECTORY_DOWNLOADS)
            }
            val uri = resolver.insert(android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues)
            uri?.let {
                resolver.openOutputStream(it)?.use { out ->
                    out.write(content.toByteArray())
                }
            }
        } else {
            val downloadsDir = android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS)
            val outFile = java.io.File(downloadsDir, fileName)
            outFile.outputStream().use { out -> out.write(content.toByteArray()) }
            android.media.MediaScannerConnection.scanFile(context, arrayOf(outFile.absolutePath), arrayOf("text/plain"), null)
        }
    } catch (e: Exception) {
        android.util.Log.e("SAVE_FILE", "Error: ${e.message}")
    }
}