package com.example.zyberpasspro.model;



import lombok.Data;
import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name="USERS")
public class UserApp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(nullable = false, unique = true)
    private String username;

    private String password;

    // standard getters and setters
}
