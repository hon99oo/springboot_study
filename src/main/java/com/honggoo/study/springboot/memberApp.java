package com.honggoo.study.springboot;

import com.honggoo.study.springboot.member.Grade;
import com.honggoo.study.springboot.member.Member;
import com.honggoo.study.springboot.member.MemberService;
import com.honggoo.study.springboot.member.MemberServiceImpl;

public class memberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member memberA = new Member(1L, "memberA", Grade.BASIC);
        memberService.join(memberA);
        Member member = memberService.findMember(1L);
        System.out.println("member = " + member);
    }
}
