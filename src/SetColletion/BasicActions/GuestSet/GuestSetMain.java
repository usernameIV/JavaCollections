package SetColletion.BasicActions.GuestSet;

public class GuestSetMain {

    public static void main(String[] args) {

        GuestSet gst = new GuestSet();


        System.out.println("Existem " + gst.countGuests() + " convidado(s) dentro do Set de Convidados");


        gst.addGuest("Alice", 1234);
        gst.addGuest("Bob", 1235);
        gst.addGuest("Charlie", 1235);
        gst.addGuest("David", 1236);

        System.out.println("Convidados no conjunto:");
        gst.displayGuests();


        System.out.println("Existem " + gst.countGuests() + " convidado(s) dentro do Set de Convidados");


        gst.removeGuestById(1236);
        System.out.println("Existem " + gst.countGuests() + " convidado(s) dentro do Set de Convidados após a remoção");


        System.out.println("Convidados no conjunto após a remoção:");
        gst.displayGuests();
    }
}
