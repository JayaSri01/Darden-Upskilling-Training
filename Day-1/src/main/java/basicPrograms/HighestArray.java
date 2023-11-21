package basicPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighestArray {

	public static void main(String[] args) {
		List<Integer> res = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int max = res.stream().sorted(Collections.reverseOrder()).skip(2).findFirst().get();
		System.out.println(max);
	}

}
