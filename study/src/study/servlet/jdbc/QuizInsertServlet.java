package study.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.HintDao;
import study.beans.HintDto;
import study.beans.QuizDao;
import study.beans.QuizDto;

//[1] 퀴즈 정보만 등록(先 시퀀스 번호 생성, 後 등록)
//[2] 힌트 정보를 추가 등록 

@WebServlet(urlPatterns = "/quiz/insert.kh")
public class QuizInsertServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			QuizDto quizDto = new QuizDto();
			quizDto.setQuizContent(req.getParameter("quiz_content"));

			String[] hintContent = req.getParameterValues("hint_content");

//			문항 등록
			QuizDao quizDao = new QuizDao();
			int quizNo = quizDao.getSequenceNumber();
			quizDto.setQuizNo(quizNo);
			quizDao.insert(quizDto);

//			보기 등록(x4)
			HintDao hintDao = new HintDao();
//			hintDao.insert(1번보기객체) * 4

			for (int i = 0; i < hintContent.length; i++) {
				HintDto hintDto = new HintDto();
				hintDto.setHintContent(hintContent[0]);
				hintDto.setQuizNo(quizNo);
				hintDao.insert(hintDto);
			}

//			출력
			resp.setCharacterEncoding("MS949");
			resp.getWriter().println("퀴즈 등록 완료");

		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}

}
