package com.example.zyberpasspro.model;
import lombok.Data;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
@Data
@Entity
@Table(name="category_tab")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String link_id;
    private String name;
    private String status;
    private String regstatus;
    private Date created_date;
    private LocalDateTime modified_datetime;
    private String time_schedule;

    public  Category(){

    }
}
