package com.kh.home.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BoardDto {
	private int boardNo;
	private String boardHeader;
	private String boardTitle;
	private String boardContent;
	private int boardWriter;
	private Date boardTime;
	private int boardRead;
	private int boardLike;
	private int boardHate;
}
