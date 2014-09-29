package br.com.furb.tagarela.model;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table SYMBOL.
 */
public class Symbol {

    private Integer serverID;
    private Integer userID;
    private Boolean isGeneral;
    private String name;
    private String videoLink;
    private byte[] picture;
    private byte[] sound;
    private long categoryID;
    private String ascRepresentation;
    private Integer alphaID;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient SymbolDao myDao;

    private Category category;
    private Long category__resolvedKey;


    public Symbol() {
    }

    public Symbol(Integer serverID, Integer userID, Boolean isGeneral, String name, String videoLink, byte[] picture, byte[] sound, long categoryID, String ascRepresentation, Integer alphaID) {
        this.serverID = serverID;
        this.userID = userID;
        this.isGeneral = isGeneral;
        this.name = name;
        this.videoLink = videoLink;
        this.picture = picture;
        this.sound = sound;
        this.categoryID = categoryID;
        this.ascRepresentation = ascRepresentation;
        this.alphaID = alphaID;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getSymbolDao() : null;
    }

    public Integer getServerID() {
        return serverID;
    }

    public void setServerID(Integer serverID) {
        this.serverID = serverID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Boolean getIsGeneral() {
        return isGeneral;
    }

    public void setIsGeneral(Boolean isGeneral) {
        this.isGeneral = isGeneral;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public byte[] getSound() {
        return sound;
    }

    public void setSound(byte[] sound) {
        this.sound = sound;
    }

    public long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(long categoryID) {
        this.categoryID = categoryID;
    }

    public String getAscRepresentation() {
        return ascRepresentation;
    }

    public void setAscRepresentation(String ascRepresentation) {
        this.ascRepresentation = ascRepresentation;
    }

    public Integer getAlphaID() {
        return alphaID;
    }

    public void setAlphaID(Integer alphaID) {
        this.alphaID = alphaID;
    }

    /** To-one relationship, resolved on first access. */
    public Category getCategory() {
        long __key = this.categoryID;
        if (category__resolvedKey == null || !category__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            CategoryDao targetDao = daoSession.getCategoryDao();
            Category categoryNew = targetDao.load(__key);
            synchronized (this) {
                category = categoryNew;
            	category__resolvedKey = __key;
            }
        }
        return category;
    }

    public void setCategory(Category category) {
        if (category == null) {
            throw new DaoException("To-one property 'categoryID' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.category = category;
            categoryID = category.getId();
            category__resolvedKey = categoryID;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
