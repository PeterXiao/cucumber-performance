package cucumber.api.perf.result;

import java.time.Duration;
import java.time.LocalDateTime;

import cucumber.api.Result;

public class StepResult {
	private LocalDateTime start = LocalDateTime.now();
	private LocalDateTime stop = LocalDateTime.now();
	private String name;
	private Result result;

	public StepResult(String name,Result result,LocalDateTime start,LocalDateTime stop)
	{
		this.name=name;
		this.result=result;
		this.start = start;
		this.stop = stop;
	}
	
	public StepResult(StepResult result)
	{
		this.name=result.getName();
		this.result=new Result(result.getResult().getStatus(), result.getResultDuration(), result.getError());
		this.start = result.getStart();
		this.stop = result.getStop();
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getStop() {
		return stop;
	}

	public void setStop(LocalDateTime stop) {
		this.stop = stop;
	}

	public Duration getDuration()
	{
		return Duration.between(start, stop);
	}
	
	public Long getResultDuration()
	{
		return result.getDuration();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
	
	public boolean isPassed() {
		return result.getError() == null;
	}

	public Throwable getError() {
		return result.getError();
	}
}
