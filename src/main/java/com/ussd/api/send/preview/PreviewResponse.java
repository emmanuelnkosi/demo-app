package com.ussd.api.send.preview;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 */
public class PreviewResponse {
    private String originalText;
    private List<Preview> previews = new ArrayList<>();

    public PreviewResponse() {
    }

    public String getOriginalText() {
        return this.originalText;
    }

    public PreviewResponse setOriginalText(String originalText) {
        this.originalText = originalText;
        return this;
    }

    public List<Preview> getPreviews() {
        return this.previews;
    }

    public PreviewResponse setPreviews(List<Preview> previews) {
        this.previews = previews;
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

        PreviewResponse o = (PreviewResponse)obj;
        if (this.originalText == null) {
            if (o.originalText != null){
                return false;
            }
        } else if (!this.originalText.equals(o.originalText)) {
            return false;
        }
        if (this.previews == null) {
            if (o.previews != null){
                return false;
            }
        } else if (!this.previews.equals(o.previews)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "PreviewResponse{" +
            "originalText='" + originalText + "'" +
            ", previews='" + previews + "'" +
            '}';
    }
}