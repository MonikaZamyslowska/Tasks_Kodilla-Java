package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product computer = new Product("Computer");

        Item item = new Item(new BigDecimal(123456), 10, new BigDecimal(1234560));
        Item item1 = new Item(new BigDecimal(1000), 2, new BigDecimal(2000));

        Invoice invoice = new Invoice("AA123");

        computer.getItems().add(item);
        computer.getItems().add(item1);

        invoice.getItems().add(item);
        invoice.getItems().add(item1);

        item.setProduct(computer);
        item1.setProduct(computer);

        item.setInvoice(invoice);
        item1.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int numberId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, numberId);

        //CleanUp
        invoiceDao.delete(numberId);
    }
}
