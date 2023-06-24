package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Order {
    private int orderId; //PK 주문번호
    private int Id; //주문자ID
    private int bookId; //상품아이디
    private int bookCount; //주문수량
    private int orderPrice;//가격
    private Date orderDate; //주문날짜
    private String address; //주소
    private String orderStatus; //주문상태

}
