package com.example.ourdreamteamapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Student2(navController: NavController) {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFF6F7FB)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(32.dp))

            // Profile Image
            Image(
                painter = painterResource(id = R.drawable.s1),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Name
            Text(
                text = "Vidal, Samantha Loui A.",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(4.dp))

            // Role
            Text(
                text = "UI/UX Designer",
                fontSize = 16.sp,
                color = Color(0xFF3F51B5)
            )

            Spacer(modifier = Modifier.height(4.dp))

            // Email
            Text(
                text = "Samanthaloui122404@gmail.com",
                fontSize = 14.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(24.dp))

            // ABOUT CARD
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFEDEFF7)
                )
            ) {
                Column(modifier = Modifier.padding(16.dp)) {

                    Text(
                        text = "About",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "I'm a student with a passion for UI/UX design and development, enjoying the process of creating user-friendly and visually appealing digital experiences while continuously learning and improving my skills.",
                        fontSize = 14.sp,
                        lineHeight = 20.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // SKILLS CARD (NO SkillItem)
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFEDEFF7)
                )
            ) {
                Column(modifier = Modifier.padding(16.dp)) {

                    Text(
                        text = "Skills",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text("• Critical Thinking", fontSize = 14.sp)
                    Text("• Problem Solving", fontSize = 14.sp)
                    Text("• Design Thinking", fontSize = 14.sp)
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            // BACK BUTTON
            Button(
                onClick = { navController.popBackStack() },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 24.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF4E5D9D)
                )
            ) {
                Text(
                    text = "Back to Team",
                    fontSize = 16.sp,
                    color = Color.White
                )
            }
        }
    }
}
