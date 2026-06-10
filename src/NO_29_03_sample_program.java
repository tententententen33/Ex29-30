public class NO_29_03_sample_program {

	// 学生情報を表すrecord 
	public record Student(
			int student_number,String student_name_jp) {
	}

	public static void main(String[] args) {

		// Studentオブジェクトを Object型として保存 
		Object sample_object = new Student(1002,"佐藤");

		// Student型か確認しながら 
		// 値を取り出す 
		if (sample_object instanceof Student(var sample_student_number, var sample_student_name_jp)) {

			// 学生番号を表示 
			System.out.println(sample_student_number);

			// 氏名を表示 
			System.out.println(sample_student_name_jp);
		}
	}
}