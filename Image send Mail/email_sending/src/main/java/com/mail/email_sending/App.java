package com.mail.email_sending;
//
//import java.util.Properties;
//
//import javax.mail.Address;
//import javax.mail.Authenticator;
//import javax.mail.Message;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//
///**
// * Hello world!
// *
// */
//public class App 
//{
//    public static void main( String[] args )
//    {
//    	
//        String message = "Hello  dear This is msg ";
//        String subject = "Ha bhai Mene Meven se bana li";
//        String to ="sohaninfoband4@gmail.com";
//        String from ="Sagar.choudhary9811@gmail.com";
//        sendEmail(message,subject,to,from);
//        
//        
//        
//        
//    }
//    //this is responsible to send email
//	private static void sendEmail(String message, String subject, String to, String from) {
//		//variable for gamil 
//		//String host ="smtp.gmail.com"; //gmail ke server ka use krenge
//		String host = "smtp.gmail.com";
//		
//		//get the system properties
//		Properties properties = System.getProperties();
//		System.out.println("Properties"+properties);
//		
//		
//		
//		//setting important information to propeties objce
//		
//		// host set
////		properties.put("mail.smpt.host",host );
////		properties.put("mail.smpt.port","465" ); //465 is google port
////		properties.put("mail.smpt.ssl.enable","true" );
//		
//		properties.put("mail.smtp.host", host);
//		properties.put("mail.smtp.port", "465");
//		properties.put("mail.smtp.ssl.enable", "true");
//
//		//enable security socket
//		properties.put("mail.smpt.host",host ); //anle authontication
//		
//		//wo set only informarmation
//		
//		
//		
//		// step 1 :get the session object
//		//session have factory method
//		 Session session = Session .getInstance(properties, new Authenticator() {
//
//			@Override
//			protected PasswordAuthentication getPasswordAuthentication() {
//				// TODO Auto-generated method stub
//				return new PasswordAuthentication("Sagar.choudhary9811@gmail.com", "hefo estb nlcw ajii");
//				
//			}
//			
//			
//			
//		});
//		 session.setDebug(true);
//		 
//		 //step 2 compose the message [text ,multimedia]
//		 MimeMessage m= new MimeMessage(session);
//		 
//		 try {
//			// from emal id
//			 m.setFrom(from);
//			 m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//			 //if we want to send many mag then we pass Array in  this of internetAddresses
//			 
//			 //Adding subject to message
//			 m.setSubject(subject);
//			 
//			 //Adding text to message
//			 m.setText(message);
//			 
//			 //send 
//			// step 3: Send the mesage using transport class
//			 Transport.send(m);
//		System.out.println("Send the Message Seccuss fully");
//			 
//		 }
//		 catch (Exception e) {
//			e.printStackTrace();
//		}
//		 
//	
//		
//	}
//}

import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class App {
	public static void main(String[] args) {
		
		System.out.println("preparing to send message ...");
		String message = "Hello , Dear, this is message for security check . ";
		String subject = "CodersArea : Confirmation";
		String to = "nikita.choudhary9811@gmail.com";
		String from = "Sagar.choudhary9811@gmail.com";
		
//		sendEmail(message,subject,to,from);
		sendAttach(message,subject,to,from);
	}

	//this is responsible to send the message with attachment
	private static void sendAttach(String message, String subject, String to, String from) {

		//Variable for gmail
		String host="smtp.gmail.com";
		
		//get the system properties
		Properties properties = System.getProperties();
		System.out.println("PROPERTIES "+properties);
		
		//setting important information to properties object
		
		//host set
//		properties.put("mail.smtp.host", host);
//		properties.put("mail.smtp.port","465");
//		properties.put("mail.smtp.ssl.enable","true");
//		properties.put("mail.smtp.auth","true");
		
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		
		//Step 1: to get the session object..
		Session session=Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {				
				return new PasswordAuthentication("Sagar.choudhary9811@gmail.com", "sagar7828");
			}
			
			
			
		});
		
		session.setDebug(true);
		
		//Step 2 : compose the message [text,multi media]
		MimeMessage m = new MimeMessage(session);
		
		try {
		
		//from email
		m.setFrom(from);
		
		//adding recipient to message
		m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		
		//adding subject to message
		m.setSubject(subject);
	
		
		//attachement..
		
		//file path
		String path="C:\\Users\\dell\\OneDrive\\Desktop\\ca_logo.png";
		
		
		MimeMultipart mimeMultipart = new MimeMultipart();
		//text
		//file
		
		MimeBodyPart textMime = new MimeBodyPart();
		
		MimeBodyPart fileMime = new MimeBodyPart();
		
		try {
			
			textMime.setText(message);
			
			File file=new File(path);
			fileMime.attachFile(file);
			
			
			mimeMultipart.addBodyPart(textMime);
			mimeMultipart.addBodyPart(fileMime);
		
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		m.setContent(mimeMultipart);
		
		
		//send 
		
		//Step 3 : send the message using Transport class
		Transport.send(m);
		
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	
		System.out.println("Sent success...................");
		
		
	}

	//this is responsible to send email..
	private static void sendEmail(String message, String subject, String to, String from) {
		
		//Variable for gmail
		String host="smtp.gmail.com";
		
		//get the system properties
		Properties properties = System.getProperties();
		System.out.println("PROPERTIES "+properties);
		
		//setting important information to properties object
		
		//host set
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port","465");
		properties.put("mail.smtp.ssl.enable","true");
		properties.put("mail.smtp.auth","true");
		
		//Step 1: to get the session object..
		Session session=Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {				
				return new PasswordAuthentication("Sagar.choudhary9811@gmail.com", "Sagar7828");
			}
			
			
			
		});
		
		session.setDebug(true);
		
		//Step 2 : compose the message [text,multi media]
		MimeMessage m = new MimeMessage(session);
		
		try {
		
		//from email
		m.setFrom(from);
		
		//adding recipient to message
		m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		
		//adding subject to message
		m.setSubject(subject);
	
		
		//adding text to message
		m.setText(message);
		
		//send 
		
		//Step 3 : send the message using Transport class
		Transport.send(m);
		
		System.out.println("Sent success...................");
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
			
	}
}

