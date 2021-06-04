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
@Table(name = "BILL")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BILL_SEQ")
    @SequenceGenerator(sequenceName = "SEQUENCE_OF_IDBILL", allocationSize = 1, name = "BILL_SEQ")
    @Column(name = "IDBILL")
    private Long id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "IDBID", nullable = false)
    private Bid bid;

    @Column(name = "PRICE")
    private Long price;

    @Column(name = "INFORMATION")
    private String info;

    @OneToMany(mappedBy = "bill", cascade = {CascadeType.MERGE, CascadeType.PERSIST}, orphanRemoval = true)
    private List<BillHasAdditionalService> billHasAdditionalServices = new ArrayList<>();
}
