package com.example.zyberpasspro.model;
import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date modified_datetime;
}
