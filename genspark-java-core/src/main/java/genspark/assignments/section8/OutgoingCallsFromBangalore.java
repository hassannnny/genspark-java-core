package genspark.assignments.section8;

import genspark.assignments.Assignment;
import org.w3c.dom.ls.LSInput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class OutgoingCallsFromBangalore implements Assignment {
    public String solution() throws IOException {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        HashSet<String> areaCodes = new HashSet<>();

        List<String> callers = Files.readAllLines(Paths.get("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\calls.csv")).stream()
                .map(string -> string.split(",")[0])
                .collect(Collectors.toList());

        List<String> sol = new ArrayList<>();

        Pattern fixedLine = Pattern.compile("\\((0[0-9]+)\\)[0-9]+");
        Pattern mobile = Pattern.compile("([789][0-9]{3})[0-9] [0-9]{5}");
        Pattern telemarketer = Pattern.compile("(140)[0-9]{7}");

//        for(String num: callers) {
//
//            Matcher fixed = fixedLine.matcher(num);
//            Matcher mobileM = mobile.matcher(num);
//            Matcher tele = telemarketer.matcher(num);
//
//            if (fixed.matches()) {
//                sol.add(fixed.group(1));
//            }
//            else if (mobileM.matches()) {
//                sol.add(mobileM.group(1));
//            }
//            else if (tele.matches()) {
//                sol.add(tele.group(1));
//            }
//        }



        String result = sol.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining(" "));

        return result;
    }
}
