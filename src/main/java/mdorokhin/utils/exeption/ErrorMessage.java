package mdorokhin.utils.exeption;

import com.sun.jersey.api.NotFoundException;
import org.apache.commons.beanutils.BeanUtils;

import javax.ws.rs.core.Response;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Maxim Dorokhin
 *         15.07.2017
 */

public class ErrorMessage {

    private int status;
    private int code;
    private String message;
    private String link;

    public ErrorMessage() {}

    public ErrorMessage(AppException ex){
        try {
            BeanUtils.copyProperties(this, ex);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}