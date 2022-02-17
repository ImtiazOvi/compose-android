package me.imtiaz.compose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    data class User(val id: Int)

   private val users = listOf(
        User(1),
        User(2),
        User(3),
        User(4),
        User(5),
        User(6),
        User(7),
        User(8),
        User(9)
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserList()
        }

    }

    @Composable
    fun UserList() {
//        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//            for (i in 1..10){
//                UserCard()
//            }
//        }

        LazyColumn {
            items((users)) { user ->
                UserCard()
            }
        }
    }

    @Composable
    fun UserCard() {
        // Title()

        Card(
            elevation = 4.dp,
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
        ) {

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(12.dp)
                .border(1.dp, color = Color.Gray)
                .padding(12.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_profile),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            )

            Column {
                Text(text = stringResource(id = R.string.app_name))
                Button(onClick = {
                    // perform button clicked action here
                }) {
                    Text(text = "View Profile ")
                }
            }
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
    fun ImagePreview() {
        Surface(modifier = Modifier.fillMaxSize()) {
            Title()
            UserCard()
        }
    }
}

