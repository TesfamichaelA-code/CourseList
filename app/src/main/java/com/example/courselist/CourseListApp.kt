package com.example.courselist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.courselist.model.Course
import com.example.courselist.ui.screens.CourseListScreen
import com.example.courselist.ui.theme.CourseListTheme

class CourseListApp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CourseListTheme {
                CourseListScreen(courses = Course.sampleCourses)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CourseListAppPreview() {
    CourseListTheme {
        CourseListScreen(courses = Course.sampleCourses)
    }
}