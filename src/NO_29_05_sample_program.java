public class NO_29_05_sample_program {

	// 学生情報を表すrecord 
	public record Student(int student_number, String student_name_jp) {
	}

	// 教員情報を表すrecord 
	public record Teacher(int teacher_number, String teacher_name_jp) {
	}

	public static void main(String[] args) {

		// Object型として Studentを保存する 
		Object sample_object = new Student(1001, "田中"); //Student 型を作った 

		// Object型の中身を switchで判定する 
		switch (sample_object) {

		// Student型なら、学生番号と学生氏名を取り出す 
		// sample_object が Student 型なら、 →今回は、これに該当 
		// Student の 1 番目の値をsample_student_number へ入れる。➔1001 
		// Student の 2 番目の値をsample_student_name_jp へ入れる。➔田中 
		// そして { } の中を実行する。 
		case Student(var sample_student_number, var sample_student_name_jp) -> {
			System.out.println("学生番号：" + sample_student_number);
			System.out.println("学生氏名：" + sample_student_name_jp);
		}

		// Teacher型なら、教員番号と教員氏名を取り出す 
		// sample_object が Teacher型なら、 
		// Teachert の1 番目の値をsample_teacher_number へ入れる。 
		// Teachert の2 番目の値をsample_teacher_name_jp へ入れる。 
		// そして { } の中を実行する。 
		case Teacher(var sample_teacher_number, var sample_teacher_name_jp) -> {
			System.out.println("教員番号：" + sample_teacher_number);
			System.out.println("教員氏名：" + sample_teacher_name_jp);
		}
		// どちらでもない場合の処理 
		default -> {
			System.out.println("未対応のデータです。");
		}
		}
	}
}
