package user_exception;

public class FailException extends Exception {  // 사용자정의 예외처리

	public FailException() {
		super();
	}

	public FailException(String message) {
		super(message);
	}
	

}
