package twodemention;

public class ArrayInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mathScores = new int[2][3];
		
		System.out.println(mathScores.length);
		System.out.println(mathScores[0].length);
		System.out.println(mathScores[1].length);
		
		for(int i=0; i<mathScores.length; i++) {
			for(int j=0; j<mathScores[i].length; j++) {
				System.out.println("mathScores[" +i+"]["+j+"]=" + mathScores[i][j]);
			}
		}
		System.out.println();
		
		int[][] englishScore = new int[2][];
		englishScore[0] = new int[2]; 
		englishScore[1] = new int[3]; 
		
		for(int i=0; i<englishScore.length; i++) {
			for(int j=0; j<englishScore[i].length; j++) {
				System.out.println("mathScores[" +i+"]["+j+"]=" + englishScore[i][j]);
			}
		}
		System.out.println();
	}

}
