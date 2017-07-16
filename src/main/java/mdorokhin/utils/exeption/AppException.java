package mdorokhin.utils.exeption;

/**
 * @author Maxim Dorokhin
 *         13.07.2017
 */
public class AppException extends Exception {

    private static final long serialVersionUID = -8999932578270387947L;

    private Integer status;
    private int code;
    private String developerMessage;

    public AppException() { }

    public AppException(Integer status, int code, String developerMessage, String message) {
        super(message);
        this.status = status;
        this.code = code;
        this.developerMessage = developerMessage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }
}
