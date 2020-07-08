package com.example.zyberpasspro.model;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
@Data
@Entity
@Table(name="register_tab")
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String package_name;
    private String fullname;
    private String emailid;
    private String mobilenumber;
    private String password;
    private String status;
    private Date created_date;
    private LocalDateTime modified_datetime;
    private String registerid;
    private String ref_email;
}
