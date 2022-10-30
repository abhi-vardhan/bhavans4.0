/*package com.example.onboardingcompose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onboardingcompose.R
import android.service.autofill.OnClickAction as OnClickAction1*/


/*@Composable
@Preview

fun HomeScreen() {

    Image(painter = painterResource(id = R.drawable.bcak)
        , contentDescription = null, modifier = Modifier.padding(top = 100dp)
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight(), contentScale = ContentScale.FillHeight)
    contentColorFor(backgroundColor = Color.White)

    Box(
        modifier = Modifier.fillMaxSize(),
        //contentAlignment = Alignment.Top
    ) {
        Row (){
            Image(painter = painterResource(id = R.drawable.brand), contentDescription =null, alignment = Alignment.BottomStart, modifier = Modifier.padding(top = 30.dp, bottom = 50.dp).fillMaxWidth(), contentScale = ContentScale.FillWidth)


            Text(
                
                text = "HOME",
                fontSize = MaterialTheme.typography.h4.fontSize,
                color = Color.White
            
            )


        }


    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomStart
    ){
        Row {
            Text(text = "away",
                fontSize = MaterialTheme.typography.h4.fontSize
            )
    }


    }
}*/
package com.example.onboardingcompose.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.onboardingcompose.R
import com.example.onboardingcompose.navigation.Screen
import com.example.onboardingcompose.ui.theme.*
import com.example.onboardingcompose.ui.theme.Blue700
import com.example.onboardingcompose.util.OnBoardingPage
import com.example.onboardingcompose.util.slider
import com.example.onboardingcompose.viewmodel.WelcomeViewModel
import com.google.accompanist.pager.*
val Blue500 = Color(0xFF29b6f6)
val Blue700 = Color(0xFF0086c3)
val Teal200 = Color(0xFF36A5C0)

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun HomeScreen(
    navController: NavHostController,
    welcomeViewModel: WelcomeViewModel = hiltViewModel()
) {
    val gradient =
        Brush.horizontalGradient(listOf(Color(0xFF28D8A3), Color(0xFF00BEB2)))




    Image(
        painter = painterResource(id = R.drawable.whitegrad), contentDescription = null,
        modifier = Modifier
            .padding(top = 1.dp)
            .fillMaxSize()
            .fillMaxWidth()

            .fillMaxHeight()
            /*.background(
                Color.White
            )*/,
        contentScale = ContentScale.FillHeight,
        )
    Image(
        painter = painterResource(id = R.drawable.jdjl),
        contentDescription = null,
        //alignment = Alignment.TopCenter,
        modifier = Modifier
            .padding(top = 0.dp, bottom = 1.dp)

            .background(color = Color.Transparent)
           //.fillMaxWidth()
            //.fillMaxHeight()
            //.fillMaxSize(),
        ,contentScale = ContentScale.FillWidth,
    )



        Text(text = " Hello Bhavanite,", modifier = Modifier.padding(start = 10.dp, top =  25.dp), color = Color.White, fontSize = 25.sp, fontFamily = FontFamily.SansSerif)
        Image(
            painter = painterResource(id = R.drawable.logohome),
            contentDescription = null,
            //alignment = Alignment.BottomStart,
            modifier = Modifier
                //.background(color = Color.White)
                .padding(top = 40.dp, bottom = 100.dp, start = 270.dp)
                .fillMaxWidth()


        )








   // contentColorFor(backgroundColor = MaterialTheme.colors.background)
    /*Image(
        painter = painterResource(id = R.drawable.bcak),
        contentDescription = null,
        modifier = Modifier
            .padding(
                top = 200.dp, bottom = 300.dp
            )
            .fillMaxSize()

            .fillMaxHeight(),
        contentScale = ContentScale.FillWidth
    )
    contentColorFor(backgroundColor = Color.White)*/

    /* val pages = listOf(
        slider.First,
        slider.Second,
       // slider.Third
    )
    val pagerState = rememberPagerState()

        Column(
            modifier = Modifier
                .padding(top = 200.dp, bottom = 300.dp)
                .border(
                    border = BorderStroke(2.dp, Color.LightGray),
                    shape = RoundedCornerShape(16.dp)
                )




            )
        {
            HorizontalPager(
                modifier = Modifier.weight(10f),
                count = 2,
                state = pagerState,
                verticalAlignment = Alignment.Top
            ) { position ->
                PagerScreen(slider = pages[position])
            }
            HorizontalPagerIndicator(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .weight(1f),
                pagerState = pagerState
            )


        }

    }*/

    GradientButton1(
        onClick = { navController.navigate(Screen.Welcome.route) },
        gradient = gradient,

    )
    GradientButton2(
        onClick = { navController.navigate(Screen.Papers.route) },
        gradient = gradient    )
    GradientButton3(
        onClick = { navController.navigate(Screen.Welcome.route) },
        gradient = gradient    )
    GradientButton4(
        onClick = { navController.navigate(Screen.Welcome.route) },
        gradient = gradient    )
    GradientButton5(
        onClick = { navController.navigate(Screen.Welcome.route) },
        gradient = gradient    )
    GradientButton6(
        onClick = { navController.navigate(Screen.Welcome.route) },
        gradient = gradient    )



}


