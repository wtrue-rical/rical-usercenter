package com.whitrue.rical.backend.biz.impl;

import com.whitrue.rical.backend.biz.IJobBiz;
import com.whitrue.rical.backend.domain.dto.JobInfoDTO;
import com.whitrue.rical.backend.service.IJobConsumer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: meidanlong
 * @date: 2022/2/5 12:26 PM
 */
@Service
public class JobBizImpl implements IJobBiz {

    @Resource
    private IJobConsumer jobConsumer;

    @Override
    public Boolean addJob(JobInfoDTO jobInfoDTO) {
        return jobConsumer.addJob(jobInfoDTO);
    }

    @Override
    public JobInfoDTO queryJob(Integer jobId) {
        return jobConsumer.queryJob(jobId);
    }
}