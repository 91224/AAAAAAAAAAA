package com.example.demo.service;

import com.example.demo.mapper.MemberMapper;
import com.example.demo.model.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    MemberMapper membermapper;

    @Override
    public void memberJoin(MemberVO member) throws Exception {

        membermapper.memberJoin(member);

    }
    /* 로그인 */
    public MemberVO memberLogin(MemberVO member) throws Exception {


        return membermapper.memberLogin(member);
    }

}
