package AbstractEncapsulGeneralis;

public class TestGneralisation {
	public static void main(String[] args) {
		System.out.println("*********Specification of Jio**************");
		
		Jio x = new Jio();
		x.AudioCalling();
		x.TextMessage();
		x.Internet();
		x.NewFeature();
		
		System.out.println("********Specification of VI****************");
		
		VI y = new VI();
		y.AudioCalling();
		y.TextMessage();
		y.Internet();
		
		System.out.println("************Specipication of BSNL*************");
		
		BSNL z = new BSNL();
		z.AudioCalling();
		z.TextMessage();
		z.Internet();
		z.NewFeature2();
   }
}