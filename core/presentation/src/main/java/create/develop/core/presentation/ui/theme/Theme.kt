package create.develop.core.presentation.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val LocalExtendedColors = staticCompositionLocalOf { LightExtendedColors }

val ColorScheme.extended: ExtendedColors
    @ReadOnlyComposable
    @Composable
    get() = LocalExtendedColors.current

@Immutable
data class ExtendedColors(
    // Button states
    val primaryHover: Color,
    val destructiveHover: Color,
    val destructiveSecondaryOutline: Color,
    val disabledOutline: Color,
    val disabledFill: Color,
    val successOutline: Color,
    val success: Color,
    val onSuccess: Color,
    val secondaryFill: Color,

    // Text variants
    val textPrimary: Color,
    val textTertiary: Color,
    val textSecondary: Color,
    val textPlaceholder: Color,
    val textDisabled: Color,

    // Surface variants
    val surfaceLower: Color,
    val surfaceHigher: Color,
    val surfaceOutline: Color,
    val overlay: Color,

    // Accent colors
    val accentBlue: Color,
    val accentPurple: Color,
    val accentViolet: Color,
    val accentPink: Color,
    val accentOrange: Color,
    val accentYellow: Color,
    val accentGreen: Color,
    val accentTeal: Color,
    val accentLightBlue: Color,
    val accentGrey: Color,

    // Cake colors for chat bubbles
    val cakeViolet: Color,
    val cakeGreen: Color,
    val cakeBlue: Color,
    val cakePink: Color,
    val cakeOrange: Color,
    val cakeYellow: Color,
    val cakeTeal: Color,
    val cakePurple: Color,
    val cakeRed: Color,
    val cakeMint: Color,
)

val LightExtendedColors = ExtendedColors(
    primaryHover = IntelligentListenerBrand600,
    destructiveHover = IntelligentListenerRed600,
    destructiveSecondaryOutline = IntelligentListenerRed200,
    disabledOutline = IntelligentListenerBase200,
    disabledFill = IntelligentListenerBase150,
    successOutline = IntelligentListenerBrand100,
    success = IntelligentListenerBrand600,
    onSuccess = IntelligentListenerBase0,
    secondaryFill = IntelligentListenerBase100,

    textPrimary = IntelligentListenerBase1000,
    textTertiary = IntelligentListenerBase800,
    textSecondary = IntelligentListenerBase900,
    textPlaceholder = IntelligentListenerBase700,
    textDisabled = IntelligentListenerBase400,

    surfaceLower = IntelligentListenerBase100,
    surfaceHigher = IntelligentListenerBase100,
    surfaceOutline = IntelligentListenerBase1000Alpha14,
    overlay = IntelligentListenerBase1000Alpha80,

    accentBlue = IntelligentListenerBlue,
    accentPurple = IntelligentListenerPurple,
    accentViolet = IntelligentListenerViolet,
    accentPink = IntelligentListenerPink,
    accentOrange = IntelligentListenerOrange,
    accentYellow = IntelligentListenerYellow,
    accentGreen = IntelligentListenerGreen,
    accentTeal = IntelligentListenerTeal,
    accentLightBlue = IntelligentListenerLightBlue,
    accentGrey = IntelligentListenerGrey,

    cakeViolet = IntelligentListenerCakeLightViolet,
    cakeGreen = IntelligentListenerCakeLightGreen,
    cakeBlue = IntelligentListenerCakeLightBlue,
    cakePink = IntelligentListenerCakeLightPink,
    cakeOrange = IntelligentListenerCakeLightOrange,
    cakeYellow = IntelligentListenerCakeLightYellow,
    cakeTeal = IntelligentListenerCakeLightTeal,
    cakePurple = IntelligentListenerCakeLightPurple,
    cakeRed = IntelligentListenerCakeLightRed,
    cakeMint = IntelligentListenerCakeLightMint,
)

