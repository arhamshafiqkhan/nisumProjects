package com.arham;

public class Response {
    private String message;
    private boolean isValid;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(boolean valid) {
        isValid = valid;
    }

    @Override
    public String toString() {
        return "Response{" +
                "message='" + message + '\'' +
                ", isValid=" + isValid +
                '}';
    }
}
