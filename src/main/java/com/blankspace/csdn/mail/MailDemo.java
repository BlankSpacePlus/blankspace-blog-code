package com.blankspace.csdn.mail;

import java.util.Properties;

import jakarta.mail.Address;
import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class MailDemo {

    public static void main(String[] args) {
        // 创建邮件的发送过程中用到的主机和端口号的属性文件
        Properties properties = new Properties();
        // 设置邮件发送方的主机地址，qq邮箱为smtp.qq.com
        properties.put("mail.smtp.host", "smtp.qq.com");
        // 设置发送邮件端口号
        properties.put("mail.smtp.port", "25");
        // 设置邮件发送需要认证
        properties.put("mail.smtp.auth", "true");
        // 邮件发送方地址
        String senderEmailAddress = "blankspaceplus@foxmail.com";
        // 邮件接收方地址
        String receiverEmailAddress = "blankspacekv@foxmail.com";
        // 开通pop3/smtp服务时的验证码
        String verificationCode = "tqgjdeodildmcjai";
        // 创建邮件验证信息，即发送邮件的用户名和密码
        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                // 重写验证方法，填写用户名，密码
                return new PasswordAuthentication(senderEmailAddress, verificationCode);
            }
        };
        // 根据邮件会话 构建一个邮件的session
        Session sendMailSession = Session.getDefaultInstance(properties, authenticator);
        // 创建一个邮件消息
        Message message = new MimeMessage(sendMailSession);
        try {
            // 创建邮件发送者地址
            Address senderAddress = new InternetAddress(senderEmailAddress);
            // 将原地址设置到消息的信息中
            message.setFrom(senderAddress);
            // 创建邮件的接收者地址
            Address receiverAddress = new InternetAddress(receiverEmailAddress);
            // 将接收者的地址设置到消息的信息中
            message.setRecipient(Message.RecipientType.TO, receiverAddress);
            // 设置邮件的主题
            message.setSubject("日常聊天");
            // 设置邮件的发送内容
            message.setText("Hello, BlankSpace");
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
