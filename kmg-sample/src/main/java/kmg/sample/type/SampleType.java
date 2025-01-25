package kmg.sample.type;

public class SampleType {
	
	public String sampleMethod(String arg) {
		String result = "sampleMethodResult:" + arg;
		System.out.println("sampleMethod-doing:"	+ result);
		return result;
	}

}
