package com.ussd.api.send;

/**
 * This is a generated class and is not intended for modification!
 */
public class Language {
    private Boolean singleShift;
    private Boolean lockingShift;
    private String languageCode;

    public Language() {
    }

    public Boolean getSingleShift() {
        return this.singleShift;
    }

    public Language setSingleShift(Boolean singleShift) {
        this.singleShift = singleShift;
        return this;
    }

    public Boolean getLockingShift() {
        return this.lockingShift;
    }

    public Language setLockingShift(Boolean lockingShift) {
        this.lockingShift = lockingShift;
        return this;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public Language setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
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

        Language o = (Language)obj;
        if (this.singleShift == null) {
            if (o.singleShift != null){
                return false;
            }
        } else if (!this.singleShift.equals(o.singleShift)) {
            return false;
        }
        if (this.lockingShift == null) {
            if (o.lockingShift != null){
                return false;
            }
        } else if (!this.lockingShift.equals(o.lockingShift)) {
            return false;
        }
        if (this.languageCode == null) {
            if (o.languageCode != null){
                return false;
            }
        } else if (!this.languageCode.equals(o.languageCode)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Language{" +
            "singleShift='" + singleShift + "'" +
            ", lockingShift='" + lockingShift + "'" +
            ", languageCode='" + languageCode + "'" +
            '}';
    }
}