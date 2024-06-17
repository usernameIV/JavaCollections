package SetColletion.BasicActions.GuestSet;

import java.util.Objects;

public class Guest {
    //atributos
    private String name;
    private int inviteId;

    public Guest(String name, int inviteId) {
        this.name = name;
        this.inviteId = inviteId;
    }

    public String getName() {
        return name;
    }

    public int getInviteId() {
        return inviteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest guest)) return false;
        return getInviteId() == guest.getInviteId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInviteId());
    }

    @Override
    public String toString() {
        return
            "Guest: " + '\n'
            + "Name - "+ name + '\n'
            + "Id - "+ inviteId + '\n' + '\n';
    }
}