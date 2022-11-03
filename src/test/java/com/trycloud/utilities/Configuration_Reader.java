package com.trycloud.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// We are creating this class ONLY ONCE in utilities package
// we will just call getProperties() method using class name

public class Configuration_Reader {

    // 1. Create the object of Properties class
    // We need Properties class to use methods coming from this class like load(), getProperty("key")
    private static Properties properties = new Properties(); // it is static because we are using it in static method
    // it is private because I'll be using it only in this class

    static {  // We want to open the properties file and loa properties object ONLY ONCE before reading
              // static block runs first
        try {
            // 2. Create the object of FileInputStream
            // We need this object to open the file as a stream in Java memory
            FileInputStream file = new FileInputStream("configuration.properties"); //passing the path of the file

            // 3. Load the properties object using  FileInputStream object
            // Load "properties" object with the "file" we opened using  FileInputStream
            properties.load(file);
            file.close(); //  close the file after loading, if we don't close the file, it will take space from computer memory

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // This method is used to read value from configuration.properties file
    // parameter keyword --> key name in configuration.properties file
    // return --> value for the key; returns null if key is not found
    // driver.get(Configuration_Reader.getProperty("env"))

    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }
}