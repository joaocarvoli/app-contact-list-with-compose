package com.carvoli.contactlist.presentation.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.carvoli.contactlist.presentation.list.ContactList
import com.carvoli.contactlist.model.Contact
import com.carvoli.contactlist.presentation.components.rowInput

@Composable
fun MainScreen(){
    var name = remember { mutableStateOf(TextFieldValue()) }
    var number = remember { mutableStateOf(TextFieldValue()) }
    var address = remember { mutableStateOf(TextFieldValue()) }
    var contactList = remember { mutableStateOf(listOf<Contact>()) }

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
            val contact = Contact(name = name.value.text, phoneNumber = number.value.text, address = address.value.text)
            contactList.value = contactList.value + contact
        },
            modifier = Modifier
                .align(Alignment.End)
                .padding(end = 15.dp)
        ) {
            Text(text = "Add Contact")
        }
        Spacer(modifier = Modifier.height(30.dp))
        ContactList(contactList)
    }
}