@Composable
private fun GradientEdge(
    startColor: Color, endColor: Color,
) {
    Box(
        modifier = Modifier
            .width(10.dp)
            .fillMaxHeight()
            .background(
                brush = Brush.horizontalGradient(
                    0f to startColor, 1f to endColor,
                )
            )
    )
}

private enum class MarqueeLayers { MainText, SecondaryText, EdgesGradient }
private data class TextLayoutInfo(val textWidth: Int, val containerWidth: Int)
@ExperimentalAnimationApi
@ExperimentalPagerApi
@get:Composable
val Colors.myExtraColor: Color
    get() = if (isLight) Color.Blue else Color.Green




@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun GradientButton1(gradient: Brush, onClick: () -> Unit, ) {



    Column(
       // horizontalAlignment = Alignment.CenterHorizontally,
       // verticalArrangement = Arrangement.spacedBy(10.49358081817627.dp, Alignment.Top),

    ) {

        Button(

            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),contentPadding = PaddingValues(),

            modifier = Modifier
                //.padding(150.dp)
                .padding(top = 350.dp, start = 205.dp)
                .height(100.dp)
                .width(188.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                //.fillMaxSize()
                //.padding(horizontal = 1.dp, vertical = 8.dp)
                .background(gradient),


            onClick = onClick,
        ) {

            Image(
                painterResource(id = R.drawable.exam),
                contentDescription = "Cart button icon",alignment = Alignment.Center,modifier = Modifier.height(80.dp)

            )
Text(text = "PREVIOUS YEAR Q.P'S", color = Color.White, fontWeight = FontWeight.ExtraBold, fontFamily = bab,
)
        }
    }

}

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun GradientButton2(gradient: Brush, onClick: () -> Unit, ) {


    Column(
       // horizontalAlignment = Alignment,
        // verticalArrangement = Arrangement.spacedBy(10.49358081817627.dp, Alignment.Top),
        modifier = Modifier



            .clip(RoundedCornerShape(topStart = 17.489301681518555.dp, topEnd = 17.489301681518555.dp, bottomStart = 17.489301681518555.dp, bottomEnd = 17.489301681518555.dp))
    ) {

        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),        contentPadding = PaddingValues(),

            modifier = Modifier
                //.padding(150.dp)
                .padding(top = 350.dp, start = 10.dp)
                .height(100.dp)
                .width(185.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(gradient),

                //.padding(horizontal = 1.dp, vertical = 8.dp)



            onClick = onClick
        ) {
            Image(
                painterResource(id = R.drawable.c7489d50a04427ad0ed4e3966230c0d3_removebg_preview),
                contentDescription = "Cart button icon",alignment = Alignment.Center,
                modifier = Modifier.height(80.dp)
            )
            Text(text = "RESULTS", color = Color.White, fontFamily = bab)

        }
    }

}
@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun GradientButton3(gradient: Brush, onClick: () -> Unit, ) {


    Column(
        // horizontalAlignment = Alignment,
        // verticalArrangement = Arrangement.spacedBy(10.49358081817627.dp, Alignment.Top),
        modifier = Modifier



            .clip(RoundedCornerShape(topStart = 17.489301681518555.dp, topEnd = 17.489301681518555.dp, bottomStart = 17.489301681518555.dp, bottomEnd = 17.489301681518555.dp))
    ) {

        Button(  colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),        contentPadding = PaddingValues(),

            modifier = Modifier
                //.padding(150.dp)
                .padding(top = 470.dp, start = 10.dp)
                .height(100.dp)
                .width(188.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .fillMaxSize()
                //.padding(horizontal = 1.dp, vertical = 8.dp)
                .background(gradient),


            onClick = onClick,
        ) {
            Image(
                painterResource(id = R.drawable.feedbackreal),
                contentDescription = "Cart button icon",alignment = Alignment.Center, modifier = Modifier.height(80.dp)

            )
            Text(text = "FEEDBACK", color = Color.White, fontWeight = FontWeight.ExtraBold, fontFamily = bab,

            )


        }
    }

}
@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun GradientButton4(gradient: Brush, onClick: () -> Unit, ) {
    Column(
        // horizontalAlignment = Alignment.CenterHorizontally,
        // verticalArrangement = Arrangement.spacedBy(10.49358081817627.dp, Alignment.Top),
        modifier = Modifier



            .clip(RoundedCornerShape(topStart = 17.489301681518555.dp, topEnd = 17.489301681518555.dp, bottomStart = 17.489301681518555.dp, bottomEnd = 17.489301681518555.dp))
    ) {

        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
            contentPadding = PaddingValues(),

            modifier = Modifier
                //.padding(150.dp)
                .padding(top = 470.dp, start = 205.dp)

                .height(100.dp)
                .width(188.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .fillMaxSize()
                //.padding(horizontal = 1.dp, vertical = 8.dp)
                .background(gradient),


            onClick = onClick


        ) {
            Image(
                painterResource(id = R.drawable.images_removebg_preview__2_),
                contentDescription = "Cart button icon", alignment = Alignment.Center,modifier = Modifier.height(400.dp)

            )
            Box( contentAlignment = Alignment.Center) {


                //Text(text = "Navigation ", color = Color.White, fontWeight = FontWeight.ExtraBold, fontFamily = FontFamily.Serif, fontSize = 13.sp, )
                Text(
                    text = "NAVIGATION ",

                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = bab,
                    fontSize = 15.sp


                    )
            }
        }
    }

}
@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun GradientButton5(gradient: Brush, onClick: () -> Unit, ) {


    Column(
        // horizontalAlignment = Alignment.CenterHorizontally,
        // verticalArrangement = Arrangement.spacedBy(10.49358081817627.dp, Alignment.Top),
        modifier = Modifier



            .clip(RoundedCornerShape(topStart = 17.489301681518555.dp, topEnd = 17.489301681518555.dp, bottomStart = 17.489301681518555.dp, bottomEnd = 17.489301681518555.dp))
    ) {

        Button(  colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),        contentPadding = PaddingValues(),

            modifier = Modifier
                //.padding(150.dp)
                .padding(top = 590.dp, start = 10.dp)

                .height(100.dp)
                .width(185.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .fillMaxSize()
                //.padding(horizontal = 1.dp, vertical = 8.dp)
                .background(gradient),


            onClick = onClick
        ) {
            Image(
                painterResource(id = R.drawable._61788c1_816e_4ce1_8030_6cd54350dc1b_removebg_preview),
                contentDescription = "Cart button icon",alignment = Alignment.Center, contentScale =  ContentScale.Inside,modifier = Modifier.height(60.dp)
            )
            Text(text = "NOTIFICATION ", color = Color.White, fontWeight = FontWeight.ExtraBold, fontFamily = bab, )

        }
    }

}
@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun GradientButton6(gradient: Brush, onClick: () -> Unit, ) {


    Column(
        // horizontalAlignment = Alignment.CenterHorizontally,
        // verticalArrangement = Arrangement.spacedBy(10.49358081817627.dp, Alignment.Top),
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()


            .clip(
                RoundedCornerShape(
                    topStart = 17.489301681518555.dp,
                    topEnd = 17.489301681518555.dp,
                    bottomStart = 17.489301681518555.dp,
                    bottomEnd = 17.489301681518555.dp
                )
            )
    ) {

        Button(  colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),

            modifier = Modifier
                .wrapContentWidth()
                //.padding(150.dp)
                .padding(top = 590.dp, start = 205.dp)
                .height(100.dp)
                .width(187.dp)
                .clip(shape = RoundedCornerShape(20.dp))

                //.padding(horizontal = 1.dp, vertical = 8.dp)
                .background(gradient)
                .fillMaxSize(),


            onClick = onClick, contentPadding = PaddingValues(),
        ) {
            Image(
                painterResource(id = R.drawable._a199798_b921_47c8_aa71_30d9330f37c2_removebg_preview),
                contentDescription = "Cart button icon", alignment = Alignment.Center,
                contentScale =  ContentScale.Inside
            )
            Text(text = "ANTI - RAGGING ", color = Color.White, fontWeight = FontWeight.Bold, fontFamily =  bab, textAlign = TextAlign.Center)

        }
    }

}






