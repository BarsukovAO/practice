package ru.bellintegrator.practice.organization.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.bellintegrator.practice.organization.dao.OrganizationDao;
import ru.bellintegrator.practice.organization.model.Organization;
import ru.bellintegrator.practice.organization.view.OrganizationView;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class OrganizationServiceImpl implements OrganizationService {
    private final Logger log = LoggerFactory.getLogger(getClass());

    private final OrganizationDao dao;

    @Autowired
    public OrganizationServiceImpl(OrganizationDao dao) {
        this.dao = dao;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public void add(OrganizationView view) {
        Organization organization = new organization(view.name, view.FullName, view.address, view.inn,
                view.kpp, view.phone );
        dao.save(organization);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional(readOnly = true)
    public List<OrganizationView> organization() {
        List<Organization> all = dao.all();

        return all.stream()
                .map(mapOrganization())
                .collect(Collectors.toList());
    }

    private Function<Organization, OrganizationView> mapOrganization() {
        return o -> {
            OrganizationView view = new OrganizationView();
            view.id = String.valueOf(o.getId());
            view.name = o.getName();
            view.FullName = o.getFullName();
            view.address = o.getAdress();
            view.inn = o.getInn();
            view.kpp = o.getKpp();
            view.phone = o.getPhone();

            log.debug(view.toString());

            return view;
        };
    }
}
