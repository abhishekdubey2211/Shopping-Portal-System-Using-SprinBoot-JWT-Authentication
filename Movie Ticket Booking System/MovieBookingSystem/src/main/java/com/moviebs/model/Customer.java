package com.moviebs.model;
import lombok.*;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="customer_details")
public class Customer 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
 	
	//indicates that the value cannot be null
	@Column(name="Name", nullable = false, length = 20)
    private String name;
    
	//indicates that the value cannot be null
	@Column(name ="email",nullable = false, length = 20)
    private String email;
 	
	//Parameterized Constructor
    public Customer(String name, String email)
    {
        this.name = name;
        this.email = email;
    }
}
