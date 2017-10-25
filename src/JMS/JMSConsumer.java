//package JMS;
//
//import org.apache.activemq.ActiveMQConnection;
//import org.apache.activemq.ActiveMQConnectionFactory;
//
//import javax.jms.*;
//
///**
// * Created by Administrator on 2017/3/9/009.
// */
//public class JMSConsumer {
//    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;//默认连接用户名
//    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;//默认连接密码
//    private static final String BROKEURL = ActiveMQConnection.DEFAULT_BROKER_URL;//默认连接地址
//
//    public static void main(String[] args) {
//        //连接工厂
//        ConnectionFactory connectionFactory;
//        //连接
//        Connection connection;
//        //会话
//        Session session;
//        //消息的目的地
//        Destination destination;
//        //消息的消费者
//        MessageConsumer messageConsumer;
//        //实例化工厂
//        connectionFactory = new ActiveMQConnectionFactory(JMSConsumer.USERNAME,JMSConsumer.PASSWORD,JMSConsumer.BROKEURL);
//        try {
//            //通过连接工厂获取连接
//            connection = connectionFactory.createConnection();
//            //启动连接
//            connection.start();
//            //创建会话
//            session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
//            //创建一个连接HelloWorld的消息队列
//            destination = session.createQueue("HelloWorld");
//            //创建消息发送者
//            messageConsumer = session.createConsumer(destination);
//
//            while (true){
//                TextMessage message = (TextMessage)messageConsumer.receive(1);
//                if (message != null){
//                    System.out.println("收到的消息："+message.getText());
//                }else {
//                    break;
//                }
//            }
//            //确认消息
//            session.commit();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }
//}
