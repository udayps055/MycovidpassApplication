package com.covid.Mycovidpass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class d2 {
    @Id
    private Long pnumber;
    @GeneratedValue(strategy = GenerationType.AUTO)


    private String fname;
    private String lname;
    private String email;
    private String password;

    public d2(Long pnumber, String fname, String lname, String email, String password) {
        this.pnumber = pnumber;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
    }

    public d2() {
    }

    public Long getPnumber() {
        return pnumber;
    }

    public void setPnumber(Long pnumber) {
        this.pnumber = pnumber;
    }

    public String getFname() { return fname; }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return "d2{" +
                "pnumber=" + pnumber +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}