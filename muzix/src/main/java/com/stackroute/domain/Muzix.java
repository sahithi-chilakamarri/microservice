package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
//Using lombok to create getter and setter methods.
public class Muzix{
    @Id
    private int trackId;
    private String trackName;
    private String comments;
}
