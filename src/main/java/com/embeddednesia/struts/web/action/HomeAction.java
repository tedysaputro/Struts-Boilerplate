package com.embeddednesia.struts.web.action;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.embeddednesia.struts.service.TaskService;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport{
    private static final Log LOG = LogFactory.getLog(HomeAction.class);

	@Autowired
	private TaskService taskService;
	public String execute() {
		LOG.debug("run home:"+taskService.findAllOpenTasksCount());
		return "success";
	}
}
