package edu.miu.e_mart.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

public class ACredential {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int credentialId;
	private String  userName;
	private String password;

	public int getCredentialId() {
		return credentialId;
	}

	public ACredential(int credentialId, String userName, String password) {
		super();
		this.credentialId = credentialId;
		this.userName = userName;
		this.password = password;
	}

	public void setCredentialId(int credentialId) {
		this.credentialId = credentialId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
