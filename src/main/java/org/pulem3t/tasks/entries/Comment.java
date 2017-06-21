package org.pulem3t.tasks.entries;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Comment {

	private String id;
	private String authorId;
	private String text;
	private Set<String> relatedUsers;
	private long createDate;
	private long lastmodDate;
	
	public Comment() {
		this.id = UUID.randomUUID().toString();
		this.authorId = "";
		this.text = "";
		this.relatedUsers = new HashSet<String>();
		this.createDate = System.currentTimeMillis();
		this.lastmodDate = System.currentTimeMillis();
	}
	
	public String getId() {
		return id;
	}
	public String getAuthorId() {
		return authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Set<String> getRelatedUsers() {
		return relatedUsers;
	}
	public void setRelatedUsers(Set<String> relatedUsers) {
		this.relatedUsers = relatedUsers;
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
}
