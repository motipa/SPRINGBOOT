package com.example.zyberpasspro.model;
import lombok.Data;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
@Data
@Entity
@Table(name="files_tab")
public class Files {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String filepath;
    private String file_name;
    private String file_ext;
    private String status;
    private String parent_name;
    private String regstatus;
    private String user_type;
    private Date created_date;
    private LocalDateTime modified_datetime;

}
