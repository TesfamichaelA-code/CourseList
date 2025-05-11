package com.example.courselist.ui.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.courselist.model.Course
import com.example.courselist.ui.components.CourseCard
import com.example.courselist.ui.theme.CourseListTheme

@Composable
fun CourseListScreen(
    courses: List<Course>,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(top = 25.dp) // Add top padding here
    ) {
        items(courses) { course ->
            var isExpanded by rememberSaveable(course.id.toString()) {
                mutableStateOf(false)
            }

            CourseCard(
                course = course,
                isExpanded = isExpanded,
                onCardClick = { isExpanded = !isExpanded }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CourseListScreenPreview() {
    CourseListTheme {
        CourseListScreen(courses = Course.sampleCourses)
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "Dark Mode"
)
@Composable
fun CourseListScreenDarkPreview() {
    CourseListScreenPreview()
}