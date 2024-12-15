package StringProgramPractise;

public class NumberFromString {


		public static void main(String[] args) {

			String str = "ViVeK1234G21#";

			String numString = "";

			for (int i = 0; i < str.length(); i++) {
				int ascii = str.charAt(i);

				// ascii value of 0 is 48 and of 9 is 57
				if (ascii >= 48 && ascii <= (57)) {
					numString += (char) ascii;
				}
			}
			// Convert number in string form to
			//an integer value
			int numbers = Integer.parseInt(numString);

			System.out.println(numbers);
		}
}
