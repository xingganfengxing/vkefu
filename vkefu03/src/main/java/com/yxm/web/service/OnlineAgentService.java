package com.yxm.web.service;

import com.yxm.web.entity.agent.Agent;

public interface OnlineAgentService {
    void save(Agent agent);
    void updateAgentByAgentId(Agent agent);
    Agent getByAgentId(String agentId);
	boolean agentlogin(String agentId);
    /**
     * 更改坐席状态
     * @param agentStatusOffline
     * @param agentId
     */
	void updateAgentStatusByAgentId(String status, String agentId);
}
