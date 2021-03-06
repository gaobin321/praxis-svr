package com.noriental.praxissvr.question.request;

import com.noriental.validate.bean.BaseRequest;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * Created by shengxian on 2016/11/22.
 */
public class CreateEntrustExerciseRequest extends BaseRequest{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.phone_number
     *
     * @mbggenerated
     */
    @Size(max = 11)
    private String phoneNumber="";

    private List<EntrustUploadFileVo> files;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.description
     *
     * @mbggenerated
     */
    private String description="";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.teacher_name
     *
     * @mbggenerated
     */
    @Size(max = 255)
    private String teacherName="";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.school_name
     *
     * @mbggenerated
     */
    @Size(max = 255)
    private String schoolName="";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.subject_name
     *
     * @mbggenerated
     */
    @Size(max = 255)
    private String subjectName="";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.stage_name
     *
     * @mbggenerated
     */
    @Size(max = 255)
    private String stageName="";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.teacher_id
     *
     * @mbggenerated
     */
    @Min(1)
    private Long teacherId;



    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.chapter
     *
     * @mbggenerated
     */
    @Size(max = 255)
    private String chapter="";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.section
     *
     * @mbggenerated
     */
    @Size(max = 255)
    private String section="";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.article
     *
     * @mbggenerated
     */
    @Size(max = 255)
    private String article="";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.questions_name
     *
     * @mbggenerated
     */
    @Size(max = 255)
    private String questionsName="";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_upload.chapter_id
     *
     * @mbggenerated
     */

    private Long directoryId;

    private Integer chapterId;

    private List<Long> topicId;


    /*
        自定义目录体系
        添加
        customerDirectoryId 自定义目录Id
        groupId             自定义目录体系Id
     */
    private Long customerDirectoryId;

    private Long groupId;


    @NotEmpty
    private String fileName;
    @NotEmpty
    private String qiniuUrl;

    public CreateEntrustExerciseRequest() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<EntrustUploadFileVo> getFiles() {
        return files;
    }

    public void setFiles(List<EntrustUploadFileVo> files) {
        this.files = files;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getQuestionsName() {
        return questionsName;
    }

    public void setQuestionsName(String questionsName) {
        this.questionsName = questionsName;
    }

    public Long getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(Long directoryId) {
        this.directoryId = directoryId;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public List<Long> getTopicId() {
        return topicId;
    }

    public void setTopicId(List<Long> topicId) {
        this.topicId = topicId;
    }

    public Long getCustomerDirectoryId() {
        return customerDirectoryId;
    }

    public void setCustomerDirectoryId(Long customerDirectoryId) {
        this.customerDirectoryId = customerDirectoryId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getQiniuUrl() {
        return qiniuUrl;
    }

    public void setQiniuUrl(String qiniuUrl) {
        this.qiniuUrl = qiniuUrl;
    }

    @Override
    public String toString() {
        return "CreateEntrustExerciseRequest{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", files=" + files +
                ", description='" + description + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", stageName='" + stageName + '\'' +
                ", teacherId=" + teacherId +
                ", chapter='" + chapter + '\'' +
                ", section='" + section + '\'' +
                ", article='" + article + '\'' +
                ", questionsName='" + questionsName + '\'' +
                ", directoryId=" + directoryId +
                ", chapterId=" + chapterId +
                ", topicId=" + topicId +
                ", customerDirectoryId=" + customerDirectoryId +
                ", groupId=" + groupId +
                ", fileName='" + fileName + '\'' +
                ", qiniuUrl='" + qiniuUrl + '\'' +
                '}';
    }
}
