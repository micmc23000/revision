/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.micmc23000.attempttowork.controllers;

import com.micmc23000.attempttowork.models.Agent;
import com.micmc23000.attempttowork.service.AgentFacadeREST;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMsg;
import com.techprimers.rest.resthateoas.model.Users;
import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.ws.rs.QueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Michael
 */
@RestController
@RequestMapping("/agent")
public class AgentRestController {
    
       @Autowired 
       AgentFacadeREST service;
    private String errorMsg;
    
    
    
    @GetMapping("/all")
    public List<Agent> getAll() {
        List<Agent> agentList = service.findAll();



        return agentList;
    }

  
    
    @GetMapping("/view{id}")
    public ModelAndView diplayAgent(@QueryParam("id") String id){
   
   Agent a=service.find(id);
    return new ModelAndView("displayAgent","agent",a);
    }
 
@GetMapping("/add")
public ModelAndView viewAddAgentForm(){return new ModelAndView("addAgent","agent", new Agent()); }
   

@PostMapping("/addAgent")
public ModelAndView addAgent(@Valid @ModelAttribute("Agent") Agent agent,
BindingResult result,HttpSession session, HttpServletRequest request){
  if(result.hasErrors()){   
      errorMsg ="failed to create new agent";
return new ModelAndView("redirect:/error");
  }
       service.create(agent);
return new ModelAndView("allAgents", "agentList", service.findAll());
       
    }
    
    
    

   
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
