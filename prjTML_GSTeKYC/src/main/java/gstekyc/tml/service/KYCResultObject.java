
package gstekyc.tml.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KYCResultObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KYCResultObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="canFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pradr" type="{http://service.TML.GSTeKYC/}pradrObject" minOccurs="0"/&gt;
 *         &lt;element name="tradeNam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lstupdt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contacted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rgdt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stjCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ctjCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ppr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cmpRt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cxdt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ctb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gstin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lgnm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ctj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adadr" type="{http://service.TML.GSTeKYC/}adadrObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KYCResultObject", propOrder = {
    "mbr",
    "canFlag",
    "pradr",
    "tradeNam",
    "lstupdt",
    "contacted",
    "rgdt",
    "stjCd",
    "stj",
    "ctjCd",
    "ppr",
    "dty",
    "cmpRt",
    "cxdt",
    "ctb",
    "sts",
    "gstin",
    "lgnm",
    "ctj",
    "adadr"
})
public class KYCResultObject {

    protected String mbr;
    protected String canFlag;
    protected PradrObject pradr;
    protected String tradeNam;
    protected String lstupdt;
    protected String contacted;
    protected String rgdt;
    protected String stjCd;
    protected String stj;
    protected String ctjCd;
    protected String ppr;
    protected String dty;
    protected String cmpRt;
    protected String cxdt;
    protected String ctb;
    protected String sts;
    protected String gstin;
    protected String lgnm;
    protected String ctj;
    protected AdadrObject adadr;

    /**
     * Gets the value of the mbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbr() {
        return mbr;
    }

    /**
     * Sets the value of the mbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbr(String value) {
        this.mbr = value;
    }

    /**
     * Gets the value of the canFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanFlag() {
        return canFlag;
    }

    /**
     * Sets the value of the canFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanFlag(String value) {
        this.canFlag = value;
    }

    /**
     * Gets the value of the pradr property.
     * 
     * @return
     *     possible object is
     *     {@link PradrObject }
     *     
     */
    public PradrObject getPradr() {
        return pradr;
    }

    /**
     * Sets the value of the pradr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PradrObject }
     *     
     */
    public void setPradr(PradrObject value) {
        this.pradr = value;
    }

    /**
     * Gets the value of the tradeNam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeNam() {
        return tradeNam;
    }

    /**
     * Sets the value of the tradeNam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeNam(String value) {
        this.tradeNam = value;
    }

    /**
     * Gets the value of the lstupdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLstupdt() {
        return lstupdt;
    }

    /**
     * Sets the value of the lstupdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLstupdt(String value) {
        this.lstupdt = value;
    }

    /**
     * Gets the value of the contacted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacted() {
        return contacted;
    }

    /**
     * Sets the value of the contacted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacted(String value) {
        this.contacted = value;
    }

    /**
     * Gets the value of the rgdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgdt() {
        return rgdt;
    }

    /**
     * Sets the value of the rgdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgdt(String value) {
        this.rgdt = value;
    }

    /**
     * Gets the value of the stjCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStjCd() {
        return stjCd;
    }

    /**
     * Sets the value of the stjCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStjCd(String value) {
        this.stjCd = value;
    }

    /**
     * Gets the value of the stj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStj() {
        return stj;
    }

    /**
     * Sets the value of the stj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStj(String value) {
        this.stj = value;
    }

    /**
     * Gets the value of the ctjCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtjCd() {
        return ctjCd;
    }

    /**
     * Sets the value of the ctjCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtjCd(String value) {
        this.ctjCd = value;
    }

    /**
     * Gets the value of the ppr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpr() {
        return ppr;
    }

    /**
     * Sets the value of the ppr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpr(String value) {
        this.ppr = value;
    }

    /**
     * Gets the value of the dty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDty() {
        return dty;
    }

    /**
     * Sets the value of the dty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDty(String value) {
        this.dty = value;
    }

    /**
     * Gets the value of the cmpRt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmpRt() {
        return cmpRt;
    }

    /**
     * Sets the value of the cmpRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmpRt(String value) {
        this.cmpRt = value;
    }

    /**
     * Gets the value of the cxdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxdt() {
        return cxdt;
    }

    /**
     * Sets the value of the cxdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxdt(String value) {
        this.cxdt = value;
    }

    /**
     * Gets the value of the ctb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtb() {
        return ctb;
    }

    /**
     * Sets the value of the ctb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtb(String value) {
        this.ctb = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSts(String value) {
        this.sts = value;
    }

    /**
     * Gets the value of the gstin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGstin() {
        return gstin;
    }

    /**
     * Sets the value of the gstin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGstin(String value) {
        this.gstin = value;
    }

    /**
     * Gets the value of the lgnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgnm() {
        return lgnm;
    }

    /**
     * Sets the value of the lgnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgnm(String value) {
        this.lgnm = value;
    }

    /**
     * Gets the value of the ctj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtj() {
        return ctj;
    }

    /**
     * Sets the value of the ctj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtj(String value) {
        this.ctj = value;
    }

    /**
     * Gets the value of the adadr property.
     * 
     * @return
     *     possible object is
     *     {@link AdadrObject }
     *     
     */
    public AdadrObject getAdadr() {
        return adadr;
    }

    /**
     * Sets the value of the adadr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdadrObject }
     *     
     */
    public void setAdadr(AdadrObject value) {
        this.adadr = value;
    }

}
