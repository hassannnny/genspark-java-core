package genspark.assignments.section7;

import genspark.assignments.Assignment;
import org.checkerframework.checker.units.qual.A;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QueryTheFile implements Assignment {
    public ArrayList<String> solution() {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        ArrayList<String> str = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();

        try {

            File file = new File("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\filter_problem.text");
            Scanner line = new Scanner(file);
            int i = 0;

            while (i < 1000) {

                str.add(line.nextLine());
                i++;
            }

            Object[] obj;

            obj = str.stream()
                    .filter(string -> !string.contains("2"))
                    .toArray();

            for (Object o : obj) {

                answer.add((String) o);

            }

        }catch (Exception e) {
            e.printStackTrace();
        }

        return answer;
    }
}
