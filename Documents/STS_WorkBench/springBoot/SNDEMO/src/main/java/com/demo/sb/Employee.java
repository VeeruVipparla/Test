package com.demo.sb;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import reactor.util.annotation.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@NonNull
	private int empId;
	@NotNull
	private String name;
	@NonNull
	private String email;

}
