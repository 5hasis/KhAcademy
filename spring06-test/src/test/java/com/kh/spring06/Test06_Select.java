package com.kh.spring06;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.kh.spring06.entity.ItemDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@WebAppConfiguration
public class Test06_Select {
	//목표 : JdbcTemplate을 이용하여 select 작업 수행
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//select 수행시 JdbcTemplate이 알아야 할 데이터 변환 방식을 정의한 객체
	 /* private RowMapper<ItemDto> mapper = new RowMapper<ItemDto>(){ 
	 * //함수형 인터페이스
	 * //람다 표현식 ..? 구게머야
	 * 
		 * @Override 
		 * public ItemDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		 * 		ItemDto itemDto = new ItemDto(); itemDto.setItemNo(rs.getInt("item_no"));
		 * 		itemDto.setItemName(rs.getString("item_name"));
		 * 		itemDto.setItemPrice(rs.getInt("item_price")); 
		 * 		return itemDto; 
		 * }
	 * };*/
	 
	
	private RowMapper<ItemDto> mapper = (rs, rowNum) -> {
		ItemDto itemDto = new ItemDto();
		itemDto.setItemNo(rs.getInt("item_no"));
		itemDto.setItemName(rs.getString("item_name"));
		itemDto.setItemPrice(rs.getInt("item_price"));
		return itemDto;
	};
	
	@Test
	public void test() {
		String sql = "select * from item order by item_no asc";
		List<ItemDto> list = jdbcTemplate.query(sql, mapper);
		
		for(ItemDto itemDto : list) {
			System.out.println(itemDto.getItemName()+", " + itemDto.getItemPrice());
		}
	}
}
