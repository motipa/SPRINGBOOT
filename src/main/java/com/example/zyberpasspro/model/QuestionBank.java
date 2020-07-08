package com.example.zyberpasspro.model;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
@Data
@Entity
@Table(name="questionbank_tab")
public class QuestionBank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String category;
    private String subcategory;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;
    private String status;
    private Date created_date;
    private LocalDateTime modified_datetime;

}
