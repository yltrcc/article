package cn.itcast.article.dao;

import cn.itcast.article.po.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

//评论的dao接口
public interface CommentRepository extends MongoRepository<Comment,String> {

    //根据父id，查询子评论的分页列表
    Page<Comment> findByParentid(String parentid, Pageable pageable);

}
