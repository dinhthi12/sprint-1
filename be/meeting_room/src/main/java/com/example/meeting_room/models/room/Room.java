package com.example.meeting_room.models.room;

import com.example.meeting_room.models.EStatus;
import com.example.meeting_room.models.equipment.Equipment;
import com.example.meeting_room.models.feedback.Feedback;
import com.example.meeting_room.models.registrationHistory.RegistrationHistory;
import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private UUID idRoom;

    @Column(length = 100)
    private String nameRoom;

    private int floor;

    @Enumerated(EnumType.STRING)
    private EStatus status;

    private int capacity;

    private String image;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
    private LocalDate dateStart;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
    private LocalDate dateEnd;

    private LocalTime timeStart;

    private LocalTime timeEnd;

    @ManyToOne //cascade = CascadeType.ALL
    @JoinColumn
    private RoomType roomType;

    @ManyToOne //fetch = FetchType.LAZY //cascade = CascadeType.ALL
    @JoinColumn
    private Area area;

    @OneToMany(mappedBy = "room")
    @JsonIgnore
    private List<Feedback> feedbackList;

    @OneToMany(mappedBy = "room")
    @JsonIgnore
    private List<RegistrationHistory> registrationHistoryList;

    @OneToMany(mappedBy = "room")
    @JsonIgnore
    private List<Equipment> equipmentList;

}
