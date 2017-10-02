package org.pulem3t.tasks.entry;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.json.JSONObject;

@Entity
@Table(name = "COMMENTS")
public class Comment {

	@Id
	@Column(name = "ID")
	private String id;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private User author;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Task task;
	
	@Column(name = "TEXT")
	private String text;
	
	@Column(name = "RATING")
	private int rating;
	
	@ElementCollection
	private List<User> relatedUsers;
	
	@Column(name = "CREATEDATE")
	private long createDate;
	
	@Column(name = "LASTMODDATE")
	private long lastmodDate;
	
	public Comment() {
		this.id = "";
		this.author = null;
		this.task = null;
		this.text = "";
		this.rating = 0;
		this.relatedUsers = new ArrayList<>();
		this.createDate = System.currentTimeMillis();
		this.lastmodDate = System.currentTimeMillis();
	}
	
	@Override
	public String toString() {
		JSONObject o = new JSONObject();
		o.put("id", this.id);
		o.put("author", this.author);
		o.put("task", this.task);
		o.put("text", this.text);
		o.put("rating", this.rating);
		o.put("relatedUsers", this.relatedUsers);
		o.put("createDate", this.createDate);
		o.put("lastmodDate", this.lastmodDate);
		return o.toString();
	}
	
	public String getId() {
		return id;
	}
	
	public User getAuthor() {
		return author;
	}
	
	public void setAuthor(User author) {
		this.author = author;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public long getCreateDate() {
		return createDate;
	}
	
	public long getLastmodDate() {
		return lastmodDate;
	}
	
	public void setLastmodDate(long lastmodDate) {
		this.lastmodDate = lastmodDate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public List<User> getRelatedUsers() {
		return relatedUsers;
	}

	public void setRelatedUsers(List<User> relatedUsers) {
		this.relatedUsers = relatedUsers;
	}
}
