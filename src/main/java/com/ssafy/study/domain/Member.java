package com.ssafy.study.domain;

import com.ssafy.study.dto.MemberJoinRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Member {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private String password;

    public static Member of(MemberJoinRequest memberJoinRequest) {
        Member member = new Member();
        member.setName(memberJoinRequest.getName());
        member.setPassword(memberJoinRequest.getPassword());

        return member;
    }

}
