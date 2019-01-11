package com.yueqian.cn.dao;

import com.yueqian.cn.dao.entity.Card;
import com.yueqian.cn.dao.impl.CardDaoImpl;

public class TestCardDaoImpl {
	public static void main(String[] args) {
		ICardDao cardDao = new CardDaoImpl();
		Card card = cardDao.getById(1);
		System.out.println(card.getNum()+"号的对应人是"+card.getPerson().getName());
	}
}
