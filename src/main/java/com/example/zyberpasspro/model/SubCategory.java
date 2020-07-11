package com.example.zyberpasspro.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
@Data
@Entity
@Table(name="subcategory_tab")
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String link_id;
    private String category;
    private String caption;
    private String name;
    private String noofquestions;
    private String status;
    private Date created_date;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date modified_datetime;
    private String regstatus;
    private int coins;
    private int option1;
    private int option2;
    private int option3;
    private int option4;
    private String description;
    private String url_link;

      private  int  markperquestion;
      private  double minusmarkperquestion;
       private String examconductedby;
       private String  qualification;
        private String     last_date;

}
