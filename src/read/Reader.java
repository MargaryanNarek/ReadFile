package read;


import java.io.*;
import java.nio.Buffer;

public abstract class Reader {
    File file;
   public abstract int[] Read() throws IOException;
}
