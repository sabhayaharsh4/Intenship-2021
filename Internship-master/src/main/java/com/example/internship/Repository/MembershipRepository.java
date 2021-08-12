package com.example.internship.Repository;

import com.example.internship.Domain.Membership;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipRepository extends CrudRepository<Membership,Long> {


}
