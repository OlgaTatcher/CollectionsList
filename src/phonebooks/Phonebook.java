package phonebooks;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<ContactRecord> contactInfo;

    public Phonebook() {
        contactInfo =new ArrayList<>();
    }
    public String toString() {
        return "Contact: " + contactInfo;
    }

    public void add(ContactRecord phonebookEntry){
        contactInfo.add(phonebookEntry);
    }
    public ContactRecord find(String name){
        for (ContactRecord phonebookEntry: contactInfo) {
            if (phonebookEntry.getName().equals(name)){
                return phonebookEntry;
            }

        }
        return null;
    }
}
