package JavaAdvanced.InterfaceEx.myarrays;

import java.util.Arrays;
import java.util.Comparator;



public class ScoreTest3 {
	public static void main(String[] args) {
		Score[] list = new Score[4];
		list[0] = new Score(100, 90);
		list[1] = new Score(80, 90);
		list[2] = new Score(90, 90);
		list[3] = new Score(60, 70);
		System.out.println("정렬 X");
		for (Score score : list) {
			System.out.println(score);

			// 국어 점수가 낮은 순으로 정렬 라이브러리(직접정렬, 선택정렬)

			MyArrays.sort(list);

		}
		System.out.println("국어 점수가 낮은 순으로 정렬");
		for (Score score : list) {
			System.out.println(score);
		}
		
		// 1. 익명클래스
		MyArrays.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Score s1 = (Score) o1;
				Score s2 = (Score) o2;
				return s1.kor = s2.eng;
			}
		});
		
		// 2. 인터페이스를 구현한 클래스를 작성하고 사용
		class ComparatorImp implements Comparator{

			@Override
			public int compare(Object o1, Object o2) {
				Score s1 = (Score) o1;
				Score s2 = (Score) o2;
				return s1.kor = s2.eng;
			}	
		}
		
		MyArrays.sort(list, new ComparatorImp());	
		}
	

}
