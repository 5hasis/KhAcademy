package com.kh.spring07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *	Lombok을 이용하면 클래스의 구성요소가 자동으로 생성.
 *	= 생성자
 *		= 기본생성자 -> @NoArgsConstructor
 *		= 모든생성자 -> @AllArgsConstructor
 *	= setter -> @Setter
 *	= getter -> @Getter
 *	= toString() -> @ToString
 *	= equals() / hashCode() -> @EqualsAndHashCode
 *
 * 	@Data = @ToString + @Getter + @Setter
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private String name;
	private int score;
}
