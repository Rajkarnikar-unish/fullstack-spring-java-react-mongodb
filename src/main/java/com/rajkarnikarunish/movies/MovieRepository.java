package com.rajkarnikarunish.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
}

/***
 * This class is a data access layer
 * It does the job of talking to database
 */
