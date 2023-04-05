package com.carvoli.contactlist.model

class Contact(name : String, phoneNumber : String, address : String) {
    private val name : String
    private val phoneNumber : String
    private val address : String
    init {
        this.name = name
        this.phoneNumber = phoneNumber
        this.address = address
    }

    fun getName() : String {
        return name
    }

    fun getPhoneNumber() : String {
        return phoneNumber
    }

    fun getAddress() : String {
        return address
    }
}