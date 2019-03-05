package za.co.malope.security.secureapp.entity;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

public enum RoleName {
    PROJECT_ADMIN,
    PROGRAM_MANAGER,
    SYSTEM_ADMIN,
    MENTOR;

    public String getName(){
        return "ROLE_" + name();
    }

    public SimpleGrantedAuthority asSimpleGrantedAuthority(){
        return new SimpleGrantedAuthority(getName());
    }

}
