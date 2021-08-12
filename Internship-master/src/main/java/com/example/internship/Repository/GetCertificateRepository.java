package com.example.internship.Repository;

import com.example.internship.Domain.GetCertificate;
import org.springframework.data.repository.CrudRepository;

public interface GetCertificateRepository extends CrudRepository<GetCertificate,Long> {

    GetCertificate findGetCertificateByEmail(String email);
}
