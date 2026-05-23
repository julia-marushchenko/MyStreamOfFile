/**
 *  Java program to create a stream of file.
 */

package com.mystreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * com.mystreams.Main class.
 */

public class Main {

    // JVM entry point.
    public static void main(String[] args) throws IOException {

        // Path to file.
        Path path = Paths.get("src/file.txt");

        // Creating a stream with cgaracters.
        Stream<String> streamOfString = Files.lines(path);

        // Printing streamOfString to console.
        streamOfString.forEach(System.out::println); // Output: Hello World.

        // Closing stream.
        streamOfString.close();

    }
}
