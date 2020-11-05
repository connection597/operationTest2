package operation2;

public class Operation2Test {

	public static void main(String[] args) {
		int gameScore = 150; //게임에서 획득한 점수
		
		int lastScore1 = gameScore++; //게임 스코어와 1더하값을 라스트 스코어1에 대입
		System.out.println(lastScore1);
		
		int lastScore2 = gameScore--; //게임 스코어와 1뺀값을 라스트 스코어2에 대입
		System.out.println(lastScore2);
		

	}

}
