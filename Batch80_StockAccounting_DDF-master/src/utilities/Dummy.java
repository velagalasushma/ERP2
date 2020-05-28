package utilities;

import CommonFunLibrary.ERP_Functions;

public class Dummy {

	public static void main(String[] args) throws Exception {
		ERP_Functions erp=new ERP_Functions();
		erp.lanchAPP("http://webapp.qedge.com/login.php");
		erp.login("admin", "master");
		String result=erp.supplier("Amazon", "hyderabad", "hyderabad", "INDIA", "VIKRAM", "8602236766", "XXX.GMAIL.COM", "8602236766", "TESTING");

	}

}
