package com.ynova.users.models;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "role")
@Data
@EqualsAndHashCode(callSuper = true)
public class Role extends BaseEntity {

    @NotNull
    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER, mappedBy = "role")
    private Set<Permissionn> permiso;

    public void setPermission(Set<Permissionn> lista) {
        permiso = lista;
    }

    public Set<Permissionn> getPermission() {
        return permiso;
    }

}
