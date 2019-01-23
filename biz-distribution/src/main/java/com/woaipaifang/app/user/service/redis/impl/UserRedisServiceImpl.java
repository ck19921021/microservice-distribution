/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.woaipaifang.app.user.service.redis.impl;


import com.woaipaifang.app.user.model.User;
import com.woaipaifang.app.user.service.redis.IRedisService;
import org.springframework.stereotype.Service;

@Service("userRedisServiceImpl")
public class UserRedisServiceImpl extends RedisServiceImpl<User> implements IRedisService<User> {

}