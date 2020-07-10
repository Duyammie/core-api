package com.du11.coreapi.common;

public enum Role {

    ROLE_SUPER_USER("R001", "SUPER_USER", "Super User"),
    ROLE_MANAGER("R002", "MANAGER", "Manager"),
    ROLE_DEVELOPER("R003", "DEVELOPER", "Developer"),
    ROLE_PART_TIMER("R004", "PART_TIMER", "Part Timer"),
    ROLE_OPERATOR("R005", "OPERATOR", "Operator"),
    ROLE_SA("R006", "SA", "SA"),
    ROLE_GENERAL("R007", "GENERAL", "General");

    private String value;
    private String authority;
    private String alias;

    Role(String value, String authority, String alias) {
        this.value = value;
        this.authority = authority;
        this.alias = alias;
    }

    public String getValue() { return this.value; }
    public String getAuthority() { return this.authority; }
    public String getAlias() { return this.alias; }

    public static Role findByValue(String value) {
        if (value == null) {
            return null;
        }
        for (Role role : Role.values()) {
            if (value.equals(role.getValue())) {
                return role;
            }
        }
        return null;
    }

    public static Role findByAuthority(String authority) {
        if (authority == null) {
            return null;
        }
        for (Role role : Role.values()) {
            if (authority.equals(role.getAuthority())) {
                return role;
            }
        }
        return null;
    }

    public static Role findByAlias(String alias) {
        if (alias == null) {
            return null;
        }
        for (Role role : Role.values()) {
            if (alias.equals(role.getAlias())) {
                return role;
            }
        }
        return null;
    }
}
