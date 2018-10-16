package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    private SearchFacade searchFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void searchCompanyTest() throws SearchException{
        //Given
        Company techland = new Company("Techland");
        Company ubisoft = new Company("Ubisoft");
        Company theFarm51 = new Company("The farm 51");

        //When
        companyDao.save(techland);
        int techlandId = techland.getId();
        companyDao.save(ubisoft);
        int ubisoftId = ubisoft.getId();
        companyDao.save(theFarm51);
        int theFarm51Id = theFarm51.getId();

        List<Company> search51 = searchFacade.findCompanyByAnyLetters("51");
        List<Company> searchSoft = searchFacade.findCompanyByAnyLetters("soft");
        List<Company> searchA = searchFacade.findCompanyByAnyLetters("a");

        //Then
        Assert.assertEquals(1, search51.size());
        Assert.assertEquals(1, searchSoft.size());
        Assert.assertEquals(2, searchA.size());

        //Clean Up
        companyDao.delete(techlandId);
        companyDao.delete(ubisoftId);
        companyDao.delete(theFarm51Id);
    }

    @Test
    public void searchEmployeeTest() throws SearchException {
        //Given
        Employee oliwia = new Employee("Oliwia", "Oliwkowa");
        Employee patrycja = new Employee("Patrycja", "Patkowa");
        Employee zuzanna = new Employee("Zuzanna", "Zuzia");

        //When
        employeeDao.save(oliwia);
        int oliwiaId = oliwia.getId();
        employeeDao.save(patrycja);
        int patrycjaId = patrycja.getId();
        employeeDao.save(zuzanna);
        int zuzannaId = zuzanna.getId();

        List<Employee> searchA = searchFacade.findEmployeeAnyLetters("a");

        //Then
        Assert.assertEquals(3, searchA.size());

        //Clean Up
        employeeDao.delete(oliwiaId);
        employeeDao.delete(patrycjaId);
        employeeDao.delete(zuzannaId);
    }
}
