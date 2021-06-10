package study.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

// DAO(Database Access Object)
// = 데이터 베이스 관련 코드 작업을 수행하는 객체
public class MemberDao {

//	필요한 데이터베이스 작업들을 메소드로 구현

//	회원 탈퇴 메소드
//	String 2개(아이디,비밀번호)를 이용하여 int(결과튜플수)를 반환하는 메소드
	public int exit(String memberId, String memberPw) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");

		String sql = "delete from member where member_id = ? and member_pw = ? ";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberId);
		ps.setString(2, memberPw);

		int count = ps.executeUpdate();

		con.close();

		return count;
	}

	public int givePoint(String memberId, int memberPoint) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");

		String sql = "update member set member_point = member_point + ? where member_id = ?";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, memberPoint);
		ps.setString(2, memberId);

		int count = ps.executeUpdate();

		con.close();

		return count;
	}

//	비밀번호 변경 메소드
//	= 입력 : 아이디, 기존비밀번호, 신규비밀번호
//	= 출력 : 변경 성공 여부

	public boolean changePassword(String memberId, String memberPw, String newPw) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");

		String sql = "update member set member_pw = ? where member_id = ? and member_Pw = ?";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, newPw);
		ps.setString(2, memberId);
		ps.setString(3, memberPw);

		con.close();

		int count = ps.executeUpdate();

//		if(count > 0) {
//			return true;
//		}
//		else {
//			return false;
//		}

//		count가 0보다 큰지 여부를 반환
		return count > 0;

	}

//	회원 등록 메소드
//	= 입력 : 문자열 6개(아이디, 비밀번호, 닉네임, 생년월일, 전화번호, 이메일)
//	= 출력(반환) : 없음

	public void regist(String memberId, String memberPw, String memberNickname, String memberBirth, String memberPhone,
			String memberEmail) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");

		String sql = "insert into member values(" + "member_seq.nextval, ?, ?, ?, ?, ?, sysdate, ?, 0, '일반')";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberId);
		ps.setString(2, memberPw);
		ps.setString(3, memberNickname);
		ps.setString(4, memberBirth);
		ps.setString(5, memberPhone);
		ps.setString(6, memberEmail);

		ps.execute();

		con.close();
	}
	
	public static final String USERNAME = "study";
	public static final String PASSWORD = "study";

	public void regist(MemberDto memberDto) throws Exception {

		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);

		String sql = "insert into member values(" + "member_seq.nextval, ?, ?, ?, ?, ?, sysdate, ?, 0, '일반')";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberDto.getMemberId());
		ps.setString(2, memberDto.getMemberPw());
		ps.setString(3, memberDto.getMemberNick());
		ps.setString(4, memberDto.getMemberBirth());
		ps.setString(5, memberDto.getMemberPhone());
		ps.setString(6, memberDto.getMemberEmail());

		ps.execute();

		con.close();

	}

//	회원 목록 메소드
	public List<MemberDto> selectList() throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");

		String sql = "select * from member order by member_no asc";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		List<MemberDto> list = new ArrayList<>();

		while (rs.next()) {
			MemberDto memberDto = new MemberDto();

			memberDto.setMemberNo(rs.getInt("member_no"));
			memberDto.setMemberId(rs.getString("member_id"));
			memberDto.setMemberPw(rs.getString("member_pw"));
			memberDto.setMemberNick(rs.getString("member_nick"));
			memberDto.setMemberBirth(rs.getString("member_birth"));
			memberDto.setMemberPhone(rs.getString("member_phone"));
			memberDto.setMemberJoin(rs.getDate("member_join"));
			memberDto.setMemberEmail(rs.getString("member_email"));
			memberDto.setMemberPoint(rs.getInt("member_point"));
			memberDto.setMemberGrade(rs.getString("member_grade"));

			list.add(memberDto);

		}

		con.close();

		return list;

	}

//	항목과 검색어를 이용하여 회원을 조회하는 메소드
//	입력 : 항목(String), 검색어(String)
//	출력(반환) : 회원목록(List<MemeberDto>)
	public List<MemberDto> searchList(String type, String keyword) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");

