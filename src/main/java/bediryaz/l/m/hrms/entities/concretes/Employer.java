package bediryaz.l.m.hrms.entities.concretes;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import bediryaz.l.m.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@EqualsAndHashCode(callSuper= false)
@Table(name="employers")
@PrimaryKeyJoinColumn(name="employer_id",referencedColumnName="id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobs"})
@AllArgsConstructor
@NoArgsConstructor
public class Employer  extends User{

	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_address")
	private String webAddress;
	
	@Column(name="phone_number")
	private String phoneNumber;

	@Column(name="is_activated")
	private boolean isActivated;
	
	@OneToMany(mappedBy="employer")
	private List<Job> jobs;
}
