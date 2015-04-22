public class pertama {
	

	
	public static void aritmatika()
	{
		 int a=5,b=2,c=4;
	        double d=0;
	       
	        System.out.println("\n OPERASI ARITMATIKA \n");
	        //tambah
	        c=a+b;
	        System.out.println("Penjumlahan =  "+a+"+"+b+"="+c);
	        //kurang
	        c=a-b;
	        System.out.println("Pengurangan =  "+a+"-"+b+"="+c);
	        //kali
	        c=a*b;
	        System.out.println("Pengurangan =  "+a+"*"+b+"="+c);
	        //bagi
	        d=(double)a/b;
	        System.out.println("Pengurangan =  "+a+"/"+b+"="+d);
	        //modulus
	        c=a%b;
	        System.out.println("Sisa bagi =  "+a+"mod"+b+"="+c);
	        
	}
	
	public static void biodata()
	{
		String name ="A.ST.Hasna Ilyas";
		String nim ="60200112021";
		System.out.println("Nama "+name+ "\nNim  "+nim);
	}

public static void main(String[] args) {
        
		biodata();
        aritmatika();

    }

}
