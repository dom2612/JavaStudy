package ch07;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
public class ImageDownloader {
	int 전역변수;//클래스
	Member m;
	int[] array;
	
	void method() {
		System.out.println(전역변수);
		int 지역변수;
		System.out.println(지역변수);
		
	}
public static void main(String[] args) {




	      File outputFile = new File("D:/dev/test.jpg");

	      URL url = null;
	      BufferedImage bi = null;

	      try {
	         url = new URL(
	               "https://image-comic.pstatic.net/webtoon/703307/210/20190307213735_f33e4131ca7ad5e7b41bc38659f12fa4_IMAG01_1.jpg");
	         bi = ImageIO.read(url);
	         ImageIO.write(bi, "png", outputFile);

	      } catch (MalformedURLException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }

	   }
	}
