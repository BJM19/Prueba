package co.com.prueba.metrocuadrado.prueba.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Students")
public class Students {
    @Id
    @Column(name = "Id")
    private String identificationCard;
    @Column(name = "Name")
    private String name;


    public String getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
