package infyBank;

class InvalidPostException extends Exception {
	public InvalidPostException(String message) {
		super(message);
	}
}

class InvalidNameException extends Exception {
	public InvalidNameException(String msg) {
		super(msg);
	}
}

class InvalidAgeException extends Exception {
	public InvalidAgeException(String msg) {
		super(msg);
	}
}

