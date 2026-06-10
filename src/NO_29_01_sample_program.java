//このサンプル・プログラムでは、以下の流れになっています。 
//メソッド1で「正体不明のオブジェクト（実はStudent型の学籍番号と学生名）」を作成 
//メソッド2は、どんなオブジェクト型が来るか（Student型か、Teacher型か）不明 
//なので、一番広いObject 型で受け取り、データ型を解析する。 
public class NO_29_01_sample_program {

	// 学生情報を定義する record この瞬間、以下のコンストラクタが 
	public record Student( //自動的に生成される(record の基本動作) 
			int student_number, //this.student_number=student_number 
			String student_name_jp) { //this.student_name_jp=student_name_jp 
	}

	// メソッド1（create_sample_data）の処理内容： 
	//「Student型オブジェクト」を作る。メソッド2(analyze_sample_data)は、 
	// Object型として受け取るため、最初は中身を知らない。 
	public static Object create_sample_data() {

		// 今回は、Student オブジェクトを返す。ただし、受け取るメソッド 2側は 
		// Object型として受け取るので、中身がStudent型か、Teacher 型かどうか 
		// 確認する必要がある 
		return new Student(1001,"田中");
	} // メソッド 1（create_sample_data）の終わり 

	// メソッド2（analyze_sample_data）の処理内容： 
	// Object型として受け取ったデータを処理する。 
	// Object型は、様々な種類のオブジェクトが入る可能性がある 
	public static void analyze_sample_data(Object sample_object) {

		// 受け取ったデータが Student型かどうか確認する（型判定する） 
		// Teacher型かも知れないし、Student型かも知れない 
		if (sample_object instanceof Student) {

			// Object型をStudent型に変換（キャスト）し、変数、sample_student 
			// に入れて、Student型として使う 
			Student sample_student = (Student) sample_object;
			// 学生番号を表示する（アクセッサ・メソッドの呼び出し） 
			System.out.println(sample_student.student_number());

			// 氏名を表示する（アクセッサ・メソッドの呼び出し） 
			System.out.println(sample_student.student_name_jp());
		}
	} // メソッド 2（analyze_sample_data）の終わり 

	public static void main(String[] args) {

		// メソッド 1（create_sample_data）で、「Student 型のオブジェクト」を作る。 
		// しかし、メソッド 2には、「型が不明のオブジェクト」である 
		Object sample_object = create_sample_data();

		// メソッド 2（analyze_sample_data）は、「型が不明のオブジェクト」を 
		// Object型として処理する 
		analyze_sample_data(sample_object);
	}
}
