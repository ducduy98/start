package com.duy.start;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "taikhoan")

public class TaiKhoan {
    @Id
    private String  id;
    @Column(name ="pass")
    private String pass;

    public TaiKhoan setId(String id) {
        this.id = id;
        return this;
    }

    public TaiKhoan setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public String getId() {
        return id;
    }

    public String getPass() {
        return pass;
    }
}
