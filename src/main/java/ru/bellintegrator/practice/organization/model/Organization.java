package ru.bellintegrator.practice.organization.model;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Version;
import java.util.HashSet;
import java.util.Set;

/**
 * Органицация
 */
@Entity
@Table(name = "Organization")
public class Organization {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;

    /**
     * Служебное поле hibernate
     */
    @Version
    private Integer version;

    /**
     * название
     */
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    /**
     * Полное название
     */
    @Column(name = "Fullname", nullable = false)
    private String Fullname;

    /**
     * инн
     */
    @Column(name = "inn", nullable = false)
    private int inn;

    /**
     * кпп
     */
    @Column(name = "kpp", nullable = false)
    private int kpp;

    /**
     * адрес
     */
    @Column(name = "address", nullable = false)
    private String adress;

    /**
     * телефон
     */
    @Column(name = "phone", nullable = false)
    private int phone;

    /**
     * Конструктор для hibernate
     */
    public Organization() {

    }

    public Organization(String name, String FullName, int inn, int kpp, String address, int phone) {
        this.name = name;
        this.Fullname = FullName;
        this.inn = inn;
        this.kpp = kpp;
        this.adress = address;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return Fullname;
    }

    public void setFullNameName(String FullName) {
        this.Fullname = FullName;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public int getKpp() {
        return kpp;
    }

    public void setKpp(int kpp) {
        this.kpp = kpp;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    }

}
