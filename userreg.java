import java.util.regex.*;

class userreg {

	// Function to validate the username
	public static boolean isValidUsername(String name)
	{

		// Regex to check valid username.
		String regex = "^[A-Za-z]\\w{5,29}$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the username is empty
		// return false
		if (name == null) {
			return false
		}
		Matcher m = p.matcher(name);

		// Return if the username
		// matched the ReGex
		return m.matches();
	}
	public static void main(String[] args)
	{

		// Test Case: 1
		String str1 = "PrayagrajBehera";
		System.out.println(isValidUsername(str1));

		// Test Case: 2
		String str3 = "1PrayagrajBehera";
		System.out.println(isValidUsername(str3));

		// Test Case: 3
		String str5 = "PB";
		System.out.println(isValidUsername(str5));
	}
}
