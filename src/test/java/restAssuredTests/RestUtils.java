package restAssuredTests;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {

	public static String getFirstName() {

		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("john"+generatedString);

	}

	public static String getLastName() {

		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("kenedy"+generatedString);

	}

	public static String getUserName() {

		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("john"+generatedString);

	}

	public static String getPassword() {

		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("john"+generatedString);

	}

	public static String getEmail() {

		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return (generatedString+"@gamil.com");

	}


	public static String empName() {

		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("John"+generatedString);

	}


	public static String empSalary() {

		String generatedString = RandomStringUtils.randomNumeric(5);
		return (generatedString);

	}


	public static String empAge() {

		String generatedString = RandomStringUtils.randomNumeric(2);
		return (generatedString);

	}

}
