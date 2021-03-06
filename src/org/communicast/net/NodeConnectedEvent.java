package org.communicast.net;

import java.net.InetAddress;

/**
 * 节点连接事件
 * @author huangkaixuan
 *
 */
public interface NodeConnectedEvent {
	public void trigger(InetAddress remote, int port, Node self);
}
