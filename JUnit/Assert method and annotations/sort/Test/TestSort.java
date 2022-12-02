package sort.Test;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
public class TestSort {
	@Test
	public void testSort() {
		int a[] = {5,3,4,1,2};
		int b[]= {1,2,3,4,5};
		Arrays.sort(a);
		assertArrayEquals(b,a);
	}
}
