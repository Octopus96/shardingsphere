/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.scaling.core.job;

import lombok.Getter;
import lombok.Setter;
import org.apache.shardingsphere.scaling.core.config.JobConfiguration;
import org.apache.shardingsphere.scaling.core.config.TaskConfiguration;
import org.apache.shardingsphere.scaling.core.job.progress.JobProgress;
import org.apache.shardingsphere.scaling.core.job.task.incremental.IncrementalTask;
import org.apache.shardingsphere.scaling.core.job.task.inventory.InventoryTask;
import org.apache.shardingsphere.scaling.core.util.JobConfigurationUtil;

import java.util.LinkedList;
import java.util.List;

/**
 * Scaling job context.
 */
@Getter
@Setter
public final class JobContext {
    
    private final long jobId;
    
    private final int shardingItem;
    
    private JobStatus status = JobStatus.RUNNING;
    
    private JobProgress initProgress;
    
    private final List<TaskConfiguration> taskConfigs;
    
    private final List<InventoryTask> inventoryTasks = new LinkedList<>();
    
    private final List<IncrementalTask> incrementalTasks = new LinkedList<>();
    
    private JobConfiguration jobConfig;
    
    public JobContext(final JobConfiguration jobConfig) {
        this.jobConfig = jobConfig;
        JobConfigurationUtil.fillInProperties(jobConfig);
        jobId = jobConfig.getHandleConfig().getJobId();
        shardingItem = jobConfig.getHandleConfig().getShardingItem();
        taskConfigs = JobConfigurationUtil.toTaskConfigs(jobConfig);
    }
}
