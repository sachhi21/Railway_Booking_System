package com.example.milestone.Entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.CollectionTable;
import javax.persistence.JoinColumn;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Table(name = "trains")
@NoArgsConstructor
@Data
@AllArgsConstructor
@Setter
@Getter
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int train_id;

    @ElementCollection
    @CollectionTable(name = "train_classes", joinColumns = @JoinColumn(name = "train_id"))
    @Column(name = "class_type")
    private Set<String> classes;

    @Column(name="trainNumber", unique = true)
    private String trainNumber;

    @Column(name="trainName")
    private String trainName;

    @Column(name="source")
    private String source;

    @Column(name="destination")
    private String destination;

    @Column(name="departureTime")
    private LocalTime departureTime;

    @Column(name="arrivalTime")
    private LocalTime arrivalTime;

    @Column(name="seatsAvailable")
    private int seatsAvailable;


}

