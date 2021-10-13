
package trabalhofinal;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Marco
 */
@Entity
@Table
public class Student implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String registration;
    
    @Column
    private String mastery;
    
    @Column(nullable = true)
    private float avg_grade;
    
    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER) 
    private Person p;

    public Student() {
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getMastery() {
        return mastery;
    }

    public void setMastery(String mastery) {
        this.mastery = mastery;
    }

    public float getAvg_grade() {
        return avg_grade;
    }

    public void setAvg_grade(float avg_grade) {
        this.avg_grade = avg_grade;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }
    
    
}
