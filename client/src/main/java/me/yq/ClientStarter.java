package me.yq;

import lombok.extern.slf4j.Slf4j;
import me.yq.biz.domain.User;
import me.yq.support.ChatClient;
import me.yq.support.ClientBootstrap;

/**
 * @author yq
 * @version v1.0 2023-02-23 16:11
 */
@Slf4j
public class ClientStarter {

    public static void main(String[] args) {
        ChatClient chatClient = new ClientBootstrap().buildClient();
        chatClient.start();

        log.info("正在登录......");
        chatClient.signIn(157146, "abcde");
        User user = chatClient.getCurrentUser();
        log.info("用户[{}]已登录！",user);

        log.info("当前的好友列表是: {}",user.getFriendList());


    }
}
