package com.embeddednesia.struts.action;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.embeddednesia.struts.service.TaskService;

public class HomeAction {
    private static final Log LOG = LogFactory.getLog(HomeAction.class);

	@Autowired
	private TaskService taskService;
	public String execute() {
		LOG.debug("run home:"+taskService.findAllOpenTasksCount());
		return "success";
	}
}
