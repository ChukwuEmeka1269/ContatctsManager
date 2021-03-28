package com.decagon.emeka.conatacts.manager;

public class Main {

    public static void main(String[] args) {
        ContactManager myContactsManager = new ContactManager();

        Contact myGuyJames = new Contact();
        myGuyJames.name = "James";
        myGuyJames.phoneNumber = "07065513758";
        myGuyJames.email  = "jamesBond007@gmail.com";
        //add contacts from myContactsManager using the addContact method
        myContactsManager.addContact(myGuyJames);

        Contact myGuyEmma = new Contact();
        myGuyEmma.name = "Emma";
        myGuyEmma.email = "emma23@gmail.com";
        myGuyEmma.phoneNumber = "09876543111";
        myContactsManager.addContact(myGuyEmma);


        Contact myGirl = new Contact();
        myGirl.name = "Susan";
        myGirl.phoneNumber = "09065513543";
        myContactsManager.addContact(myGirl);

        Contact myDude = new Contact();
        myDude.name = "Coleman";
        myDude.phoneNumber = "07098876243";
        myContactsManager.addContact(myDude);


        System.out.println(myContactsManager.searchContact("Coleman").name);
//        System.out.println(myContactsManager.myFriends[0].name);

//        String searchFriend = myContactsManager.searchContact(myDude.name).toString();
//
//        System.out.println(searchFriend);

    }




}
