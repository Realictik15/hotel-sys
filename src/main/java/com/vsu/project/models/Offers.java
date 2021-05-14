package com.vsu.project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SERVICES")
public class Offers {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SERVICES_SEQ")
    @SequenceGenerator(sequenceName = "SEQUENCE_OF_IDSEV", allocationSize = 1, name = "SERVICES_SEQ")
    @Column(name = "IDSEV")
    private Long id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "INFORMATION")
    private String information;
    @Column(name = "PRICE")
    public Integer price;
}
