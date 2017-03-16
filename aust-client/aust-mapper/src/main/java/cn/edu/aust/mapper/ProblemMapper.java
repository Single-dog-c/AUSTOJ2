package cn.edu.aust.mapper;

import java.util.List;

import cn.edu.aust.pojo.entity.ProblemDO;
import cn.edu.aust.query.ProblemDOPC;
import cn.edu.aust.query.ProblemQM;
import tk.mybatis.mapper.common.Mapper;

public interface ProblemMapper extends Mapper<ProblemDO> {
    /**
     * 查询出指定阶段的所有题目
     * @param problemQM 查询实体
     * @return 查询集合包装类
     */
    List<ProblemDOPC> queryListStage(ProblemQM problemQM);
    /**
     * 查询出指定目录的所有题目
     * @param problemQM 查询实体
     * @return 查询集合包装类
     */
    List<ProblemDOPC> queryListCatelog(ProblemQM problemQM);

    /**
     * 根据主键查询一个题目的详细
     * @param id 主键
     * @return 结果
     */
    ProblemDOPC queryDetail(Long id);

    /**
     * 查询一个比赛题目
     * @param problemId 题目id
     * @return 查询结果
     */
    ProblemDOPC queryContestProblem(Long problemId);

    List<ProblemDOPC> queryContest(Long contest);
}