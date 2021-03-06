package com.spirit.essential.biz;

import com.spirit.tsserialize.Exception.TsException;
import com.spirit.tsserialize.core.TsEvent;
import com.spirit.tsserialize.core.TsRpcHead;
import com.spirit.tsserialize.core.TsRpcProtocolFactory;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.apache.thrift.TBase;


public class ThriftBinaryProtocolEncoder extends MessageToByteEncoder<Object> {

	@Override
	protected void encode(ChannelHandlerContext ctx, Object msg, ByteBuf out) throws Exception {

		TsEvent ev = (TsEvent) msg;

		try {
			TsRpcHead head = ev.getHead();
			TsRpcProtocolFactory protocol = new TsRpcProtocolFactory<TBase>((TBase)ev.getBody(), head, ev.getLen());
			byte[] buf = protocol.Encode().OutStream().GetBytes();
			out.writeBytes(buf, 0, buf.length);
		}
		catch (TsException e) {
			//log.error(e.getLocalizedMessage(), e);
		}
	}

}
