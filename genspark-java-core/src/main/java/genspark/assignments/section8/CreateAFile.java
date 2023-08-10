package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreateAFile implements Assignment {

        public void createAFile() {

            File file = new File("sample_data.txt");

            try {

                boolean created = file.createNewFile();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        public void writeToAFile() {

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("sample_data.txt"));

                writer.write("test");
                writer.close();


            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        public ArrayList<Character> readAFile() {

            ArrayList<Character> chars = new ArrayList<>();

            try {

                List<String> text = Files.readAllLines(Paths.get("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\src\\main\\java\\genspark\\assignments\\section8\\sample_data.txt"));


                for(char c: text.get(0).toCharArray()) {

                    chars.add(c);
                }

                return chars;

            } catch (IOException e) {
                e.printStackTrace();
            }

            return chars;

        }



}
