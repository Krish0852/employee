package Client;

public class EmpApp {
public static void main (String[] args) {
	EmpServiceImp obj=new EmpServiceImp();
	obj.dbConnection();
	obj.updateEmpSal();
}
}
