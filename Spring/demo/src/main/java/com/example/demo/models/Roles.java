package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name= "roles")
public class Roles {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Id Long idRole;
    private String roleName;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "role")
    private List<User> users;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Roles roles = (Roles) o;
        return Objects.equals(idRole, roles.idRole) && roleName.equals(roles.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRole, roleName);
    }

    @Override
    public String toString() {
        return "Roles{" +
                "idRole=" + idRole +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
