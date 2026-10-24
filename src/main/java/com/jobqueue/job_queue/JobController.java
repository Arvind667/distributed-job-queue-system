
package com.jobqueue.job_queue;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    @PostMapping("/jobs")
    public ResponseEntity<Job> createJob(
            @RequestBody Job request) {

        String jobId = UUID.randomUUID().toString();

        Job job = new Job(
                jobId,
                request.getJobName(),
                "PENDING"
        );

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(job);
    }
}
