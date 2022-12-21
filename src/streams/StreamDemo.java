package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String []args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		list=list.stream().filter(x -> x%2==0).collect(Collectors.toList());
		//Set<Integer>s=list.stream().map(x->x*x).collect(Collectors.toSet());
		//System.out.println(s);
		System.out.println(list);
	}
}
