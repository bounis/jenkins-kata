package org.company.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Path;

import static java.nio.file.Files.newInputStream;

public class IOHelper {
    public static MowerBufferdReader createMowerBufferedReader(Path path) throws IOException {
        Reader reader = new InputStreamReader(newInputStream(path));
        return new MowerBufferdReader(reader);
    }
}
