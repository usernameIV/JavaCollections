package SetColletion.SearchSet.ScheduleContacts;

import java.util.HashSet;
import java.util.Set;

public class AgendaContacts {

    private Set<Contact> contacts;

    public AgendaContacts() {
        this.contacts = new HashSet<>();
    }

    public void addContact(String name, int phoneNumber) {
        contacts.add(new Contact(name, phoneNumber));
    }
    public void displayContacts() {
        System.out.println(contacts);
    }
    public Set<Contact> searchByName(String name) {
        Set<Contact> contactName = new HashSet<>();
        for (Contact cnt : contacts ) {
            if (cnt.getName().startsWith(name)){
                contactName.add(cnt);
            }
        }
        return contactName;
    }
    public Contact updateContactNumber(String name, int newPhoneNumber) {
        Contact updatedContact = null;
        for (Contact cnt : contacts) {
            if (cnt.getName().equalsIgnoreCase(name)) {
                cnt.setPhoneNumber(newPhoneNumber);
                updatedContact = cnt;
                break;
            }
        }
        return updatedContact;
    }
}
