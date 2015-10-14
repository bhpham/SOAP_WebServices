/**
 * Calc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.mv.week2.domain;

public class Calc  implements java.io.Serializable {
    private double num1;

    private double num2;

    private java.lang.String op;

    private double result;

    private long resultId;

    public Calc() {
    }

    public Calc(
           double num1,
           double num2,
           java.lang.String op,
           double result,
           long resultId) {
           this.num1 = num1;
           this.num2 = num2;
           this.op = op;
           this.result = result;
           this.resultId = resultId;
    }


    /**
     * Gets the num1 value for this Calc.
     * 
     * @return num1
     */
    public double getNum1() {
        return num1;
    }


    /**
     * Sets the num1 value for this Calc.
     * 
     * @param num1
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }


    /**
     * Gets the num2 value for this Calc.
     * 
     * @return num2
     */
    public double getNum2() {
        return num2;
    }


    /**
     * Sets the num2 value for this Calc.
     * 
     * @param num2
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }


    /**
     * Gets the op value for this Calc.
     * 
     * @return op
     */
    public java.lang.String getOp() {
        return op;
    }


    /**
     * Sets the op value for this Calc.
     * 
     * @param op
     */
    public void setOp(java.lang.String op) {
        this.op = op;
    }


    /**
     * Gets the result value for this Calc.
     * 
     * @return result
     */
    public double getResult() {
        return result;
    }


    /**
     * Sets the result value for this Calc.
     * 
     * @param result
     */
    public void setResult(double result) {
        this.result = result;
    }


    /**
     * Gets the resultId value for this Calc.
     * 
     * @return resultId
     */
    public long getResultId() {
        return resultId;
    }


    /**
     * Sets the resultId value for this Calc.
     * 
     * @param resultId
     */
    public void setResultId(long resultId) {
        this.resultId = resultId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Calc)) return false;
        Calc other = (Calc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.num1 == other.getNum1() &&
            this.num2 == other.getNum2() &&
            ((this.op==null && other.getOp()==null) || 
             (this.op!=null &&
              this.op.equals(other.getOp()))) &&
            this.result == other.getResult() &&
            this.resultId == other.getResultId();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Double(getNum1()).hashCode();
        _hashCode += new Double(getNum2()).hashCode();
        if (getOp() != null) {
            _hashCode += getOp().hashCode();
        }
        _hashCode += new Double(getResult()).hashCode();
        _hashCode += new Long(getResultId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Calc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://domain.week2.mv.net", "Calc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain.week2.mv.net", "num1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain.week2.mv.net", "num2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("op");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain.week2.mv.net", "op"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain.week2.mv.net", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://domain.week2.mv.net", "resultId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
