package com.example.zyberpasspro.model;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name="report_tab")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String quizid;
    private String user_id;
    private int right_answer;

}
