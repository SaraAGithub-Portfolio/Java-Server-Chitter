package com.chitter.server.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.chitter.server.model.Peep;
public interface PeepRespository extends MongoRepository<Peep, String> {
}
