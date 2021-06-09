package quiz.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MusicDao {
	
//	상수로 계정 정보를 설정
	public static final String USERNAME = "study";
	public static final String PASSWORD = "study";
	
//	[C] 등록기능
	public void insert(MusicDto musicDto) throws Exception {
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD); 
				
//		String sql = "insert into music values(music_seq.nextval, ?, ?, ?, 0, 0)";
		String sql = "insert into music(music_no, music_name, music_artist, music_album) "
																			+ "values(music_seq.nextval, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, musicDto.getMusicName());
		ps.setString(2, musicDto.getMusicArtist());
		ps.setString(3, musicDto.getMusicAlbum());
		ps.execute();
		
		con.close();
	}
	
//	[U] 정보변경기능
	public boolean change(MusicDto musicDto) throws Exception {
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);

		String sql = "update music "
							+ "set music_name = ? , music_artist = ? , music_album = ? "
							+ "where music_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, musicDto.getMusicName());
		ps.setString(2, musicDto.getMusicArtist());
		ps.setString(3, musicDto.getMusicAlbum());
		ps.setLong(4, musicDto.getMusicNo());
		int count = ps.executeUpdate();
		
		con.close();
		
		return count > 0;
	}
	
//	[U] 재생횟수 증가
	public boolean play(long music_no) throws Exception {
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
		
		String sql = "update music set music_play_count = music_play_count + 1 where music_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setLong(1, music_no);
		int count = ps.executeUpdate();
		
		con.close();
		
		return count > 0;
	}
	
	
//	[U] 좋아요 증가
	public boolean like(long music_no) throws Exception {
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
		
		String sql = "update music set music_like_count = music_like_count + 1 where music_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setLong(1, music_no);
		int count = ps.executeUpdate();
		
		con.close();
		
		return count > 0;
	}
	
//	[R] 목록 조회
	public List<MusicDto> list() throws Exception {
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);

		String sql = "select * from music order by music_no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<MusicDto> list = new ArrayList<>();
		while(rs.next()) {
			MusicDto musicDto = new MusicDto();
			
			musicDto.setMusicNo(rs.getLong("music_no"));
			musicDto.setMusicName(rs.getString("music_name"));
			musicDto.setMusicArtist(rs.getString("music_artist"));
			musicDto.setMusicAlbum(rs.getString("music_album"));
			musicDto.setMusicPlayCount(rs.getLong("music_play_count"));
			musicDto.setMusicLikeCount(rs.getLong("music_like_count"));
			
			list.add(musicDto);
		}
		
		con.close();
		
		return list;
	}
	
//	[R] 등수별 조회
	public List<MusicDto> top3() throws Exception {
		return this.rank(1, 3);
	}
	
	public List<MusicDto> rank(int n, int m) throws Exception {
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
		
		String sql = "select * from ("
							+ "select TMP.*, rownum rn from ("
								+ "select * from music order by music_play_count desc, music_like_count desc, music_no asc"
							+ ")TMP"
						+ ") where rn between ? and ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, n);
		ps.setInt(2, m);
		ResultSet rs = ps.executeQuery();
		
		List<MusicDto> list = new ArrayList<>();
		while(rs.next()) {
			MusicDto musicDto = new MusicDto();
			
			musicDto.setMusicNo(rs.getLong("music_no"));
			musicDto.setMusicName(rs.getString("music_name"));
			musicDto.setMusicArtist(rs.getString("music_artist"));
			musicDto.setMusicAlbum(rs.getString("music_album"));
			musicDto.setMusicPlayCount(rs.getLong("music_play_count"));
			musicDto.setMusicLikeCount(rs.getLong("music_like_count"));
			
			list.add(musicDto);
		}
		
		con.close();
		
		return list;
	}
	
//	[R] 검색 기능
//	1. 제목만 검색하는 기능(searchByName)
//	2. 아티스트만 검색하는 기능(searchByArtist)
//	3. 앨범만 검색하는 기능(searchByAlbum)	
//	4. 항목을 지정하여 검색하는 기능(search)
	public List<MusicDto> searchByName(String keyword) throws Exception {
		return search("music_name", keyword);
	}
	public List<MusicDto> searchByArtist(String keyword) throws Exception {
		return search("music_artist", keyword);
	}
	public List<MusicDto> searchByAlbum(String keyword) throws Exception {
		return search("music_album", keyword);
	}
	public List<MusicDto> search(String type, String keyword) throws Exception {
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
		
		String sql = "select * from music where instr(#1, ?) > 0 order by #1 asc";
		sql = sql.replace("#1", type);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();
		
		List<MusicDto> list = new ArrayList<>();
		while(rs.next()) {
			MusicDto musicDto = new MusicDto();
			
			musicDto.setMusicNo(rs.getLong("music_no"));
			musicDto.setMusicName(rs.getString("music_name"));
			musicDto.setMusicArtist(rs.getString("music_artist"));
			musicDto.setMusicAlbum(rs.getString("music_album"));
			musicDto.setMusicPlayCount(rs.getLong("music_play_count"));
			musicDto.setMusicLikeCount(rs.getLong("music_like_count"));
			
			list.add(musicDto);
		}
		
		con.close();
		
		return list;
	}
	
//	[R] 상세조회(단일조회)
	public MusicDto get(long music_no) throws Exception {
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
		
		String sql = "select * from music where music_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setLong(1, music_no);
		ResultSet rs = ps.executeQuery();
		
		MusicDto musicDto;
		if(rs.next()) {
			musicDto = new MusicDto();
			
			musicDto.setMusicNo(rs.getLong("music_no"));
			musicDto.setMusicName(rs.getString("music_name"));
			musicDto.setMusicArtist(rs.getString("music_artist"));
			musicDto.setMusicAlbum(rs.getString("music_album"));
			musicDto.setMusicPlayCount(rs.getLong("music_play_count"));
			musicDto.setMusicLikeCount(rs.getLong("music_like_count"));
		}
		else {
			musicDto = null;
		}
		
		con.close();
		
		return musicDto;
	}
	
//	[D] 음악 삭제
	public boolean delete(long music_no) throws Exception {
		Connection con = JdbcUtils.getConnection(USERNAME, PASSWORD);
		
		String sql = "delete music where music_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setLong(1, music_no);
		int count = ps.executeUpdate();
		
		con.close();
		
		return count > 0;
	}
}