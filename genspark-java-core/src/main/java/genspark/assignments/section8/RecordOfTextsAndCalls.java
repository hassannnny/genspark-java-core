package genspark.assignments.section8;

import genspark.assignments.Assignment;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RecordOfTextsAndCalls implements Assignment {
    public String[] solution() throws IOException {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        String[] ans = new String[2];



        List<String> first = Files.readAllLines(Paths.get("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\texts.csv"));

        //97424 22395,90365 06212,01-09-2016 06:03:22

        String[] firstLine = first.get(0).split(",");

        String[] time = firstLine[2].split(" ");

        ans[0] = "First record of texts, " + firstLine[0] + " texts " + firstLine[1] + " at time " + firstLine[2];



        List<String> second = Files.readAllLines(Paths.get("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\calls.csv"));

        //98447 62998,(080)46304537,30-09-2016 23:57:15,2151

        //incoming - 0
        //ans - 1
        //time - 2
        //duration - 3

        String[] lastLine = second.get(second.size() - 1).split(",");

        time = lastLine[2].split(" ");

        ans[1] = "Last record of calls, " + lastLine[0] + " calls " + lastLine[1] + " at time " + lastLine[2] + ", lasting " + lastLine[3] + " seconds";


        return ans;
    }
}
