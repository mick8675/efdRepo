package com.solers.delivery.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import com.solers.delivery.validator.NotEmpty;
import javax.validation.constraints.NotEmpty;
import com.solers.delivery.domain.validations.ValidScheduleDuration;
import com.solers.delivery.domain.validations.ValidScheduleExpression;
import com.solers.util.unit.TimeIntervalUnit;

@Entity
@Table(name = "schedule_expression")
@ValidScheduleDuration
public class ScheduleExpression implements Serializable {
    /**
     * Serial UID
     */
    private static final long serialVersionUID = 10l;
	private static final int EXPRESSION_LEN = 255;

    private Long id;
    private String cronExpression;
    private int duration;
    private TimeIntervalUnit durationUnit;
    
    public ScheduleExpression() { 
        
    }
    
    public ScheduleExpression (String cronExpression) {
       this.cronExpression = cronExpression;	
    }
    
    @Id
    @Column(nullable=false, updatable=false, insertable=false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
    	return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(nullable=false, updatable=true, length=EXPRESSION_LEN)
    @NotEmpty(message="{scheduleexpression.cronexpression.required}")
    @ValidScheduleExpression
    public String getCronExpression() {
    	return cronExpression;
    }
        
    public void setCronExpression(String expression) {
    	this.cronExpression = expression;
    }
    
    @Column(name = "duration", nullable = true)
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Column(name = "durationunit", nullable = true)
    public TimeIntervalUnit getDurationUnit() {
        return durationUnit;
    }

    public void setDurationUnit(TimeIntervalUnit durationUnit) {
        this.durationUnit = durationUnit;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ScheduleExpression) {
            if (cronExpression == null && ((ScheduleExpression)obj).cronExpression == null) {
                return true;
            }
            
            if (cronExpression == null ^ ((ScheduleExpression)obj).cronExpression == null) {
                return false;
            }
            
            return ((ScheduleExpression) obj).cronExpression.equals(cronExpression);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return cronExpression == null ? 0 : cronExpression.hashCode();
    }
    
    @Override
    public String toString() {
        return new StringBuilder("id:").append(id)
                              .append(",expression:").append(cronExpression)
                              .append(",duration:").append(duration)
                              .append(",durationUnit:").append(durationUnit)
                              .toString();
    }
}