package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class QaProps {

    static Properties properties;

    private QaProps() {

    }

    public static void init() {
        //here we can get value i.e url
        if (properties == null) {
            properties = new Properties();
            try {
                properties.load(Files.newInputStream(Path.of("src/test/resources/env.properties"))); // to associate the class file (url) to properties
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static String getValue(String key) {    //if it is starting then it will load the files and get property
        init();
       return  properties.getProperty(key);
    }
}



