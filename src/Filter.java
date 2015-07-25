/**
 * Created by green on 23.02.2015.
 */
public interface Filter
{
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain);
}
