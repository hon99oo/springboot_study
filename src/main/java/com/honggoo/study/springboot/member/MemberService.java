package com.honggoo.study.springboot.member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
