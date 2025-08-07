package segments;

import java.util.List;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;

class Solution {

    private static final int MAX_LENGTH = 10000;

    public List<String> partitionString(String s) {
        if (s.length() > MAX_LENGTH || !s.equals(s.toLowerCase())) return Collections.emptyList();

        List<String> segments = new ArrayList<>();

        StringWriter currentSegment = new StringWriter();
        for (int idx = 0; idx < s.length(); idx++) {
            currentSegment.append(s.substring(idx, idx + 1));
            if (!segments.contains(currentSegment.toString())) {
                segments.add(currentSegment.toString());
                currentSegment = new StringWriter();
            }
        }
        return segments;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().partitionString(args[0]));
    }
}