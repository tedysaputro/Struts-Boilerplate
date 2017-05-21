package com.embeddednesia.struts.impl;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.embeddednesia.struts.model.Task;
import com.embeddednesia.struts.service.TaskService;

@Service("AnnoatedTaskService")
@Primary
public class TaskServiceImpl implements TaskService{

	@Override
	public Task createTask(Task task) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task createTask(String name, int priority, Long createdByuserId, Long assigneeUserId, String comments) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task findTaskById(Long taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> findTasksByAssignee(Long assigneeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> findAllTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findAllTasksCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Task> findAllOpenTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> findAllClosedTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findAllOpenTasksCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Task> findTasksByAssignee(String assigneeUserName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> findOpenTasksByAssignee(Long assigneeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> findOpenTasksByAssignee(String assigneeUserName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> findClosedTasksByAssignee(Long assigneeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> findClosedTasksByAssignee(String assigneeUserName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void completeTask(Long taskId, String comments, Long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reassignTask(Long taskId, String comments, Long assigneeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTask(Long taskId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFile(Long taskId, String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFile(Long taskId, Long fileId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllFiles(Long taskId) {
		// TODO Auto-generated method stub
		
	}

}
