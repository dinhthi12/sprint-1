package com.example.meeting_room.models.equipment;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private UUID idCategory;

    @Column(length = 100)
    private String nameCategory;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    //@OneToMany(targetEntity = Equipment.class,cascade = CascadeType.ALL)
    private List<Equipment> equipmentList;
}
