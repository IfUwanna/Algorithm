package slidingwindow;


import com.leetcode.slidingwindow.LongestSubstringWithoutRepeatingCharacters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * packageName    : com.leetcode.slidingwindow
 * fileName       : LongestSubstringWithoutRepeatingCharactersTest
 * author         : Jihun Park
 * date           : 2022/01/11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/11        Jihun Park       최초 생성
 */
class LongestSubstringWithoutRepeatingCharactersTest {
    LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    @Test
    void lengthOfLongestSubstring() {
        //assertEquals(3,longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3,longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abba"));
        //assertEquals(1,longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(" "));
    }
}