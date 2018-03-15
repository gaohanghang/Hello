package 面试题.面试题系列6IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * IO
 * 
 * 字节流：Reader,Writer
 * 
 * 字符流：InputStream、OutputStream
 * 
 * 文件拷贝
 * @author soft01
 *
 */

public class Test {
	/**
	 * 文件拷贝
	 * JDK1.7 TWR try with resource
	 * @param source 源文件位置
	 * @param target 目录位置
	 */
	public static void copyfile(String source,String target) throws Exception{
		try (InputStream input = new FileInputStream(source)){
			try(OutputStream out = new FileOutputStream(target)){
				byte[] buffer = new byte[1024]; // 小--> 速度慢 大---> 硬盘空间浪费
				int bytes;
				/*
				 * read(byte[] b)
				 * 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
				 * 以整数形式返回实际读取的字节数。
				 * 在输入数据可用、检测到文件末尾或者抛出异常前，此方法一直阻塞。
				 * 
				 * 如果 b 的长度为 0，则不读取任何字节并返回 0；
				 * 否则，尝试读取至少一个字节。如果因为流位于文件末尾而没有可用的字节，则返回值 -1；
				 * 否则，至少读取一个字节并将其存储在 b 中。
				 */
				while((bytes=input.read(buffer))!=-1) {
					/*
					 * write(b, off, len) 的常规协定是：
					 * 将数组 b 中的某些字节按顺序写入输出流；
					 * 元素 b[off] 是此操作写入的第一个字节，
					 * b[off+len-1] 是此操作写入的最后一个字节。
					 */
					out.write(buffer, 0, bytes);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			copyfile("/home/soft01/dump.rdb", "/home/soft01/tts/dump.rdb");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
