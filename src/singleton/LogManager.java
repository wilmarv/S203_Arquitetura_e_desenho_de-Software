package singleton;

public class LogManager {
	private static LogManager instance;

	private LogManager() {

	}

	public static LogManager getInstance() {
		if (instance == null) {
			instance = new LogManager();
		}
		return instance;
	}
}
