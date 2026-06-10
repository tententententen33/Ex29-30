public class NO_29_07_sample_program {

	// 住所情報を表すrecord 
	public record Address(String postal_code, String address_name_jp) {
	}

	// 学生情報を表すrecord。Addressを内部に持つ 
	public record Student(int student_number, String student_name_jp, Address student_address) {
	}

	public static void main(String[] args) {

		// Studentレコードを Object型として保存する 
		Object sample_object = new Student(1001, "田中", new Address("790-0001",
				"愛媛県松山市"));

		// Student型か確認し、さらに内部の Addressから郵便番号と住所名を取り出す 
		// Address の中の変数名は、(var aaa, var bbb)でもよい 
		if (sample_object instanceof Student(var sample_student_number, var sample_student_name_jp, Address(var sample_postal_code, var sample_address_name_jp))) {

			// Addressから取り出した郵便番号を表示する 
			System.out.println(sample_postal_code);

			// Addressから取り出した住所名を表示する 
			System.out.println(sample_address_name_jp);
		}
	}
}