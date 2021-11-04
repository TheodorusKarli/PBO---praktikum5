import java.util.Scanner;

public class Aksi {
	public static void main (String args[]){
		String NIK, Nama, JenisKelamin;
		int Umur = 0;
		String NIM, Fakultas, Jurusan;
		double Tugas1, Tugas2, Tugas3;
		double UTS, UAS = 0;
		double hasil;
		
		Mahasiswa MHS = new Mahasiswa();
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Masukkan NIK : ");
		NIK = SC.nextLine();
		System.out.print("Masukkan Nama Anda : ");
		Nama = SC.nextLine();
		System.out.println("Masukkan Jenis Kelamin : ");
		JenisKelamin = SC.nextLine();
		System.out.println("Masukkan Umur : ");
		NIM = SC.nextLine();
		SC.nextLine();
		System.out.println("Masukkan Fakultas : ");
		Fakultas = SC.nextLine();
		System.out.println("Masukkan Jurusan : ");
		Jurusan = SC.nextLine();
		
		
		System.out.println("Masukkan TGS1");
		Tugas1 = SC.nextDouble();
		System.out.println("Masukkan TGS2");
		Tugas2 = SC.nextDouble();
		System.out.println("Masukkan TGS3");
		Tugas3 = SC.nextDouble();
		System.out.println("Masukkan UTS : ");
		UTS = SC.nextDouble();
		System.out.println("Masukkan UAS : ");
		UTS = SC.nextDouble();
		
		MHS.identitas(NIK, Nama, JenisKelamin, Umur);
		MHS.dataMahasiswa(NIM, Fakultas, Jurusan);
		MHS.nilaiMahasiswa(Tugas1, Tugas2, Tugas3, UTS, UAS);
		
	}
		
}