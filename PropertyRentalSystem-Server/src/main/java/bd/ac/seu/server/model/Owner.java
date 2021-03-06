package bd.ac.seu.server.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@ToString
@Entity
public class Owner {
    @NotNull
    @Id
    private long ownerNubmer;

    @OneToOne
    private User user;

    @NotNull
    @Embedded
    private Name name;

    @NotNull
    @Embedded
    private Address address;

    @NotNull
    private long businessType;

    @NotNull
    @OneToMany
    private List<OwnerPhone> ownerPhoneList;

    @NotNull
    @OneToMany
    private List<OwnerEmail> ownerEmailList;
}
