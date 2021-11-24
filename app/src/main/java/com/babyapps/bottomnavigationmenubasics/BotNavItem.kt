package com.babyapps.bottomnavigationmenubasics

import androidx.compose.ui.graphics.vector.ImageVector

data class BotNavItem(
    val name: String,
    val route: String,
    val icon: ImageVector,
    val badgeNumber: Int = 0
)
