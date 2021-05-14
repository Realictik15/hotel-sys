package com.vsu.project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CLIENTS")
public class Client {
    @Id
    @Column(name = "IDCLIENT")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLIENTS_SEQ")
    @SequenceGenerator(sequenceName = "SEQUENCE_OF_IDCLIENT", allocationSize = 1, name = "CLIENTS_SEQ")
    private Long id;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "DOCINFO")
    private String DocInfo;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "PASS")
    private String pass;

    @OneToMany(mappedBy = "client", cascade = {CascadeType.MERGE, CascadeType.PERSIST}, orphanRemoval = true)
    private List<Bid> bids = new ArrayList<>();

}
