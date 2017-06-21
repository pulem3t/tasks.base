package org.pulem3t.tasks.entries;

import java.util.UUID;

import org.json.JSONObject;
import org.pulem3t.tasks.enums.Status;

public class Task {
	
	private String id;
	private String prefix;
	private String title;
	private String authorId;
	private String parentTaskId;
	private String performerId;
	private String description;
	private int status;
	private int priority;
	private long createDate;
	private long lastmodDate;
	private long deadLine;

	public Task() {
		this.id = UUID.randomUUID().toString();
		this.prefix = "";
		this.title = "";
		this.authorId = "";
		this.parentTaskId = "";
		this.performerId = "";
		this.description = "";
		this.status = Status.NEW.getStatus();
		this.priority = 0;
		this.createDate = System.currentTimeMillis();
		this.lastmodDate = System.currentTimeMillis();
		this.lastmodDate = 0;
	}
	
	@Override
	public String toString() {
		JSONObject o = new JSONObject();
		o.put("id", id);
		o.put("prefix", prefix);
		o.put("title", title);
		o.put("authorId", authorId);
		o.put("parentTaskId", parentTaskId);
		o.put("performerId", performerId);
		o.put("description", description);
		o.put("status", status);
		o.put("priority", priority);
		o.put("createDate", createDate);
		o.put("lastmodDate", lastmodDate);
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
	public String getAuthorId() {
		return authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	public String getParentTaskId() {
		return parentTaskId;
	}
	public void setParentTaskId(String parentTaskId) {
		this.parentTaskId = parentTaskId;
	}
	public String getPerformerId() {
		return performerId;
	}
	public void setPerformerId(String performerId) {
		this.performerId = performerId;
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
