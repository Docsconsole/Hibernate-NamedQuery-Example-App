package com.docsconsole.tutorials.hibernate5.entity;

import javax.persistence.*;


@NamedQueries(
		{
				@NamedQuery(
						name = "findPersonByName",
						query = "from Person p where p.firstName = :firstName"
				)
		}
)

@Entity
@Table(name = "person")
public class Person {

	@Id
	@GeneratedValue
	@Column(name = "PERSON_ID")
	private Long id;

	@Column(name = "PERSON_FIRST_NAME")
	private String firstName;

	@Column(name = "PERSON_LAST_NAME")
	private String lastName;

	@Column(name = "PERSON_GENDER")
	private String gender;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}