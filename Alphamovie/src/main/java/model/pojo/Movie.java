package model.pojo;
// Generated Nov 11, 2014 5:50:29 PM by Hibernate Tools 4.3.1


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.commons.codec.binary.Base64;

/**
 * Movie generated by hbm2java
 */
@Entity
@Table(name="Movie"
    ,schema="dbo"
    ,catalog="Alpha"
)
public class Movie  implements java.io.Serializable {


     private String mname;
     private String releasedate;
     private String type;
     private int duration;
     private String synopsis;
     private byte[] mimg;
     private String b64str;
     private List<Showtime> listshowtime = null;

    public Movie() {
    }

    public Movie(String mname, String releasedate, String type, int duration, String synopsis, byte[] mimg) {
       this.mname = mname;
       this.releasedate = releasedate;
       this.type = type;
       this.duration = duration;
       this.synopsis = synopsis;
       this.mimg = mimg;
    }
    
    public void setB64str() {
        Base64 b64 = new Base64();
        String b64str = new String(b64.encode(this.mimg));
        this.b64str = b64str;
    }

    public String getB64str() {
        return this.b64str;
    }
    
    public List<Showtime> addShowtimeList(List<Showtime> showtimelst) {
        return this.listshowtime = showtimelst;
    }
    
    public List<Showtime> getShowtimeList() {
        return this.listshowtime;
    }
   
     @Id 

    
    @Column(name="mname", nullable=false, length=50)
    public String getMname() {
        return this.mname;
    }
    
    public void setMname(String mname) {
        this.mname = mname;
    }

    
    @Column(name="releasedate", nullable=false, length=10)
    public String getReleasedate() {
        return this.releasedate;
    }
    
    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    
    @Column(name="type", nullable=false, length=50)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    
    @Column(name="duration", nullable=false)
    public int getDuration() {
        return this.duration;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }

    
    @Column(name="synopsis", nullable=false, length=500)
    public String getSynopsis() {
        return this.synopsis;
    }
    
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    
    @Column(name="mimg", nullable=false)
    public byte[] getMimg() {
        return this.mimg;
    }
    
    public void setMimg(byte[] mimg) {
        this.mimg = mimg;
    }




}


