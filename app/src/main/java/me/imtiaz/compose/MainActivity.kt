package me.imtiaz.compose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Title()
        }

    }

    @Composable
    fun Title() {
        val context = LocalContext.current
        Text(
            text = "Compose Android",
            fontSize = 28.sp,
            fontFamily = FontFamily.Cursive,
            color = colorResource(id = R.color.teal_700),
            modifier = Modifier.clickable {
                Toast.makeText(context, "Title text clicked", Toast.LENGTH_SHORT).show()

            }
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        Surface(modifier = Modifier.fillMaxSize()) {
            Title()
        }
    }

}

