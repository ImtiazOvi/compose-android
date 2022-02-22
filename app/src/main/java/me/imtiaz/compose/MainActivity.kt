package me.imtiaz.compose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
private fun OptionsMenu(
    expanded:Boolean,
    onDismissRequest:()->Unit
){
    val listData = listOf("A","b","c")
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = onDismissRequest
    ){
        listData.forEach {
            DropdownMenuItem(onClick = onDismissRequest) {
                Text(text = it)
            }
        }
    }
}


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var dropDownSate by remember { mutableStateOf(false) }
            OptionsMenu(
                expanded = dropDownSate,
                onDismissRequest = {
                    dropDownSate = false
                }
            )

            Box(modifier = Modifier.fillMaxSize()) {

                TopAppBar(
                    title = {
                        Text(text = "Hello", fontSize = 30.sp)
                    },
                    navigationIcon = {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Add Icon",
                            modifier = Modifier.clickable {
                                dropDownSate = true
                            }
                        )
                    }
                )

                FloatingActionButton(
                    onClick = {
                        Toast.makeText(applicationContext, "Click", Toast.LENGTH_SHORT).show()
                    },
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(end = 16.dp, bottom = 16.dp),
                    backgroundColor = MaterialTheme.colors.primary,
                    content = {
                        Icon(
                            imageVector = Icons.Filled.Add,
                            contentDescription = "Add Icon"
                        )
                    }
                )
            }
        }


//            var textFieldState by remember {
//                mutableStateOf("")
//            }
//            Scaffold(
//                modifier = Modifier.fillMaxSize(),
//            ) {
//                Column(
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    verticalArrangement = Arrangement.Center,
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(horizontal = 30.dp)
//                ) {
//                    TextField(
//                        value = textFieldState,
//                        label = {
//                                Text(text = "Enter your name")
//                        },
//                        onValueChange = {
//                            textFieldState = it
//                        },
//                        singleLine = true,
//                        modifier = Modifier.fillMaxWidth()
//                    )
//                    Spacer(modifier = Modifier.height(16.dp))
//                    Button(onClick = {
//                        sc.snackbarHostState.showSnackbar(textFieldState,)
//                    }) {
//                        Text(text = "Please greet me")
//                    }
//                }
//            }
    }
}




