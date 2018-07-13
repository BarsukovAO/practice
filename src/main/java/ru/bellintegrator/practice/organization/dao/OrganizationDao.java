package ru.bellintegrator.practice.organization.dao;

import ru.bellintegrator.practice.person.model.Organization;

import java.util.List;

public interface OrganizationDao {
    /**
     * Получить все объекты Organization
     *
     * @return
     */
    List<Organization> all();

    /**
     * Получить Organization по идентификатору
     *
     * @param name
     * @return
     */
    Organization loadByName(String name);


    /**
     * Сохранить Organization
     *
     * @param organization
     */
    void save(Organization organization);
}