package com.qr;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class generateQRcode {

	public static void main(String[] args) {
		System.out.print("ENTER THE URL OR DATA YOU WANT TO GENERATE INTO QR CODE: \n");
		Scanner sc=new Scanner(System.in);
		String content=sc.nextLine();
		
	        String pathToStore = "D:\\New folder\\QRCodeGenerated.jpg";
	         
	        BitMatrix bitMatrix = null;
			try {
				bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, 500, 500);
			} catch (WriterException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        try {
				MatrixToImageWriter.writeToPath(bitMatrix, "jpg", Paths.get(pathToStore));
			} catch (IOException e) {
				
				      e.printStackTrace();
			}
	         
	        System.out.println("QR Code Generated Successfully");
	 
	}

}
