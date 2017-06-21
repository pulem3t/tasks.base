package org.pulem3t.tasks.dao;

import java.util.List;

import org.pulem3t.tasks.entries.Task;
import org.pulem3t.tasks.enums.Status;

public interface TaskDAO {
	public List<Task> getTasks();
	public Task getTask(String id);
	public boolean addTask(Task task);
	public boolean deleteTask(String id);
	public boolean updateTask(Task task);
	public boolean setTaskPriority(String taskId, int priority);
	public boolean setTaskStatus(String taskId, int status);
}
