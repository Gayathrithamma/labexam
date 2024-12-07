package com.klef.jfsd.exam;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name = "department")
	public class Department {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int deptId;

	    @Column(nullable = false, length = 100)
	    private String name;

	    @Column(nullable = false, length = 100)
	    private String location;

	    @Column(name = "hod_name", nullable = false, length = 100)
	    private String hodName;

	    // Constructors, Getters, and Setters
	    public Department() {}

	    public Department(String name, String location, String hodName) {
	        this.name = name;
	        this.location = location;
	        this.hodName = hodName;
	    }

	    public int getDeptId() {
	        return deptId;
	    }

	    public void setDeptId(int deptId) {
	        this.deptId = deptId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }

	    public String getHodName() {
	        return hodName;
	    }

	    public void setHodName(String hodName) {
	        this.hodName = hodName;
	    }
	}



