package core.basesyntax.serviceimpl;

import core.basesyntax.service.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriterImpl implements FileWriter {
    @Override
    public void writeFile(String fileName, String data) {
        try {
            Files.writeString(Path.of(fileName), data);
        } catch (IOException e) {
            throw new RuntimeException("Can't write the file : " + fileName, e);
        }
    }
}
