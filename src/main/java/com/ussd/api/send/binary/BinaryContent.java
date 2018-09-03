package com.ussd.api.send.binary;

/**
 * This is a generated class and is not intended for modification!
 */
public class BinaryContent {
    private String hex;
    private Integer dataCoding;
    private Integer esmClass;

    public BinaryContent() {
    }

    public String getHex() {
        return this.hex;
    }

    public BinaryContent setHex(String hex) {
        this.hex = hex;
        return this;
    }

    public Integer getDataCoding() {
        return this.dataCoding;
    }

    public BinaryContent setDataCoding(Integer dataCoding) {
        this.dataCoding = dataCoding;
        return this;
    }

    public Integer getEsmClass() {
        return this.esmClass;
    }

    public BinaryContent setEsmClass(Integer esmClass) {
        this.esmClass = esmClass;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        BinaryContent o = (BinaryContent)obj;
        if (this.hex == null) {
            if (o.hex != null){
                return false;
            }
        } else if (!this.hex.equals(o.hex)) {
            return false;
        }
        if (this.dataCoding == null) {
            if (o.dataCoding != null){
                return false;
            }
        } else if (!this.dataCoding.equals(o.dataCoding)) {
            return false;
        }
        if (this.esmClass == null) {
            if (o.esmClass != null){
                return false;
            }
        } else if (!this.esmClass.equals(o.esmClass)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "BinaryContent{" +
            "hex='" + hex + "'" +
            ", dataCoding='" + dataCoding + "'" +
            ", esmClass='" + esmClass + "'" +
            '}';
    }
}