//package JMS;
//
//import org.apache.activemq.ActiveMQConnection;
//import org.apache.activemq.ActiveMQConnectionFactory;
//
//import javax.jms.*;
//
///**
// * Created by xiechur on 2017/3/9/009.
// * @author xiechur
// *
// */
//public class JMSProducer {
//    //默认连接用户名
//    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;
//    //默认连接密码
//    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
//    //默认连接地址
//    private static final String BROKEURL = ActiveMQConnection.DEFAULT_BROKER_URL;
//    //发送的消息数量
//    private static final int SENDNUM = 10;
//
//    public static void main(String[] args){
//        //连接工厂
//        ConnectionFactory connectionFactory;
//        //连接
//        Connection connection = null;
//        //会话 接受或者发送消息的线程
//        Session session;
//        //消息目的地
//        Destination destination;
//        //消息生产者
//        MessageProducer messageProducer;
//        //实例化工厂
//        connectionFactory = new ActiveMQConnectionFactory(JMSProducer.USERNAME,JMSProducer.PASSWORD,JMSProducer.BROKEURL);
//        try {
//            //通过连接工厂连接
//            connection  = connectionFactory.createConnection();
//            //启动连接
//            connection.start();
//            //创建session
//            session = connection.createSession(true,Session.AUTO_ACKNOWLEDGE);
//            //创建一个名称为HelloWolrd 的消息队列
//            destination = session.createQueue("HelloWorld");
//            //创建消息生产者
//            messageProducer = session.createProducer(destination);
//            //发送消息
//            sendMessage(session,messageProducer);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            if(connection != null){
//                try {
//                    connection.close();
//                } catch (JMSException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//
//
//
//    }
//
//
//    public static void sendMessage(Session session,MessageProducer messageProducer)throws Exception{
//        for (int i = 0; i < JMSProducer.SENDNUM;i++){
//            //创建一条文本消息
//            TextMessage textMessage = session.createTextMessage();
//            //通过生产者发出消息
//            System.out.println("发送消息："+i);
//            messageProducer.send(textMessage);
//        }
//    }
//}
