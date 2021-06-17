package bediryaz.l.m.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import bediryaz.l.m.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="candidates")

@PrimaryKeyJoinColumn(name="id",referencedColumnName="id")
public class Candidate extends User{

	@NotBlank(message="Zorunlu alan")
	@Column(name="first_name")
	private String fisrtName;
	
	@NotBlank(message="Zorunlu alan")
	@Column(name="last_name")
	private String lastName;
	
	@NotBlank(message="Zorunlu alan")
	@Size(min=11,max=11,message="TC 11 haneli olmalıdır")
	@Column(name="identity_number")
	private String identityNumber;
	
	@NotBlank(message="Zorunlu alan")
	@Column(name="birth_date")
	private Date birthDate;

	
}
