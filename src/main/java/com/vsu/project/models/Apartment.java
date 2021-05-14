package com.vsu.project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "APARTMENT")
public class Apartment {
    @Id
    @Column(name = "IDROOM")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "APART_SEQ")
    @SequenceGenerator(sequenceName = "SEQUENCE_OF_IDROOM", allocationSize = 1, name = "APART_SEQ")
    private Long idRoom;

    @Column(name = "COUNTOFROOMS")
    private Integer counOfRooms;

    @Column(name = "FLOOR")
    private Integer floor;

    @Column(name = "ROOMTYPE")
    @Enumerated(EnumType.STRING)
    private RoomType type;

    @Column(name = "PRICE")
    private Integer price;

    @Column(name = "INFORMATION")
    private String information;

    @OneToMany(mappedBy = "apartment", cascade = {CascadeType.MERGE, CascadeType.PERSIST}, orphanRemoval = true)
    private List<Bid> bids = new ArrayList<>();
}
