package palindrome;

import org.junit.Assert;
import org.junit.Test;
import palindrome.PalindromeKata;

// A palindrome is a word, phrase, or sequence that reads the same backward as forward
// Write code to check if a word is a palindrome without using the Stringbuilder reverse method
public class PalindromeKataTest {
    @Test
    public void isPalindromeTest_Mom() {
        String word = "mom";
        boolean isPalindrome = PalindromeKata.isPalindrome(word);
        Assert.assertTrue(isPalindrome);
    }

    @Test
    public void isPalindromeTest_HelloWorld() {
        String word = "hello world";
        boolean isPalindrome = PalindromeKata.isPalindrome(word);
        Assert.assertFalse(isPalindrome);
    }

    @Test
    public void isPalindromeTest_TacoCat() {
        String word = "taco cat";
        boolean isPalindrome = PalindromeKata.isPalindrome(word);
        Assert.assertTrue(isPalindrome);
    }

    @Test
    public void isPalindromeTest_GoHangASalamiImALasagnaHog() {
        String word = "Go hang a salami, I'm a lasagna hog";
        boolean isPalindrome = PalindromeKata.isPalindrome(word);
        Assert.assertTrue(isPalindrome);
    }
}
