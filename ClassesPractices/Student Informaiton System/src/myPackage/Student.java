package myPackage;

public class Student {

	
	    String name ;
	    String stuNo;
	    int classes;
	    Course mat;
	    Course fizik;
	    Course kimya;
	    double average;
	    boolean isPass;
	    
	    
		public Student(String name,  int classes,String stuNo, Course mat, Course fizik, Course kimya) {
			super();
			this.name = name;
			this.stuNo = stuNo;
			this.classes = classes;
			this.mat = mat;
			this.fizik = fizik;
			this.kimya = kimya;
			calcAverage() ;
			this.isPass = false;
		}
	
	
	
		
		public void calcAverage() {
			
			int finalFizikNote= (this.fizik.note*4 + this.fizik.quizNote*1)/5 ;
			int finalKimyaNote =  (this.kimya.note*4 + this.kimya.quizNote*1)/5 ;
			int finalMatNote = (this.mat.note*4 + this.mat.quizNote*1)/5;
	        this.average = ( finalFizikNote+ finalKimyaNote+finalMatNote) / 3;
	    }
		
		
		
		public void addBulkExamNote(int mat, int fizik, int kimya) {

	        if (mat >= 0 && mat <= 100) {
	            this.mat.note = mat;
	            
	        }

	        if (fizik >= 0 && fizik <= 100) {
	            this.fizik.note = fizik;
	        }

	        if (kimya >= 0 && kimya <= 100) {
	            this.kimya.note = kimya;
	        }

	    }
		
		public void addBulkQuizNote(int mat, int fizik, int kimya) {

	        if (mat >= 0 && mat <= 100) {
	            this.mat.quizNote = mat;
	            
	        }

	        if (fizik >= 0 && fizik <= 100) {
	            this.fizik.quizNote = fizik;
	        }

	        if (kimya >= 0 && kimya <= 100) {
	            this.kimya.quizNote = kimya;
	        }

	    }
		
		
		
		 public void isPass() {
		        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
		            System.out.println("Notlar tam olarak girilmemiş");
		        } else {
		            this.isPass = isCheckPass();
		            printNote();
		            System.out.println("Ortalama : " + this.average);
		            if (this.isPass) {
		                System.out.println("Sınıfı Geçti. ");
		            } else {
		                System.out.println("Sınıfta Kaldı.");
		            }
		        }
		    }
		 
		 public boolean isCheckPass() {
		        calcAverage();
		        return this.average > 55;
		    }
		 
		 public void printNote(){
		        System.out.println("=========================");
		        System.out.println("Öğrenci : " + this.name);
		        System.out.println("Matematik sınav ve quiz Notu : " + this.mat.note+ "  "+this.mat.quizNote);
		        System.out.println("Fizik sınav ve quiz Notu : " + this.fizik.note+ "  "+this.fizik.quizNote);
		        System.out.println("Kimya sınav ve quiz Notu : " + this.kimya.note+ "  "+this.kimya.quizNote);
		    }
		
		
}
