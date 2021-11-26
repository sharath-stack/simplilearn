package simplilearn;

import java.io.File;
import java.util.Scanner;

public class LokedMe {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("WELCOME TO LokedMe \t this code is writen by KANCHARLA SHARATH REDDY");
		boolean d=true;
		do {
		System.out.println("Main Menu");
		System.out.println("select your option from below list");
		System.out.println("1.Display all files\n2.File operations\n3.Exit");
		int choice=scan.nextInt();
		switch(choice) {
		case 1:
			File ob = new File("D:\\main\\");
		    File array[] =ob.listFiles();
		    for(int i=0;i<array.length;i++) {
		    	System.out.println(array[i]);
		      }
		case 2:
			do{
			System.out.println("select your file operation");
			System.out.println("1.Add file\n 2. Delete file\n 3.search file\n4.return to previous menu\n5. exit");
			int choice1=scan.nextInt();
			switch(choice1) {
			case 1:
				System.out.println("enter your file name");
				String name11="D:\\main\\";//I HAVE ADDED "name11" String because i want to use this directory as default 
				
				String name=scan.next();
				File folder=new File(name11+name);
				// if you want to specify your own directory means you should remove "name11" is above FILE statement
				folder.mkdir();
			case 2:
				System.out.println("enter your file name to delete ");
				String n1=scan.next();
				String n2="D:\\main\\";//I HAVE ADDED "n2" String because i want to use this directory as default 
			
				File folder1=new File(n2+n1);// if you want to specify your own directory means you should remove "n2" is above FILE statement
				folder1.delete();
			case 3:
				System.out.println("enter starting letters of file which you want to search");
				String name1=scan.next();
				File ob1= new File("D:\\main\\"); 
				
			    File array1[] =ob1.listFiles();
				 for(int i=0;i<array1.length;i++) {
					    
				    	if(array1[i].getName().startsWith(name1)) {
				    		System.out.println(array1[i]);
				    	}
				      }
			case 4:
				break;
				
   			case 5:d=false;
			default:
			}
			}while(d);
		case 3:
			System.out.println("Application closing");
			d=false;
		default:
		 }
		}while(d);
		scan.close();
	}

}
