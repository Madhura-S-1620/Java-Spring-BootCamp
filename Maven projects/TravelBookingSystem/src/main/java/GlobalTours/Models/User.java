package GlobalTours.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "User123", uniqueConstraints ={
        @UniqueConstraint(columnNames = "name"),
        @UniqueConstraint(columnNames = "emailId")})
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid", unique = true,nullable = false)
    private Long id;
    @Column(name = "emailId", unique = true,nullable = false )
    private String emailId;
    @Column(name = "name", unique = true,nullable = false )
    private String name;
    @Column(name = "password", unique = true,nullable = false )
    private String password;

    public User() {}

    public User(String name, String emailId, String password,Long id)
    {
        this.name = name;
        this.emailId = emailId;
        this.password = password;
        this.id=id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String get_emailId()
    {
        return emailId;
    }

    public void set_emailId(String emailId)
    {
        this.emailId = emailId;
    }

    public String get_name()
    {
        return name;
    }

    public void set_name(String name)
    {
        this.name = name;
    }

    public String get_password()
    {
        return password;
    }

    public void set_password(String password)
    {
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "User [emailId=" + emailId + ", name=" + name + ", password=" + password+ "]";
    }
}