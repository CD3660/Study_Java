package pack02.email;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import org.apache.commons.mail.*;

public class Ex01_SendMail {
	Properties properties;

	public Ex01_SendMail() {
		properties = new Properties();
		try {
			properties.load(Ex01_SendMail.class.getResourceAsStream("emailinfo.properties"));
			System.out.println(properties.getProperty("email.id"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sendSimple() {
		Email email = new SimpleEmail();
		email.setHostName("smtp.naver.com");
		email.setSmtpPort(465);
		email.setAuthenticator(
				new DefaultAuthenticator(properties.getProperty("email.id"), properties.getProperty("email.pw")));
		email.setSSLOnConnect(true);
		email.setCharset("utf-8");
		email.setDebug(true);
		try {
			email.setFrom(properties.getProperty("email.id"), "CD가참둥그렇다.");
			email.addTo(properties.getProperty("email.id"));
			email.setSubject("메일 확인 중");
			email.setMsg("자바 공부 중");
			email.send();
		} catch (EmailException e) {
			System.out.println(e.getMessage());
		}
	}

	public void htmlMail() throws EmailException {
		// 이메일 첨부
		EmailAttachment attach = new EmailAttachment();
		attach.setPath("sql 과제.txt");// 첨부파일 장전

		HtmlEmail email = new HtmlEmail();
		email.setHostName("smtp.naver.com");
		email.setSmtpPort(465);
		email.setAuthenticator(
				new DefaultAuthenticator(properties.getProperty("email.id"), properties.getProperty("email.pw")));
		email.setSSLOnConnect(true);

		email.setCharset("utf-8");
		email.setDebug(true);

		email.setFrom(properties.getProperty("email.id"), "CD가참둥그렇다.");
		email.addTo(properties.getProperty("email.id"));
		email.setSubject("메일 확인 중");
//		email.setMsg("자바 공부 중");
		

		email.attach(attach);// 이메일에 첨부파일 포함시키기
		attach = new EmailAttachment();// 기존 파일을 지우고 첨부파일 다시 만들기
		try {
			attach.setURL(new URL(
					"https://velog.velcdn.com/images/youngerjesus/post/74ba448d-59f7-486f-b4bf-702e8e124fdd/java.png"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		email.attach(attach);

		email.send();
	}

	public void attachMail() throws EmailException {
		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath("sql 과제.txt");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("sql 과제 쿼리문");
		attachment.setName("sql 과제.txt");

		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.naver.com");
		email.setSmtpPort(465);
		email.setAuthenticator(
				new DefaultAuthenticator(properties.getProperty("email.id"), properties.getProperty("email.pw")));
		email.setSSLOnConnect(true);
		// 인코딩 정보 ================================
		email.setCharset("utf-8");
		email.setDebug(true);
		// ===========================================
		email.setFrom(properties.getProperty("email.id"), "CD가참둥그렇다.");
		email.addTo(properties.getProperty("email.id"));
		email.setSubject("메일 확인 중");
		email.setMsg("자바 공부 중");

		email.attach(attachment);
		email.send();
	}

	public static void main(String[] args) throws EmailException {
		Ex01_SendMail ex = new Ex01_SendMail();
	}
}
