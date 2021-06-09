package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AcademyDao {

//	목록 조회 메소드
	public List<AcademyDto> select() throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");

		String sql = "select * from academy";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

//		1. 비어있는 List 생성
		List<AcademyDto> list = new ArrayList<>();

//		2. 반복적으로 줄단위 데이터를 DTO로 바꾸어 List에 추가 
		while (rs.next()) {
			AcademyDto academyDto = new AcademyDto();

//			rs의 acdemy_no를 academyDto로 복사
			academyDto.setAcademyNo(rs.getInt("academy_no"));
//			rs의 acdemy_name를 academyDto로 복사
			academyDto.setAcademyName(rs.getString("academy_name"));

//			list에 복사된 정보를 가지는 객체 추가
			list.add(academyDto);

		}

		con.close();

		return list;

	}

	public List<AcademyDto> searchList(String keyword) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");

		String sql = "select * from academy where instr(academy_name, ?) > 0 " + "order by academy_no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();

		List<AcademyDto> list = new ArrayList<>();

		while (rs.next()) {
			AcademyDto academyDto = new AcademyDto();

			academyDto.setAcademyNo(rs.getInt("academy_no"));
			academyDto.setAcademyName(rs.getString("academy_name"));

			list.add(academyDto);
		}
		con.close();

		return list;
	}

//	단일조회 기능
	public AcademyDto find(int academyNo) throws Exception {
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");

		String sql = "select * from academy where academy_no = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, academyNo);
		ResultSet rs = ps.executeQuery();// 데이터 있거나 없거나 둘 중 하나

		AcademyDto academyDto;
		
		if (rs.next()) {
			academyDto = new AcademyDto();
			// 데이터 복사
			academyDto.setAcademyNo(rs.getInt("academy_no"));
			academyDto.setAcademyName(rs.getString("academy_name"));
		} 
		else {
			academyDto = null;
		}

		con.close();

		return academyDto;
	}
}
