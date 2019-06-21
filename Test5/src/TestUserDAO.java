import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestUserDAO {


		String name="";
		String mail="";

		public void select(String name,String mail){
			DBConnector db=new DBConnector();
			Connection con=db.getConnection();

			String sql="select * from test5_table where name=? and mail=?";

			try{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, mail);
				ResultSet rs=ps.executeQuery();
				if(rs.next()){
					System.out.println(rs.getString("name"));
					System.out.println(rs.getString("mail"));
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

}
