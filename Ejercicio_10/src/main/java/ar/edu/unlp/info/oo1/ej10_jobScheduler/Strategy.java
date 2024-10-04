package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.*;

public interface Strategy {
     JobDescription next(List<JobDescription> jobs);
}
