package com.decagon.emeka.conatacts.manager;

import com.decagon.emeka.conatacts.manager.Main;

/**
 * Creating the com.decagon.emeka.conatacts.manager.ContactManager class responsible for;
 * adding
 * searching of Contacts
 *
 */

public class ContactManager {
        Contact [] myFriends;
        int friendCount;

        //creating the constructor
        ContactManager () {
            this.friendCount = 0;
            this.myFriends = new Contact[500];
        }

        /**
         * creating the methods for adding
         */

        void addContact (Contact contact) {
            myFriends[friendCount] = contact;
            friendCount++;
        }

        /**
         * creating the method for searching
         *
         */
        Contact searchContact (String searchName) {
            for(int count = 0; count < friendCount; count++) {
                if(myFriends[count].name.equals(searchName))
                    return myFriends[count];
            }
            return null;
        }
}
