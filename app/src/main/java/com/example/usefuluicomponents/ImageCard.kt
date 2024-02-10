package com.example.usefuluicomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.usefuluicomponents.ui.theme.UsefulUIComponentsTheme

@Composable
fun ImageCard(
    painter:Painter,
    contentDescriptor:String,
    title:String,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier.fillMaxWidth()
            ,
        shape = RoundedCornerShape(16.dp))
    {
        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painter, 
                contentDescription = contentDescriptor,
                contentScale = ContentScale.FillBounds

            )
            Box(modifier = Modifier.fillMaxSize()
                .background(Brush.verticalGradient(
                    colors = listOf(
                        Color.Transparent,
                        Color.Black
                    ),
                    startY = 300f
                )))
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Text(
                    text = title,
                    fontSize = 16.sp,
                    color = Color.White)
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    UsefulUIComponentsTheme {
        val paintName = painterResource(id = R.drawable.archer)
        Box(modifier = Modifier
            .fillMaxWidth(0.5f)
            .padding(8.dp)){
            ImageCard(painter = paintName, contentDescriptor = "archer", title =   "Archer")
        }

    }
}