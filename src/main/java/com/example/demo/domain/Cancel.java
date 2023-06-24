package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Cancel {
    private int cancelId; //PK 취소번호
    private int Id; //회원아이디
    private int orderId; //주문번호
    private int cancelPrice; //취소금액
    private Date cancelDate; //취소날짜
    private String cancelProduct; //취소상품
    private String cancelReason; //취소사유
    private String cancelStatus; //취소상태
}
