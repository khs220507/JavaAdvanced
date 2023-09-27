package JavaAdvanced.InterfaceEx.stream;

import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;

public class Test1 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> lottos = new HashSet<>();
		Random r = new Random();
		for(int i=0; i<20; i++) {
			lottos.add(r.nextInt(46));
		}
		
		System.out.println(lottos.size());
		
		Object[] lottosArray = lottos.toArray();
		Integer[] result = new Integer[6];
		System.arraycopy(lottosArray, 0, result, 0, 6);
		
		System.out.println("lotte number!");
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i] + " ");
		}
		
		IntStream is = new Random().ints(1,46);
		System.out.println("\n스트림으로 lotto 생성");
		is.distinct().limit(6).sorted().forEach(number-> System.out.println(number + " "));
	}
}
