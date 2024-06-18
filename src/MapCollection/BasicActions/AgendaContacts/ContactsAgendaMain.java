package MapCollection.BasicActions.AgendaContacts;

public class ContactsAgendaMain {

    public static void main(String[] args) {

        ContactsAgenda cnt = new ContactsAgenda();

        cnt.addContact("Danton", 101010); //This will not show on terminal
        cnt.addContact("Hebert", 111010);
        cnt.addContact("Filipe", 111110);
        cnt.addContact("Sabino", 100010);
        cnt.addContact("Silva",  111111);
        cnt.addContact("Danton", 101010); //This will not show on terminal
        cnt.addContact("Danton", 101024);
        //Because ~put~ method, besides adding to the hash


        System.out.println();
        System.out.println("Contacts online:");
        cnt.displayContacts();

        cnt.removeContact("Silva");

        System.out.println("Contacts online:");
        cnt.displayContacts();

        System.out.println();
        System.out.println("The contact number is: "+ cnt.searchNumberByName("Danton"));


    }
}