/*@Composable
fun PagerScreen(slider: slider) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(

            painter = painterResource(id = slider.image), contentScale = ContentScale.FillHeight,
            contentDescription = "Pager Image",
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .fillMaxSize()
                .clip(
                    RoundedCornerShape(16.dp)
                ))
        /*Text(
            modifier = Modifier
                .fillMaxWidth(),
           // text = slider.title,
            fontSize = MaterialTheme.typography.h4.fontSize,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
       Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .padding(top = 20.dp),
            //text = slider.description,
            fontSize = MaterialTheme.typography.subtitle1.fontSize,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center
        )*/
    }
}

//@ExperimentalAnimationApi
//@ExperimentalPagerApi
/*@Composable
fun FinishButton1(
    modifier: Modifier,
    pagerState: PagerState,
    onClick: () -> Unit
) {
    Row(
        modifier = modifier
            .padding(horizontal = 40.dp),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.Center
    ) {
        AnimatedVisibility(
            modifier = Modifier.fillMaxWidth(),
            visible = pagerState.currentPage == 2
        ) {
            Button(
                onClick = onClick,
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White
                )
            ) {
                Text(text = "Finish")
            }
        }
    }
}*/












@Composable
@Preview(showBackground = true)
fun FirstOnBoardingScreenPreview1() {
    Column(modifier = Modifier.fillMaxSize()) {
        PagerScreen(slider = slider.First)
    }
}

@Composable
@Preview(showBackground = true)
fun SecondOnBoardingScreenPreview1() {
    Column(modifier = Modifier
        .fillMaxSize()
        .fillMaxHeight()) {
        PagerScreen(slider = slider.Second)
    }
}

/*@Composable
@Preview(showBackground = true)
fun ThirdOnBoardingScreenPreview1() {
    Column(modifier = Modifier.fillMaxSize()) {
        PagerScreen(slider = slider.Third)
    }
}*///

 */


