package me.imtiaz.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
//                    .padding(top = 50.dp)
                    .border(5.dp, Color.Magenta)
                    .padding(5.dp)
                    .border(5.dp, Color.Blue)
                    .padding(5.dp)
                    .border(10.dp, Color.Red)
                    .padding(10.dp)
//                    .padding(16.dp)
//                    .width(600.dp)
//                    .requiredWidth(600.dp)
            ) {
                Text(text = "Hello World!", modifier = Modifier
//                    .border(5.dp, Color.Yellow)
//                    .padding(5.dp)
//                    .offset(20.dp, 20.dp)
//                    .border(10.dp, Color.Black)
//                    .padding(10.dp)

                    //.offset(0.dp, 20.dp)
//                    .offset(50.dp, 20.dp)
                    )
                Spacer(modifier = Modifier.height(50.dp))
                Text(text = "Imtiaz")
            }

        }
    }
}
