package com.vektorel;

public class RunnerMantikOperatorleri {

	public static void main(String[] args) {
					
		// && ve
		// VE operatoru ile baglanan tum durumlar
		// dogru(true) olusu zaman calisir.
		
		int not1, not2, ortalama;
		not1 = 45;
		not2 = 78;
		ortalama = (not1+not2)/2;
		
		// AA 90 - 100
		// CC 50 - 65
		
		System.out.println(ortalama>=50 && ortalama<=65);
		
		String kullaniciadi = "admin";
		String sifre = "ArtYmxw22*/?";
		int yetkidurumu = 1;
		boolean aktif = true;
		
		System.out.println( kullaniciadi=="admin"
						 && sifre=="ArtYmxw22*/?"
						 && yetkidurumu==2
						 && aktif==true);
		
		
		
		
	}

}
