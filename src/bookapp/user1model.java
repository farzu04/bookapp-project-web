package bookapp;

public class user1model {
			public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
			private int id;
		private String name;
		private String emailid;
		private String password;
		@Override
		public String toString() {
			return "user1model [id=" + id + ", name=" + name + ", emailid=" + emailid + ", password=" + password + "]";
		}
		
}