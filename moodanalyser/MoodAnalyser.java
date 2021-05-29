package moodanalyser;

public class MoodAnalyser {

		public class MoodAnalysisException extends Exception{
		    public exceptionType type;
		    public MoodAnalysisException(String message)
		    {
		        super(message);
		        this.type=type;
		    }
		    public enum exceptionType
		    {
		        NULL,
		        EMPTY
		    }


		}
	}

}
