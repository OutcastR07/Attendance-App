package com.example.present;

public class ClassItem {

    private long cid;

    public ClassItem(long cid, String course, String sectionNumber) {
        this.cid = cid;
        this.course = course;
        this.sectionNumber = sectionNumber;
    }

    private String course;
    private String sectionNumber;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public ClassItem(String course, String sectionNumber) {
        this.course = course;
        this.sectionNumber = sectionNumber;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
