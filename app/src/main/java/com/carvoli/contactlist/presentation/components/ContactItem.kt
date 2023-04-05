package com.carvoli.contactlist.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.carvoli.contactlist.model.Contact

@Composable
fun ContactItem(contact : Contact){
    Row(modifier = Modifier.fillMaxWidth()) {
        Row() { Text(text = contact.getName()) }
        Spacer(modifier = Modifier.width(5.dp))
        Row() { Text(text = contact.getPhoneNumber()) }
    }
}