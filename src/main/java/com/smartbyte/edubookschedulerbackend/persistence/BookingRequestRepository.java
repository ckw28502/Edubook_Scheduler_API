package com.smartbyte.edubookschedulerbackend.persistence;

import com.smartbyte.edubookschedulerbackend.domain.BookingRequestAnswer;
import com.smartbyte.edubookschedulerbackend.persistence.jpa.entity.BookingRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookingRequestRepository extends JpaRepository<BookingRequestEntity, Long> {

    @Modifying
    @Query("UPDATE BookingRequestEntity sbr SET sbr.answer=:answer WHERE sbr.id=:reqId")
    void updateAnswer(@Param("reqId") Long reqId, @Param("answer") BookingRequestAnswer answer);
}
