package com.kh.spring18.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//복합 검색용 VO
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class ProductSearchVO {
	private Integer no;
	private String name, type;
	private Integer minPrice, maxPrice;
	private String made, expire;
	private String ordering;//정렬
	private Integer page;//페이지번호
	private Integer size;//페이지크기
}