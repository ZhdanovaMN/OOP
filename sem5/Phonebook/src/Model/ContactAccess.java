package Model;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public interface ContactAccess {
    public void addNumber(Scanner scanner);
    public void removeContact(Scanner scanner);
    public List<Contact> searchContacts(String searchTerm);
    public void exportContactsToXml() throws IOException, XMLStreamException;
    public void exportContactsToCsv() throws IOException;
    public void importContactsFromXml() throws IOException, XMLStreamException;
    public void importContactsFromCsv() throws IOException;
    public void printAll();

}
