package com.example.zyberpasspro.model;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
@Data
@Entity
@Table(name="folder_tab")
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String folderpath;
    private String folder_name;
    private String status;
    private String parent_name;
    private String regstatus;
    private String user_type;
    private Date created_date;
    private LocalDateTime modified_datetime;

}
