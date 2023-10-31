package com.example.jetpacktutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import kotlin.random.Random

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                Modifier.fillMaxSize()
            ){
                val color = remember{
                    mutableStateOf(Color.Yellow)
                }
                ColorBox(
                    modifier = Modifier.fillMaxSize().weight(1f)
                ){
                    color.value = it
                }
                Box(
                    modifier = Modifier.fillMaxSize().background(color.value).weight(1f)
                )
            }

        }
    }
}
@Composable
fun ColorBox(modifier: Modifier = Modifier, updateColor: (Color)->Unit){


        Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                Color.Black
            )
            .clickable {
                updateColor(
                     Color(
                        Random.nextFloat(),
                        Random.nextFloat(),
                        Random.nextFloat(),
                        1f
                    )
                )

            }
    )
}
//    @Preview
//    @Composable
//    private fun someFunWithText() {
//        Box(
//            modifier = Modifier.fillMaxSize(),
//            contentAlignment = Alignment.Center
//        ){
//            Text(
//                text = buildAnnotatedString {
//                    withStyle(
//                        style = SpanStyle(
//                            color = Color.Red
//                        )
//                    ){
//                        append("This is ")
//                    }
//                    withStyle(
//                        style = SpanStyle(color = Color.White)
//                    ){
//                        append("my")
//                    }
//                    withStyle(
//                        style = SpanStyle(color = Color.Green)
//                    ){
//                        append("india")
//                    }
//
//
//                }
//            )
//        }
//
//
//
//    }


//@Composable
//fun ImageCard(
//    painter: Painter,
//    contentDescription: String,
//    title: String,
//    modifier: Modifier = Modifier
//) {
//    Card(
//        modifier = Modifier.fillMaxWidth(0.5f).padding(10.dp),
//        shape = RoundedCornerShape(15.dp),
//        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)
//    ) {
//        Box(
//            modifier = Modifier.height(200.dp)
//        ) {
//            Image(
//                painter = painter,
//                contentDescription = contentDescription,
//                contentScale = ContentScale.Crop
//            )
//            Box(modifier = Modifier
//                .fillMaxSize()
//                .background(Brush.verticalGradient(
//                    colors = listOf(
//                        Color.Transparent,
//                        Color.Black
//                    ),
//                )))
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(12.dp),
//               verticalArrangement = Arrangement.Bottom
//            ) {
//                Text(text = title, style = TextStyle(color = Color.White, fontSize = 16.sp))
//                Text(text = contentDescription, style = TextStyle(color = Color.White, fontSize = 16.sp))
//            }
//        }
//    }
//
//}
//
//@Preview(device = "id:pixel_5")
//@Composable
//fun ImageCardPreview() {
//    var painter = painterResource(id = R.drawable.photo)
//    var contentDescription = "filled form "
//    var title = "Title"
//    ImageCard(painter = painter, contentDescription = contentDescription, title = title)
//}
