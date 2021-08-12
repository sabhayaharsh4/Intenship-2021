package com.example.internship.Services;

import com.example.internship.Domain.Membership;
import com.example.internship.Repository.MembershipRepository;
import org.aspectj.weaver.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MembershipService {
    @Autowired
    private MembershipRepository membershipRepository;

    public Iterable<Membership> findAll(){
        return membershipRepository.findAll();
    }

    public ResponseEntity register(Membership data) {
        membershipRepository.save(data);
        return ResponseEntity.accepted().build();
    }
}
