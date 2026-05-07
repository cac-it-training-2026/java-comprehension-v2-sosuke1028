package q02_advanced.question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public String inputString() throws IOException {
		return reader.readLine();
	}

	public int inputNumber() throws IOException, NumberFormatException {
		return Integer.parseInt(reader.readLine());
	}
}