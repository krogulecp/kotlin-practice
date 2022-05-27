package info.krogulec.kotlinpractice.exceptions;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ExceptionsJava {

    List<String> openFile() {
        // TODO
        return null;
    }

    private Path getResourcePath(String fileName) {
        return Paths.get(getClass().getClassLoader().getResource(fileName).getPath());
    }
}
