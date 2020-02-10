package com.duy.start;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaikhoanRepository extends JpaRepository<TaiKhoan,String> {

List<TaiKhoan> findAllByPass(String pass);
@Query("select t from TaiKhoan t where t.id= ?1")
    TaiKhoan findTaiKhoan(String id);
}
