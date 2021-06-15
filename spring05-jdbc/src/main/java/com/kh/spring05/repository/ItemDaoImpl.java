package com.kh.spring05.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring05.entity.ItemDto;

@Repository
public class ItemDaoImpl implements ItemDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insert(ItemDto itemDto) {
		
		//JdbcTemplate을 이용하여 등록을 수행
		String sql = "insert into item values(item_seq.nextval, ?, ?)";
		//Object[] param = new Object[] {itemDto.getItemName(), itemDto.getItemPrice()};
		Object[] param  = {itemDto.getItemName(), itemDto.getItemPrice()};
		
		jdbcTemplate.update(sql,param);
	}

}
