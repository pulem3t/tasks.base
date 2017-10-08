package org.pulem3t.tasks.entry;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.json.JSONObject;
import org.pulem3t.tasks.enums.Status;

@Entity
@Table(name = "TASKS")
public class Task {
	
	@Id
	@Column(name = "ID")
	private String id;
	
	@Column(name = "PREFIX")
	private String prefix;
	
	@Column(name = "TITLE")
	private String title;
	
	@OneToOne
	private User author;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private User performer;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "STATUS")
	private int status;
	
	@Column(name = "PRIORITY")
	private int priority;
	
	@Column(name = "CREATEDATE")
	private long createDate;
	
	@Column(name = "LASTMODDATE")
	private long lastmodDate;
	
	@Column(name = "DEADLINE")
	private long deadLine;

	public Task() {
		this.id = "";
		this.prefix = "";
		this.title = "";
		this.author = null;
		this.performer = null;
		this.description = "";
		this.status = Status.NEW.getStatus();
		this.priority = 0;
		this.createDate = System.currentTimeMillis();
		this.lastmodDate = System.currentTimeMillis();
		this.lastmodDate = 0;
		this.deadLine = 0;
	}
	
	@Override
	public String toString() {
		JSONObject o = new JSONObject();
		o.put("id", this.id);
		o.put("prefix", this.prefix);
		o.put("title", this.title);
		o.put("author", this.author);
		o.put("performer", this.performer);
		o.put("description", this.description);
		o.put("status", this.status);
		o.put("priority", this.priority);
		o.put("createDate", this.createDate);
		o.put("lastmodDate", this.lastmodDate);
		o.put("deadLine", this.deadLine);
		return o.toString();
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPrefix() {
		return prefix;
	}
	
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public User getAuthor() {
		return author;
	}
	
	public void setAuthor(User author) {
		this.author = author;
	}
	
	public User getPerformer() {
		return performer;
	}
	
	public void setPerformerId(User performer) {
		this.performer = performer;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public long getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}
	
	public long getLastmodDate() {
		return lastmodDate;
	}
	
	public void setLastmodDate(long lastmodDate) {
		this.lastmodDate = lastmodDate;
	}
	
	public long getDeadLine() {
		return deadLine;
	}
	
	public void setDeadLine(long deadLine) {
		this.deadLine = deadLine;
	}
}
