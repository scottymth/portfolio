package segments;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;

public class SolutionTest {
    
    @Test
    public void test() {
        assertEquals(List.of("a", "b", "bc", "c", "cc", "d"),new Solution().partitionString("abbccccd"));
    }
    
    @Test
    public void testCaps() {
        assertEquals(Collections.<String>emptyList(),new Solution().partitionString("aB"));
    }
    
    @Test
    public void testSize() {
        assertEquals(Collections.<String>emptyList(),new Solution().partitionString("a".repeat(10001)));
    }
}
