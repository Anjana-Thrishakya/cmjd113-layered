/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.controller;


import edu.ijse.layered.dto.CustomerDto;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author anjana
 */
public class CustomerController {
    
    private final CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
    
    public CustomerController () throws Exception{
        
    }
   
    
    public String saveCustomer(CustomerDto dto) throws Exception{
        String resp = customerService.saveCustomer(dto);
        return resp;
    }
    
    public String updateCustomer(CustomerDto dto) throws Exception{
        String resp = customerService.updateCustomer(dto);
        return resp;
    }
    
    public String deleteCustomer(String customerId) throws Exception{
        String resp = customerService.deleteCustomer(customerId);
        return resp;
    }
    
    public CustomerDto searchCustomer(String customerId) throws Exception{
        CustomerDto dto = customerService.searchCustomer(customerId);
        return dto;
    }
    
    public ArrayList<CustomerDto> findAllCustomer() throws Exception{
        ArrayList<CustomerDto> dtos = customerService.getAll();
        return dtos;
    }
}
