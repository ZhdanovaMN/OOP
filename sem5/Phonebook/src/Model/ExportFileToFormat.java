package Model;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.*;
import java.util.List;

public class ExportFileToFormat implements ExportFile {
    private String filePath;

    public ExportFileToFormat(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void exportToXml(List<Contact> contacts, String filePath) throws IOException, XMLStreamException {
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
        OutputStream outputStream = new FileOutputStream(filePath + ".xml");
        XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(outputStream);
        xmlStreamWriter.writeStartDocument();
        xmlStreamWriter.writeStartElement("contacts");
        for (Contact contact : contacts) {
            xmlStreamWriter.writeStartElement("contact");
            xmlStreamWriter.writeStartElement("name");
            xmlStreamWriter.writeCharacters(contact.getName());
            xmlStreamWriter.writeEndElement();
            xmlStreamWriter.writeStartElement("phoneNumber");
            xmlStreamWriter.writeCharacters(contact.getPhoneNumber());
            xmlStreamWriter.writeEndElement();
            xmlStreamWriter.writeEndElement();
        }
        xmlStreamWriter.writeEndElement();
        xmlStreamWriter.writeEndDocument();
        xmlStreamWriter.flush();
        xmlStreamWriter.close();
    }

    @Override
    public void exportToCsv(List<Contact> contacts, String filePath) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath + ".csv"))) {
            for (Contact contact : contacts) {
                bw.write(contact.getName() + "," + contact.getPhoneNumber());
                bw.newLine();
            }
        }
    }
}
