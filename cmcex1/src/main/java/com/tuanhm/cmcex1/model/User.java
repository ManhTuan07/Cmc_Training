package com.tuanhm.cmcex1.model;
import com.tuanhm.cmcex1.constant.Gender;
import com.tuanhm.cmcex1.converter.GenderEnumConverter;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    @Convert(converter = GenderEnumConverter.class)
    private Gender gender;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="user_permission",
            joinColumns = {@JoinColumn(name="user_id")} ,
            inverseJoinColumns = {@JoinColumn(name="permission_id")})
    private List<Permission> permissions = new ArrayList<>();
}
