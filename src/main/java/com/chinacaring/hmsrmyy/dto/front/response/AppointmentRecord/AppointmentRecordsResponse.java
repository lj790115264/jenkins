package com.chinacaring.hmsrmyy.dto.front.response.AppointmentRecord;

import lombok.Data;

import java.util.List;


@Data
public class AppointmentRecordsResponse {

   private List<AppointmentRecord> paid;

   private List<AppointmentRecord> treated;

   private List<AppointmentRecord> canceled;

   public AppointmentRecordsResponse(List<AppointmentRecord> paid,
                                     List<AppointmentRecord> treated,
                                     List<AppointmentRecord> canceled) {
      this.paid = paid;
      this.treated = treated;
      this.canceled = canceled;
   }
}
