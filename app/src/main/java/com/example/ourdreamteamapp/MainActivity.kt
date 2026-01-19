package com.example.ourdreamteamapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                DreamTeamApp()
            }
        }
    }
}

@Composable
fun DreamTeamApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") { HomeScreen(navController) }
        composable("student1") { Student1(navController) }
        composable("student2") { Student2() }
        composable("student3") { Student3() }
        composable("student4") { Student4() }
        composable("student5") { Student5() }
    }
}

@Composable
fun HomeScreen(navController: NavController) {

    // 🎨 Colors
    val backgroundColor = Color(0xFF0F3D2E) // dark green
    val buttonColor = Color(0xFF4CAF50)     // soft green
    val textColor = Color(0xFFF1F8E9)       // off-white

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(horizontal = 60.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "The Dream Team",
            color = textColor,
            style = MaterialTheme.typography.headlineMedium.copy(
                fontSize = 32.sp
            )
        )

        Spacer(modifier = Modifier.height(32.dp))

        DreamButton("Student 1", buttonColor) {
            navController.navigate("student1")
        }
        Spacer(modifier = Modifier.height(14.dp))

        DreamButton("Student 2", buttonColor) {
            navController.navigate("student2")
        }
        Spacer(modifier = Modifier.height(14.dp))

        DreamButton("Student 3", buttonColor) {
            navController.navigate("student3")
        }
        Spacer(modifier = Modifier.height(14.dp))

        DreamButton("Student 4", buttonColor) {
            navController.navigate("student4")
        }
        Spacer(modifier = Modifier.height(14.dp))

        DreamButton("Student 5", buttonColor) {
            navController.navigate("student5")
        }
    }
}

@Composable
fun DreamButton(
    text: String,
    buttonColor: Color,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonColor,
            contentColor = Color.White
        ),
        shape = MaterialTheme.shapes.large
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.headlineMedium.copy(
                fontSize = 26.sp
            )
        )
    }
}
