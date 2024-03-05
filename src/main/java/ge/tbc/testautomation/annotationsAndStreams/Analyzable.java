package ge.tbc.testautomation.annotationsAndStreams;

public class Analyzable {
    @VariableNameAnnotation(name = "StringValue")
    private String stringValue;

    @VariableNameAnnotation(name = "CharValue")
    private char charValue;

    @VariableNameAnnotation(name = "LongValue")
    private long longValue;

    @VariableNameAnnotation(name = "IntegerValue")
    private int integerValue;

    @VariableNameAnnotation(name = "ObjectValue")
    private Object objectValue;

    @VariableNameAnnotation(name = "ShortValue")
    private short shortValue;

    @VariableNameAnnotation(name = "BooleanValue")
    private boolean booleanValue;

    @VariableNameAnnotation(name = "ByteValue")
    private byte byteValue;

    @VariableNameAnnotation(name = "Something")
    private float floatValue;

    @VariableNameAnnotation
    private double doubleNum;


}
