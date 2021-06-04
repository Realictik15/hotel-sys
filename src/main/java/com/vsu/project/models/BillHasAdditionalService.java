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
@Table(name = "ADDITIONALSERVICES")
public class BillHasAdditionalService {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ADDITIONALSERVICES_SEQ")
    @SequenceGenerator(sequenceName = "SEQUENCE_OF_IDADDSEV", allocationSize = 1, name = "ADDITIONALSERVICES_SEQ")
    @Column(name = "IDADDSEV")
    private Long id;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "IDBILL", nullable = false)
    private Bill bill;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "IDSEV", nullable = false)
    private Offers additionalService;
}
