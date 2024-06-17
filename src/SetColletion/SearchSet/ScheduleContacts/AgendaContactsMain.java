package SetColletion.SearchSet.ScheduleContacts;

public class AgendaContactsMain {
    public static void main(String[] args) {

        AgendaContacts contacts = new AgendaContacts();

        contacts.displayContacts();
        contacts.addContact("Dan", 919910231);
        contacts.addContact("Fil", 999717101);
        contacts.displayContacts();
        contacts.addContact("Liedson", 919910231);
        System.out.println();
        System.out.println();

        System.out.println("Contato buscado: "+ '\n' + contacts.searchByName("Liedson"));
        System.out.println("Contato atualizado: " + contacts.updateContactNumber("Liedson", 1928919));
        contacts.displayContacts();


    }
}
