package ru.lksh;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class FileInStream extends InputStreamInStream {
    /**
     * A file to read data from.
     */
    private final File file;

    FileInStream(File file, Map<Outcome.Type, Outcome.Type> outcomeMapping) {
        super(outcomeMapping);
        this.file = file;
    }

    public InputStreamReader getReader() throws IOException {
        return new FileReader(file);
    }
}
