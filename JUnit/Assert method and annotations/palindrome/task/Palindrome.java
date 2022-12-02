package palindrome.task;
public class Palindrome {
	public boolean doPalindrome(int a) {
		int inp=a;
		int rem=0;
		int res=0;
		boolean result;
		while(a>0) {//123
		rem=a%10;//1
		res=(res*10)+rem;//321
		a=a/10;//0
	}
		if(inp==res) {
			result=true;
			System.out.print("Correct");
			return result;
		}
		else {
			result=false;
			System.out.print("Incorrect");
			return result;
		}

}
}
