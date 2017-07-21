package mdorokhin.utils.exeption;

/**
 * @author Maxim Dorokhin
 *         15.07.2017
 */

public class ErrorMessage {

    private int status;
    private int code;
    private String detailMessage;


    public ErrorMessage() {}

    public ErrorMessage(AppException ex) {
        this.status = ex.getStatus();
        this.code = ex.getCode();
        this.detailMessage = ex.getMessage();
    }

    public ErrorMessage(int status, int code, String detailMessage) {
        this.status = status;
        this.code = code;
        this.detailMessage = detailMessage;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public void setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
    }
}