val DarkExtendedColors = ExtendedColors(
    primaryHover = IntelligentListenerBrand600,
    destructiveHover = IntelligentListenerRed600,
    destructiveSecondaryOutline = IntelligentListenerRed200,
    disabledOutline = IntelligentListenerBase900,
    disabledFill = IntelligentListenerBase1000,
    successOutline = IntelligentListenerBrand500Alpha40,
    success = IntelligentListenerBrand500,
    onSuccess = IntelligentListenerBase1000,
    secondaryFill = IntelligentListenerBase900,

    textPrimary = IntelligentListenerBase0,
    textTertiary = IntelligentListenerBase200,
    textSecondary = IntelligentListenerBase150,
    textPlaceholder = IntelligentListenerBase400,
    textDisabled = IntelligentListenerBase500,

    surfaceLower = IntelligentListenerBase1000,
    surfaceHigher = IntelligentListenerBase900,
    surfaceOutline = IntelligentListenerBase100Alpha10Alt,
    overlay = IntelligentListenerBase1000Alpha80,

    accentBlue = IntelligentListenerBlue,
    accentPurple = IntelligentListenerPurple,
    accentViolet = IntelligentListenerViolet,
    accentPink = IntelligentListenerPink,
    accentOrange = IntelligentListenerOrange,
    accentYellow = IntelligentListenerYellow,
    accentGreen = IntelligentListenerGreen,
    accentTeal = IntelligentListenerTeal,
    accentLightBlue = IntelligentListenerLightBlue,
    accentGrey = IntelligentListenerGrey,

    cakeViolet = IntelligentListenerCakeDarkViolet,
    cakeGreen = IntelligentListenerCakeDarkGreen,
    cakeBlue = IntelligentListenerCakeDarkBlue,
    cakePink = IntelligentListenerCakeDarkPink,
    cakeOrange = IntelligentListenerCakeDarkOrange,
    cakeYellow = IntelligentListenerCakeDarkYellow,
    cakeTeal = IntelligentListenerCakeDarkTeal,
    cakePurple = IntelligentListenerCakeDarkPurple,
    cakeRed = IntelligentListenerCakeDarkRed,
    cakeMint = IntelligentListenerCakeDarkMint,
)

val LightColorScheme = lightColorScheme(
    primary = IntelligentListenerBrand500,
    onPrimary = IntelligentListenerBrand1000,
    primaryContainer = IntelligentListenerBrand100,
    onPrimaryContainer = IntelligentListenerBrand900,

    secondary = IntelligentListenerBase700,
    onSecondary = IntelligentListenerBase0,
    secondaryContainer = IntelligentListenerBase100,
    onSecondaryContainer = IntelligentListenerBase900,

    tertiary = IntelligentListenerBrand900,
    onTertiary = IntelligentListenerBase0,
    tertiaryContainer = IntelligentListenerBrand100,
    onTertiaryContainer = IntelligentListenerBrand1000,

    error = IntelligentListenerRed500,
    onError = IntelligentListenerBase0,
    errorContainer = IntelligentListenerRed200,
    onErrorContainer = IntelligentListenerRed600,

    background = IntelligentListenerBrand1000,
    onBackground = IntelligentListenerBase0,
    surface = IntelligentListenerBase0,
    onSurface = IntelligentListenerBase1000,
    surfaceVariant = IntelligentListenerBase100,
    onSurfaceVariant = IntelligentListenerBase900,

    outline = IntelligentListenerBase1000Alpha8,
    outlineVariant = IntelligentListenerBase200,
)

val DarkColorScheme = darkColorScheme(
    primary = IntelligentListenerBrand500,
    onPrimary = IntelligentListenerBrand1000,
    primaryContainer = IntelligentListenerBrand900,
    onPrimaryContainer = IntelligentListenerBrand500,

    secondary = IntelligentListenerBase400,
    onSecondary = IntelligentListenerBase1000,
    secondaryContainer = IntelligentListenerBase900,
    onSecondaryContainer = IntelligentListenerBase150,

    tertiary = IntelligentListenerBrand500,
    onTertiary = IntelligentListenerBase1000,
    tertiaryContainer = IntelligentListenerBrand900,
    onTertiaryContainer = IntelligentListenerBrand500,

    error = IntelligentListenerRed500,
    onError = IntelligentListenerBase0,
    errorContainer = IntelligentListenerRed600,
    onErrorContainer = IntelligentListenerRed200,

    background = IntelligentListenerBase1000,
    onBackground = IntelligentListenerBase0,
    surface = IntelligentListenerBase950,
    onSurface = IntelligentListenerBase0,
    surfaceVariant = IntelligentListenerBase900,
    onSurfaceVariant = IntelligentListenerBase150,

    outline = IntelligentListenerBase100Alpha10,
    outlineVariant = IntelligentListenerBase800,
)