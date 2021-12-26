package guru.springframework.spring5webapp.domain;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class publisher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pubid;
	
	
	private String name;
	private String address;
	
	@OneToMany
	@JoinColumn(name = "publisher_id")
	private Set<Book> book = new HashSet<>();
	
	
	public publisher() {
		// TODO Auto-generated constructor stub
	}


	public publisher(String name, String address) {
		this.name = name;
		this.address = address;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the book
	 */
	public Set<Book> getBook() {
		return book;
	}


	/**
	 * @param book the book to set
	 */
	public void setBook(Set<Book> book) {
		this.book = book;
	}


	@Override
	public int hashCode() {
		return Objects.hash(pubid);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		publisher other = (publisher) obj;
		return pubid == other.pubid;
	}


	@Override
	public String toString() {
		return "publisher [pubid=" + pubid + ", name=" + name + ", address=" + address + ", book=" + book + "]";
	} 
	
	
	
	

}
