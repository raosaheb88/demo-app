package com.example.demo_app.dto;

public class ReviewRequest {

    private String repo;
    private String branch;

    public ReviewRequest() {}

    public ReviewRequest(String repo, String branch) {
        this.repo = repo;
        this.branch = branch;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public String getRepo() {
        return repo;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getBranch() {
        return branch;
    }

    @Override
    public String toString() {
        return "ReviewRequest{" +
                "repo='" + repo + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
