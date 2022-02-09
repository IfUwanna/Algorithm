package com.leetcode.string;


import org.junit.jupiter.api.Test;

/**
 * packageName    : com.leetcode.string
 * fileName       : RansomNoteTest
 * author         : Jihun Park
 * date           : 2022/01/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/01/23        Jihun Park       최초 생성
 */
class RansomNoteTest {
    RansomNote  ransomNote = new  RansomNote();
    @Test
    void canConstruct() {
        ransomNote.canConstruct("bg","efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj");
    }
}