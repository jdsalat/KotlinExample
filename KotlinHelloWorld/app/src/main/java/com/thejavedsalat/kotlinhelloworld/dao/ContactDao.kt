package com.thejavedsalat.kotlinhelloworld.dao

import com.thejavedsalat.kotlinhelloworld.beans.ContactBean

/**
 * Created by Javed.Salat on 10/15/2017.
 */
class ContactDao {

    companion object {
        fun getInstance(): ContactDao {
            return ContactDao()
        }
    }


    fun getContactList(): ArrayList<ContactBean> {
        val contacts: ArrayList<ContactBean> = ArrayList();
        var contactBean = ContactBean()
        contactBean.contactId = 1
        contactBean.contactName = "Steve"
        contactBean.contactNumber = "1111111"
        contacts.add(contactBean)

        contactBean = ContactBean()
        contactBean.contactId = 2
        contactBean.contactName = "Jack"
        contactBean.contactNumber = "2222222"
        contacts.add(contactBean)

        contactBean = ContactBean()
        contactBean.contactId = 3
        contactBean.contactName = "John"
        contactBean.contactNumber = "0000000"
        contacts.add(contactBean)

        contactBean = ContactBean()
        contactBean.contactId = 4
        contactBean.contactName = "Sunny"
        contactBean.contactNumber = "999999"
        contacts.add(contactBean)

        return contacts;
    }
}