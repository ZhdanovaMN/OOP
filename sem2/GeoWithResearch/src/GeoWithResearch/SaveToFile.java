package GeoWithResearch;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {
    GeoTree tree;

    public void save(String fileName, GeoTree geoTree) {
        tree = geoTree;
        try (FileWriter writer = new FileWriter("src/GeoWithResearch/GT.txt", false)) {
            GeoTree text = tree;
            writer.write(text.toString());
            writer.append('\n');
            writer.append('E');

            writer.flush();
        } catch (IOException ex) {

        }
    }
}