package section8.arraylistChallenge;

import java.util.ArrayList;

public class MobilePhone {

    ArrayList<Contacts> mobileList = new ArrayList<Contacts>();

    public void addContact(String name, String phoneNumber) {
        Contacts contacts = new Contacts();
        contacts.setName(name);
        contacts.setPhoneNumber(phoneNumber);
        if (checkDuplicateContact(name)) {
            mobileList.add(contacts);
            System.out.println("Contact Added Successfully Name : " + name + " number : " + phoneNumber);
        }
    }

    public void listAllContacts() {
        for (int i = 0; i < mobileList.size(); i++) {
            System.out.println("NAME: " + mobileList.get(i).getName());
            System.out.println("NUMBER :" + mobileList.get(i).getPhoneNumber());
        }
    }

    private boolean checkDuplicateContact(String name) {
        for (int i = 0; i < mobileList.size(); i++) {
            if (mobileList.get(i).getName().equals(name)) {
                System.out.println(name + " : Already Exist");
                return false;
            }

        }
        return true;
    }

    public void removeContact(String name){

    }


}
