package Lisson_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Seminar_task_0 {
    public static void main(String[] args) {

    }
    public void rwLine(Path pathRead, Path pathWrite) {

        try(BufferedReader in = Files.newBufferedReader(pathRead); BufferedWriter out = Files.newBufferedWriter(pathWrite);) {
            out.write(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
