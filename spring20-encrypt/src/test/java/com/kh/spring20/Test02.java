package com.kh.spring20;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test02 {

	//XOR 암호화 : 같은 숫자를 두번 XOR 하면 원래값으로 복귀한다
	
	@Test
	public void test() {
		int number = 12345678;
		int key = 111111;
		log.debug("number = {}", number);
		
		int encrypt = number ^ key;
		log.debug("encrypt = {}", encrypt);
		
		int decrypt = encrypt ^ key;
		log.debug("decrypt = {}", decrypt);
	}
	
	@Test
	public void test2() {
		String text = "hello";
		
		StringBuffer encrypt = new StringBuffer();
		for(int i=0; i < text.length(); i++) {
			char c = text.charAt(i);
			c ^= 5;
			encrypt.append(c);
		}
		log.debug("encrypt = {}", encrypt.toString());
		
		StringBuffer decrypt = new StringBuffer();
		for(int i=0; i < encrypt.length(); i++) {
			char c = encrypt.charAt(i);
			c ^= 5;
			decrypt.append(c);
		}
		log.debug("decrypt = {}", decrypt.toString());
	}
	
}

