package SetColletion.BasicActions.GuestSet;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {

    private Set<Guest> guestSet;

    public GuestSet() {
        this.guestSet = new HashSet<>();
    }

    public void addGuest(String name, int inviteId) {
        guestSet.add(new Guest(name, inviteId));
    }

    public void removeGuestById(int codigoConvite) {
        Guest convidadoParaRemover = null;
        if (!guestSet.isEmpty()) {
            for (Guest c : guestSet) {
                if (c.getInviteId() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            guestSet.remove(convidadoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public int countGuests() {
        return guestSet.size();
    }

    public void displayGuests() {
        if (!guestSet.isEmpty()) {
            System.out.println(guestSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

}