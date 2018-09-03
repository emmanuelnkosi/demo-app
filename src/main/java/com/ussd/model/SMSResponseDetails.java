package com.ussd.model;


/**
 * This is a generated class and is not intended for modification!
 */
public class SMSResponseDetails {
    private String to;
    private Status status;
    private Integer smsCount;
    private String messageId;

    public SMSResponseDetails() {
    }

    public String getTo() {
        return this.to;
    }

    public SMSResponseDetails setTo(String to) {
        this.to = to;
        return this;
    }

    public Status getStatus() {
        return this.status;
    }

    public SMSResponseDetails setStatus(Status status) {
        this.status = status;
        return this;
    }

    public Integer getSmsCount() {
        return this.smsCount;
    }

    public SMSResponseDetails setSmsCount(Integer smsCount) {
        this.smsCount = smsCount;
        return this;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public SMSResponseDetails setMessageId(String messageId) {
        this.messageId = messageId;
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

        SMSResponseDetails o = (SMSResponseDetails)obj;
        if (this.to == null) {
            if (o.to != null){
                return false;
            }
        } else if (!this.to.equals(o.to)) {
            return false;
        }
        if (this.status == null) {
            if (o.status != null){
                return false;
            }
        } else if (!this.status.equals(o.status)) {
            return false;
        }
        if (this.smsCount == null) {
            if (o.smsCount != null){
                return false;
            }
        } else if (!this.smsCount.equals(o.smsCount)) {
            return false;
        }
        if (this.messageId == null) {
            if (o.messageId != null){
                return false;
            }
        } else if (!this.messageId.equals(o.messageId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "SMSResponseDetails{" +
            "to='" + to + "'" +
            ", status='" + status + "'" +
            ", smsCount='" + smsCount + "'" +
            ", messageId='" + messageId + "'" +
            '}';
    }
}