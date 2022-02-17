package me.imtiaz.compose

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment

class HomeFragment: Fragment(R.layout.home_fragment) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent { UserCard() }
        }
    }

    @Composable
    fun UserCard() {

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



    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        Surface(modifier = Modifier.fillMaxSize()) {
            UserCard()
        }
    }


}