package com.carvoli.contactlist.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
                )
                }
            )
        }
    }
}
