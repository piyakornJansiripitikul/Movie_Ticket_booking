package model.pojo;
// Generated Nov 15, 2014 4:01:32 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name="Users"
    ,schema="dbo"
    ,catalog="Alpha"
)
public class Users  implements java.io.Serializable {


     private String username;
     private String password;
     private String email;
     private String phonenumber;
     private boolean isadmin;
     private String session;
     private String code;

    public Users() {
    }

	
    public Users(String username, String password, String email, String phonenumber, boolean isadmin) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phonenumber = phonenumber;
        this.isadmin = isadmin;
    }
    public Users(String username, String password, String email, String phonenumber, boolean isadmin, String session) {
       this.username = username;
       this.password = password;
       this.email = email;
       this.phonenumber = phonenumber;
       this.isadmin = isadmin;
       this.session = session;
    }
   
     @Id 

    
    @Column(name="username", nullable=false, length=50)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="password", nullable=false, length=150)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="email", nullable=false, length=50)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="phonenumber", nullable=false, length=12)
    public String getPhonenumber() {
        return this.phonenumber;
    }
    
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    
    @Column(name="isadmin", nullable=false)
    public boolean isIsadmin() {
        return this.isadmin;
    }
    
    public void setIsadmin(boolean isadmin) {
        this.isadmin = isadmin;
    }

    
    @Column(name="session", length=150)
    public String getSession() {
        return this.session;
    }
    
    public void setSession(String session) {
        this.session = session;
    }
    
    @Column(name="code", length=100)
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }




}


