package ru.lksh;

import java.io.InputStreamReader;
import java.util.Map;

public class StdinInStream extends InputStreamInStream {
    /**
     * A file to read data from.
     */

    StdinInStream(Map<Outcome.Type, Outcome.Type> outcomeMapping) {
        super(outcomeMapping);
    }

    public InputStreamReader getReader() {
        return new InputStreamReader(System.in);
    }
}
