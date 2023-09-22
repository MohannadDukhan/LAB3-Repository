import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy);
    }

    public List<BuddyInfo> getBuddies(){
        return buddies;
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo ("Tom", "Carleton", "(613)");
        AddressBook buddies = new AddressBook();
        buddies.addBuddy(buddy);
        buddies.removeBuddy(buddy);
    }
}
