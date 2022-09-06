package com.wzw.dao;

import com.wzw.pojo.Audit;

import java.util.List;

public interface AuditDao {
    //查询所有审计
    List<Audit> getAuditList();

    //根据id查询审计
    Audit getAuditByID(int aid);

    //注册审计
    int addAudit(Audit audit);

    //更新审计信息
    void updateAudit(Audit audit);

    //删除审计
    void deleteAudit(int aid);
}
