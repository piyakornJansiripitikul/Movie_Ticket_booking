package model.pojo;
// Generated Nov 15, 2014 4:01:32 AM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * ReviewRating generated by hbm2java
 */
@Entity
@Table(name = "ReviewRating"
    ,schema = "dbo"
    ,catalog = "Alpha"
)
public class ReviewRating implements java.io.Serializable {

    private int id;
    private String mname;
    private String username;
    private int rating;
    private String review;

    public ReviewRating() {
    }

    public ReviewRating(String mname, String username, int rating, String review) {
        this.mname = mname;
        this.username = username;
        this.rating = rating;
        this.review = review;
    }

    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")

    @Column(name = "id", nullable = false)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "mname", nullable = false, length = 50)
    public String getMname() {
        return this.mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    @Column(name = "username", nullable = false, length = 50)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "rating", nullable = false)
    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Column(name = "review", nullable = false, length = 100)
    public String getReview() {
        return this.review;
    }

    public void setReview(String review) {
        this.review = review;
    }

}
