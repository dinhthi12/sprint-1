package com.example.meeting_room.models.user;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "account")
public class Account {

    @Id
    @Column(length = 100)
    private String username;

    @Column(length = 100)
    private String password;

    @Enumerated(EnumType.STRING)
    private ERole eRole;

    @OneToOne(mappedBy = "account")
    @JsonIgnore
    private User user;
}
