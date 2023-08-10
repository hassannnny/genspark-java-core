package genspark.assignments.section8;

import genspark.assignments.Assignment;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TotalNumberOfCalls implements Assignment {
    public int solution() throws IOException {


        List<String> lines = Files.readAllLines(Paths.get("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\texts.csv"));

        List<String> moreLines = (Files.readAllLines(Paths.get("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\calls.csv")));


        lines.addAll(moreLines);

        List<String[]> split = lines.stream()
                .map(string -> string.split(","))
                .collect(Collectors.toList());

        List<String> phonenums = new ArrayList<>();

        for (String[] strings : split) {

            phonenums.add(strings[0]);
            phonenums.add(strings[1]);
        }

        Set<String> set = new HashSet<String>(phonenums);


       return set.size();
    }
}

