package design.builder;

import java.util.List;

public class Director {
	
	
	//Builderのサブクラスであれば受け入れられるように指定
	private Builder bulider;
	
	//コンストラクタ
	public Director( Builder bulider ) {
		super();
		this.bulider = bulider;
	}
	
	//インスタンス生成
	//buliderのメソッドで処理を呼び出しているため、それのどのサブクラスかを知る必要がない。
	public void construct( List<Employee> employeeList ) {
		
		//ヘッダーの生成
		bulider.makeHeader();
		
		//一覧の作成
		bulider.makeEmployeeList( employeeList );
	}

}
