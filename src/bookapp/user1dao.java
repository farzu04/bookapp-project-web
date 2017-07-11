package bookapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class user1dao {
	public void register(user1model user) throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String sql = "insert into users ( name, emailid, password) values ( ?, ? ,? )";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, user.getName());
		pst.setString(2, user.getEmailid());
		pst.setString(3, user.getPassword());
		int rows = pst.executeUpdate();
		System.out.println("Noof rows inserted=" + rows);
	}

	public user1model login(String emailid, String password) throws Exception {
	

		String sql = "select id,name,emailid,password from user1 where emailid=? and password=?";
		user1model user = null;
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, emailid);
		pst.setString(2, password);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String emailid1 = rs.getString("emailid");
			String password1 = rs.getString("password");

			user = new user1model();
			user.setId(id);
			user.setName(name);
			user.setEmailid(emailid1);
			user.setPassword(password1);
			System.out.println(user);
		}
		return user ;
	}
		public void listbook(user1model user)
		{

	}

}
