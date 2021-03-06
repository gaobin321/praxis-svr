package com.noriental.praxissvr.answer.service;

import com.noriental.BaseTest;
import com.noriental.praxissvr.answer.request.FindStuAnswsOnBatchRequest;
import com.noriental.praxissvr.answer.request.UpdateCorrectRequest;
import com.noriental.praxissvr.answer.request.UpdateSubmitAnswer;
import com.noriental.praxissvr.answer.request.UpdateSubmitAnswerRequest;
import com.noriental.praxissvr.common.StuAnswerConstant;
import com.noriental.utils.json.JsonUtil;
import com.noriental.validate.exception.BizLayerException;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

/**
 * 重复批改测试用例
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:testApplicationContext.xml"})
    @Ignore
public class RepeateCorrectServiceTest extends BaseTest{

    public static  final String result6 = "6";
    public static  final String result2 = "2";
    public static  final String result1 = "1";
    public static  final String corT = StuAnswerConstant.CorrectorRole.TEACHER;
    public static  final String corS = StuAnswerConstant.CorrectorRole.STUDENT;
    public static  final String exerciseSouceHoWork = StuAnswerConstant.ExerciseSource.HO_WORK;
    public static  final String exerciseSouceWrong = StuAnswerConstant.ExerciseSource.WRONGBOOK;
    public static  final String redoSouceNull = null;
    //1、小题
//    public static  final Long resouceId = 2261L;
//
//    public static  final String redoSouce = null;
//    public static  final Long studentId = 4285662L;
//   public static  final Long questionId1 = 810184L;


    //2、复合题
    public static  final Long resouceId = 22620L;
    public static  final Long studentId = 162L;
    public static  final Long questionId1 = 2430319L;
    public static  final Long questionId2 = 2430320L;






    @Autowired
    AnswerCommonService answerCommonService;
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    @Test
    public void updateSubmitAnswer1() {
        UpdateSubmitAnswerRequest request = new UpdateSubmitAnswerRequest();
        request.setExerciseSource(exerciseSouceHoWork);
        request.setRedoSource(redoSouceNull);
        request.setCorrectorId(1L);
        request.setCorrectorRole(StuAnswerConstant.CorrectorRole.STUDENT);
        request.setResourceId(resouceId);
        request.setStudentId(studentId);
        List<UpdateSubmitAnswer> updateSubmitAnswerList  = new ArrayList<>();
        request.setUpdateSubmitAnswerList(updateSubmitAnswerList);
        UpdateSubmitAnswer u1 = new UpdateSubmitAnswer();
        u1.setQuestionId(questionId1);
        u1.setResult(result6);
        u1.setSubmitAnswer("A");
        updateSubmitAnswerList.add(u1);

        UpdateSubmitAnswer u2 = new UpdateSubmitAnswer();
        u2.setQuestionId(questionId2);
        u2.setResult(result6);
        u2.setSubmitAnswer("A");
        updateSubmitAnswerList.add(u2);
        try{
        logger.info(JsonUtil.obj2Json(answerCommonService.updateSubmitAnswer(request)));
    }catch (Exception e){
        if(e instanceof BizLayerException){
            logger.error(JsonUtil.obj2Json(e));
        }else {
            logger.error("eee",e);
        }
    }
    }
    @Test
    public void updateCorrect1() {
//        UpdateCorrectRequest studentExercise = new UpdateCorrectRequest();
//        studentExercise.setCorrectorId(1L);
//        studentExercise.setCorrectorRole(corS);
//
//        studentExercise.setExerciseSource(exerciseSouceHoWork);
//        studentExercise.setResourceId(resouceId);
//        studentExercise.setStudentId(studentId);
//        studentExercise.setQuestionId(questionId1);
//        studentExercise.setResult(result2);
//        logger.info(JsonUtil.obj2Json(answerCommonService.updateCorrect(studentExercise)));

        UpdateCorrectRequest studentExercise1 = new UpdateCorrectRequest();
        studentExercise1.setCorrectorId(1L);
        studentExercise1.setCorrectorRole(corS);

        studentExercise1.setExerciseSource(exerciseSouceHoWork);
        studentExercise1.setResourceId(resouceId);
        studentExercise1.setStudentId(studentId);
        studentExercise1.setQuestionId(questionId2);
        studentExercise1.setResult(result2);
        logger.info(JsonUtil.obj2Json(answerCommonService.updateCorrect(studentExercise1)));
    }
    @Test
    public void updateCorrect2() {
//        UpdateCorrectRequest studentExercise = new UpdateCorrectRequest();
//        studentExercise.setCorrectorId(1L);
//        studentExercise.setCorrectorRole(corT);
//
//        studentExercise.setExerciseSource(exerciseSouceHoWork);
//        studentExercise.setResourceId(resouceId);
//        studentExercise.setStudentId(studentId);
//        studentExercise.setQuestionId(questionId1);
//        studentExercise.setResult(result1);
//        logger.info(JsonUtil.obj2Json(answerCommonService.updateCorrect(studentExercise)));

        UpdateCorrectRequest studentExercise1 = new UpdateCorrectRequest();
        studentExercise1.setCorrectorId(1L);
        studentExercise1.setCorrectorRole(corT);

        studentExercise1.setExerciseSource(exerciseSouceHoWork);
        studentExercise1.setResourceId(resouceId);
        studentExercise1.setStudentId(studentId);
        studentExercise1.setQuestionId(questionId2);
        studentExercise1.setResult(result1);
        try{
        logger.info(JsonUtil.obj2Json(answerCommonService.updateCorrect(studentExercise1)));
    }catch (Exception e){
        if(e instanceof BizLayerException){
            logger.error(JsonUtil.obj2Json(e));
        }else {
            logger.error("eee",e);
        }
    }
    }
    @Test
    public void findStuAnswsOnBatch() {
        FindStuAnswsOnBatchRequest in = new FindStuAnswsOnBatchRequest();
        in.setExerciseSource(exerciseSouceWrong);
        in.setRedoSource(exerciseSouceHoWork);
        in.setResourceId(resouceId);
        in.setStudentId(studentId);
        logger.info(JsonUtil.obj2Json(answerCommonService.findStuAnswsOnBatch(in)));
    }









}
