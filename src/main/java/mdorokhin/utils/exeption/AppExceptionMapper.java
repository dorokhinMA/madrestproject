package mdorokhin.utils.exeption;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * @author Maxim Dorokhin
 *         15.07.2017
 */
@Provider
public class AppExceptionMapper implements ExceptionMapper<AppException> {

    public Response toResponse(AppException ex) {
        return Response.status(ex.getStatus())
                .entity(new ErrorMessage(ex))
                .type(MediaType.APPLICATION_JSON).
                        build();
    }

}
