public class IdentProducer {
	private static Integer lastID = 0;
	
	public static String newStr() {
		lastID += 1;
		return "M" + lastID.toString();
	}
}
