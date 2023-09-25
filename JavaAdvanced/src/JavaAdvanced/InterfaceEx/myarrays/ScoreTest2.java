package JavaAdvanced.InterfaceEx.myarrays;

import java.util.Arrays;

public class ScoreTest2 {
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
		
		Arrays.sort(list);
			
		}
		System.out.println("국어 점수가 낮은 순으로 정렬");
		for (Score score : list) {
			System.out.println(score);
		}
	}
}
