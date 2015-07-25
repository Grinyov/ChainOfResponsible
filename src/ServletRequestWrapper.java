/**
 * Created by green on 24.02.2015.
 */
public class ServletRequestWrapper implements ServletRequest
{
    private final ServletRequest request;

    public ServletRequestWrapper(ServletRequest request)
    {
        this.request = request;
    }

    @Override
    public String getParameter(String name)
    {
        return request.getParameter(name);
    }
}
