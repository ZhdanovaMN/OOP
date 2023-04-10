package Model;

public class Contact {

    private String name;
    private String phoneNumber;
    private Long contactId;


    public Contact() {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getContactId() {
        return contactId;
    }

    public Contact getContact(Long contactId) {
        return getContact(contactId);
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Contact)) return false;
        Contact c = (Contact) obj;
        return name.equals(c.name) &&
                phoneNumber.equals(c.phoneNumber);
    }

    @Override
    public String toString() {
        return "ContactID" + contactId +
                ", Имя: " + name +
                ", Номер телефона: " + phoneNumber;
    }


}
