package ru.Korotaev.SpringApp.DAO;


import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.Korotaev.SpringApp.Models.Genre;
import ru.Korotaev.SpringApp.Models.Music;
import ru.Korotaev.SpringApp.utils.HibernateSessionFactoryUtil;

import java.util.List;

public class GenreDAO {

    public Genre findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Genre.class,id);
    }

    public void save(Genre genre){
       Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(genre);
        tx1.commit();
        session.close();
    }

    public void update(Genre genre){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(genre);
        tx1.commit();
        session.close();
    }
    public void delete(Genre genre){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(genre);
        tx1.commit();
        session.close();
    }

    public Music findMusicById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Music.class,id);
    }

    public List<Genre> findAll() {
        return (List<Genre>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From genres").list();
    }
}
