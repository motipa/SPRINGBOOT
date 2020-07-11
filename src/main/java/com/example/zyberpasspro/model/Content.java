package com.example.zyberpasspro.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
@Data
@Entity
@Table(name="content_tab")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String content;
    private String link_id;
    private String status;
    private Date created_date;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date modified_datetime;

}
