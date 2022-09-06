package com.wzw.dao;

import com.wzw.pojo.Audit;
import com.wzw.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class AuditDaoTest {

    @Test
    public void testGetAuditList(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            AuditDao auditDao = sqlSession.getMapper(AuditDao.class);
            List<Audit> auditList = auditDao.getAuditList();
            //        List<Audit> auditList = sqlSession.selectList("com.wzw.dao.AuditDao.getAuditList");

            //打印结果
            for (Audit audit : auditList){
                System.out.println(audit);
            }
        }catch (Exception e){

        }finally {
            //关闭session 线程不安全
            sqlSession.close();
        }
    }

    @Test
    public void testGetAuditByID(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            AuditDao auditDao = sqlSession.getMapper(AuditDao.class);
            Audit audit = auditDao.getAuditByID(001);
            //        List<Audit> auditList = sqlSession.selectList("com.wzw.dao.AuditDao.getAuditList");

            //打印结果
            System.out.println(audit);
        }catch (Exception e){

        }finally {
            //关闭session 线程不安全
            sqlSession.close();
        }
    }

    @Test
    public void testAddAudit(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            AuditDao auditDao = sqlSession.getMapper(AuditDao.class);


            int auditid = auditDao.addAudit(new Audit(001,"0204", 50.0F,50.0F,0.0F,0.0F,5.0F,5.0F,95.0F,"pending"));

            List<Audit> auditList = auditDao.getAuditList();
            //打印结果
            for (Audit audit : auditList){
                System.out.println(audit);
            }
        }catch (Exception e){

        }finally {
            sqlSession.commit();
            //关闭session 线程不安全
            sqlSession.close();
        }
    }

    @Test
    public void testUpdateAudit(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            AuditDao auditDao = sqlSession.getMapper(AuditDao.class);
            Audit audit = auditDao.getAuditByID(001);
            audit.setBasic_salary(80);

            auditDao.updateAudit(audit);

            List<Audit> auditList = auditDao.getAuditList();
            //打印结果
            for (Audit auditI : auditList){
                System.out.println(auditI);
            }
        }catch (Exception e){

        }finally {
            sqlSession.commit();
            //关闭session 线程不安全
            sqlSession.close();
        }
    }
    @Test
    public void testDeleteAudit(){
        // 获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try{
            //执行sql
            AuditDao auditDao = sqlSession.getMapper(AuditDao.class);

            auditDao.deleteAudit(001);
            List<Audit> auditList = auditDao.getAuditList();
            //打印结果
            for (Audit auditI : auditList){
                System.out.println(auditI);
            }
        }catch (Exception e){

        }finally {
            sqlSession.commit();
            //关闭session 线程不安全
            sqlSession.close();
        }
    }
}
