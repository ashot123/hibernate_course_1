package org.javabrains.koushik.dto;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ashot Karakhanyan on 27-12-2014
 */

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String userName;

    @Embedded
    private Address address;



    public String getUserName() {
        return userName + " from getter";
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
