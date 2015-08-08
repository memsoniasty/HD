package com.healthyday;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the test database table.
 * 
 */
@Entity
@NamedQuery(name="Test.findAll", query="SELECT t FROM Test t")
public class Test implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;

	@Column(name="pk_test")
	private Integer pkTest;

	public Test() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPkTest() {
		return this.pkTest;
	}

	public void setPkTest(Integer pkTest) {
		this.pkTest = pkTest;
	}

}