package mdorokhin.utils.exeption;

import java.io.Serializable;

/**
 * @author Maxim Dorokhin
 *         13.07.2017
 */
public class AppException extends Exception implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer status;
    private int code;

    public AppException() { }

    public AppException(Integer status, int code, String detailMessage) {
        super(detailMessage);
        this.status = status;
        this.code = code;
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
}
