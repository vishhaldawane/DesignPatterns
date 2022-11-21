public interface Shape
{
	void draw();
	
	default void fun() {
		
	}
	
}/*

1 exclusive
2 inherited
3 overridden
4 implemented


		class Doctor {
			void diagnose() { } //1
			void chargeFees() { // 70/80  } //overridden
		}
		
		interface Surgery {
			void cut();
			void stitch() ;
			void default localAnasthetia() { }  
		}
		class Surgeon extends Doctor implements Surgery {
				//2. diagnose is inherited
				 
				 void chargeFees() { //3. overriding
				 }
				 public void cut() { } //4.
				 public void stitch() { }
		}
		4. 
*/