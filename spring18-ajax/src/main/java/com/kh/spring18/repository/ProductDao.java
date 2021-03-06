package com.kh.spring18.repository;

import java.util.List;

import com.kh.spring18.entity.ProductDto;
import com.kh.spring18.vo.ProductSearchVO;

public interface ProductDao {
	
	List<ProductDto> list();
	List<ProductDto> search(String name);
	List<ProductDto> search(ProductSearchVO productSearchVO); //올인원
}
