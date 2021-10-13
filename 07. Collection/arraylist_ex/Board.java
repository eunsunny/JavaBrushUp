package arraylist_ex;
/*
 * 게시판 클래스
 */
public class Board {
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {   // constructor - 생성자 자동 만들기
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
	
}
