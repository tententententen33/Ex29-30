//このサンプル・プログラムでは、以下の流れになっています。 
//メソッド1 で「正体不明のオブジェクト（実はStudent型の学籍番号と学生名）」を作成 
//メソッド2 は、どんなオブジェクト型が来るか（Student型か、Teacher型か）不明 
//なので、一番広いObject 型で受け取り、データ型を解析する。 
public class NO_29_02_sample_program {

	// 学生情報を定義するrecord。 この瞬間、コンストラクタや 
	public record Student( // アクセサメソッドが自動生成される 
			int student_number,String student_name_jp) {
	}

	// メソッド1（create_sample_data）の処理内容： 
	// 「Student型オブジェクト」を作る。メソッド2(analyze_sample_data)は、 
	// Object型として受け取るため、実際の型を確認する必要がある 
	public static Object create_sample_data() {

		// 今回はStudent オブジェクトを返す。ただし、受け取るメソッド2側は 
		// Object型として受け取る 
		return new Student(1001,"田中");
	} // メソッド1（create_sample_data）の終わり 

	// メソッド2（analyze_sample_data）の処理内容： 
	// Object型として受け取ったデータを処理する。 
	// Object型は、様々な種類のオブジェクトが入る可能性がある 
	public static void analyze_sample_data(Object sample_object) {
		// 受け取ったデータが Student型か確認し、 
		// 同時に学籍番号と学生名を取り出す 
		if (sample_object instanceof Student(int sample_student_number, String sample_student_name_jp)) {

			// 取り出した学籍番号を表示する 
			System.out.println(sample_student_number);

			// 取り出した学生名を表示する 
			System.out.println(sample_student_name_jp);
		}
	} // メソッド 2（analyze_sample_data）の終わり 

	public static void main(String[] args) {

		// メソッド1（create_sample_data）で、「Student型のオブジェクト」を作る 
		Object sample_object = create_sample_data();

		// メソッド2（analyze_sample_data）は、「型が不明のオブジェクト」を 
		// Object型として処理する 
		analyze_sample_data(sample_object);
	}
}
