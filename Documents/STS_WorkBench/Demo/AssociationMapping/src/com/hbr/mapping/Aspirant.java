package com.hbr.mapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ASPIRANT")
public class Aspirant {
    private int aId;
    private String aName;
    private String aJob;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="AId")
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	@Column(name="AName")
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="JID")
	public String getaJob() {
		return aJob;
	}
	public void setaJob(String aJob) {
		this.aJob = aJob;
	}
    
     
}
