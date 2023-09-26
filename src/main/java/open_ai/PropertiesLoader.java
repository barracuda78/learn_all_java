package open_ai;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Properties;

public class PropertiesLoader {

    public Properties loadProperties(String resourceFileName) throws IOException {
        Properties configuration = new Properties();
        InputStream inputStream = Files.newInputStream(new File(resourceFileName).toPath());
        configuration.load(inputStream);
        inputStream.close();
        return configuration;
    }

}
