package ru.bellintegrator.practice.organization.view;

import io.swagger.annotations.ApiModelProperty;

public class OrganizationView {
    @ApiModelProperty(hidden = true)
    public String id;

    public String name;

    public String FullName;

    public int inn;

    public int kpp;

    public String address;

    public int phone;

    @Override
    public String toString() {
        return "{id:" + id + ";name:" + name + ";FullName:" + FullName + ";inn:" + inn + ";kpp:" + kpp +
                ";address:" + address + ";phone:" + phone + "}";
    }
}
