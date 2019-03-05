package za.co.malope.security.secureapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "role", uniqueConstraints = @UniqueConstraint(name = "uk_role_name", columnNames = "name"))
public class Role extends BaseEntity {

    @JsonIgnore
    @Getter
    @Enumerated(EnumType.STRING)
    @Column(length = 60)
    private RoleName name;

    public Role() {
    }

    public Role(RoleName name) {
        this.name = name;
    }

    @Override
    public Serializable uniqueIdentifier() {
        return name;

    }
}
