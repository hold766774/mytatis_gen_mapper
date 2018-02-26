package com.dudu.domain;

import javax.persistence.*;

@Table(name = "news")
public class News {
    @Id
    @Column(name = "news_id")
    private Integer newsId;

    @Column(name = "news_title")
    private String newsTitle;

    /**
     * @return news_id
     */
    public Integer getNewsId() {
        return newsId;
    }

    /**
     * @param newsId
     */
    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    /**
     * @return news_title
     */
    public String getNewsTitle() {
        return newsTitle;
    }

    /**
     * @param newsTitle
     */
    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }
}