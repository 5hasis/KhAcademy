package com.kh.spring10.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class ItemDto {
	private int itemNo;
	private String itemName;
	private int itemPrice;
	
}
