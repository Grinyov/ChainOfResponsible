import java.io.*;
import java.util.zip.GZIPOutputStream;

/**
 * Created by green on 23.02.2015.
 */
public class LogFilter implements Filter
{
    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
    {
        //long tic = System.currentTimeMillis(); // измеряет время в mс и  привязан к абсолютному времени

        long tic = System.nanoTime(); // измеряет время в нс и не привязан к абсолютному времени

        chain.doFilter(request, response);

        long toc = System.nanoTime();

        System.out.println(" URL = " + url + ", dT =  " + (toc - tic));
    }
}


