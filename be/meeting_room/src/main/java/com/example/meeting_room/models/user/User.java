package com.example.meeting_room.models.user;

import com.example.meeting_room.models.feedback.Feedback;
import com.example.meeting_room.models.registrationHistory.RegistrationHistory;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private UUID idUser;

    @Column(length = 100)
    //@NotEmpty(message = "Không được để trống")
    private String nameUser;

    @Email
    @Column(length = 100)
    private String email;

    @Enumerated(EnumType.STRING)
    private EGender gender;

    @Column(length = 20)
    private String number;

    private String image;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
    private LocalDate dob;

    @Column(length = 100)
    private String address;

    //khi 1 bản ghi thay đổi sẽ tự động update các bản ghi đang tham chiếu tơi (cascade)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Account account;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Feedback> feedbackList;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<RegistrationHistory> registrationHistoryList;

}
