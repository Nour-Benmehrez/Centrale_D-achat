package tn.esprit.centraleachat.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderLine implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idO;
    int quantity;

    @OneToOne
    public Orderr order;
}
