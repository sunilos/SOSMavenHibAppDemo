package in.co.sunrays.hibernate.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import in.co.sunrays.hibernate.model.CustomerModel;
import in.co.sunrays.hibernate.pojo.rel.CustomerPOJO;
import in.co.sunrays.hibernate.pojo.rel.PhonePOJO;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Test program of CustomerModel
 * 
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS 
 */
public class CustomerModelTest {

	CustomerModel model = new CustomerModel();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Customer setUpBeforeClass is called");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Customer tearDownAfterClass is called");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Customer setUp is called");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Customer tearDown is called");
	}

	@Test
	public void testAdd() throws Exception {
		PhonePOJO phonePOJO = new PhonePOJO();
		phonePOJO.setPhonenumber(88175453l);
		CustomerPOJO customerpojo = new CustomerPOJO();
		customerpojo.setCompanyName("ncs1");
		customerpojo.setFirstName("test");
		customerpojo.setLastName("test");
		customerpojo.setContactNo(9992345624l);
		customerpojo.setAddress("Sanver Road");
		customerpojo.setPhones(phonePOJO);
		CustomerPOJO customerpojo1 = new CustomerPOJO();
		customerpojo1.setCompanyName("ncs2");
		customerpojo1.setFirstName("test");
		customerpojo1.setLastName("test");
		customerpojo1.setContactNo(8817982453l);
		customerpojo1.setAddress("Sanver Road");
		customerpojo1.setPhones(phonePOJO);
		long pk = model.add(customerpojo);
		long pk1 = model.add(customerpojo1);
		customerpojo = model.findByPK(pk);
		customerpojo1 = model.findByPK(pk1);
		assertNotNull("Error : Customer Add Fail", customerpojo);
	}

	@Test
	public void testUpdate() throws Exception {

		CustomerPOJO pojo = model.findByPK(1l);

		pojo.setFirstName("Alok");
		pojo.setLastName("Mishra");
		model.update(pojo);
		CustomerPOJO updatedPOJO = model.findByPK(1l);

		assertEquals("Error : Customer Update Fail", pojo.getValue(),
				updatedPOJO.getValue());

	}

	@Ignore
	public void testDelete() throws Exception {
		CustomerPOJO pojo = new CustomerPOJO();
		pojo.setId(2l);
		model.delete(pojo);

		pojo = model.findByPK(pojo.getId());

		assertNull("Error : Delete Test Fail", pojo);

		System.out.println("Success : Customer Delete Success");
	}

	@Ignore
	public void testFindByPK() throws Exception {

		CustomerPOJO pojo = model.findByPK(1l);

		assertNotNull("Error : Customer Get By Id Fail", pojo);

		if (pojo != null) {

			System.out.println(pojo.getId());
			System.out.println(pojo.getFirstName());
			System.out.println(pojo.getLastName());
			System.out.println(pojo.getCompanyName());
			System.out.println(pojo.getAddress());
			System.out.println(pojo.getContactNo());
		}

	}

	@Test
	public void testSearchCustomerPOJO() throws Exception {

		CustomerPOJO pojo = new CustomerPOJO();
		pojo.setCompanyName("ncs");

		List<CustomerPOJO> list = model.search(pojo);

		assertTrue("Error : Customer Search Fail", list.size() > 0);

	}

}
