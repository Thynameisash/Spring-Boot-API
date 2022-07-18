package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "jobs")
public class Jobs {

    @Override
    public String toString() {
        return "Jobs [Id=" + Id + ", ctc=" + ctc + ", jd=" + jd + ", location=" + location + ", title=" + title + "]";
    }

    @Id
    private long Id;
    @NonNull
    private long ctc;
    @NonNull
    private String title;
    @NonNull
    private String jd;
    @NonNull
    private String location;

    public Jobs() {

    }

    public Jobs(long Id, long ctc, String title, String jd, String location) {
        this.Id = Id;
        this.ctc = ctc;
        this.title = title;
        this.jd = jd;
        this.location = location;
    }

    public long getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public long getCtc() {
        return ctc;
    }

    public void setCtc(long ctc) {
        this.ctc = ctc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJd() {
        return jd;
    }

    public void setJd(String jd) {
        this.jd = jd;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
