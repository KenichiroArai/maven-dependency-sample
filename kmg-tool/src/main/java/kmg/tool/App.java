package kmg.tool;

import kmg.sample.type.SampleType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "kmg-tool-doing" );
        SampleType sampleType = new SampleType();
        String xxx = sampleType.sampleMethod("kmg-tool");
        System.out.println( "kmg-tool-result:" + xxx );
    }
}
