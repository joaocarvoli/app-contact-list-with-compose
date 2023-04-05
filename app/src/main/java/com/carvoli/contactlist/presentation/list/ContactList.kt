package com.carvoli.contactlist.presentation.list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.carvoli.contactlist.presentation.components.ContactItem
import com.carvoli.contactlist.model.Contact

@Composable
fun ContactList(contactList : MutableState<List<Contact>>){
    LazyColumn {
        items(contactList.value) {
                contact -> ContactItem(contact)
        }
    }
}