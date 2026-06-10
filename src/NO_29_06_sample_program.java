public class NO_29_06_sample_program {

	// 住所情報を表すrecord 「郵便番号」と「住所」 
	public record Address(String postal_code, String address_name_jp) {
	}

	// 学生情報を表すrecord。3番目の項目はAddress 型の変数,student_addressである 
	// Address には郵便番号(String postal_code)と,住所(String address_name_jp)がある 
	public record Student(int student_number, String student_name_jp, Address student_address) {
	}

	public static void main(String[] args) {

		// 住所情報を作成する 
		Address sample_address = new Address("790-0001", "愛媛県松山市");

		// 学生情報を作成し、住所情報も一緒に持たせる 
		Student sample_student = new Student(1001, "田中", sample_address);

		// StudentからAddressを取り出す 
		Address sample_result_address = sample_student.student_address();

		// Addressから郵便番号を取り出して表示する 
		System.out.println(sample_result_address.postal_code());

		// Addressから住所名を取り出して表示する 
		System.out.println(sample_result_address.address_name_jp());
	}
}