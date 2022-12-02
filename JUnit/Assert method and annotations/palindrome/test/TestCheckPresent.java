package palindrome.test;
import java.util.Scanner;
import palindrome.task.Palindrome;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestCheckPresent {
@Test
	public void testPalindrome(){
	Palindrome p = new Palindrome();
	Scanner input = new Scanner(System.in);
	int a =input.nextInt();
	assertTrue(p.doPalindrome(a));
		
	
}
}
