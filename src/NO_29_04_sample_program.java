public class NO_29_04_sample_program {

	// 学生情報を表すrecord 
	public record Student(int student_number, String student_name_jp) {
	}

	// 教員情報を表すrecord 
	public record Teacher(int teacher_number, String teacher_name_jp) {
	}

	public static void main(String[] args) {

		// Object型として Studentを保存する 
		Object sample_object = new Student(1001, "田中"); // Student 型を作った 

		// Student型なら学生情報として処理する。Student 型を作ったので、当然、true 
		if (sample_object instanceof Student(var sample_student_number, var sample_student_name_jp)) {
			System.out.println("学生番号：" + sample_student_number);
			System.out.println("学生氏名：" + sample_student_name_jp);

			// Teacher型なら教員情報として処理する 
		} else if (sample_object instanceof Teacher(var sample_teacher_number, var sample_teacher_name_jp)) {
			System.out.println("教員番号：" + sample_teacher_number);
			System.out.println("教員氏名：" + sample_teacher_name_jp);
		}
	}
}
