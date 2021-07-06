package com.kh.spring21.controller;

import java.net.URISyntaxException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring21.entity.PaymentDto;
import com.kh.spring21.entity.ProductDto;
import com.kh.spring21.repository.PaymentDao;
import com.kh.spring21.repository.ProductDao;
import com.kh.spring21.service.PayService;
import com.kh.spring21.vo.KakaoPayApprovePrepareVO;
import com.kh.spring21.vo.KakaoPayApproveVO;
import com.kh.spring21.vo.KakaoPayCancelPrepareVO;
import com.kh.spring21.vo.KakaoPayReadyPrepareVO;
import com.kh.spring21.vo.KakaoPayReadyVO;
import com.kh.spring21.vo.KakaoPaySearchVO;

@Controller
@RequestMapping("/shop")
public class ShoppingController {
	
	@Autowired
	private ProductDao productDao;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("list", productDao.list());
		return "shop/home";
	}
	
	@GetMapping("/detail/{no}")
	public String detail(@PathVariable int no, Model model) {
		model.addAttribute("productDto", productDao.get(no));
		return "shop/detail";
	}
	

}


