package GlobalTours.Models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.TimeZone;

@Entity
@Table(name="Ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticketid", unique = true,nullable = false)
    private Long id;
    @Column(name = "source", unique = true,nullable = false )
    private String source;
    @Column(name = "destination", unique = true,nullable = false )
    private String destination;
    @Column(name = "travel_type", unique = true,nullable = false )
    private String travel_type;
    @Column(name = "date", unique = true,nullable = false )
    private LocalDate date;
    @Column(name = "time", unique = true,nullable = false )
    private TimeZone time;
    @Column(name = "cost", unique = true,nullable = false )
    private float cost;


    public Ticket() {
        super();
    }

    public Ticket(Long id, String source, String destination, String travel_type, LocalDate date, TimeZone time, float cost) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.travel_type = travel_type;
        this.date = date;
        this.time = time;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTravel_type() {
        return travel_type;
    }

    public void setTravel_type(String travel_type) {
        this.travel_type = travel_type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public TimeZone getTime() {
        return time;
    }

    public void setTime(TimeZone time) {
        this.time = time;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketid=" + id +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", travel_type='" + travel_type + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", cost=" + cost +
                '}';
    }


}
