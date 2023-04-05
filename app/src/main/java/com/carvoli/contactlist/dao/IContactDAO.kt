package com.carvoli.contactlist.dao

import com.carvoli.contactlist.model.Contact

interface IContactDAO {
    fun addContact() : Boolean
    fun getContact() : Contact
    fun getListContacts() : ArrayList<Contact>
}