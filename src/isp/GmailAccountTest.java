package isp;

public class GmailAccountTest {

	void main() {
		GmailAccount kontua = new GmailAccount("user1", "user1@gmail.com");
		EmailSender.sendEmail(kontua,"PROBA MEZUA");
	}

}
