package com.arham.compositionaggregation;

// association using aggregation
public class TeachingStaff {
    private String name;
    private String jobTitle;

    @Override
    public String toString() {
        return "TeachingStaff{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }

    public TeachingStaff(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
