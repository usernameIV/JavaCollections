package MapCollection.BasicActions.AgendaContacts;

import java.util.HashMap;
import java.util.Map;

public class ContactsAgenda {

    private Map<String, Integer> contacts;

    public ContactsAgenda () {
        this.contacts = new HashMap<>();
    }


    public void addContact(String name, Integer phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public void removeContact(String name) {
        if (!contacts.isEmpty()) {
            contacts.remove(name);
        }
    }
    public void displayContacts() {
        System.out.println(contacts);
    }
    public Integer searchNumberByName(String name) {
        Integer numberByName = null;
        if(!contacts.isEmpty()) {
            numberByName = contacts.get(name);
        }
        return numberByName;
    }

}
