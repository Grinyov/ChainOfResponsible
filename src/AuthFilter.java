/**
 * Created by green on 23.02.2015.
 */
public class AuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
    {
    if (request.getParameter("secret_word").equals("XYZ"))
        {
        chain.doFilter(request, response);
        }
    else
        {
        response.sendRedirect("index.jsp");
        }
    }
}
