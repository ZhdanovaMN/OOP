import java.io.IOException;
import java.util.List;

public class ImportFile {

    private String filePath;
    public ImportFile(String filePath) {
        this.filePath = filePath;
    }
// Не реализовано еще
    public List<Contact> importFromXml(String filePath) throws IOException {
        return null;
    }


    public List<Contact> importFromCsv(String filePath) throws IOException {
        return null;
    }
}
