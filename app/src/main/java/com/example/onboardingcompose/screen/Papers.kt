package com.example.onboardingcompose.screen


import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.onboardingcompose.R
import com.example.onboardingcompose.navigation.Screen
import com.example.onboardingcompose.ui.theme.bab

import com.example.onboardingcompose.util.OnBoardingPage
import com.example.onboardingcompose.util.slider
import com.example.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.*

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun Papers(navController: NavHostController,
           welcomeViewModel: WelcomeViewModel = hiltViewModel())
{
    val gradient =
        Brush.horizontalGradient(listOf(Color(0xFF28D8A3), Color(0xFF00BEB2)))

    Column (){
        GradientButton(
            text = "Gradient Button - Max Width",
            gradient = gradient,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )
        GradientButton(
            text = "Gradient Button - Wrap Width",
            gradient = gradient,
            modifier = Modifier
                .wrapContentWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
    GradientButton(onClick = { navController.navigate(Screen.Welcome.route) }, text = "Button",

        gradient = gradient
)

}
@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun GradientButton(
    text: String,
    gradient: Brush,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = { },
) {
    Button(
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Unspecified),
        contentPadding = PaddingValues(),
        onClick = { onClick() },
    ) {
        Box(
            modifier = Modifier
                .background(gradient)
                .then(modifier),
            contentAlignment = Alignment.Center,
        ) {
            Text(text = text, fontFamily = bab)
        }
    }
}