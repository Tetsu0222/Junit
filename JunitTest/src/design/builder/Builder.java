package design.builder;

import java.util.List;

public abstract class Builder {

	//ヘッダーの生成
	public abstract void makeHeader();
	
	//一覧生成
	public abstract void makeEmployeeList( List<Employee> employeeList );
	
}