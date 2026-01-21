package com.example.ourdreamteamapp

// Compose UI elements
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape

// Material 3 components
import androidx.compose.material3.*

// Compose runtime annotation
import androidx.compose.runtime.Composable

// UI utilities
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Navigation component
import androidx.navigation.NavController

// Composable screen for Student 1 profile
@Composable
fun Student1(navController: NavController) {  // NavController for back navigation

    // Color palette used in this screen
    val backgroundColor = Color(0xFF0F3D2E)
    val primaryText = Color(0xFFF1F8E9)
    val secondaryText = Color(0xFFB7E1CD)
    val accentColor = Color(0xFF4CAF50)
    val cardColor = Color(0xFF145A32)

    // Main vertical layout
    Column(
        modifier = Modifier
            .fillMaxSize()                 // Fill entire screen
            .background(backgroundColor)   // Set background color
            .padding(horizontal = 28.dp),  // Horizontal padding
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(48.dp)) // Top spacing

        // Profile Image container
        Surface(
            shape = CircleShape,           // Circular shape
            color = accentColor,           // Border/background color
            modifier = Modifier.size(150.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.student1), // Profile image
                contentDescription = "Vergara, Ben Mark C.",
                modifier = Modifier
                    .padding(4.dp)         // Inner spacing
                    .clip(CircleShape)     // Clip image into circle
            )
        }

        Spacer(modifier = Modifier.height(20.dp)) // Spacing below image

        // Student Name
        Text(
            text = "Vergara, Ben Mark C.",
            color = primaryText,
            style = MaterialTheme.typography.headlineMedium.copy(
                fontSize = 28.sp
            ),
            fontWeight = FontWeight.Bold
        )

        // Student Role
        Text(
            text = "Android Developer",
            color = accentColor,
            style = MaterialTheme.typography.titleMedium
        )

        Spacer(modifier = Modifier.height(24.dp)) // Spacing before card

        // Information Card (About & Skills)
        Card(
            colors = CardDefaults.cardColors(containerColor = cardColor),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(20.dp),           // Inner padding
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                // About section
                Column {
                    Text(
                        text = "About",
                        color = accentColor,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "I’m a programmer who enjoys building practical solutions using code. I’m always learning new technologies and improving my problem-solving skills.",
                        color = secondaryText,
                        style = MaterialTheme.typography.bodyLarge
                    )
                }

                // Skills section
                Column {
                    Text(
                        text = "Skills",
                        color = accentColor,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "• Logical Thinking \n" +
                                "• UI Design \n" +
                                "• Problem Solving",
                        color = secondaryText,
                        style = MaterialTheme.typography.bodyLarge,
                        textAlign = TextAlign.Start
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(32.dp)) // Spacing before button

        // Back button to return to previous screen
        Button(
            onClick = { navController.popBackStack() }, // Navigate back
            colors = ButtonDefaults.buttonColors(
                containerColor = accentColor,
                contentColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Text(
                text = "Back",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontSize = 24.sp
                )
            )
        }
    }
}
