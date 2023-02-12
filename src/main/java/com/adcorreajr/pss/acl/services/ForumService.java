package com.adcorreajr.pss.acl.services;

import com.adcorreajr.pss.acl.domain.Post;

import java.util.Collection;
import java.util.Map;
public interface ForumService {
    void createPost(Post post);
    public abstract Collection<Post> getPosts();

    public abstract void deletePost(Post post);
}
