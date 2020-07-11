package com.example.zyberpasspro.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
@Data
@Entity
@Table(name="exam_purchase_tab")
public class ExamPurchase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String user_id;
    private String exam_id;
    private int coins;
    private String link_id;
    private String status;
    private Date created_date;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date modified_datetime;
}
