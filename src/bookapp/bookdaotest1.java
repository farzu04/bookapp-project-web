package bookapp;

public class bookdaotest1 {
	public static void main(String[] args) throws Exception {
		user1model user = new user1model();
		user.setName("farzana");
		user.setEmailid("farzafaz04@gmail.com");
		user.setPassword("185232");
		String emailid = "farzafaz04@gmail.com";
		String password = "185232";
		user1dao userdao = new user1dao();
		user1model u = userdao.login(emailid, password);

		System.out.println(u);

	}
}
