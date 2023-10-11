package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO{


    //define a field for entity manager
    private EntityManager entityManager;

    //set up constructor injection
    @Autowired
    public EmployeeDAOJPAImpl(EntityManager theEntityManager){
        entityManager=theEntityManager;
    }
    @Override
    public List<Employee> findAll() {

        //create a query
        TypedQuery<Employee> theQuery=entityManager.createQuery("from Employee",Employee.class);

        //execute a query and get the result list
        List<Employee> employees=theQuery.getResultList();

        //return the results
        return employees;
    }

    @Override
    public Employee findById(Integer id) {

//        get the employee
        Employee theEmployee=entityManager.find(Employee.class,id);

        //return the employee
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        //save dbemployee
        Employee dbEmployee= entityManager.merge(theEmployee);

        //return dbemployee
        return dbEmployee;
    }

//    @Override
//    public void deleteById(Integer id) {
//        //find the employee by id
//        Employee theEmployee=entityManager.find(Employee.class,id);
//
//
//        //remove employee
//        entityManager.remove(theEmployee);
//    }
}
