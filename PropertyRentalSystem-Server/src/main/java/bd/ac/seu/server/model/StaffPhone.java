package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class StaffPhone {
    @NotNull
    @Id
    @GeneratedValue
    int staffPhoneId;
    @NotNull
    @ManyToOne
    private Staff staff;
    @Embedded
    @NotNull
    @UniqueElements
    private Phone phone;
    @NotNull
    private String staffExtension;

}
