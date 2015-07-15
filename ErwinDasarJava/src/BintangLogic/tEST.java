package BintangLogic;

import java.util.Scanner;

public class tEST {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        System.out.print("Masukkan Angka : ");
	        int input = scan.nextInt();
	// dibawah ini adalah penyeleksian agar hanya angka 10 kebawah yang bisa diproses
	        if (input <= 10)
	        {
	// jika angka sudah dibawah 10, disini dimulai pengulangan sejumlah angka yang dimasukkan
	            for (int i=1; i <= input ; i++)
	            {
	//disini diseleksi untuk angka yang berada di baris tengah, bukan baris 1 dan bukan baris terakhir
	                if (i != 1 && i != input)
	                {
	//angka kembali diulang berdasarkan angka yang diinputkan 
	                     for (int j=1; j <= input ; j++)
	                    {
	//penyeleksian kembali supaya kolom yang ada ditengah, yaitu kolom yang bukan pertama dan bukan kolom terakhir  berisikan spasi
	                        if (j>1 && j<input)
	                        {
	                            System.out.print(" ");
	                        }
	                            else
	                            {
	//sedangkan kolom pertama dan terakhir berisikan bintang
	                                System.out.print("*");
	                            }
	                    }
	                }
	//setelah itu, baris pertama dan terakhir diisikan bintang
	                else
	                {
	                    for (int x=1; x <= input ; x++)
	                    {
	                        System.out.print("*");
	                    }
	                }

	                System.out.println("");
	            }
	        }
	//jika input lebih dari 10, maka akan ditampilkan tulisan dibawah ini
	        else
	        {
	            System.out.println("Masukkan angka 1-10");
	        }
	   
	

	}

}
