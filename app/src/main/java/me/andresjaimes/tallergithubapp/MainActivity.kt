package me.andresjaimes.tallergithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio()
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable

fun Ejercicio() {
    Column(
        modifier = Modifier.padding(all = 25.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val painter = painterResource(R.drawable.swimming)
        Image(
            contentScale = ContentScale.Crop,
            painter = painter,
            contentDescription = "Swimming",
            modifier = Modifier
                .width(width = 125.dp)
                .size(125.dp)
                .clip(CircleShape)
        )
        Text(
            text = "Andres Jaimes",
            textAlign = TextAlign.Center,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .background(Color.Blue)
                .width(150.dp)
                //.height(50.dp)
                .padding(all = 40.dp)
        )
        Text(
            text = "Estudiante de Ingenieria de Sistemas en la UNAB",
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 40.dp)
        )
    }
}