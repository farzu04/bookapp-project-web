package bookapp;

public class Testuser1Dao {
	 public static void main(String[] args) throws Exception {
		 
	        user1model user = new user1model();
	        user.setName("farzana");
	        user.setEmailid("farzafaz04@gmail.com");
	        user.setPassword("185232");
	 
	        user1dao userdao = new user1dao();
	        userdao.register(user);
	 
	    }
	 
	}


