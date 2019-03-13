package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.dao.AddUserDAO;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class AddUserDataProviders {

	@DataProvider(name = "db-inputs")
	public Object[][] getDBData() {

		List<LoginBean> list = new AddUserDAO().getLogins();

		Object[][] result = new Object[list.size()][];
		int count = 0;
		for (LoginBean temp : list) {
			Object[] obj = new Object[8];
			obj[0] = temp.getUserName();
			obj[1] = temp.getPassword();
			obj[2] = temp.getfirstName();
			obj[3] = temp.getlastName();
			obj[4] = temp.getEmail();
			obj[5] = temp.getPhone();
			obj[6] = temp.getUserName1();
			obj[7] = temp.getPassword1();

			result[count++] = obj;
		}

		return result;
	}

	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData() {
		String fileName = "C:\\Users\\IBM_ADMIN\\Documents\\ECLIPSE\\workspace1\\GITHUB\\Test Data Anitha.xlsx";
		return new ApachePOIExcelRead().getExcelContent(fileName);
	}

	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData() {
		// ensure you will have the title as first line in the file
		return new ReadExcel().getExcelData("C:/Users/Naveen/Desktop/Testing.xls", "Sheet1");
	}
}
