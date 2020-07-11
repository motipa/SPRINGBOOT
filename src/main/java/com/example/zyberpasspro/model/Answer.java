package com.example.zyberpasspro.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
@Data
@Entity
@Table(name="answer_tab")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public Answer(){}
    private String user_id;
    private String quizid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getQuizid() {
        return quizid;
    }

    public void setQuizid(String quizid) {
        this.quizid = quizid;
    }

    public String getQuestionid() {
        return questionid;
    }

    public void setQuestionid(String questionid) {
        this.questionid = questionid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getModified_datetime() {
        return modified_datetime;
    }

    public void setModified_datetime(Date modified_datetime) {
        this.modified_datetime = modified_datetime;
    }

    private String questionid;
    private String answer;
    private String status;
    private Date created_date;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date modified_datetime;

    public Answer(Long id, String user_id, String quizid, String questionid, String answer, String status, Date created_date, Date modified_date) {
        this.id = id;
        this.user_id = user_id;
        this.quizid = quizid;
        this.questionid = questionid;
        this.answer = answer;
        this.status = status;
        this.created_date = created_date;
        this.modified_datetime = modified_date;
    }


}
