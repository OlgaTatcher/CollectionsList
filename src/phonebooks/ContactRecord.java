package phonebooks;

public class ContactRecord {
    private String name;
    private String phone;
    public ContactRecord(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return " " +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
