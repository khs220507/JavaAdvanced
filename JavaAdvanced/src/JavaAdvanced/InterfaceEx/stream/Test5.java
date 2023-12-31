package JavaAdvanced.InterfaceEx.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Test5 {
	
	public static void main(String[] args) throws IOException {

		
		BufferedReader reader = new BufferedReader ( new FileReader("src/JavaAdvanced/InterfaceEx/stream/test.txt"));
		ArrayList<String> list = new ArrayList<>();
		
		String str="";
		
		while( ( str = reader.readLine())  != null ) {
			list.add( str);			
		}
		
		System.out.println(list.size());
		Stream<String> stream = list.stream();
		long count = stream.filter(s-> s.equals("김현수")).count();
		System.out.println("김현수님 : " + count);
	}

}
