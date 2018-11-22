import java.sql.*;

public class Database {

	public boolean insertRecord(String c, String Top, String cor,String Rel)
	{
		boolean result=true;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/QuestDB";
			String user="root";
			String pass="root";
			Connection con=(Connection) DriverManager.getConnection(url,user,pass);
			PreparedStatement ps=con.prepareStatement("Insert into Data values(?,?,?,?)");
			ps.setString(1, c);
			ps.setString(2, Top);
			ps.setString(3, cor);
			ps.setString(4, Rel);
			ps.executeUpdate();
		}catch(Exception ex)
		{
			ex.printStackTrace();
			result=false;
		}
		return result;
	}

}
