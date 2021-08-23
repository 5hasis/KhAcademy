package com.kh.spring16.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PlanServiceImpl implements PlanService{

	/**
	 * @Scheduled annotation을 추가하여 "주기적인 작업"임을 알림.
	 * 
	 * 옵션을 통하여 "주기"를 설정해줄 수 있음
	 * 
	 * - initialDelay : 시작 후 딜레이(ms)
	 * - fixedRate : 실행 주기(ms)
	 * - cron : 실행 주기에 관련된 문자열 식
	 * 		= 총 7자리를 작성할 수 있다.
	 * 		= 좌측부터 초, 분, 시, 일, 월, 요일, 연도를 지정
	 * 		= * 는 "모든(all)"의 의미를 가진다.
	 * 		= * * * * * * 모든초, 모든분, 모든시, 모든일, 모든월, 모든요일의 의미
	 * 		= 요일은 월(1) 부터 일(7) 까지 설정할 수 있음
	 * 		= 요일은 월(mon) 부터 일(sun) 까지 설정할 수 있음
	 * 		= /를 이용하면 반복주기(회차) 를 설정할 수 있음
	 * 		= , 를 이용하면 여러 개의 값을 설정할 수 있음
	 * 		= ?는 값이 없음을 의미(날짜와 요일에만 작성 가능)
	 * 		= L은 마지막을 의미(날짜와 요일에만 작성 가능)
	 * 		= W는 가장 가까운 평일을 말함(날짜에만 작성 가능)
	 * 		= # 은 주차를 의미(요일에만 작성 가능. 3#2는 두번째 주 수요일)
	 */
	
//	work1 : 5초 뒤부터 1초 간격으로 실행
//	@Scheduled(initialDelay = 5000, fixedRate = 1000)
	@Override
	public void work1() {
		log.debug("work1 실행");
	}
	
//	@Scheduled(cron = "* * * * * *")//매초
//	@Scheduled(cron = "0 * * * * *")//매분 0초(1분마다)
//	@Scheduled(cron = "0 0 * * * *")//매시 정각
//	@Scheduled(cron = "0 0 * * * 4")//목요일 매시 정각
//	@Scheduled(cron = "0 0 * * * thu")//목요일 매시 정각
//	@Scheduled(cron = "*/5 * * * * *")//매 5초마다
//	@Scheduled(cron = "0,30 * * * * *")//매 0초, 30초
//	@Scheduled(cron = "0-10 * * * * *")//매 0초~10초
//	@Scheduled(cron = "0 0 9 * * *")//매일 아침 9시
//	@Scheduled(cron = "0 0 14 25 * *")//매월 25일 오후 2시
//	@Scheduled(cron = "* * * ? * 4L")//매월 마지막 목요일
	@Scheduled(cron = "* * * ? * 4#4")//매월 4주차 목요일
	@Override
	public void work2() {
		log.debug("work2 실행");
	}

}
