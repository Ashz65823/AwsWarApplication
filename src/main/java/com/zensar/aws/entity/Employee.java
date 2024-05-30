package com.zensar.aws.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tbl_Employee")
public class Employee {

	@Id
	@GeneratedValue
	private int e_Id;
	private String e_Name;
	private int e_Age;
}
