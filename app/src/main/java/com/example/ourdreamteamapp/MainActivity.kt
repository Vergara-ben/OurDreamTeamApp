package com.example.ourdreamteamapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DreamTeamApp()
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
        // Home screen
        composable("home") {
            HomeScreen(navController)
        }

        // Student screens
        composable("student1") { Student1() }
        composable("student2") { Student2() }
        composable("student3") { Student3() }
        composable("student4") { Student4() }
        composable("student5") { Student5() }
    }
}


@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "The Dream Team",
            style = MaterialTheme.typography.headlineMedium
        )

        Button(onClick = { navController.navigate("student1") }) {
            Text("Student 1")
        }

        Button(onClick = { navController.navigate("student2") }) {
            Text("Student 2")
        }

        Button(onClick = { navController.navigate("student3") }) {
            Text("Student 3")
        }

        Button(onClick = { navController.navigate("student4") }) {
            Text("Student 4")
        }

        Button(onClick = { navController.navigate("student5") }) {
            Text("Student 5")
        }
    }
}
