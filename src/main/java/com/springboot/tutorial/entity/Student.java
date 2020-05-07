package com.springboot.tutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// TODO: Auto-generated Javadoc
/**
 * The Class StudentEntity.
 */
@Entity
@Table

/**
 * Gets the student phone number.
 *
 * @return the student phone number
 */

/**
 * Gets the student phone number.
 *
 * @return the student phone number
 */
@Getter

/**
 * Sets the student phone number.
 *
 * @param studentPhoneNumber the new student phone number
 */

/**
 * Sets the student phone number.
 *
 * @param studentPhoneNumber the new student phone number
 */
@Setter

/**
 * Instantiates a new student entity.
 */
@NoArgsConstructor
public class Student {

	/** The student id. */
	@Id
	@Column(name = "studentId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId;

	/** The student name. */
	@NotBlank(message = "Name is mandatory")
	@Column(name = "studentName")
	private String studentName;

	/** The student email. */
	@NotBlank(message = "Email is mandatory")
	@Column(name = "studentEmail")
	private String studentEmail;

	/** The student phone number. */
	@Column(name = "studentPhoneNumber")
	private long studentPhoneNumber;
}
