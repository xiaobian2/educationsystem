package cn.beijing.ssfh.entity;

public class RolePermissions {
    private Integer rolePermissionsId;

    private Integer permissionsId;

    private Integer roleId;

    public Integer getRolePermissionsId() {
        return rolePermissionsId;
    }

    public void setRolePermissionsId(Integer rolePermissionsId) {
        this.rolePermissionsId = rolePermissionsId;
    }

    public Integer getPermissionsId() {
        return permissionsId;
    }

    public void setPermissionsId(Integer permissionsId) {
        this.permissionsId = permissionsId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}