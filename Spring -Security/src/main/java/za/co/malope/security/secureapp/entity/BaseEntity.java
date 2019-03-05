package za.co.malope.security.secureapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.UUID;

@MappedSuperclass
public abstract class BaseEntity<T extends BaseEntity<T>> implements Serializable {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @Version
    @Column(name = "version")
    private Long version;

    @Getter
    @NotNull
    @Column(name = "reference_id")
    private String referenceId = UUID.randomUUID().toString();


    public abstract Serializable uniqueIdentifier();

    @Override
    public final boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        return sameIdentityAs(((T) object));
    }

    @Override
    public final int hashCode() {
        return internalHashCode();
    }

    private final boolean sameIdentityAs(T t) {
        if (this == t) {
            return true;
        }
        return internalSameIdentityAs(t);
    }

    private boolean internalSameIdentityAs(T t) {
        return new EqualsBuilder().append(uniqueIdentifier(), t.uniqueIdentifier()).isEquals();
    }

    private int internalHashCode() {
        return new HashCodeBuilder().append(uniqueIdentifier()).toHashCode();
    }

}
