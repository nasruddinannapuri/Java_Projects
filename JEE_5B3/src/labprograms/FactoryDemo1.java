package labprograms;
 
public class FactoryDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Showroom obj = new FactoryMobile();
		Mobile mobile = obj.mobile("WIndows");
		mobile.mobileOS();
	}

}
interface Mobile{
	void mobileOS();
}



class Android implements Mobile{
	public void mobileOS() {
		System.out.println("Android Mobile");
	}
	
}

class Iphone implements Mobile{

	public void mobileOS() {
		System.out.println("IOS Mobile");
	}
	
}
class Windows implements Mobile{
	public void mobileOS() {
		System.out.println("Windows Mobile");
	}
}


interface Showroom{
	Mobile mobile(String name);
}

class FactoryMobile implements Showroom{//to aceess differnt mobile we use factory method and create obj here to access
	public Mobile mobile(String name) {
		switch(name) {
		case "Android":
			return new Android();
		case "OS":
			return new Iphone();
		case "Windows":
			return new Windows();
		default:
			return new Android();
		}
	}
}
//poblem
//if client expresss diferent product based on taht we cnage the client side code problem. creating object in client side
//solution: object will be created in factory side