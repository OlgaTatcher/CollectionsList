package phonebooks;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<ContactRecord> contactInfo;
    public Phonebook() {
        contactInfo =new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Contact: " + contactInfo;
    }

    public void add(ContactRecord phonebookRecord){
        contactInfo.add(phonebookRecord);
    }

    public ContactRecord find(String name){
        for (ContactRecord phonebookRecord: contactInfo) {
            if (phonebookRecord.getName().equals(name)){
                return phonebookRecord;
            }

        }
        return null;
    }

    public List<ContactRecord>  findInfo(String name) {
        List<ContactRecord> contact = new ArrayList<>();
        for (ContactRecord phonebookRecord : contactInfo){
            if (phonebookRecord.getName().equalsIgnoreCase(name))contact.add(phonebookRecord);
        }
        if (contact.isEmpty())return null;

        return contact;
    }
}
