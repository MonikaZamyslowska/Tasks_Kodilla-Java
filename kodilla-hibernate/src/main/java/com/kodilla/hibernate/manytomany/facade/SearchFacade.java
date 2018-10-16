package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SearchFacade {
    @Autowired
    private CompanyDao company;
    @Autowired
    private EmployeeDao employee;
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public List<Company> findCompanyByAnyLetters (final String partOfName) throws SearchException {
        LOGGER.info("Searching Company by part of Name: " + partOfName);
        if (partOfName.length() == 0) {
            LOGGER.error(SearchException.ERR_SUBSTRINGS_HAS_ZERO_LETTER);
            throw new SearchException(SearchException.ERR_SUBSTRINGS_HAS_ZERO_LETTER);
        }
        List<Company> companies = company.retrieveCompanyByPartOfName(partOfName);
        if (companies.size() == 0) {
            LOGGER.error(SearchException.ERR_NOT_FOUND_COMPANY);
            throw new SearchException(SearchException.ERR_NOT_FOUND_COMPANY);
        }
        LOGGER.info(companies.size() + " companies were successfully found.");
        return companies;
    }

    public List<Employee> findEmployeeAnyLetters (final String partOfName) throws SearchException {
        LOGGER.info("Searching Employee by part of LastName: " + partOfName);
        if (partOfName.length() == 0) {
            LOGGER.error(SearchException.ERR_SUBSTRINGS_HAS_ZERO_LETTER);
            throw new SearchException(SearchException.ERR_SUBSTRINGS_HAS_ZERO_LETTER);
        }
        List<Employee> employees = employee.retrieveEmployeeByPartOfName(partOfName);
        if (employees.size() == 0) {
            LOGGER.error(SearchException.ERR_NOT_FOUND_EMPLOYEE);
            throw new SearchException(SearchException.ERR_NOT_FOUND_EMPLOYEE);
        }
        LOGGER.info(employees.size() + " employees were successfully found.");
        return employees;
    }





}
