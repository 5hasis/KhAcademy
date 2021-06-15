package com.kh.spring06.repository;

import com.kh.spring06.entity.ItemDto;

//의존성을 떨어뜨리고 약결합을 만들기 위해
public interface ItemDao {
	void insert(ItemDto itemDto);
}