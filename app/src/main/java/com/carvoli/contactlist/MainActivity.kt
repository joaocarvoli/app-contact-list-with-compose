package com.carvoli.contactlist

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var name = remember { mutableStateOf(TextFieldValue()) }
            var number = remember { mutableStateOf(TextFieldValue()) }
            var address = remember { mutableStateOf(TextFieldValue()) }

            Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 30.dp)
                        .fillMaxWidth()
            ) {
                rowInput(textField = "Name", placeHolder = "John Vector", stateVar = name)
                Spacer(modifier = Modifier.height(5.dp))
                rowInput(textField = "Number", placeHolder = "(xx) xxxx-xxxx", stateVar = number)
                Spacer(modifier = Modifier.height(5.dp))
                rowInput(textField = "Address", placeHolder = "Street ", stateVar = address)
                Spacer(modifier = Modifier.height(15.dp))
                Button(onClick = {
                                 Log.d("Logging data, ", "${name.value.text}, ${number.value.text}, ${address.value.text}")
                },
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(end = 15.dp)
                ) {
                    Text(text = "Add Contact")
                }
            }
        }
    }

    @Composable
    fun rowInput(textField : String, placeHolder : String, stateVar : MutableState<TextFieldValue>){
        Row(modifier = Modifier.
        padding(start = 15.dp, end = 15.dp)
        ) {
            Column(modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically)){
                Text(text = textField, fontWeight = FontWeight.Bold, fontSize = 15.sp)
            }
            Column(modifier = Modifier.weight(1f)) {
                OutlinedTextField(
                    value = stateVar.value,
                    onValueChange = { stateVar.value = it },
                    placeholder = { Text(
                        text = placeHolder
                    )}
                )
            }
        }
    }

}
