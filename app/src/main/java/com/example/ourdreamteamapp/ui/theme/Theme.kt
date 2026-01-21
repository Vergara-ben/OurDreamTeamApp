package com.example.ourdreamteamapp.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

// Custom Color Palette
val OceanBlue = Color(0xFF0066CC)
val SkyBlue = Color(0xFF4DA6FF)
val SoftGray = Color(0xFFF5F7FA)
val DarkCharcoal = Color(0xFF2C3E50)
val SuccessGreen = Color(0xFF2ECC71)
val CoralRed = Color(0xFFFF6B6B)
val SunnyYellow = Color(0xFFF9C74F)
val LavenderPurple = Color(0xFF9D65C9)

// Legacy color names for compatibility (using your custom palette)
                               // Replaced with CoralRed

// Additional color variants
val OceanBlueLight = Color(0xFF4DA6FF)
val OceanBlueDark = Color(0xFF004C99)
val SkyBlueLight = Color(0xFF80C1FF)
val DarkCharcoalLight = Color(0xFF4A6572)
val SoftGrayDark = Color(0xFFE1E8ED)

val LightColorScheme = lightColorScheme(
    primary = OceanBlue,
    primaryContainer = OceanBlueLight,
    secondary = SkyBlue,
    secondaryContainer = SkyBlueLight,
    tertiary = SunnyYellow,
    tertiaryContainer = SunnyYellow.copy(alpha = 0.2f),
    background = SoftGray,
    surface = Color.White,
    surfaceVariant = SoftGray,
    error = CoralRed,
    errorContainer = CoralRed.copy(alpha = 0.1f),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.Black,
    onBackground = DarkCharcoal,
    onSurface = DarkCharcoal,
    onSurfaceVariant = DarkCharcoalLight,
    onError = Color.White,
    outline = Color(0xFFCCCCCC),
    outlineVariant = Color(0xFFE0E0E0)
)

val DarkColorScheme = darkColorScheme(
    primary = SkyBlue,
    primaryContainer = OceanBlueDark,
    secondary = OceanBlue,
    secondaryContainer = OceanBlue.copy(alpha = 0.3f),
    tertiary = SunnyYellow,
    tertiaryContainer = SunnyYellow.copy(alpha = 0.2f),
    background = Color(0xFF121212),
    surface = Color(0xFF1E1E1E),
    surfaceVariant = Color(0xFF2D2D2D),
    error = CoralRed,
    errorContainer = CoralRed.copy(alpha = 0.2f),
    onPrimary = Color.Black,
    onSecondary = Color.Black,
    onTertiary = Color.Black,
    onBackground = Color.White.copy(alpha = 0.87f),
    onSurface = Color.White.copy(alpha = 0.87f),
    onSurfaceVariant = Color.White.copy(alpha = 0.6f),
    onError = Color.Black,
    outline = Color(0xFF444444),
    outlineVariant = Color(0xFF333333)
)

@Composable
fun OurDreamTeamAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}