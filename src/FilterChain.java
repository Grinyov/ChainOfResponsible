/**
 * Created by green on 23.02.2015.
 */
public interface FilterChain
{
    public void doFilter(
            ServletRequest request,
            ServletResponse response);
}
