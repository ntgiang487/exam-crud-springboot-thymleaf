package com.springboot.tutorial.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// TODO: Auto-generated Javadoc
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
@Setter

/**
 * Instantiates a new student DTO.
 */
@NoArgsConstructor
public class StudentDTO {

	/** The student id. */
	private Long studentId;

	/** The student name. */
	private String studentName;

	/** The student email. */
	private String studentEmail;

	/** The student phone number. */
	private long studentPhoneNumber;
}
