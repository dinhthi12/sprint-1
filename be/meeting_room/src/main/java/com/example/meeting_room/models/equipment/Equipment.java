package com.example.meeting_room.models.equipment;

import com.example.meeting_room.models.room.Room;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//Table(name = "equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private UUID idEquipment;

    @Column(length = 100)
    private String nameEquipment;

    @Column(length = 100)
    private String des;

    private Double price;

    private Integer quantity;

    private String image;

    @ManyToOne
    @JoinColumn
    private Category category;

   @ManyToOne(fetch = FetchType.LAZY) //cascade = CascadeType.ALL
    @JoinColumn
    private Room room;
}
