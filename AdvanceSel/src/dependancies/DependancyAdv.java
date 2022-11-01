package dependancies;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyAdv {     // login, dash, users, downloads
		
		/*See the output of following code which will tell you the execution rule*/
		
//		@Test()
//		public void login(){
//			System.out.println("login"); 
////			Assert.assertTrue(false);  // also see the output by decommting this assert
//		}                                 // if any test case is failed then the case which is depends on the same test case will be going to skip
	//	
//		@Test(dependsOnMethods="login")
//		public void dash(){
//			System.out.println("dash");
//		}
	//	
//		@Test
//		public void users(){
//			System.out.println("users");
//		}
	//	
//		@Test(priority=-1, dependsOnMethods="users") // if we remove priority form here then the sequence will be changed
//		// i.e. dash will execute first and then downloads
//		public void downloads(){
//			System.out.println("downloads");
//		}

		/*Following code with alwaysrun, groupby*/
		
		@Test(groups="login")                    // login,users,downloads, dash(skip)
		public void login(){
			System.out.println("login"); 
			Assert.assertTrue(true);
		}
		
		@Test(groups="login")
		public void dash(){
			System.out.println("dash");
		}
//		@Test(dependsOnMethods="login", enabled=false)
//		public void dash(){
//			System.out.println("dash");
//		}
		
		@Test(groups="users")
		public void users1(){
			System.out.println("users1");
		}
		
		
		@Test(groups="users")
		public void users2(){
			System.out.println("users2");
		}
		
//		@Test(priority=-1, dependsOnMethods="users") // if we remove priority form here then the sequence will be changed
//		// i.e. dash will execute first and then downloads
//		public void downloads(){
//			System.out.println("downloads");
//		}

}
