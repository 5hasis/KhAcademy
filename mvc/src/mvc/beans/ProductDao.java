package mvc.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

	public void registItem(String name, String type, int price, String made, String expire) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");

		String sql = "insert into product values(product_seq.nextval, ?, ?, ?, ?, ?)";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, type);
		ps.setInt(3, price);
		ps.setString(4, made);
		ps.setString(5, expire);

		ps.execute();

		con.close();

	}

	public void registItem(ProductDto productDto) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");

		String sql = "insert into product values(product_seq.nextval, ?, ?, ?, ?, ?)";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, productDto.getName());
		ps.setString(2, productDto.getType());
		ps.setInt(3, productDto.getPrice());
		ps.setString(4, productDto.getMade());
		ps.setString(5, productDto.getExpire());

		ps.execute();

		con.close();
	}

	public static final String USERNAME = "study";
	public static final String PASSWORD = "study";

	public List<ProductDto> list() throws Exception {

		Connection con = JdbcUtils.getConnection();

		String sql = "select * from product";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<ProductDto> list = new ArrayList<>();

		while (rs.next()) {

			ProductDto productDto = new ProductDto();
			productDto.setNo(rs.getInt("no"));
			productDto.setName(rs.getString("name"));
			productDto.setType(rs.getString("type"));
			productDto.setPrice(rs.getInt("price"));
			productDto.setMade(rs.getString("made"));
			productDto.setExpire(rs.getString("expire"));

			list.add(productDto);
		}

		con.close();
		return list;

	}

	public List<ProductDto> rank(int begin, int end) throws Exception {

		Connection con = JdbcUtils.getConnection();

		String sql = "select * from (" + "select TMP.*, rownum rn from ("
				+ "select * from product order by price desc, no asc) TMP)" + "where rn between ? and ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, begin);
		ps.setInt(2, end);
		ResultSet rs = ps.executeQuery();

		List<ProductDto> list = new ArrayList<>();
		while (rs.next()) {
			ProductDto productDto = new ProductDto();
			productDto.setNo(rs.getInt("no"));
			productDto.setName(rs.getString("name"));
			productDto.setType(rs.getString("type"));
			productDto.setPrice(rs.getInt("price"));
			productDto.setMade(rs.getString("made"));
			productDto.setExpire(rs.getString("expire"));

			list.add(productDto);
		}

		con.close();
		return list;
	}

	public List<ProductDto> search(String type, String keyword) throws Exception {

		Connection con = JdbcUtils.getConnection();
		String sql = "select * from product where instr(#1,?) > 0 order by #1 asc";
		sql = sql.replace("#1", type);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();

		List<ProductDto> list = new ArrayList<>();
		while (rs.next()) {
			ProductDto productDto = new ProductDto();
			productDto.setName(rs.getString("name"));
			productDto.setType(rs.getString("type"));
			productDto.setPrice(rs.getInt("price"));
			productDto.setMade(rs.getString("made"));
			productDto.setExpire(rs.getString("expire"));

			list.add(productDto);
		}

		con.close();
		return list;
	}

	// 단일조회 기능
	public ProductDto get(int no) throws Exception {
		Connection con = JdbcUtils.getConnection();

		String sql = "select * from product where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		ResultSet rs = ps.executeQuery();

		// rs ---> dto
		ProductDto productDto;
		if (rs.next()) {
			productDto = new ProductDto();

			productDto.setNo(rs.getInt("no"));
			productDto.setName(rs.getString("name"));
			productDto.setType(rs.getString("type"));
			productDto.setPrice(rs.getInt("price"));
			productDto.setMade(rs.getString("made"));
			productDto.setExpire(rs.getString("expire"));
		} 
		else {
			productDto = null;
		}

		con.close();

		return productDto;
	}
	
	public ProductDto get(String name) throws Exception {
		Connection con = JdbcUtils.getConnection();

		String sql = "select * from product where name = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ResultSet rs = ps.executeQuery();

		// rs ---> dto
		ProductDto productDto;
		if (rs.next()) {
			productDto = new ProductDto();

			productDto.setNo(rs.getInt("no"));
			productDto.setName(rs.getString("name"));
			productDto.setType(rs.getString("type"));
			productDto.setPrice(rs.getInt("price"));
			productDto.setMade(rs.getString("made"));
			productDto.setExpire(rs.getString("expire"));
		} 
		else {
			productDto = null;
		}

		con.close();

		return productDto;
	}
	
//	삭제 기능
	public boolean delete(int no) throws Exception {
		Connection con = JdbcUtils.getConnection();
		
		String sql = "delete product where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		
		int count = ps.executeUpdate();
		
		con.close();
		
		return count > 0;
	}
	
}
