package project1;

public class MailInfo {
	private String User;
	private int password;
	public MailInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MailInfo(String user, int password) {
		super();
		User = user;
		this.password = password;
	}
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "mailInfo [User=" + User + ", password=" + password + "]";
	}
	
	
}
