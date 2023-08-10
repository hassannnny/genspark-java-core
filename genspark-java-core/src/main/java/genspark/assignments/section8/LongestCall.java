package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class LongestCall implements Assignment {
    public String solution() {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        String ans = "";

        try {
            List<String> lines = Files.readAllLines(Paths.get("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\calls.csv"));

            List<String[]> split = lines.stream()
                    .map(string -> string.split(","))
                    .collect(Collectors.toList());

            int max = 0;

            for (String[] strings : split) {

                if (Integer.parseInt(strings[3]) > max) {

                    max = Integer.parseInt(strings[3]);
                    ans = strings[0];
                }
            }

            return ans;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return ans;
    }
}
