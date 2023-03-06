package com.ssafy.study.service;

import com.ssafy.study.domain.Member;
import com.ssafy.study.dto.MemberJoinRequest;
import com.ssafy.study.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public void join(MemberJoinRequest memberJoinRequest) {
        memberRepository.save(Member.of(memberJoinRequest));
    }
}
