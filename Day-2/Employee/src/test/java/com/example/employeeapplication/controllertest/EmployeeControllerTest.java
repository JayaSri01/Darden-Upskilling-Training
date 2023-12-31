package com.example.employeeapplication.controllertest;

import org.junit.jupiter.api.Test;
import static org.mockito.BDDMockito.*;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static  org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;

import static org.hamcrest.CoreMatchers.*;

import com.example.employeeapplication.entity.Employee;
import com.example.employeeapplication.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest
public class EmployeeControllerTest {
	
	@Autowired
	private MockMvc mockmvc;
	
	
	@MockBean
	private EmployeeService employeeservice;
	
	@Autowired
	private ObjectMapper mapper;
	
	
	@Test
	public void employeeAddTest() throws Exception {
		
		Employee employee=Employee.builder()
				.id(1)
				.firstname("jaya")
				.lastname("sri")
				.role("analyst")
				.build();
		
		Mockito.when(employeeservice.adds(Mockito.any(Employee.class))).thenReturn(employee);

		
		ResultActions response=mockmvc.perform(post("/save")
				.contentType(MediaType.APPLICATION_JSON)
				.content(mapper.writeValueAsString(employee)));
		
		response.andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.jsonPath("$.id", is(employee.getId())))
		   .andExpect(MockMvcResultMatchers.jsonPath("$.firstname", is(employee.getFirstname())))
		   .andExpect(MockMvcResultMatchers.jsonPath("$.lastname", is(employee.getLastname())))
		   .andExpect(MockMvcResultMatchers.jsonPath("$.role", is(employee.getRole())));
	}
	
	
    @Test
    public void getAllTest()throws Exception {
    	List<Employee> list= new ArrayList<>();
       list.add(Employee.builder().id(3).firstname("bhavani").lastname("sri").role("Sranalyst").build());
       list.add(Employee.builder().id(3).firstname("veni").lastname("sri").role("analyst").build());
       given(employeeservice.getAllEmp()).willReturn(list);
       ResultActions response=mockmvc.perform(get("/getall"));
       
       response.andExpect(MockMvcResultMatchers.status().isOk())
       .andDo(print())
       .andExpect( MockMvcResultMatchers.jsonPath("$.size()", is(list.size())));

    }
    
    @Test
    public void getEmpById()throws Exception  {
    	 int id=2;
    	 
    	 Employee employee=Employee.builder()
 				.id(1)
 				.firstname("jaya")
 				.lastname("sri")
 				.role("analyst")
 				.build();
    	 
    	given(employeeservice.getById(id)).willReturn(employee);
    	 
    	 
    	ResultActions response=mockmvc.perform(get("/get/{id}",id));
    	
    	response.andExpect(status().isOk())
    	.andDo(print())
    	.andExpect(MockMvcResultMatchers.jsonPath("$.id", is(employee.getId())))
	    .andExpect(MockMvcResultMatchers.jsonPath("$.firstname", is(employee.getFirstname())))
		.andExpect(MockMvcResultMatchers.jsonPath("$.lastname", is(employee.getLastname())))
		.andExpect(MockMvcResultMatchers.jsonPath("$.role", is(employee.getRole())));
	
    }
    
    
    @Test
    public void updateEmployeeTest()throws Exception {
    	
    	int id=4;
    	
    	Employee saveemployee=Employee.builder()
    			.firstname("jaswik")
    			.lastname("Tej")
    			.role("Sranalyst")
    			.build();
    	Mockito.when(employeeservice.update(Mockito.anyInt(), Mockito.any(Employee.class)))
        .thenReturn(saveemployee);

 // Perform the update request
    	ResultActions response=mockmvc.perform(MockMvcRequestBuilders.put("/update/{id}", 4)
         .contentType(MediaType.APPLICATION_JSON)
         .content(mapper.writeValueAsString(saveemployee)));
    	
    	
    	response.andExpect(MockMvcResultMatchers.status().isOk());
  	
    }
    
    @Test
    public void deleteTest()throws Exception {
    	int id=1;
    	willDoNothing().given(employeeservice).delete(id);
    	ResultActions response=mockmvc.perform(delete("/delete/{id}",id));
    	response.andExpect(status().isOk())
    	        .andDo(print());
    }
		          
	}
	


