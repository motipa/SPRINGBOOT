package com.example.zyberpasspro.model;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
@Data
@Entity
@Table(name="stat_tab")
public class Stat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String status;
    private String ip_address;
    private Date created_date;
    private LocalDateTime modified_datetime;

}
