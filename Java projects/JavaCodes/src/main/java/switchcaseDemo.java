public class switchcaseDemo {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String fruit="guava"; switch(fruit) { case "orange"
		 * :System.out.println("orange"); break; case "banana"
		 * :System.out.println("banana"); break; case "apple"
		 * :System.out.println("apple"); break;
		 * default:System.out.println("Unknown fruit");
		 *
		 * }
		 */
			String month = "feb";
			int year = 2028;
			int noofdays = switch(month) {
			case "jan","mar","may","jul","aug","oct","dec" -> 31;
			case "apr","jun","sep","nov"->30;
			case "feb" ->{
				if(year%400 == 0) yield 29;
				else if(year %100 ==0 ) yield 28;
				else if(year %4 == 0) yield 29;
				else yield 28;
			}
			default -> 30;
			};
			System.out.println("Number of days " + noofdays);
	
	}
 
}
 