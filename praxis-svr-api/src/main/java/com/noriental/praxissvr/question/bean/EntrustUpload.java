package com.noriental.praxissvr.question.bean;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

public class EntrustUpload implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.phone_number
     *
     * @mbggenerated
     */
    private String phoneNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.file_name
     *
     * @mbggenerated
     */
    private String fileName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.teacher_name
     *
     * @mbggenerated
     */
    private String teacherName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.school_name
     *
     * @mbggenerated
     */
    private String schoolName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.subject_name
     *
     * @mbggenerated
     */
    private String subjectName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.stage_name
     *
     * @mbggenerated
     */
    private String stageName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.teacher_id
     *
     * @mbggenerated
     */
    private Long teacherId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.qiniu_url
     *
     * @mbggenerated
     */
    private String qiniuUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.time
     *
     * @mbggenerated
     */
    private Date time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.chapter
     *
     * @mbggenerated
     */
    private String chapter;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.section
     *
     * @mbggenerated
     */
    private String section;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.article
     *
     * @mbggenerated
     */
    private String article;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.questions_name
     *
     * @mbggenerated
     */
    private String questionsName;

    private Long directoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.chapter_id
     *
     * @mbggenerated
     */
    private Integer chapterId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.last_update_time
     *
     * @mbggenerated
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.approve_system_name
     *
     * @mbggenerated
     */
    private String approveSystemName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.approve_system_id
     *
     * @mbggenerated
     */
    private Long approveSystemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.approve_desc
     *
     * @mbggenerated
     */
    private String approveDesc;

    private String topicIds;
    /**
     * 自定义目录ID
     */
    private Long customListId;
    /**
     * 自定义目录体系ID
     */
    private Long groupId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.id
     *
     * @return the value of entrust_upload.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.id
     *
     * @param id the value for entrust_upload.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.phone_number
     *
     * @return the value of entrust_upload.phone_number
     *
     * @mbggenerated
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.phone_number
     *
     * @param phoneNumber the value for entrust_upload.phone_number
     *
     * @mbggenerated
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.file_name
     *
     * @return the value of entrust_upload.file_name
     *
     * @mbggenerated
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.file_name
     *
     * @param fileName the value for entrust_upload.file_name
     *
     * @mbggenerated
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.description
     *
     * @return the value of entrust_upload.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.description
     *
     * @param description the value for entrust_upload.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.teacher_name
     *
     * @return the value of entrust_upload.teacher_name
     *
     * @mbggenerated
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.teacher_name
     *
     * @param teacherName the value for entrust_upload.teacher_name
     *
     * @mbggenerated
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.school_name
     *
     * @return the value of entrust_upload.school_name
     *
     * @mbggenerated
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.school_name
     *
     * @param schoolName the value for entrust_upload.school_name
     *
     * @mbggenerated
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.subject_name
     *
     * @return the value of entrust_upload.subject_name
     *
     * @mbggenerated
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.subject_name
     *
     * @param subjectName the value for entrust_upload.subject_name
     *
     * @mbggenerated
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.stage_name
     *
     * @return the value of entrust_upload.stage_name
     *
     * @mbggenerated
     */
    public String getStageName() {
        return stageName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.stage_name
     *
     * @param stageName the value for entrust_upload.stage_name
     *
     * @mbggenerated
     */
    public void setStageName(String stageName) {
        this.stageName = stageName == null ? null : stageName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.teacher_id
     *
     * @return the value of entrust_upload.teacher_id
     *
     * @mbggenerated
     */
    public Long getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.teacher_id
     *
     * @param teacherId the value for entrust_upload.teacher_id
     *
     * @mbggenerated
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.qiniu_url
     *
     * @return the value of entrust_upload.qiniu_url
     *
     * @mbggenerated
     */
    public String getQiniuUrl() {
        return qiniuUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.qiniu_url
     *
     * @param qiniuUrl the value for entrust_upload.qiniu_url
     *
     * @mbggenerated
     */
    public void setQiniuUrl(String qiniuUrl) {
        this.qiniuUrl = qiniuUrl == null ? null : qiniuUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.time
     *
     * @return the value of entrust_upload.time
     *
     * @mbggenerated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.time
     *
     * @param time the value for entrust_upload.time
     *
     * @mbggenerated
     */
    public void setTime(Date time) {
        this.time = time;
    }

    public Long getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(Long directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.chapter
     *
     * @return the value of entrust_upload.chapter
     *
     * @mbggenerated
     */
    public String getChapter() {
        return chapter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.chapter
     *
     * @param chapter the value for entrust_upload.chapter
     *
     * @mbggenerated
     */
    public void setChapter(String chapter) {
        this.chapter = chapter == null ? null : chapter.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.section
     *
     * @return the value of entrust_upload.section
     *
     * @mbggenerated
     */
    public String getSection() {
        return section;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.section
     *
     * @param section the value for entrust_upload.section
     *
     * @mbggenerated
     */
    public void setSection(String section) {
        this.section = section == null ? null : section.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.article
     *
     * @return the value of entrust_upload.article
     *
     * @mbggenerated
     */
    public String getArticle() {
        return article;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.article
     *
     * @param article the value for entrust_upload.article
     *
     * @mbggenerated
     */
    public void setArticle(String article) {
        this.article = article == null ? null : article.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.questions_name
     *
     * @return the value of entrust_upload.questions_name
     *
     * @mbggenerated
     */
    public String getQuestionsName() {
        return questionsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.questions_name
     *
     * @param questionsName the value for entrust_upload.questions_name
     *
     * @mbggenerated
     */
    public void setQuestionsName(String questionsName) {
        this.questionsName = questionsName == null ? null : questionsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.chapter_id
     *
     * @return the value of entrust_upload.chapter_id
     *
     * @mbggenerated
     */
    public Integer getChapterId() {
        return chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.chapter_id
     *
     * @param chapterId the value for entrust_upload.chapter_id
     *
     * @mbggenerated
     */
    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.status
     *
     * @return the value of entrust_upload.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.status
     *
     * @param status the value for entrust_upload.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.last_update_time
     *
     * @return the value of entrust_upload.last_update_time
     *
     * @mbggenerated
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.last_update_time
     *
     * @param lastUpdateTime the value for entrust_upload.last_update_time
     *
     * @mbggenerated
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.approve_system_name
     *
     * @return the value of entrust_upload.approve_system_name
     *
     * @mbggenerated
     */
    public String getApproveSystemName() {
        return approveSystemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.approve_system_name
     *
     * @param approveSystemName the value for entrust_upload.approve_system_name
     *
     * @mbggenerated
     */
    public void setApproveSystemName(String approveSystemName) {
        this.approveSystemName = approveSystemName == null ? null : approveSystemName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.approve_system_id
     *
     * @return the value of entrust_upload.approve_system_id
     *
     * @mbggenerated
     */
    public Long getApproveSystemId() {
        return approveSystemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.approve_system_id
     *
     * @param approveSystemId the value for entrust_upload.approve_system_id
     *
     * @mbggenerated
     */
    public void setApproveSystemId(Long approveSystemId) {
        this.approveSystemId = approveSystemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_upload.approve_desc
     *
     * @return the value of entrust_upload.approve_desc
     *
     * @mbggenerated
     */
    public String getApproveDesc() {
        return approveDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_upload.approve_desc
     *
     * @param approveDesc the value for entrust_upload.approve_desc
     *
     * @mbggenerated
     */
    public void setApproveDesc(String approveDesc) {
        this.approveDesc = approveDesc == null ? null : approveDesc.trim();
    }

    public String getTopicIds() {
        return topicIds;
    }

    public void setTopicIds(String topicIds) {
        this.topicIds = topicIds;
    }

    public Long getCustomListId() {
        return customListId;
    }

    public void setCustomListId(Long customListId) {
        this.customListId = customListId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}