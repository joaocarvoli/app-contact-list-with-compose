package com.carvoli.contactlist.dao

import com.carvoli.contactlist.model.Contact

class ContactArrayListDAO : IContactDAO {
    override fun addContact(): Boolean {
        //
        return true
    }

    override fun getContact(): Contact {
        return Contact("", "", "")
    }

    override fun getListContacts(): ArrayList<Contact> {
        return arrayListOf()
    }
}