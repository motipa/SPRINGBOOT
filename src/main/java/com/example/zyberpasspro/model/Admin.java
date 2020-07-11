package com.example.zyberpasspro.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Data
@Entity
@Table(name="admin_tab")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;




    private String username;
    private String password;
    private String status;
    private Date created_datetime ;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date modified_date;
    private Date last_login_datetime;
    private String phone;
    private String address1;
    private String code;
    private String address2;






}


