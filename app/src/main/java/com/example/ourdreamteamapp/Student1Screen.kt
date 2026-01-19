package com.example.ourdreamteamapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Student1(navController: NavController) {  // Pass NavController here

    val backgroundColor = Color(0xFF0F3D2E)
    val primaryText = Color(0xFFF1F8E9)
    val secondaryText = Color(0xFFB7E1CD)
    val accentColor = Color(0xFF4CAF50)
    val cardColor = Color(0xFF145A32)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(horizontal = 28.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(48.dp))

        // Profile Image
        Surface(
            shape = CircleShape,
            color = accentColor,
            modifier = Modifier.size(150.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.student1),
                contentDescription = "Vergara, Ben Mark C.",
                modifier = Modifier
                    .padding(4.dp)
                    .clip(CircleShape)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Name
        Text(
            text = "Vergara, Ben Mark C.",
            color = primaryText,
            style = MaterialTheme.typography.headlineMedium.copy(
                fontSize = 28.sp
            ),
            fontWeight = FontWeight.Bold
        )

        // Role
        Text(
            text = "Android Developer",
            color = accentColor,
            style = MaterialTheme.typography.titleMedium
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Info Card
        Card(
            colors = CardDefaults.cardColors(containerColor = cardColor),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                // About
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

                // Skills
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

        Spacer(modifier = Modifier.height(32.dp))

        // Back Button
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
