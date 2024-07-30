public class returnswitchDemo {
 
	public static int returnScore(String event)
	{
		return switch(event) {
		case "NoBall" , "Wide" ->1;
		case "four" -> 4;
		case "One" ->1;
		case "Four" -> 4;
		case "Out" -> 0;
		case "Six" -> 6;
		default -> 0;
		};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalScore = 0;
		totalScore += returnScore("four");
		totalScore += returnScore("One");
		totalScore += returnScore("Four");
		totalScore += returnScore("Six");
		totalScore += returnScore("Out");
		totalScore += returnScore("One");
		System.out.println("Runs : " + totalScore);
 
	}
 
}
 
