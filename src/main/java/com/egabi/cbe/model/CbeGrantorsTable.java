package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBE_GRANTORS_TABLE database table.
 * 
 */
@Entity
@Table(name="CBE_GRANTORS_TABLE")
@NamedQuery(name="CbeGrantorsTable.findAll", query="SELECT c FROM CbeGrantorsTable c")
public class CbeGrantorsTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Temporal(TemporalType.DATE)
	@Column(name="BUSINESS_DATE")
	private Date businessDate;

	@Column(name="CUST_CBE_NO")
	private String custCbeNo;

	@Column(name="CUST_CODE")
	private String custCode;

	@Column(name="GRANT_CBE_NO")
	private String grantCbeNo;

	@Column(name="GUARAN_AMOUNT")
	private BigDecimal guaranAmount;

	@Column(name="GUARAN_CBE_NAME")
	private String guaranCbeName;

	@Column(name="GUARAN_CUST_CODE")
	private String guaranCustCode;

	@Column(name="GUARAN_LIMIT")
	private BigDecimal guaranLimit;

	@Column(name="GUARAN_TYPE")
	private String guaranType;

	public CbeGrantorsTable() {
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public Date getBusinessDate() {
		return this.businessDate;
	}

	public void setBusinessDate(Date businessDate) {
		this.businessDate = businessDate;
	}

	public String getCustCbeNo() {
		return this.custCbeNo;
	}

	public void setCustCbeNo(String custCbeNo) {
		this.custCbeNo = custCbeNo;
	}

	public String getCustCode() {
		return this.custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public String getGrantCbeNo() {
		return this.grantCbeNo;
	}

	public void setGrantCbeNo(String grantCbeNo) {
		this.grantCbeNo = grantCbeNo;
	}

	public BigDecimal getGuaranAmount() {
		return this.guaranAmount;
	}

	public void setGuaranAmount(BigDecimal guaranAmount) {
		this.guaranAmount = guaranAmount;
	}

	public String getGuaranCbeName() {
		return this.guaranCbeName;
	}

	public void setGuaranCbeName(String guaranCbeName) {
		this.guaranCbeName = guaranCbeName;
	}

	public String getGuaranCustCode() {
		return this.guaranCustCode;
	}

	public void setGuaranCustCode(String guaranCustCode) {
		this.guaranCustCode = guaranCustCode;
	}

	public BigDecimal getGuaranLimit() {
		return this.guaranLimit;
	}

	public void setGuaranLimit(BigDecimal guaranLimit) {
		this.guaranLimit = guaranLimit;
	}

	public String getGuaranType() {
		return this.guaranType;
	}

	public void setGuaranType(String guaranType) {
		this.guaranType = guaranType;
	}

}