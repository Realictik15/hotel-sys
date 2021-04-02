package com.vsu.project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Bid {
    private Long id;
    private BidType type;
    private Apartment apartment;
    private Client client;
    private Date startDay;
    private Date endDay;
    @Value("${bid.information}")
    private String information;
}
