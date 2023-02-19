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
public class Orderr implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idOrder ;
    String nameArt;
    int quantity;
    float unitPrice;
    float total;

    @Enumerated
    EtatOrder etatOrder;


    @OneToOne
    public OrderLine orderLine;
}
