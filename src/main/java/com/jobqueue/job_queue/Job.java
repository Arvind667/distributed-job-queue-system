


package com.jobqueue.job_queue;

public class Job {

    private String id;
    private String jobName;
    private String status;

    public Job() {
    }

    public Job(String id, String jobName, String status) {
        this.id = id;
        this.jobName = jobName;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getJobName() {
        return jobName;
    }

    public String getStatus() {
        return status;
    }
}
