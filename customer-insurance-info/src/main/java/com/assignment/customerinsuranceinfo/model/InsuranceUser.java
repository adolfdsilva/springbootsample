package com.assignment.customerinsuranceinfo.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.SpringSecurityCoreVersion;
import org.springframework.security.core.userdetails.User;

public class InsuranceUser extends User {
    private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;

    private long custId;

    public InsuranceUser(String username, String password, Collection<? extends GrantedAuthority> authorities,
            long custId) {
        super(username, password, true, true, true, true, authorities);
        this.custId = custId;
    }

    public InsuranceUser(String username, String password, boolean enabled, boolean accountNonExpired,
            boolean credentialsNonExpired, boolean accountNonLocked,
            Collection<? extends GrantedAuthority> authorities, long custId) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.custId = custId;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getCustId() {
        return this.custId;
    }

}
