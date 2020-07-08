package com.example.zyberpasspro.model;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
@Data
@Entity
@Table(name="schedule_tab")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String quizid;
    private String link_id;
    private String quizdatetime;
    private String status;
    private Date created_date;
    private LocalDateTime modified_datetime;

}
