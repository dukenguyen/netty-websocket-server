package com.dukenguyen;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;

public class WebSocketServerHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {
  @Override
  public void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws Exception {
    String request = msg.text();
    ctx.channel().writeAndFlush(new TextWebSocketFrame(request.toUpperCase()));
  }
}
