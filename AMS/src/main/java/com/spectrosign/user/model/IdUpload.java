package com.spectrosign.user.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;



@Entity
public class IdUpload {
	@Id
private int id;
@ManyToOne
private User user;
@Lob
private byte[] filedata;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}

public byte[] getFiledata() {
	return filedata;
}
public void setFiledata(byte[] filedata) {
	this.filedata=filedata;
	
}
public IdUpload(int id, User user, byte[] file) {
	super();
	this.id = id;
	this.user = user;
	
	this.filedata = file;
}
public IdUpload() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((filedata == null) ? 0 : filedata.hashCode());
	result = prime * result + id;
	result = prime * result + ((user == null) ? 0 : user.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	IdUpload other = (IdUpload) obj;
	if (filedata == null) {
		if (other.filedata != null)
			return false;
	} else if (!filedata.equals(other.filedata))
		return false;
	if (id != other.id)
		return false;
	if (user == null) {
		if (other.user != null)
			return false;
	} else if (!user.equals(other.user))
		return false;
	return true;
}
@Override
public String toString() {
	return "IdUpload [id=" + id + ", user=" + user + ", filedata=" + filedata + "]";
}




}