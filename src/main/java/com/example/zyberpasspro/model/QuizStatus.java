package com.example.zyberpasspro.model;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
@Data
@Entity
@Table(name="quizstatus_tab")
public class QuizStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String quizid;
    private String user_id;
    private String status;
    private Date created_date;
    private LocalDateTime modified_datetime;
}
