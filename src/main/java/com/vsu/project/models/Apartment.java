package com.vsu.project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Entity
//@Table(name = "APARTMENT")
public class Apartment {
//    @Id
//    @Column(name = "IDROOM")
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "APART_SEQ")
//    @SequenceGenerator(sequenceName = "SEQUENCE_OF_IDROOM", allocationSize = 1, name = "APART_SEQ")
    private Long idRoom;
    private Integer counOfRooms;
    private Integer floor;
    private RoomType type;
    private Integer price;
    private String information;
}
