import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by green on 24.02.2015.
 */
public class DEcoratorAdapterDemo
{
    // Пример Декоратора(Адаптера)

        public static void main(String[] args) throws IOException
        {
            //OutputStream out = new FileOutputStream("d:/tmp.bin");

            OutputStream out = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("d:/tmp.bin")));

            out.write(42);
            out.write(42);
            out.write(42);

            out.flush();
            out.close();

        }
}

