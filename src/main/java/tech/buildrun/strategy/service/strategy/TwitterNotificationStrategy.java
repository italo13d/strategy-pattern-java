package tech.buildrun.strategy.service.strategy;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import tech.buildrun.strategy.service.NotificationStrategy;

public class TwitterNotificationStrategy implements NotificationStrategy {

    private final Logger logger = LoggerFactory.getLogger(EmailNotificationStrategy.class);

    @Override
    public void sendNotification(String destination, String message) {
        logger.info("Notificacao [{}] enviada para o Email [{}]", message, destination);
    }
}