//		 instr(항목, 값)
//		 항목 -> 정적(있는그대로), 값 -> 동적(변조되어)
//		String sql = "select * from member where instr(" + type + ", ?) > 0 order by member_no asc";
		String sql = "select * from member where instr(#1, ?) > 0 order by member_no asc";
		sql = sql.replace("#1", type);

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);

		ResultSet rs = ps.executeQuery();

		List<MemberDto> list = new ArrayList<>();
		while (rs.next()) {
			MemberDto memberDto = new MemberDto();

			memberDto.setMemberNo(rs.getInt("member_no"));
			memberDto.setMemberId(rs.getString("member_id"));
			memberDto.setMemberPw(rs.getString("member_pw"));
			memberDto.setMemberNick(rs.getString("member_nick"));
			memberDto.setMemberBirth(rs.getString("member_birth"));
			memberDto.setMemberPhone(rs.getString("member_phone"));
			memberDto.setMemberJoin(rs.getDate("member_join"));
			memberDto.setMemberEmail(rs.getString("member_email"));
			memberDto.setMemberPoint(rs.getInt("member_point"));
			memberDto.setMemberGrade(rs.getString("member_grade"));

			list.add(memberDto);

		}

		con.close();

		return list;
	}

	public MemberDto find(int member_no) throws Exception {
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");

		String sql = "select * from member where member_no = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, member_no);
		
		ResultSet rs = ps.executeQuery();
		
//		MemberDto memberDto = null 또는 객체;
		MemberDto memberDto;
		if(rs.next()) {
			memberDto = new MemberDto();
			
			memberDto.setMemberNo(rs.getInt("member_no"));
			memberDto.setMemberId(rs.getString("member_Id"));
			memberDto.setMemberNick(rs.getString("member_nick"));
			memberDto.setMemberBirth(rs.getString("member_birth"));
			memberDto.setMemberGrade(rs.getString("member_grade"));
		}
		else {
			memberDto = null;
		}
		
		con.close();
		
		return memberDto;
	}
	
	public MemberDto find(String memberId) throws Exception {
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql = "select * from member where member_id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberId);
		ResultSet rs = ps.executeQuery();
		
//		MemberDto memberDto = null 또는 객체;
		MemberDto memberDto;
		if(rs.next()) {
			memberDto = new MemberDto();
			
			//복사 코드(컬럼 개수만큼)
			memberDto.setMemberNo(rs.getInt("member_no"));
			memberDto.setMemberId(rs.getString("member_id"));
			memberDto.setMemberPw(rs.getString("member_pw"));
			memberDto.setMemberNick(rs.getString("member_nick"));
			memberDto.setMemberBirth(rs.getString("member_birth"));
			memberDto.setMemberEmail(rs.getString("member_email"));
			memberDto.setMemberPhone(rs.getString("member_phone"));
			memberDto.setMemberPoint(rs.getInt("member_point"));
			memberDto.setMemberJoin(rs.getDate("member_join"));
			memberDto.setMemberGrade(rs.getString("member_grade"));
			
		}
		else {
			memberDto = null;
		}
		
		con.close();
		
		return memberDto;
	}
	

	//로그인 기능(=단일조회)
	public MemberDto login(MemberDto memberDto) throws Exception {
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
		
		String sql = "select * from member where member_id = ? and member_pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberDto.getMemberId());
		ps.setString(2, memberDto.getMemberPw());
		ResultSet rs = ps.executeQuery();
		
		MemberDto find;
		if(rs.next()) {
			find = new MemberDto();
			
			//복사 코드(컬럼 개수만큼)
			find.setMemberNo(rs.getInt("member_no"));
			find.setMemberId(rs.getString("member_id"));
			find.setMemberPw(rs.getString("member_pw"));
			find.setMemberNick(rs.getString("member_nick"));
			find.setMemberBirth(rs.getString("member_birth"));
			find.setMemberEmail(rs.getString("member_email"));
			find.setMemberPhone(rs.getString("member_phone"));
			find.setMemberPoint(rs.getInt("member_point"));
			find.setMemberJoin(rs.getDate("member_join"));
			find.setMemberGrade(rs.getString("member_grade"));
		}
		else {
			find = null;
		}
		
		con.close();
		
		return find;
	}
}


