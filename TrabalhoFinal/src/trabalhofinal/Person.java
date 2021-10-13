
package trabalhofinal;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 *
 * @author Marco
 */
@Entity
@Table(name = "person")
@GenericGenerator(
      name = "seq_person",
      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
      parameters = {
              @Parameter(name = "sequence_name", value = "seq_person"),
              @Parameter(name = "initial_value", value = "1"),
              @Parameter(name = "increment_size", value = "1")
      }
)   
public class Person implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_person")
    private int id;
    
    @Column
    private String cpf;
    
    @Column
    private String name;
    
    @Column
    private String address;
    
    @Column
    private String phone;

    public Person() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddres(String addres) {
        this.address = addres;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}
