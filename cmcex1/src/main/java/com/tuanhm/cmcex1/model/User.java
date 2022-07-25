package com.tuanhm.cmcex1.model;
import com.tuanhm.cmcex1.constant.Gender;
import com.tuanhm.cmcex1.constant.Permission;
import com.tuanhm.cmcex1.converter.GenderEnumConverter;
import com.tuanhm.cmcex1.converter.PermissionEnumConverter;
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


    //property is an Enum type. we need to make it becomes a table
    //create a template table in DB
    @ElementCollection(targetClass = Permission.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_permission", joinColumns = {@JoinColumn(name = "user_id")})
    @Column(name = "permission")
    @Convert(converter = PermissionEnumConverter.class)
    private List<Permission> permissions;
}
