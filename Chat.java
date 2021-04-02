package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="chat")
public class Chat implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_chat")
	private Long id;
	@Column
	private String subject;
	@Column
	private Date dateEnvoi;
	@Column
	private String sender;
	@Column
	private Date dateLecture;
	@Column
	private String recepient;
	
	@ManyToMany(cascade= CascadeType.ALL,mappedBy="chat")
	private Set<Parent> parents = new HashSet<>();
	

	public Chat(Long id, String subject, Date dateEnvoi, String sender, Date dateLecture, String recepient) {
		super();
		this.id = id;
		this.subject = subject;
		this.dateEnvoi = dateEnvoi;
		this.sender = sender;
		this.dateLecture = dateLecture;
		this.recepient = recepient;
	}


	public Chat() {

	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Temporal(TemporalType.DATE)
	public Date getDateEnvoi() {
		return dateEnvoi;
	}
	public void setDateEnvoi(Date dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getDateLecture() {
		return dateLecture;
	}
	public void setDateLecture(Date dateLecture) {
		this.dateLecture = dateLecture;
	}
	public String getRecepient() {
		return recepient;
	}
	public void setRecepient(String recepient) {
		this.recepient = recepient;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateEnvoi == null) ? 0 : dateEnvoi.hashCode());
		result = prime * result + ((dateLecture == null) ? 0 : dateLecture.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((recepient == null) ? 0 : recepient.hashCode());
		result = prime * result + ((sender == null) ? 0 : sender.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
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
		Chat other = (Chat) obj;
		if (dateEnvoi == null) {
			if (other.dateEnvoi != null)
				return false;
		} else if (!dateEnvoi.equals(other.dateEnvoi))
			return false;
		if (dateLecture == null) {
			if (other.dateLecture != null)
				return false;
		} else if (!dateLecture.equals(other.dateLecture))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (recepient == null) {
			if (other.recepient != null)
				return false;
		} else if (!recepient.equals(other.recepient))
			return false;
		if (sender == null) {
			if (other.sender != null)
				return false;
		} else if (!sender.equals(other.sender))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Chat [id=" + id + ", subject=" + subject + ", dateEnvoi=" + dateEnvoi + ", sender=" + sender
				+ ", dateLecture=" + dateLecture + ", recepient=" + recepient + ", getId()=" + getId()
				+ ", getSubject()=" + getSubject() + ", getDateEnvoi()=" + getDateEnvoi() + ", getSender()="
				+ getSender() + ", getDateLecture()=" + getDateLecture() + ", getRecepient()=" + getRecepient()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	

}
