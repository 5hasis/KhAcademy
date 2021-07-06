package com.kh.spring21.repository;

import com.kh.spring21.entity.PaymentDto;

public interface PaymentDao {

	PaymentDto get(int paymentNo);

}
