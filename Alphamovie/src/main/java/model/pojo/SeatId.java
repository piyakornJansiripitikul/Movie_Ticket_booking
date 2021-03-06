package model.pojo;
// Generated Nov 15, 2014 4:01:32 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SeatId generated by hbm2java
 */
@Embeddable
public class SeatId  implements java.io.Serializable {


     private String time;
     private int cinema;
     private String seat;

    public SeatId() {
    }

    public SeatId(String time, int cinema, String seat) {
       this.time = time;
       this.cinema = cinema;
       this.seat = seat;
    }
   


    @Column(name="time", nullable=false, length=5)
    public String getTime() {
        return this.time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }


    @Column(name="cinema", nullable=false)
    public int getCinema() {
        return this.cinema;
    }
    
    public void setCinema(int cinema) {
        this.cinema = cinema;
    }


    @Column(name="seat", nullable=false, length=3)
    public String getSeat() {
        return this.seat;
    }
    
    public void setSeat(String seat) {
        this.seat = seat;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SeatId) ) return false;
		 SeatId castOther = ( SeatId ) other; 
         
		 return ( (this.getTime()==castOther.getTime()) || ( this.getTime()!=null && castOther.getTime()!=null && this.getTime().equals(castOther.getTime()) ) )
 && (this.getCinema()==castOther.getCinema())
 && ( (this.getSeat()==castOther.getSeat()) || ( this.getSeat()!=null && castOther.getSeat()!=null && this.getSeat().equals(castOther.getSeat()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTime() == null ? 0 : this.getTime().hashCode() );
         result = 37 * result + this.getCinema();
         result = 37 * result + ( getSeat() == null ? 0 : this.getSeat().hashCode() );
         return result;
   }   


}


