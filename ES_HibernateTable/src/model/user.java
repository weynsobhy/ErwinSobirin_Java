package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class user implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int USERID;	
	private String USERNAME;
	private String USERPASSWORD;
	private int USERSTATUS;
	private String USERALAMAT;
	
	@Id
	public int getUSERID() {
		return USERID;
	}
	public void setUSERID(int uSERID) {
		USERID = uSERID;
	}
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	public String getUSERPASSWORD() {
		return USERPASSWORD;
	}
	public void setUSERPASSWORD(String uSERPASSWORD) {
		USERPASSWORD = uSERPASSWORD;
	}
	public int getUSERSTATUS() {
		return USERSTATUS;
	}
	public void setUSERSTATUS(int uSERSTATUS) {
		USERSTATUS = uSERSTATUS;
	}
	public String getUSERALAMAT() {
		return USERALAMAT;
	}
	public void setUSERALAMAT(String uSERALAMAT) {
		USERALAMAT = uSERALAMAT;
	}
	

	
	
}
