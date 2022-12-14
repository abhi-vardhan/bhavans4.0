package com.example.onboardingcompose.navigation

sealed class Screen(val route: String) {
    object Welcome : Screen(route = "welcome_screen")
    object Home : Screen(route = "home_screen")
    object Papers :Screen(route = "papers")
    object Question1 : Screen(route = "Question1")
}