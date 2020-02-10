package com.duy.start;


import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@RequiredArgsConstructor
public class StartApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StartApplication.class, args);
        TaikhoanRepository taikhoanRepository = context.getBean(TaikhoanRepository.class);
        taikhoanRepository.findAll().forEach(System.out::println);

//        TaiKhoan taiKhoan=new TaiKhoan();
//
//        taiKhoan.setPass("1243");
//        taiKhoan.setId("doloc");
//        taikhoanRepository.save(taiKhoan);

       taikhoanRepository.findAllById("doloc").forEach(System.out::println);
        System.out.println(taikhoanRepository.findTaiKhoan("admin"));
    }

}
