//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.09 at 10:45:26 AM EST 
//


package org.jentrata.ebxml.cpa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}CollaborationActivity" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="binaryCollaboration" use="required" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}non-empty-string" />
 *       &lt;attribute name="businessTransactionActivity" use="required" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}non-empty-string" />
 *       &lt;attribute name="requestOrResponseAction" use="required" type="{http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd}non-empty-string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "collaborationActivity",
    "any"
})
@XmlRootElement(name = "ActionContext")
public class ActionContext {

    @XmlElement(name = "CollaborationActivity")
    protected CollaborationActivity collaborationActivity;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "binaryCollaboration", namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd", required = true)
    protected String binaryCollaboration;
    @XmlAttribute(name = "businessTransactionActivity", namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd", required = true)
    protected String businessTransactionActivity;
    @XmlAttribute(name = "requestOrResponseAction", namespace = "http://www.oasis-open.org/committees/ebxml-cppa/schema/cpp-cpa-2_0.xsd", required = true)
    protected String requestOrResponseAction;

    /**
     * Gets the value of the collaborationActivity property.
     * 
     * @return
     *     possible object is
     *     {@link CollaborationActivity }
     *     
     */
    public CollaborationActivity getCollaborationActivity() {
        return collaborationActivity;
    }

    /**
     * Sets the value of the collaborationActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborationActivity }
     *     
     */
    public void setCollaborationActivity(CollaborationActivity value) {
        this.collaborationActivity = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the binaryCollaboration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaryCollaboration() {
        return binaryCollaboration;
    }

    /**
     * Sets the value of the binaryCollaboration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaryCollaboration(String value) {
        this.binaryCollaboration = value;
    }

    /**
     * Gets the value of the businessTransactionActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTransactionActivity() {
        return businessTransactionActivity;
    }

    /**
     * Sets the value of the businessTransactionActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTransactionActivity(String value) {
        this.businessTransactionActivity = value;
    }

    /**
     * Gets the value of the requestOrResponseAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestOrResponseAction() {
        return requestOrResponseAction;
    }

    /**
     * Sets the value of the requestOrResponseAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestOrResponseAction(String value) {
        this.requestOrResponseAction = value;
    }

}