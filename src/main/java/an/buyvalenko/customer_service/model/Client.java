package an.buyvalenko.customer_service.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Client {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "clientsIdSeq", sequenceName = "clients_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clientsIdSeq")
    private long id;

    @Column(name = "registered_address_id")
    private long registeredAddressId;

    @Column(name = "actual_address_id")
    private long actualAddressId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "sex")
    private String sex;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRegisteredAddressId() {
        return registeredAddressId;
    }

    public void setRegisteredAddressId(long registeredAddressId) {
        this.registeredAddressId = registeredAddressId;
    }

    public long getActualAddressId() {
        return actualAddressId;
    }

    public void setActualAddressId(long actualAddressId) {
        this.actualAddressId = actualAddressId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
