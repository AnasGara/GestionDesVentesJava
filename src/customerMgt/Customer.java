package customerMgt;
import Enum.*;
import cmdMgt.Command;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//@NoArgsConstructor
//@AllArgsConstructor constructor  with all params
@EqualsAndHashCode (onlyExplicitlyIncluded = true)
//@ToString //returns all attribut values
@ToString(exclude={"phone","adresse"})
public class Customer {
    @EqualsAndHashCode.Include
    long id;
    static long lastId=1;
    @EqualsAndHashCode.Include
    String nom,prenom, mail,adresse;
    long phone;
    CustomerType type= CustomerType.normal;
    Set<Command> listDescommandes= new HashSet<>();



    public long getId() {
        return id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }



    public Customer() {  this.id=lastId++;  }

    public Customer(String nom, String prenom, String mail, long phone, CustomerType type) {
        this.id=lastId++;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.phone = phone;
        this.type = type;
    }


    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    public static long getLastId() {
        return lastId;
    }

    public static void setLastId(long lastId) {
        Customer.lastId = lastId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }


}
