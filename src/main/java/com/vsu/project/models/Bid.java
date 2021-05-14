package com.vsu.project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name = "BID")
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BID_SEQ")
    @SequenceGenerator(sequenceName = "SEQUENCE_OF_IDBID", allocationSize = 1, name = "BID_SEQ")
    @Column(name = "IDBID")
    private Long id;
    private BidType type;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "IDROOM", nullable = false)
    private Apartment apartment;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "IDCLIENT", nullable = false)
    private Client client;

    @Column(name = "STARTDAY")
    private Date startDay;

    @Column(name = "ENDDAY")
    private Date endDay;

    @Column(name = "INFORMATION")
    private String information;

    @OneToMany(mappedBy = "Bid", cascade = {CascadeType.MERGE, CascadeType.PERSIST}, orphanRemoval = true)
    private List<Bill> bills = new ArrayList<>();

}
